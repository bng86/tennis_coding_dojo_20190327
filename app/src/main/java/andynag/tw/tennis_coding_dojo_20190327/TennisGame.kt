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

        if (isDeuce(player1Score, player2Score)) {
            return "Deuce"
        } else {
            if (isSameScore(player1Score, player2Score)) {
                return "$player1ScoreTag All"
            } else {
                return "$player1ScoreTag/$player2ScoreTag"
            }
        }
    }

    private fun advantage(score1: Int, score2: Int): Boolean {
        if (score1 >= 3 && score2 >= 3) {
            if (score1 == score2 +1 || score2 == score1 +1) {
                return true
            } else {
                return false
            }
        }
        return false
    }

    private fun isSameScore(score1: Int, score2: Int): Boolean {
        return score1 == score2
    }

    private fun getScopeString(scope: Int): String {
        return when (scope) {
            0 -> "Love"
            1 -> "Fifteen"
            2 -> "Thirty"
            3 -> "Forty"
            else -> ""
        }
    }
    // TODO: NEXT ONE FIX
    private fun isDeuce(score1: Int, score2: Int): Boolean {
        var isSame = isSameScore(score1, score2)
        if (score1 >= 3 || score2 >= 3) {
            return isSame
        } else {
            return false
        }
    }

}
