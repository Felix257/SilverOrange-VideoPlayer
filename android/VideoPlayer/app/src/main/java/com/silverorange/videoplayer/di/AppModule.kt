package com.silverorange.videoplayer.di

import com.silverorange.videoplayer.data.VideosApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideVideos(): VideosApi {
        return Retrofit.Builder()
            .baseUrl("http://localhost:4000")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(VideosApi::class.java)
    }
}