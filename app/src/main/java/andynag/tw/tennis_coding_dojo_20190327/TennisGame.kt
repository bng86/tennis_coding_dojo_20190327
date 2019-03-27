package andynag.tw.tennis_coding_dojo_20190327

class TennisGame(val player1: String, val player2: String) {

    var player1Score: Int = 0
    var player2Score: Int = 0

    fun getResult(): String {
        val player1ScoreTag = getScopeString(player1Score)
        val player2ScoreTag = getScopeString(player2Score)

        if (isDeuce(player1Score, player2Score)) {
            return "Deuce"
        } else if (advantage(player1Score, player2Score)) {
            val name = if (player1Score > player2Score) {
                 player1
            } else {
                player2
            }
            return "Advantage, $name"
        }else if(player1Score > 3 || player2Score > 3 && someoneWin(player1Score, player2Score)){
            return if(player1Score - player2Score >= 2){
                "$player1 Win"
            }else{
                "$player2 Win"
            }
        } else {
            return if (isSameScore(player1Score, player2Score)) {
                "$player1ScoreTag All"
            } else {
                "$player1ScoreTag/$player2ScoreTag"
            }
        }
    }

    private fun someoneWin(score1: Int, score2: Int): Boolean {
        val max = Math.max(score1, score2)
        val min = Math.min(score1, score2)
        if (max >= min + 2) {
            return true
        }
        return false
    }

    private fun advantage(score1: Int, score2: Int): Boolean {
        if (score1 >= 3 && score2 >= 3) {
            if (score1 == score2 +1 || score2 == score1 +1) {
                return true
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
        val isSame = isSameScore(score1, score2)
        return if (score1 >= 3 || score2 >= 3) {
            isSame
        } else {
            false
        }
    }

}
