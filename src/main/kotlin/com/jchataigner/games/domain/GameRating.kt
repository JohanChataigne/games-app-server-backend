package com.jchataigner.games.domain

class GameRating(val value: Double) {

    init {
        if (!isValid(value)) throw IllegalArgumentException("Invalid game rating!")
    }

    companion object {
        fun isValid(value: Double) = value in 0.0..5.0
    }
}