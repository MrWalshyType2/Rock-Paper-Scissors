package com.qa.rps.utils;

public class StatMonitor {
	private int gamesPlayed = 0;
	private int computerWins = 0;
	private int humanWins = 0;
	private int ties = 0;
	private String mostCommonMove = null;

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getComputerWins() {
		return computerWins;
	}

	public void setComputerWins(int computerWins) {
		this.computerWins = computerWins;
	}

	public int getHumanWins() {
		return humanWins;
	}

	public void setHumanWins(int humanWins) {
		this.humanWins = humanWins;
	}

	public int getTies() {
		return ties;
	}

	public void setTies(int ties) {
		this.ties = ties;
	}

	public String getMostCommonMove() {
		return mostCommonMove;
	}

	public void setMostCommonMove(String mostCommonMove) {
		this.mostCommonMove = mostCommonMove;
	}

}
