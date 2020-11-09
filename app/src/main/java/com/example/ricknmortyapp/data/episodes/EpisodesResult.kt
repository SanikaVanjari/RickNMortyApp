package com.example.ricknmortyapp.data.episodes


import com.google.gson.annotations.SerializedName

data class EpisodesResult(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val episodes: List<Episode>
)