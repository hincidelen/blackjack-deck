package com.example;

import java.util.Scanner;

import com.example.deck.Deck;

public class Blackjack {

	private static Deck deck;
	private static Scanner scan;
	private static IGameLogic gameLogic;

	public static void main(String[] args) {
		Blackjack b = new Blackjack();

		scan = new Scanner(System.in);

		deck = new Deck();
		// Compares both scores. The largest score wins.
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