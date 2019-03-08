package net.simplifiedcoding

data class Movie(
    val id: Int,
    val image: String,
    val isNew: Boolean,
    val rating: String,
    val likePercent: Int,
    val voteCount: Int,
    val title:String,
    val language:String,
    val type: String
)