package com.questions.answers.fast.thefirstqa.utils

import android.content.Context
import com.google.gson.Gson
import com.questions.answers.fast.thefirstqa.base.App
import com.questions.answers.fast.thefirstqa.data.AnswerDataBean
import com.questions.answers.fast.thefirstqa.data.QaDataBean
import com.questions.answers.fast.thefirstqa.data.QaDetail
import com.questions.answers.fast.thefirstqa.data.qAJsonData

object QaData {
    const val clock_url = "https://strange.lifequestgenius.com/dogmatic/herr/name"
    private val sharedPreferences by lazy {
        App.instance.getSharedPreferences(
            "fqa",
            Context.MODE_PRIVATE
        )
    }
    var clock_data = ""
        set(value) {
            sharedPreferences.edit().run {
                putString("clock_data", value)
                commit()
            }
            field = value
        }
        get() = sharedPreferences.getString("clock_data", "").toString()
    var uu_fqa = ""
        set(value) {
            sharedPreferences.edit().run {
                putString("uu_fqa", value)
                commit()
            }
            field = value
        }
        get() = sharedPreferences.getString("uu_fqa", "").toString()

    var answerData = ""
        set(value) {
            sharedPreferences.edit().run {
                putString("answerData", value)
                commit()
            }
            field = value
        }
        get() = sharedPreferences.getString("answerData", "").toString()
    //获取题目
    fun getQaList(): QaDataBean {
        return Gson().fromJson(qAJsonData, QaDataBean::class.java)
    }

    //获取本地保存答题信息
    fun getAnswerData(): AnswerDataBean {
        try {
            if (answerData.isEmpty()) {
                answerData = Gson().toJson(AnswerDataBean())
            }
        } catch (e: Exception) {
            answerData = Gson().toJson(AnswerDataBean())
        }
        return Gson().fromJson(answerData, AnswerDataBean::class.java)
    }
    //保存答题信息
    fun saveAnswerData(answerDataBean: AnswerDataBean) {
        answerData = Gson().toJson(answerDataBean)
    }
}