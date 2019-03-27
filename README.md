# tennis game coding dojo

## 活動內容

+ 已 pair programming 形式進行，一組 7 分鐘
  + 一位 driver (輸入程式碼的人)，一位 navigator (審查程式碼的人)
  + 下一輪時 navigator 變成 driver 跟下一個 navigator 再變成一組
+ 採自願排隊上台輪流 pair
+ 本次 coding dojo 採用的題目是 [tennis game](https://en.wikipedia.org/wiki/Tennis#Scoring) 

## 活動目標

+ 上台膽量
+ 不是做完，是從別人身上偷學一些思考及技巧

## 活動規則

+ 要寫測試
+ 有紅燈時要先修測試
+ 有紅燈時不能重構
+ 要寫 production code 要有測試
+ 每一輪時間到的時候至少要可以編譯

## tennis game 遊戲需求

This Kata is about implementing a simple tennis game. I came up with it while thinking about Wii tennis, where they have simplified tennis, so each set is one game.

The scoring system is rather simple:

1. Each player can have either of these points in one game 0 15 30 40

2. If you have 40 and you win the ball you win the game, however there are special rules.

3. If both have 40 the players are deuce. a. If the game is in deuce, the winner of a ball will have advantage and game ball. b. If the player with advantage wins the ball he wins the game c. If the player without advantage wins they are back at deuce.

##test case

 player1 = Foo
 player2 = Bar
 
 + score = 0:0 output = 'Love all'
 + score = 1:0 output = 'Fifteen/Love'
 + score = 2:0 output = 'Thirty/Love'
 + score = 3:0 output = 'Forty/Love'
 + score = 4:0 output = 'Foo win'
 + score = 3:3 output = 'Deuce'
 + score = 4:5 output = 'Advantage, Bar'
