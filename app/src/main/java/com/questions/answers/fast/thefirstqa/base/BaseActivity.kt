package com.questions.answers.fast.thefirstqa.base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseActivity<VM : BaseViewModel, VB : ViewDataBinding> : AppCompatActivity() {

    protected lateinit var viewModel: VM
    protected lateinit var binding: VB

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize ViewModel and ViewDataBinding
        viewModel = createViewModel()
        binding = DataBindingUtil.setContentView(this, getLayoutResId())
        binding.lifecycleOwner = this

        // Perform additional setup
        setupViews()
        observeViewModel()
    }

    // Abstract methods to be implemented by subclasses
    abstract fun createViewModel(): VM
    abstract fun getLayoutResId(): Int
    abstract fun setupViews()
    abstract fun observeViewModel()

    // Common methods for starting activities

    fun startActivityBase(clazz: Class<*>) {
        val intent = Intent(this, clazz)
        startActivity(intent)
    }

    fun startActivityWithExtrasBase(clazz: Class<*>, extras: Bundle) {
        val intent = Intent(this, clazz)
        intent.putExtras(extras)
        startActivity(intent)
    }

    companion object {
        // Extension function for creating ViewModel
        inline fun <reified VM : ViewModel> BaseActivity<*, *>.createViewModel(): VM {
            return ViewModelProvider(this).get(VM::class.java)
        }
    }
}
