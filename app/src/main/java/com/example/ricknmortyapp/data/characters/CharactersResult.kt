package com.example.ricknmortyapp.data.characters


import com.google.gson.annotations.SerializedName

data class CharactersResult(
    @SerializedName("info")
    val info: Info,
    @SerializedName("results")
    val results: List<Result>
)