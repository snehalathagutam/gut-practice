package com.tictactoe;

import java.util.Scanner;

public class Game1 {

	static Scanner sc = new Scanner(System.in);
	private static char[][] board = new char[3][3];

	private static void boardIntialize() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = ' ';
			}
		}
	}

	private static void box() {
		System.out.println("-------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(board[i][j] + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}

	public static void main(String[] args) {
		System.out.println("--------- Tic-Tac-Toe ----------");

		boolean playAgain = true;
		while (playAgain) {

			boardIntialize();
			char player = 'X';

			while (true) {

				box();
				playerMove(player);
				if (checkWin(player)) {
					box();
					System.out.println("Player " + player + " Wins!");
					break;
				}
				if (isDraw()) {
					box();
					System.out.println("Game Draw!");
					break;
				}
				player = switchPlayer(player);
			}
			System.out.print("Do you want to play again? (y/n): ");
			char ch = sc.next().charAt(0);

			if (ch == 'n' || ch == 'N') {
				playAgain = false;
			}
		}
	}

	private static void playerMove(char player) {

		while (true) {
			System.out.println("Player " + player + " turn");
			System.out.println("Enter numbers from 0-2 for rows  :");
			int row = sc.nextInt();

			System.out.println("Enter numbers from 0-2 for colums  :");
			int col = sc.nextInt();

			if (row < 0 || row > 2 || col < 0 || col > 2) {

				System.out.println("Invalid Position! Try again.");
				continue;
			}
			if (board[row][col] != ' ') {
				System.out.println("Cell already filled!");
				continue;
			}
			board[row][col] = player;
			break;

		}
	}

	private static char switchPlayer(char player) {
		return (player == 'X') ? 'O' : 'X';
	}

	private static boolean checkWin(char player) {

		for (int i = 0; i < 3; i++) {
			if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
				return true;

			}
		}
		for (int j = 0; j < 3; j++) {
			if (board[0][j] == player && board[1][j] == player && board[2][j] == player) {
				return true;
			}
		}
		if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
			return true;
		}

		if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
			return true;
		}

		return false;
	}

	private static boolean isDraw() {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == ' ') {
					return false;
				}
			}
		}
		return true;
	}

}
