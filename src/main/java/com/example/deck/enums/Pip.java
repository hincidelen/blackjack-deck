package com.example.deck.enums;

public enum Pip {
	Ace(1), _2(2), _3(3), _4(4), _5(5), _6(6), _7(7), _8(8), _9(9), _10(10), Jack(10), Queen(10), King(10);

	private int value;

	Pip(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
}
