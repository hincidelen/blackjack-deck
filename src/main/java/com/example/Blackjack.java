package com.example;

import com.example.deck.Deck;

public class Blackjack {

	private static Deck deck;
	private static IGameLogic gameLogic;

	public static void main(String[] args) {
		// Basic game logic
		deck = new Deck();
		int humanValue = gameLogic.getHumanValue(deck);
		int robotValue = gameLogic.getRobotValue(deck);

		if (humanValue > 21 || (robotValue <= 21 && humanValue < robotValue)) {
			System.out.println("ROBOT WINS!!!");
		} else if (humanValue == robotValue) {
			System.out.println("DRAW!!!");
		} else {
			System.out.println("YOU WIN!!!");
		}
	}
}