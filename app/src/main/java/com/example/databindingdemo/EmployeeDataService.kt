package com.example.databindingdemo

import androidx.lifecycle.LiveData
import retrofit2.Call
import retrofit2.http.GET

/**
 *Created by Ankit Bajaj on 18-06-2020.
 */
interface EmployeeDataService {
    @GET("users/?per_page=12&page=1")
    fun getEmployees(): Call<EmployeeDBResponse>
}