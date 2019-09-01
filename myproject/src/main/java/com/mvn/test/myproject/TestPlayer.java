package com.mvn.test.myproject;

public class TestPlayer {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Player player1 = new Player();
		player1.setName("Andrew");
		player1.setAge(12);
		player1.setGame("Game of Thrones");
		
		System.out.println("Info on player1: " + player1.getName() + ", " + player1.getGame() + ", " + player1.getAge());
		System.out.println("Hey, It's pushed");

	}

}
