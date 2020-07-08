package com.qa.rps.controller;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.qa.rps.utils.Utilities;

public enum Move {
	ROCK, PAPER, SCISSORS;

	public static final Logger LOG = Logger.getLogger(Move.class.getName());

	private Move() {

	}

	public static void printMoves() {
		for (Move move : Move.values()) {
			System.out.println(move);
		}
	}

	public static String getMove() {
		Move move;

		while (true) {
			try {
				move = Move.valueOf(Utilities.getInput().toUpperCase());
				break;
			} catch (IllegalArgumentException e) {
				LOG.log(Level.WARNING, "Please enter a valid move");
			}
		}
		return move.toString();
	}
}
