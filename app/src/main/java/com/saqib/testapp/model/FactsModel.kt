package com.saqib.testapp.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class FactsModel(
    @SerializedName("title") val title: String,
    @SerializedName("rows") val rows: ArrayList<FactsRowsModel>
) : Parcelable