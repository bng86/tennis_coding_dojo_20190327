package andynag.tw.tennis_coding_dojo_20190327

import org.junit.Assert
import org.junit.Test

class TennisGameTest {

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

    @Test
    fun test_thirty_love() {
        val game = TennisGame("player1", "player2")
        game.player1Score = 2
        game.player2Score = 0
        val actual = game.getResult()
        Assert.assertEquals("Thirty/Love", actual)
    }

    @Test
    fun test_Forty_Love() {
        val game = TennisGame("player1", "player2")
        game.player1Score = 3
        game.player2Score = 0
        val actual = game.getResult()
        Assert.assertEquals("Forty/Love", actual)
    }

    @Test
    fun test_deuce_3_3() {
        val game = TennisGame("player1", "player2")
        game.player1Score = 3
        game.player2Score = 3
        val actual = game.getResult()
        Assert.assertEquals("Deuce", actual)
    }

    @Test
    fun test_deuce_4_4() {
        val game = TennisGame("player1", "player2")
        game.player1Score = 4
        game.player2Score = 4
        val actual = game.getResult()
        Assert.assertEquals("Deuce", actual)
    }

    @Test
    fun test_Advantage_Bar() {
        val game = TennisGame("player1", "Bar")
        game.player1Score = 4
        game.player2Score = 5
        val actual = game.getResult()
        Assert.assertEquals("Advantage, Bar", actual)
    }
}