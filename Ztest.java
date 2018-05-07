package com.thought.works.controller;

import com.thought.works.model.Player;

public interface Battle {

	/**
	 * Initialize the basic setup
	 */
	void initialize(Player player1, Player player2);
	
	
	/**
	 * Perform fight between two player.
	 * @param player1 : details of player 1 
	 * @param player2 : details of player2
	 */
	void fight(Player player1, Player player2);
}
