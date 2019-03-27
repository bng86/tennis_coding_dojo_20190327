package andynag.tw.tennis_coding_dojo_20190327

class TennisGame(player1: String, player2: String) {

    var player1Score: Int
    var player2Score: Int

    init {
        player1Score = 0
        player2Score = 0
    }

    fun getResult(): String {
        var player1ScoreTag = getScopeString(player1Score)
        var player2ScoreTag = getScopeString(player2Score)

        if (player1Score == player2Score) {
            return "$player1ScoreTag All"
        } else if (player1Score == 1 && player2Score == 0) {
            return "$player1ScoreTag/$player2ScoreTag"
        } else if (player1Score == 0 && player2Score == 1) {
            return "$player1ScoreTag/$player2ScoreTag"
        } else if (player1Score == 2 && player2Score == 0) {
            return "$player1ScoreTag/$player2ScoreTag"
        } else {
            return ""
        }
    }

    private fun getScopeString(scope: Int): String {
        return when (scope) {
            0 -> "Love"
            1 -> "Fifteen"
            2 -> "Thirty"
            else -> ""
        }
    }

}
