package com.glite.bookstorebackend.domain.dto

data class BookDto(
    val isbn: String? = null,
    val title: String? = null,
    val description: String? = null,
    val image: String? = null,
    val author: AuthorSummaryDto? = null,
)
