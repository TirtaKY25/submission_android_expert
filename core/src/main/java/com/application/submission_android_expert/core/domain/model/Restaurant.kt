package com.application.submission_android_expert.core.domain.model

import com.application.submission_android_expert.core.data.source.remote.response.CategoriesItem

data class Restaurant(
    val id: String,
    val name: String,
    val pictureId: String,
    val city: String,
    val address: String,
    val rating: Double,
    val description: String,
    var isFavorite: Boolean,
    val categories: List<CategoriesItem>
)