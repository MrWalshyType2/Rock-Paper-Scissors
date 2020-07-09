package com.qa.rps;

import java.util.Random;
import java.util.logging.Logger;

import com.qa.rps.controller.Move;

public class Game {
	private boolean humanQuits = false;
	private boolean gameOver = false;
	private String playerMove;
	private String computerMove;
	private Move compMoveTmp;

	private static final Random RANDOM = new Random();

	public static final Logger LOG = Logger.getLogger(Move.class.getName());

	public void run() {
		LOG.info("Welcome to Rock, Paper, Scissors...");

		while (!(humanQuits)) {
			while (!(gameOver)) {
				LOG.info("Please enter your move: ");
				playerMove = Move.getMove();
				LOG.info("Player picked: " + playerMove);

//				compMoveTmp = (Move)Random.range(0, 3);
			}
		}
	}

}
