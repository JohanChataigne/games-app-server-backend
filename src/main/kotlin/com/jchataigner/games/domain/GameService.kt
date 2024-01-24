package com.jchataigner.games.domain

import org.springframework.stereotype.Component
import java.net.URL

@Component
class GameService {

    private val games = listOf(
        Game(
            "1",
            "Ori and The Blind Forest",
            URL("https://image.jeuxvideo.com/medias/165287/1652867347-4164-jaquette-avant.jpg"),
            GameRating(4.7),
            setOf(GameCategory.ADVENTURE)
        ),
        Game(
            "2",
            "Rayman Legends",
            URL("https://image.jeuxvideo.com/medias-md/150981/1509805596-4618-card.jpg"),
            GameRating(4.5),
            setOf(GameCategory.PLATFORM)
        ),
        Game(
            "3",
            "The Legend of Zelda : Tears of the Kingdom",
            URL("https://image.jeuxvideo.com/medias/166323/1663231496-4522-jaquette-avant.jpg"),
            GameRating(4.7),
            setOf(GameCategory.ADVENTURE, GameCategory.ACTION)
        ),
        Game(
            "4",
            "Super Mario Bros. Wonder",
            URL("https://image.jeuxvideo.com/medias/170317/1703166833-1293-jaquette-avant.jpg"),
            GameRating(4.5),
            setOf(GameCategory.PLATFORM)
        ),
        Game(
            "5",
            "Horizon Forbidden West",
            URL("https://image.jeuxvideo.com/medias/169583/1695828435-6193-jaquette-avant.png"),
            GameRating(4.7),
            setOf(GameCategory.ACTION)
        ),
        Game(
            "6",
            "Assassin's Creed Mirage",
            URL("https://image.jeuxvideo.com/medias/169574/1695736870-1912-jaquette-avant.jpg"),
            GameRating(4.2),
            setOf(GameCategory.ACTION)
        ),
        Game(
            "7",
            "Elden Ring",
            URL("https://image.jeuxvideo.com/medias/163301/1633006670-7022-jaquette-avant.jpg"),
            GameRating(4.5),
            setOf(GameCategory.ACTION)
        ),
        Game(
            "8",
            "God of War",
            URL("https://image.jeuxvideo.com/medias/164200/1642003637-1975-jaquette-avant.jpg"),
            GameRating(5.0),
            setOf(GameCategory.ACTION)
        ),
        Game(
            "9",
            "Minecraft",
            URL("https://image.jeuxvideo.com/medias/148285/1482845269-1018-jaquette-avant.jpg"),
            GameRating(4.7),
            setOf(GameCategory.ADVENTURE)
        ),
    )

    fun getAllGames() = games
    fun getGameById(id: String) = games.firstOrNull { it.id == id }
}