package com.silverorange.videoplayer.domain

import com.silverorange.videoplayer.domain.Author

data class VideosItem(
    val author: Author,
    val description: String,
    val fullURL: String,
    val hlsURL: String,
    val id: String,
    val publishedAt: String,
    val title: String
)