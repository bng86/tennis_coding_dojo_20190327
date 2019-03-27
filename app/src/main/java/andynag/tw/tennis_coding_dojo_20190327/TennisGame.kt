package andynag.tw.tennis_coding_dojo_20190327

class TennisGame(player1: String, player2: String) {

    var player1Score :Int
    var player2Score :Int
    init {
        player1Score = 0
        player2Score = 0
    }

    fun getResult(): String {
        var player1ScoreTag = "Love"
        var player2ScoreTag = "Love"

        when(player1Score) {
            0 -> player1ScoreTag = "Love"
            1 -> player1ScoreTag = "Fifteen"
        }

        if (player1Score == player2Score) {
            return "Love All"
        } else if (player1Score == 1 && player2Score == 0) {
            return "Fifteen/Love"
        } else if (player1Score == 0 && player2Score == 1) {
            return "Love/Fifteen"
        } else {
            return ""
        }
    }

}
