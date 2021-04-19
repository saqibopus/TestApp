package com.saqib.testapp.helper

import android.content.Context
import android.widget.ImageView
import com.google.gson.Gson
import com.saqib.testapp.R
import com.saqib.testapp.model.FactsModel
import com.squareup.picasso.Picasso

fun ImageView.loadImage(context: Context, url: String?) {
    url?.let {
        Picasso
            .get()
            .load(it)
            .placeholder(R.drawable.ic_launcher_foreground)
            .error(R.drawable.ic_launcher_background)
            .into(this)
    }
}

fun getMockFactsList(): FactsModel {
    return Gson().fromJson<FactsModel>(Constants.Mock.MockString, FactsModel::class.java)
}
