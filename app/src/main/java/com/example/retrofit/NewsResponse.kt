package com.example.retrofit

data class NewsResponse(
    val articles : MutableList<Article>,
    val status : String,
    val totalResults : Int
)