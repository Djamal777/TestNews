package com.example.testnews.repository

import com.example.testnews.api.RetrofitInstance

class NewsRepository{
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}