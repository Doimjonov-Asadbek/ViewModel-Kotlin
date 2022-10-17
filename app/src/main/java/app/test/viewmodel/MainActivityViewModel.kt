package app.test.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    var number = 0
    fun addNumber() {
        number++
    }

    override fun onCleared() {
        super.onCleared()
    }

}