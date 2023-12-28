package com.questions.answers.fast.thefirstqa.ui.boot

import android.os.CountDownTimer
import android.util.Log
import android.view.KeyEvent
import androidx.lifecycle.ViewModelProvider
import com.questions.answers.fast.thefirstqa.R
import com.questions.answers.fast.thefirstqa.base.App.Companion.TAG
import com.questions.answers.fast.thefirstqa.base.BaseActivity
import com.questions.answers.fast.thefirstqa.databinding.ActivityBootBinding
import com.questions.answers.fast.thefirstqa.ui.home.MainActivity

class BootActivity : BaseActivity<BootViewModel, ActivityBootBinding>() {

    override fun createViewModel(): BootViewModel {
        return ViewModelProvider(this)[BootViewModel::class.java]
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_boot
    }

    override fun setupViews() {
        // Setup your views here
        startCountDown()
    }

    override fun observeViewModel() {
        // Observe ViewModel LiveData here
    }

    //2秒进度条跳转
    private fun startCountDown() {
        val countDownTimer = object : CountDownTimer(2000, 50) {
            override fun onTick(millisUntilFinished: Long) {
                //倒计时的过程中回调该函数
                binding.pbBoot.progress = (100 - (millisUntilFinished/20)).toInt()
            }

            override fun onFinish() {
                //倒计时结束时回调该函数
                startHomeActivity()
            }
        }
        countDownTimer.start()
    }
    //跳转首页
    private fun startHomeActivity() {
        binding.pbBoot.progress = 100
        startActivityBase(MainActivity::class.java)
        finish()
    }
    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        return keyCode == KeyEvent.KEYCODE_BACK
    }
}