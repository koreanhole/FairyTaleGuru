package com.koreanhole.pluto.fairytaleguru.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class CreateFairyTaleViewModel : ViewModel() {
    fun createFairyTale(
        onFinished: () -> Unit,
    ) {
        viewModelScope.launch {
            delay(3000L)
            onFinished()
        }
    }
}