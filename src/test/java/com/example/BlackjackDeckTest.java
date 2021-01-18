package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.example.deck.Deck;

public class BlackjackDeckTest {

	@Test
	public void testBlackjackDeckSize() {

		Deck deck = new Deck();
		assertEquals(52, deck.getCards().size());
	}

}
