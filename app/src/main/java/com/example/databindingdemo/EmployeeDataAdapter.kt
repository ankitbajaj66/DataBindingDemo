package com.example.databindingdemo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.databindingdemo.databinding.EmployeeListItemBinding


/**
 *Created by Ankit Bajaj on 18-06-2020.
 */
class EmployeeDataAdapter : RecyclerView.Adapter<EmployeeDataAdapter.EmployeeViewHolder>() {

    var employees: List<Employee> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val employeeListItemBinding: EmployeeListItemBinding =
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.employee_list_item,
                parent,
                false
            )

        return EmployeeViewHolder(employeeListItemBinding)
    }


    override fun getItemCount() = employees.size

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {
        val employee: Employee? = employees[position]
        holder.employeeListItemBinding.employeeData = employee
    }

    fun setList(empList: List<Employee>) {
        employees = empList
        notifyDataSetChanged()
    }

    inner class EmployeeViewHolder(val employeeListItemBinding: EmployeeListItemBinding) :
        RecyclerView.ViewHolder(employeeListItemBinding.root) {

    }
}

