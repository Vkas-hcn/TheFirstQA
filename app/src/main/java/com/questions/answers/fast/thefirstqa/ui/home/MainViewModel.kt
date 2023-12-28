package com.questions.answers.fast.thefirstqa.ui.home

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.lifecycleScope
import com.questions.answers.fast.thefirstqa.base.App.Companion.TAG
import com.questions.answers.fast.thefirstqa.base.BaseViewModel
import com.questions.answers.fast.thefirstqa.data.AnswerDataBean
import com.questions.answers.fast.thefirstqa.data.QaDataBean
import com.questions.answers.fast.thefirstqa.data.QaDetail
import com.questions.answers.fast.thefirstqa.utils.QaData
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.isActive
import kotlinx.coroutines.launch

class MainViewModel : BaseViewModel() {
    var qaDetail: QaDetail? = null
    var isClickAnswer = false
    var countDownTime = MutableLiveData<Int>()
    var countDow: Job? = null
    var count: Int = 0
    var isCounting = false
    val timeData = 30
    fun getQuestionData(): QaDataBean {
        return QaData.getQaList()
    }

    fun getAnswerData(): AnswerDataBean {
        return QaData.getAnswerData()
    }

    fun saveAnswerData(answerDataBean: AnswerDataBean) {
        QaData.saveAnswerData(answerDataBean)
    }

    //30秒倒计时(isPause,0:开始，1：暂停，2恢复,3:重置)
    fun countDownTime(activity: MainActivity, isPause: Int) {
        countDow?.cancel()
        countDow = null
        when(isPause){
            0 -> {
                isCounting = true
                count =timeData
            }
            1 -> {
                isCounting = false
                count= countDownTime.value ?: timeData
            }
            2 -> {
                isCounting = true
                count= countDownTime.value ?: timeData
            }
            3 -> {
                isCounting = false
            }
        }
        countDow = activity.lifecycleScope.launch {
            while (count >= 0 && isCounting) {
                countDownTime.value = count
                count--
                delay(1000)
            }
        }
    }
}