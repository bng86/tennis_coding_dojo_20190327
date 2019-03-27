package andynag.tw.tennis_coding_dojo_20190327

class TennisGame(player1: String, player2: String) {

    var player1Score = 1
    var player2Score = 0

    fun getResult(): String {
        if (player1Score == player2Score) {
            return "Love All"
        } else if (player1Score == 1 && player2Score == 0) {
            return "Fifteen/Love"
        } else {
            return ""
        }
    }

}
