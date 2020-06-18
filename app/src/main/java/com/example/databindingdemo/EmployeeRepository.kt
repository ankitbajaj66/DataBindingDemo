package com.example.databindingdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 *Created by Ankit Bajaj on 18-06-2020.
 */
class EmployeeRepository(private val employeeDataService: EmployeeDataService) {

    val employeeData = MutableLiveData<EmployeeDBResponse>()

    fun getEmployeeList(): LiveData<EmployeeDBResponse> {
        employeeDataService.getEmployees().enqueue(object : Callback<EmployeeDBResponse> {
            override fun onFailure(call: Call<EmployeeDBResponse>, t: Throwable) {

            }

            override fun onResponse(
                call: Call<EmployeeDBResponse>,
                response: Response<EmployeeDBResponse>
            ) {
                if (response.isSuccessful)
                    employeeData.value = response.body()
            }
        })
        return employeeData
    }

}