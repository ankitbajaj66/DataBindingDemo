package com.example.databindingdemo

import androidx.lifecycle.ViewModel
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 *Created by Ankit Bajaj on 18-06-2020.
 */
const val BASE_URL = "https://reqres.in/api/"

class EmployeeViewModel : ViewModel() {

    private val repository = EmployeeRepository(makeRetrofitClient().getService())

    private fun makeRetrofitClient(): RetrofitClient {
        val retrofit =
            Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(
                RxJava2CallAdapterFactory.create())
                .build()
        return RetrofitClient(retrofit)
    }

    fun getEmployeeList() = repository.getEmployeeList()
}