package com.example.databindingdemo

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

/**
 *Created by Ankit Bajaj on 18-06-2020.
 */

@BindingAdapter("loadimgae")
fun loadImage(imageView: ImageView, url: String) {
    Glide.with(imageView.context)
        .setDefaultRequestOptions(RequestOptions().circleCrop())
        .load(url)
        .into(imageView)
}