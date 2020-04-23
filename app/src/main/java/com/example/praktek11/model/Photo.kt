package com.example.praktek11.model

import com.google.gson.annotations.SerializedName
import retrofit2.http.Body

data class Photo (
    @SerializedName("id")
    val id: Int?,
    @SerializedName("title")
    val title: String?,
    @SerializedName("thumbnailUrl")
    val thumbnail: String?,
    @SerializedName("url")
    val body: String?

)