package com.aristidevs2.horoscoapp.data.network.response

import com.aristidevs.horoscapp.data.network.HoroscopeApiService
import com.aristidevs2.horoscoapp.data.RepositoryImpl
import com.aristidevs2.horoscoapp.domain.Repository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)

object NetworkModule {

    @Provides
    @Singleton
    fun providesRetrofit(): Retrofit {
        return Retrofit
            .Builder()
            .baseUrl("https://newastro.vercel.app/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun providesHoroscopeApiService(retrofit: Retrofit):HoroscopeApiService{
        return retrofit.create(HoroscopeApiService::class.java)

    }

    @Provides
    fun provideRepository(apiService: HoroscopeApiService):Repository {
        return RepositoryImpl(apiService)

    }
}