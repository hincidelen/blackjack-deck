package com.example;

import com.example.deck.Deck;

public interface IGameLogic {

	int getHumanValue(Deck deck);

	int getRobotValue(Deck deck);

}