package com.adaptionsoft.games.trivia;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.junit.Test;

import com.adaptionsoft.games.uglytrivia.Game;

public class SomeTest {

	private static boolean notAWinner;

	@Test
	public void true_is_true() throws Exception {
		Game aGame = new Game();

		aGame.add("Chet");
		aGame.add("Pat");
		aGame.add("Sue");

		List<Integer> rollingDice = new ArrayList<Integer>();
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);
		rollingDice.add(1);
		rollingDice.add(2);
		rollingDice.add(5);
		rollingDice.add(4);

		List<Integer> wrongRightAnswer = new ArrayList<Integer>();
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(2);
		wrongRightAnswer.add(5);
		wrongRightAnswer.add(7);
		wrongRightAnswer.add(7);
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

		assertEquals("Chet was added\r\n" + "They are player number 1\r\n" + "Pat was added\r\n"
				+ "They are player number 2\r\n" + "Sue was added\r\n" + "They are player number 3\r\n"
				+ "Chet is the current player\r\n" + "They have rolled a 1\r\n" + "Chet's new location is 1\r\n"
				+ "The category is Science\r\n" + "Science Question 0\r\n" + "Question was incorrectly answered\r\n"
				+ "Chet was sent to the penalty box\r\n" + "Pat is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Pat's new location is 2\r\n" + "The category is Sports\r\n" + "Sports Question 0\r\n"
				+ "Answer was corrent!!!!\r\n" + "Pat now has 1 Gold Coins.\r\n" + "Sue is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Sue's new location is 5\r\n" + "The category is Science\r\n"
				+ "Science Question 1\r\n" + "Answer was corrent!!!!\r\n" + "Sue now has 1 Gold Coins.\r\n"
				+ "Chet is the current player\r\n" + "They have rolled a 4\r\n"
				+ "Chet is not getting out of the penalty box\r\n" + "Question was incorrectly answered\r\n"
				+ "Chet was sent to the penalty box\r\n" + "Pat is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Pat's new location is 3\r\n" + "The category is Rock\r\n" + "Rock Question 0\r\n"
				+ "Question was incorrectly answered\r\n" + "Pat was sent to the penalty box\r\n"
				+ "Sue is the current player\r\n" + "They have rolled a 2\r\n" + "Sue's new location is 7\r\n"
				+ "The category is Rock\r\n" + "Rock Question 1\r\n" + "Answer was corrent!!!!\r\n"
				+ "Sue now has 2 Gold Coins.\r\n" + "Chet is the current player\r\n" + "They have rolled a 5\r\n"
				+ "Chet is getting out of the penalty box\r\n" + "Chet's new location is 6\r\n"
				+ "The category is Sports\r\n" + "Sports Question 1\r\n" + "Answer was correct!!!!\r\n"
				+ "Chet now has 1 Gold Coins.\r\n" + "Pat is the current player\r\n" + "They have rolled a 4\r\n"
				+ "Pat is not getting out of the penalty box\r\n" + "Question was incorrectly answered\r\n"
				+ "Pat was sent to the penalty box\r\n" + "Sue is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Sue's new location is 8\r\n" + "The category is Pop\r\n" + "Pop Question 0\r\n"
				+ "Question was incorrectly answered\r\n" + "Sue was sent to the penalty box\r\n"
				+ "Chet is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Chet is not getting out of the penalty box\r\n" + "Pat is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Pat is getting out of the penalty box\r\n"
				+ "Pat's new location is 8\r\n" + "The category is Pop\r\n" + "Pop Question 1\r\n"
				+ "Answer was correct!!!!\r\n" + "Pat now has 2 Gold Coins.\r\n" + "Sue is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Sue is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Sue was sent to the penalty box\r\n"
				+ "Chet is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Chet is getting out of the penalty box\r\n" + "Chet's new location is 7\r\n"
				+ "The category is Rock\r\n" + "Rock Question 2\r\n" + "Question was incorrectly answered\r\n"
				+ "Chet was sent to the penalty box\r\n" + "Pat is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Pat is not getting out of the penalty box\r\n" + "Sue is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Sue is getting out of the penalty box\r\n"
				+ "Sue's new location is 1\r\n" + "The category is Science\r\n" + "Science Question 2\r\n"
				+ "Answer was correct!!!!\r\n" + "Sue now has 3 Gold Coins.\r\n" + "Chet is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Chet is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Chet was sent to the penalty box\r\n"
				+ "Pat is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Pat is getting out of the penalty box\r\n" + "Pat's new location is 9\r\n"
				+ "The category is Science\r\n" + "Science Question 3\r\n" + "Question was incorrectly answered\r\n"
				+ "Pat was sent to the penalty box\r\n" + "Sue is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Sue is not getting out of the penalty box\r\n" + "Chet is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Chet is getting out of the penalty box\r\n"
				+ "Chet's new location is 0\r\n" + "The category is Pop\r\n" + "Pop Question 2\r\n"
				+ "Answer was correct!!!!\r\n" + "Chet now has 2 Gold Coins.\r\n" + "Pat is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Pat is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Pat was sent to the penalty box\r\n"
				+ "Sue is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Sue is getting out of the penalty box\r\n" + "Sue's new location is 2\r\n"
				+ "The category is Sports\r\n" + "Sports Question 2\r\n" + "Question was incorrectly answered\r\n"
				+ "Sue was sent to the penalty box\r\n" + "Chet is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Chet is not getting out of the penalty box\r\n" + "Pat is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Pat is getting out of the penalty box\r\n"
				+ "Pat's new location is 2\r\n" + "The category is Sports\r\n" + "Sports Question 3\r\n"
				+ "Answer was correct!!!!\r\n" + "Pat now has 3 Gold Coins.\r\n" + "Sue is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Sue is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Sue was sent to the penalty box\r\n"
				+ "Chet is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Chet is getting out of the penalty box\r\n" + "Chet's new location is 1\r\n"
				+ "The category is Science\r\n" + "Science Question 4\r\n" + "Question was incorrectly answered\r\n"
				+ "Chet was sent to the penalty box\r\n" + "Pat is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Pat is not getting out of the penalty box\r\n" + "Sue is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Sue is getting out of the penalty box\r\n"
				+ "Sue's new location is 7\r\n" + "The category is Rock\r\n" + "Rock Question 3\r\n"
				+ "Answer was correct!!!!\r\n" + "Sue now has 4 Gold Coins.\r\n" + "Chet is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Chet is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Chet was sent to the penalty box\r\n"
				+ "Pat is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Pat is getting out of the penalty box\r\n" + "Pat's new location is 3\r\n"
				+ "The category is Rock\r\n" + "Rock Question 4\r\n" + "Question was incorrectly answered\r\n"
				+ "Pat was sent to the penalty box\r\n" + "Sue is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Sue is not getting out of the penalty box\r\n" + "Chet is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Chet is getting out of the penalty box\r\n"
				+ "Chet's new location is 6\r\n" + "The category is Sports\r\n" + "Sports Question 4\r\n"
				+ "Answer was correct!!!!\r\n" + "Chet now has 3 Gold Coins.\r\n" + "Pat is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Pat is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Pat was sent to the penalty box\r\n"
				+ "Sue is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Sue is getting out of the penalty box\r\n" + "Sue's new location is 8\r\n"
				+ "The category is Pop\r\n" + "Pop Question 3\r\n" + "Question was incorrectly answered\r\n"
				+ "Sue was sent to the penalty box\r\n" + "Chet is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Chet is not getting out of the penalty box\r\n" + "Pat is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Pat is getting out of the penalty box\r\n"
				+ "Pat's new location is 8\r\n" + "The category is Pop\r\n" + "Pop Question 4\r\n"
				+ "Answer was correct!!!!\r\n" + "Pat now has 4 Gold Coins.\r\n" + "Sue is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Sue is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Sue was sent to the penalty box\r\n"
				+ "Chet is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Chet is getting out of the penalty box\r\n" + "Chet's new location is 7\r\n"
				+ "The category is Rock\r\n" + "Rock Question 5\r\n" + "Question was incorrectly answered\r\n"
				+ "Chet was sent to the penalty box\r\n" + "Pat is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Pat is not getting out of the penalty box\r\n" + "Sue is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Sue is getting out of the penalty box\r\n"
				+ "Sue's new location is 1\r\n" + "The category is Science\r\n" + "Science Question 5\r\n"
				+ "Answer was correct!!!!\r\n" + "Sue now has 5 Gold Coins.\r\n" + "Chet is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Chet is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Chet was sent to the penalty box\r\n"
				+ "Pat is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Pat is getting out of the penalty box\r\n" + "Pat's new location is 9\r\n"
				+ "The category is Science\r\n" + "Science Question 6\r\n" + "Question was incorrectly answered\r\n"
				+ "Pat was sent to the penalty box\r\n" + "Sue is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Sue is not getting out of the penalty box\r\n" + "Chet is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Chet is getting out of the penalty box\r\n"
				+ "Chet's new location is 0\r\n" + "The category is Pop\r\n" + "Pop Question 5\r\n"
				+ "Answer was correct!!!!\r\n" + "Chet now has 4 Gold Coins.\r\n" + "Pat is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Pat is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Pat was sent to the penalty box\r\n"
				+ "Sue is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Sue is getting out of the penalty box\r\n" + "Sue's new location is 2\r\n"
				+ "The category is Sports\r\n" + "Sports Question 5\r\n" + "Question was incorrectly answered\r\n"
				+ "Sue was sent to the penalty box\r\n" + "Chet is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Chet is not getting out of the penalty box\r\n" + "Pat is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Pat is getting out of the penalty box\r\n"
				+ "Pat's new location is 2\r\n" + "The category is Sports\r\n" + "Sports Question 6\r\n"
				+ "Answer was correct!!!!\r\n" + "Pat now has 5 Gold Coins.\r\n" + "Sue is the current player\r\n"
				+ "They have rolled a 4\r\n" + "Sue is not getting out of the penalty box\r\n"
				+ "Question was incorrectly answered\r\n" + "Sue was sent to the penalty box\r\n"
				+ "Chet is the current player\r\n" + "They have rolled a 1\r\n"
				+ "Chet is getting out of the penalty box\r\n" + "Chet's new location is 1\r\n"
				+ "The category is Science\r\n" + "Science Question 7\r\n" + "Question was incorrectly answered\r\n"
				+ "Chet was sent to the penalty box\r\n" + "Pat is the current player\r\n" + "They have rolled a 2\r\n"
				+ "Pat is not getting out of the penalty box\r\n" + "Sue is the current player\r\n"
				+ "They have rolled a 5\r\n" + "Sue is getting out of the penalty box\r\n"
				+ "Sue's new location is 7\r\n" + "The category is Rock\r\n" + "Rock Question 6\r\n"
				+ "Answer was correct!!!!\r\n" + "Sue now has 6 Gold Coins.\r\n", aGame.gameMessage.toString());
	}
}
