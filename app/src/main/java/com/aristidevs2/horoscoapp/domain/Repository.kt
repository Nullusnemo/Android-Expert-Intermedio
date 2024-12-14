package com.aristidevs2.horoscoapp.domain

import com.aristidevs2.horoscoapp.data.network.response.PredictionResponse
import com.aristidevs2.horoscoapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sign:String): PredictionModel?



}