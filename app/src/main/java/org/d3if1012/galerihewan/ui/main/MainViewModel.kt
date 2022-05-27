package org.d3if1012.galerihewan.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.d3if1012.galerihewan.R
import org.d3if1012.galerihewan.model.Hewan
import org.d3if1012.galerihewan.network.HewanApi

class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Hewan>>()
    private val status = MutableLiveData<HewanApi.ApiStatus>()

    init {
        retrieveData()
    }

    private fun retrieveData() {
        viewModelScope.launch (Dispatchers.IO) {
            status.postValue(HewanApi.ApiStatus.LOADING)
            try {
                data.postValue(HewanApi.service.getHewan())
                status.postValue(HewanApi.ApiStatus.SUCCESS)
            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
                status.postValue(HewanApi.ApiStatus.FAILED)
            }
        }
    }
    fun getData(): LiveData<List<Hewan>> = data

    fun getStatus(): LiveData<HewanApi.ApiStatus> = status

}