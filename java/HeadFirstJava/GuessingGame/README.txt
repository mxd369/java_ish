GUESSING GAME

Summary:

The guessing game involves a 'game' object and three 'player' objects.
The game generates a random number between 0 and 9, and the three player objects try to guess it.

Classes:
GuessGame.class
Player.class
GameLauncher.class

Logic:
1) The GameLauncher class is where the applications starts; it has the main() method.
2) In the main() method, a GuessGame object is created, and its startGame() method is called
3) The GuessGame object's startGame() method is where the entire game plays out.
It creates three players, then 'thinks' of a random number( the target for the players to guess).
It then asks each player to guess, checks the result,
and either prints out informationa bout the winning player(s) or asks them to guess again.


https://docs.oracle.com/javase/7/docs/api/java/util/Random.html

import java.util.Random;

==================================================




----------------------------
Game Launcher
----------------------------
knows (instance variables):

----------------------------
does (methods):
// makes GuessGame object and teels it to startGame

  main(String[] args)
----------------------------




----------------------------
GuessGame
----------------------------
knows (instance variables):
// instance variables for the three players
  p1
  p2
  p3
----------------------------
does (methods):
  startGame()
----------------------------




----------------------------
Player
----------------------------
knows (instance variables):
// the number this player guessed
  p1
  p2
  p3
----------------------------
does (methods):
// method for making a guess
  guess()
----------------------------
