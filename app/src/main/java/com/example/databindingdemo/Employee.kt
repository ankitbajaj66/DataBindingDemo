package com.example.databindingdemo

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.google.gson.annotations.SerializedName

/**
 *Created by Ankit Bajaj on 18-06-2020.
 */
data class Employee(
    var avatar: String? = null,
    var email: String? = null,
    var id: Long? = null,
    @SerializedName("first_name") var firstName: String? = null,
    @SerializedName("last_name")var lastname: String? = null
)