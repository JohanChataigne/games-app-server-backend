package com.jchataigner.games.domain

import java.net.URL

enum class GameCategory {
    ACTION,
    ADVENTURE,
    PLATFORM,
}

data class Game(
    val id: String,
    val title: String,
    val imageUrl: URL,
    val rating: GameRating,
    val categories: Set<GameCategory>,
)