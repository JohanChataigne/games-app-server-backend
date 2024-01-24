package com.jchataigner.games.infra.serialization.json

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import com.jchataigner.games.domain.GameRating
import org.springframework.boot.jackson.JsonComponent

@JsonComponent
class GameRatingSerializer : JsonSerializer<GameRating>() {
    override fun serialize(rating: GameRating, generator: JsonGenerator, p2: SerializerProvider) {
        return generator.writeNumber(rating.value)
    }
}