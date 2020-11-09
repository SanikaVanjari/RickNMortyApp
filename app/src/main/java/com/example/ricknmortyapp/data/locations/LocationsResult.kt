package com.example.ricknmortyapp.data.locations


import com.google.gson.annotations.SerializedName

data class LocationsResult(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)