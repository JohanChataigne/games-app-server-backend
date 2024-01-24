package com.jchataigner.games.api

import com.jchataigner.games.domain.Game
import com.jchataigner.games.domain.GameCategory
import com.jchataigner.games.domain.GameRating
import com.jchataigner.games.domain.GameService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.net.URL

@RestController
@RequestMapping(path = ["games"])
class GamesController(
    private val gameService: GameService,
) {

    @GetMapping
    fun listGames(): List<GameDto> = gameService.getAllGames().map { it.toGameDto() }

    @GetMapping("{gameId}")
    fun getGameById(@PathVariable gameId: String) = gameService.getGameById(gameId)?.toGameDto()
}

data class GameDto(
    val id: String,
    val title: String,
    val imageUrl: URL,
    val rating: GameRating,
    val categories: Set<GameCategory>,
)

fun Game.toGameDto() = GameDto(id, title, imageUrl, rating, categories)