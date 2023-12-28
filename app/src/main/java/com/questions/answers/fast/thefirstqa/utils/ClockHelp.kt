package com.questions.answers.fast.thefirstqa.utils

import android.content.Context
import android.os.Build
import android.provider.Settings
import android.util.Log
import com.questions.answers.fast.thefirstqa.base.App.Companion.TAG
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

object ClockHelp {

    fun cloakData(context: Context): Map<String, String> {
        return mapOf(
            "thickish" to QaData.uu_fqa, // distinct_id
            "torpid" to System.currentTimeMillis().toString(), // client_ts
            "espouse" to getDeviceModel(),//device_model
            "alderman" to "com.life.quest.genius.know.wise",// bundle_id
            "quill" to getOSVersion(), // os_version
            "tupelo" to "", // gaid
            "sedition" to (getAndroidID(context) ?: "").toString(), // android_id
            "willful" to "brandy", // os
            "progeny" to getAppVersionCode(context).toString(), // app_version
            "coffer" to "", // key
        )
    }

    fun getDeviceModel(): String {
        return Build.MODEL
    }

    fun getOSVersion(): String {
        return Build.VERSION.RELEASE
    }

    private fun getAndroidID(context: Context): String? {
        return Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
    }

    private fun getAppVersionCode(context: Context): String {
        val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)
        return packageInfo.versionName

    }

    private fun getParamsJsopn(urlString: String, params: Map<String, String>): String? {
        val url = URL(urlString + "?" + encodeParams(params))
        val urlConnection = url.openConnection() as HttpURLConnection
        try {
            urlConnection.requestMethod = "GET"
            if (urlConnection.responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader(InputStreamReader(urlConnection.inputStream)).use { reader ->
                    return reader.lineSequence().joinToString(separator = "\n")
                }
            } else {
                return null
                throw IOException("Server returned non-OK status: ${urlConnection.responseCode}")
            }
        } catch (e: Exception) {
            Log.e("TAG", "error: ${e}")
            return null
        } finally {
            urlConnection.disconnect()
        }
    }

    fun encodeParams(params: Map<String, String>): String {
        return params.map { (key, value) ->
            URLEncoder.encode(key, "UTF-8") + "=" + URLEncoder.encode(value, "UTF-8")
        }.joinToString("&")
    }

    //发送请求
    suspend fun sendRequest(context: Context) {
        Log.e(TAG, "sendRequest: ${cloakData(context)}")
        if (QaData.clock_data.isNotEmpty()) {
            return
        }
        withContext(Dispatchers.IO) {
            val request = getParamsJsopn(QaData.clock_url, cloakData(context))
            if (request.isNullOrEmpty()) {
                delay(10000)
                sendRequest(context)
            } else {
                QaData.clock_data = request
                Log.e(TAG, "blacklist-data=: ${QaData.clock_data}")
            }
        }
    }
}