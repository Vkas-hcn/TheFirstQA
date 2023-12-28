package com.questions.answers.fast.thefirstqa.ui.home

import android.util.Log
import android.view.KeyEvent
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.questions.answers.fast.thefirstqa.R
import com.questions.answers.fast.thefirstqa.base.App.Companion.TAG
import com.questions.answers.fast.thefirstqa.base.BaseActivity
import com.questions.answers.fast.thefirstqa.base.BaseViewModel
import com.questions.answers.fast.thefirstqa.data.QaDataBean
import com.questions.answers.fast.thefirstqa.data.QaDetail
import com.questions.answers.fast.thefirstqa.databinding.ActivityMainBinding
import com.questions.answers.fast.thefirstqa.ui.boot.BootViewModel
import com.questions.answers.fast.thefirstqa.ui.pp.PpQaActivity
import com.questions.answers.fast.thefirstqa.utils.QaData
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : BaseActivity<MainViewModel, ActivityMainBinding>() {

    override fun createViewModel(): MainViewModel {
        return ViewModelProvider(this)[MainViewModel::class.java]
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_main
    }

    override fun setupViews() {
        click()
        setCurrentQuestionData()
    }

    override fun observeViewModel() {
        liveDataObserve()
    }

    private fun liveDataObserve() {
        viewModel.countDownTime.observe(this) {
            binding.tvTime.text = String.format("${it}s")
            if (it == 0) {
                answerError(true)
            }
        }
    }

    private fun click() {
        binding.imgSetting.setOnClickListener {
            setLevelProgress()
            binding.showSetting = true
        }
        binding.imgStart.setOnClickListener {
            binding.showQuestion = true
            viewModel.countDownTime(this, 0)

        }
        binding.clError.setOnClickListener {
        }
        binding.clSetting.setOnClickListener {
            binding.showSetting = false
        }
        binding.llSetting.setOnClickListener {
        }
        binding.imgSettingClose.setOnClickListener {
            if (binding.showQuestion == true) {
                if (binding.showPause == true) {
                    binding.showPause = false
                    viewModel.countDownTime(this, 2)
                } else {
                    binding.showPause = true
                    viewModel.countDownTime(this, 1)
                }
            }
        }
        binding.clPp.setOnClickListener {
            startActivityBase(PpQaActivity::class.java)
        }
        binding.tvAnswer1.setOnClickListener {
            clickAnswer(1)
        }
        binding.tvAnswer2.setOnClickListener {
            clickAnswer(2)
        }
        binding.tvAnswer3.setOnClickListener {
            clickAnswer(3)
        }
        binding.tvAnswer4.setOnClickListener {
            clickAnswer(4)
        }
        binding.tvTryAgain.setOnClickListener {
            binding.showError = false
            setCurrentQuestionData()
            viewModel.countDownTime(this, 0)

        }
    }


    private fun setCurrentQuestionData() {
        val bean = viewModel.getAnswerData()
        val allData = viewModel.getQuestionData().data
        if (bean.position >= allData.size) {
            bean.position = 0
            viewModel.saveAnswerData(bean)
        }
        viewModel.qaDetail = allData[viewModel.getAnswerData().position]
        resetTheUi()
        binding.tvQuestion.text = viewModel.qaDetail?.topic
        binding.tvAnswer1.text = viewModel.qaDetail?.a
        binding.tvAnswer2.text = viewModel.qaDetail?.b
        binding.tvAnswer3.text = viewModel.qaDetail?.c
        binding.tvAnswer4.text = viewModel.qaDetail?.d
        binding.txtLevel.text = String.format("level:${viewModel.getAnswerData().level}")
        binding.tvSpecies.text = viewModel.getAnswerData().species.toString()
        viewModel.isClickAnswer = false
    }

    //点击答案
    private fun clickAnswer(answer: Int) {
        if (viewModel.isClickAnswer) {
            return
        }
        viewModel.isClickAnswer = true
        when (viewModel.qaDetail?.answer) {
            1 -> {
                binding.tvAnswer1.setBackgroundResource(R.drawable.bg_success)
            }

            2 -> {
                binding.tvAnswer2.setBackgroundResource(R.drawable.bg_success)
            }

            3 -> {
                binding.tvAnswer3.setBackgroundResource(R.drawable.bg_success)
            }

            4 -> {
                binding.tvAnswer4.setBackgroundResource(R.drawable.bg_success)
            }
        }

        when (answer) {
            1 -> {
                if (viewModel.qaDetail?.answer == 1) {
                    binding.tvAnswer1.setBackgroundResource(R.drawable.bg_success)
                    answerSuccess()
                } else {
                    binding.tvAnswer1.setBackgroundResource(R.drawable.bg_error)
                    answerError()
                }
                binding.tvAnswer1.setTextColor(resources.getColor(R.color.f_s_answer))
            }

            2 -> {
                if (viewModel.qaDetail?.answer == 2) {
                    binding.tvAnswer2.setBackgroundResource(R.drawable.bg_success)
                    answerSuccess()
                } else {
                    binding.tvAnswer2.setBackgroundResource(R.drawable.bg_error)
                    answerError()
                }
                binding.tvAnswer2.setTextColor(resources.getColor(R.color.f_s_answer))
            }

            3 -> {
                if (viewModel.qaDetail?.answer == 3) {
                    binding.tvAnswer3.setBackgroundResource(R.drawable.bg_success)
                    answerSuccess()

                } else {
                    binding.tvAnswer3.setBackgroundResource(R.drawable.bg_error)
                    answerError()
                }
                binding.tvAnswer3.setTextColor(resources.getColor(R.color.f_s_answer))
            }

            4 -> {
                if (viewModel.qaDetail?.answer == 4) {
                    binding.tvAnswer4.setBackgroundResource(R.drawable.bg_success)
                    answerSuccess()
                } else {
                    binding.tvAnswer4.setBackgroundResource(R.drawable.bg_error)
                    answerError()
                }
                binding.tvAnswer4.setTextColor(resources.getColor(R.color.f_s_answer))
            }
        }
    }

    //回答正确
    private fun answerSuccess() {
        lifecycleScope.launch {
            val answerData = viewModel.getAnswerData()
            answerData.position = answerData.position + 1
            answerData.correctNum = answerData.correctNum + 1
            answerData.errorNum = 0
            answerData.species = answerData.species + (10 * answerData.level)
            answerData.level = if (answerData.correctNum >= 10) {
                answerData.correctNum = 0
                answerData.level + 1
            } else {
                answerData.level
            }
            viewModel.saveAnswerData(answerData)
            delay(500)
            setCurrentQuestionData()
            viewModel.countDownTime(this@MainActivity, 0)
        }
    }

    //回答错误
    private fun answerError(isCountDown: Boolean = false) {
        lifecycleScope.launch {
            val answerData = viewModel.getAnswerData()
            answerData.correctNum = 0
            answerData.errorNum = answerData.errorNum + 1
            if (answerData.errorNum >= 5) {
                answerData.errorNum = 0
                answerData.species = 0
            }
            viewModel.saveAnswerData(answerData)
            viewModel.countDownTime(this@MainActivity, 3)
            if (!isCountDown) {
                delay(2000)
                binding.tvError.text = "Your answer is wrong!"
            } else {
                binding.tvError.text = "Time is up"
            }
            answerErrorDialog()
        }
    }

    //答题错误弹框
    private fun answerErrorDialog() {
        setLevelProgress()
        binding.showError = true
    }

    //重置ui
    private fun resetTheUi() {
        binding.tvAnswer1.setBackgroundResource(R.drawable.bg_nol)
        binding.tvAnswer2.setBackgroundResource(R.drawable.bg_nol)
        binding.tvAnswer3.setBackgroundResource(R.drawable.bg_nol)
        binding.tvAnswer4.setBackgroundResource(R.drawable.bg_nol)
        binding.tvAnswer1.setTextColor(resources.getColor(R.color.nol_answer))
        binding.tvAnswer2.setTextColor(resources.getColor(R.color.nol_answer))
        binding.tvAnswer3.setTextColor(resources.getColor(R.color.nol_answer))
        binding.tvAnswer4.setTextColor(resources.getColor(R.color.nol_answer))
    }

    //设置等级进度条
    private fun setLevelProgress() {
        val answerData = viewModel.getAnswerData()
        binding.pbErrorLevel.progress = answerData.correctNum * 10
        binding.pbSettingLevel.secondaryProgress = answerData.correctNum * 10
        binding.tvLevel.text = String.format("Level:${viewModel.getAnswerData().level}")
        binding.showPause = !viewModel.isCounting
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        if (event?.keyCode == KeyEvent.KEYCODE_BACK) {
            if (binding.showSetting == true) {
                binding.showSetting = false
                return true
            }
            if (viewModel.isClickAnswer) {
                return true
            }
            if (binding.showQuestion == true) {
                binding.showQuestion = false
                viewModel.countDownTime(this, 3)
                return true
            }

            finish()
        }
        return true
    }
}
