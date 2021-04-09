package com.oxcoding.moviemvvm.data.vo


import androidx.room.Entity
import com.google.gson.annotations.SerializedName


data class Movie(
    val collectionId: Int,
    @SerializedName("artworkUrl100")
    val artworkUrl100: String,
    @SerializedName("releaseDate")
    val releaseDate: String,
    val collectionName: String
)  {
     companion object {
         const val TABLE_NAME = "Movies"
     }
 }