package com.silverorange.videoplayer.data

import com.silverorange.videoplayer.domain.Videos
import retrofit2.Response
import retrofit2.http.GET

interface VideosApi {

    @GET("/videos")
    suspend fun getVideos(): Response<Videos>
}