package com.aristidevs2.horoscoapp.domain.usecase

import com.aristidevs2.horoscoapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository){

    suspend operator fun invoke(sign:String) = repository.getPrediction(sign)


}