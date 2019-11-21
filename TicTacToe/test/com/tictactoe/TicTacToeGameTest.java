package com.tictactoe;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.tictactoe.TicTacToeGame;

public class TicTacToeGameTest {
	
	@Test
	public void startNewGame() {
		TicTacToeGame game = new TicTacToeGame("Player name");
		assertNotNull(game);
	}

}
