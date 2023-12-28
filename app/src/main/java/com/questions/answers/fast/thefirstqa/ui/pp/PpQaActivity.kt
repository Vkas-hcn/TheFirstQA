package com.questions.answers.fast.thefirstqa.ui.pp

import androidx.lifecycle.ViewModelProvider
import com.questions.answers.fast.thefirstqa.R
import com.questions.answers.fast.thefirstqa.base.BaseActivity
import com.questions.answers.fast.thefirstqa.databinding.ActivityMainBinding
import com.questions.answers.fast.thefirstqa.databinding.ActivityPpQaBinding
import com.questions.answers.fast.thefirstqa.ui.home.MainViewModel

class PpQaActivity : BaseActivity<PpQaViewModel, ActivityPpQaBinding>() {

    override fun createViewModel(): PpQaViewModel {
        return ViewModelProvider(this)[PpQaViewModel::class.java]
    }

    override fun getLayoutResId(): Int {
        return R.layout.activity_pp_qa
    }

    override fun setupViews() {
        binding.wvPpQa.loadUrl("https://www.baidu.com/")
    }

    override fun observeViewModel() {
    }
}