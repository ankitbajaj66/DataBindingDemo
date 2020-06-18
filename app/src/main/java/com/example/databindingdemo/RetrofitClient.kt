package com.example.databindingdemo

import retrofit2.Retrofit

/**
 *Created by Ankit Bajaj on 18-06-2020.
 */


class RetrofitClient(private val retrofit: Retrofit) {
    fun getService(): EmployeeDataService = retrofit.create(EmployeeDataService::class.java)
}