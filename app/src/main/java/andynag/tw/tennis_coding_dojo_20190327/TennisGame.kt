package andynag.tw.tennis_coding_dojo_20190327

class TennisGame(val player1: String, val player2: String) {

    var player1Score: Int
    var player2Score: Int

    init {
        player1Score = 0
        player2Score = 0
    }

    fun getResult(): String {
        var player1ScoreTag = getScopeString(player1Score)
        var player2ScoreTag = getScopeString(player2Score)

        if(player1Score >= 3 && player2Score >=3){

            if(player1Score - player2Score > 2){
                return "$player1 win"
            }else{
                return "$player2 win"
            }
        }

        if (isDeuce(player1Score, player2Score)) {
            return "Deuce"
        } else if (advantage(player1Score, player2Score)) {
            var name = if (player1Score > player2Score) {
                 player1
            } else {
                player2
            }
            return "Advantage, $name"
        } else {
            if (isSameScore(player1Score, player2Score)) {
                return "$player1ScoreTag All"
            } else {
                return "$player1ScoreTag/$player2ScoreTag"
            }
        }
    }

    private fun someoneWin(score1: Int, score2: Int): Boolean {

        var max = Math.max(score1, score2)
        var min = Math.min(score1, score2)
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
        var isSame = isSameScore(score1, score2)
        if (score1 >= 3 || score2 >= 3) {
            return isSame
        } else {
            return false
        }
    }

}
