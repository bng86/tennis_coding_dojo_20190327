package andynag.tw.tennis_coding_dojo_20190327

import org.junit.Assert
import org.junit.Test

class TennisGameTest{

    @Test
    fun test_love_all() {
        val game = TennisGame("player1", "player2")
        game.player1Score = 0
        game.player2Score = 0
        val actual: String = game.getResult()
        Assert.assertEquals("Love All", actual)
    }

    @Test
    fun test_fifteen_love() {
        val game = TennisGame("player1", "player2")
        game.player1Score = 1
        game.player2Score = 0
        val actual = game.getResult()
        Assert.assertEquals("Fifteen/Love", actual)
    }


    @Test
    fun test_love_fifteen() {
        val game = TennisGame("player1", "player2")
        game.player1Score = 0
        game.player2Score = 1
        val actual = game.getResult()
        Assert.assertEquals("Love/Fifteen", actual)
    }
}