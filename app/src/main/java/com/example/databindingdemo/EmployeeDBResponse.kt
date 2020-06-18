package com.example.databindingdemo

import com.google.gson.annotations.SerializedName

/**
 *Created by Ankit Bajaj on 18-06-2020.
 */
data class EmployeeDBResponse(
    @SerializedName("page") var page: String,
    @SerializedName("per_page") var perPage: String,
    @SerializedName("total") var total: Int,
    @SerializedName("total_pages") var totalPages: Int,
    @SerializedName("data") var employeeList: List<Employee>
) {
}