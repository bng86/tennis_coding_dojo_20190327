package andynag.tw.tennis_coding_dojo_20190327

import org.junit.Assert
import org.junit.Test

class TennisGameTest{

    @Test
    fun test_love_all() {
        val game = TennisGame("player1", "player2")
        val actual: String = game.getResult()
        Assert.assertEquals("Love All", actual)
    }

    @Test
    fun test_fifteen_love() {
        val game = TennisGame("player1", "player2")
        val actual = game.getResult()
        Assert.assertEquals("Fifteen/Love", actual)
    }
}