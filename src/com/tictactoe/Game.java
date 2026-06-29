package com.tictactoe;

import java.util.Scanner;

public class Game {

	static char[][] board = { { ' ', ' ', ' ' }, { ' ', ' ', ' ' }, { ' ', ' ', ' ' } };
	static char player = 'X';
	static int row;
	static int col;
	

	static void displayBoard() {
		System.out.println("-------------");
		for (char ch[] : board) {
			System.out.print("| ");

			for (char c : ch) {
				System.out.print(" " + " | ");
			}
			System.out.println();
			System.out.println("-------------");
		}
	}
	static boolean validPosition() {
		if((row>=0 && row<=2)&&(col>=0&&col<=2)&&(board[row][col]==' ')) {
			
			return true;
		}
		else {
			System.out.println("Enter a valid Position...");
			player=player;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		displayBoard();
		while(true) {
			System.out.println(player+" is playing: ");
			System.out.println("Enter row:");
			 row=sc.nextInt();
			System.out.println("Enter column:");
			 col=sc.nextInt();
			 if(validPosition()) {
				 board[row][col]=player;
				 displayBoard();
			 }
			 if(player=='X') {
				 player='O';
			 }
			 else
			 {
				 player='X';
			 }
			
		}

	}

}
