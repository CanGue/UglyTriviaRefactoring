
package com.adaptionsoft.games.trivia.runner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.adaptionsoft.games.uglytrivia.Game;

public class GameRunner {

	private static boolean notAWinner;

	public static void main(String[] args) {
		Game aGame = new Game();
		
		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");
		
		List<Integer> rollingDice = new ArrayList<Integer>();
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		
		List<Integer> wrongRightAnswer = new ArrayList<Integer>();
		wrongRightAnswer.add(1);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		
		Random rand = new Random();
		int roundCounter = 0;
	
		do {
			
			aGame.roll(rollingDice.get(roundCounter));
			
			if (wrongRightAnswer.get(roundCounter) == 7) {
				notAWinner = aGame.wrongAnswer();
			} else {
				notAWinner = aGame.wasCorrectlyAnswered();
			}
			
			roundCounter++;
			
		} while (notAWinner);
		
		System.out.println(aGame.gameMessage);
	}
}
