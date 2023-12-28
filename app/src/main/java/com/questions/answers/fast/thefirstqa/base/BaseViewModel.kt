package com.questions.answers.fast.thefirstqa.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.MutableLiveData
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.cancel
abstract class BaseViewModel: ViewModel() {
    // LiveData for showing loading indicator
    val isLoading = MutableLiveData<Boolean>()

    // LiveData for showing error messages
    val errorMessage = MutableLiveData<String>()

    // Coroutine scope for performing background tasks
    private val viewModelJob = Job()
    protected val viewModelScope = CoroutineScope(Dispatchers.Main + viewModelJob)

    override fun onCleared() {
        super.onCleared()
        // Cancel all coroutines when the ViewModel is cleared
        viewModelScope.cancel()
    }

    // Common functions for handling loading and error states

    protected fun showLoading() {
        isLoading.value = true
    }

    protected fun hideLoading() {
        isLoading.value = false
    }

    protected fun showError(message: String) {
        errorMessage.value = message
    }

    protected fun hideError() {
        errorMessage.value = null
    }
}