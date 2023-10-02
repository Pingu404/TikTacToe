import java.util.Scanner;

public class Gorm {
	//this is the public strings that all of the functions pull from! there are also some varubles I use in it
	public String[] row1 = { "__", "__", "__"};
	public String[] row2 = { "__", "__", "__"};
	public String[] row3 = { "__", "__", "__"};
	public int turns = 0;
	public int xWins = 0;
	public int oWins = 0;
	
	//main function
	Gorm() {
		System.out.println("Welcome!!!");
		xTurn();
	}
	
	public void xTurn() {
		
		//enter the row
		System.out.println("Please enter the row");
		Scanner scanner1 = new Scanner(System.in);
		String rowX = scanner1.nextLine();
		//enter the collom
		System.out.println("what is the colloum");
		Scanner scanner2 = new Scanner(System.in);
		String input1 = scanner2.nextLine();
		int  colX = Integer.parseInt(input1);
		//makes the move by checking if the move and if it is not __ then you cannt make that move
		if ((rowX.equals("1"))&&(row1[colX].equals("__"))) {
			row1[colX] = "X ";
			} 
		else if ((rowX.equals("2")&&(row2[colX] == "__"))) {
				row2[colX] = "X ";
		}
		else if ((rowX.equals("3")&&(row3[colX] == "__"))) {
				row3[colX] = "X ";
			}
		else {
			System.out.println("Invalid Move");
			xTurn();
		}
		turns++;
		System.out.println("  0  1  2");
		System.out.println("1 "+row1[0]+"|"+row1[1]+"|"+row1[2]);
		System.out.println("2 "+row2[0]+"|"+row2[1]+"|"+row2[2]);
		System.out.println("3 "+row3[0]+"|"+row3[1]+"|"+row3[2]);
		
		//checks for if each row all equal X, if they do that player wins, and it asks to play again
				if ((row1[0].equals("X "))&&(row1[1].equals("X "))&&(row1[2].equals("X "))) {
					xWon();
				} else if ((row2[0].equals("X "))&&(row2[1].equals("X "))&&(row2[2].equals("X "))) {
					xWon();
				} else if ((row2[0].equals("X "))&&(row2[1].equals("X "))&&(row2[2].equals("X "))) {
					xWon();
				} else if (turns == 9) {
					tie();
				}
				oTurn();
	}
	
	public void oTurn() {
		//enter the row
				System.out.println("Please enter the row");
				Scanner scanner1 = new Scanner(System.in);
				String rowO = scanner1.nextLine();
				//enter the collom
				System.out.println("what is the colloum");
				Scanner scanner2 = new Scanner(System.in);
				String input1 = scanner2.nextLine();
				int  colO = Integer.parseInt(input1);
				//makes the move by checking if the move and if it is not __ then you cannt make that move
				if ((rowO.equals("1"))&&(row1[colO].equals("__"))) {
					row1[colO] = "0 ";
					} 
				else if ((rowO.equals("2")&&(row2[colO] == "__"))) {
						row2[colO] = "0 ";
				}
				else if ((rowO.equals("3")&&(row3[colO] == "__"))) {
						row3[colO] = "0 ";
					}
				else {
					System.out.println("Invalid Move");
					oTurn();
				}
				turns++;
				System.out.println("  0  1  2");
				System.out.println("1 "+row1[0]+"|"+row1[1]+"|"+row1[2]);
				System.out.println("2 "+row2[0]+"|"+row2[1]+"|"+row2[2]);
				System.out.println("3 "+row3[0]+"|"+row3[1]+"|"+row3[2]);
				
				//checks for if each row all equal X, if they do that player wins, and it asks to play again
						if ((row1[0].equals("0 "))&&(row1[1].equals("0 "))&&(row1[2].equals("0 "))) {
							oWon();
						} else if ((row2[0].equals("0 "))&&(row2[1].equals("0 "))&&(row2[2].equals("0 "))) {
							oWon();
						} else if ((row2[0].equals("0 "))&&(row2[1].equals("0 "))&&(row2[2].equals("0 "))) {
							System.out.println("0 Wins");
						}
						xTurn();
		
					}
	
	public void xWon() {
		//handels all of the play again if x has won the game, it asks if you want to play again dose it
		xWins++;
		System.out.println("X WON!!!");
		System.out.println("X has won"+xWins+"times!");
		System.out.println("Would you like to play again? y/n");
		Scanner scanner2 = new Scanner(System.in);
		String yorn = scanner2.nextLine();
		if (yorn.equals("y")) {
			new Gorm();
		} else {
			System.out.println("Thanks for playing!");
			System.exit(0);
		}
	}
		
	
		public void oWon() {
			//Handles all of the play again if 0 has won the game, it asks if you want to play again dose it
			oWins++;
			System.out.println("0 WON!!!");
			System.out.println("0 has won"+oWins+"times!");
			System.out.println("Would you like to play again? y/n");
			Scanner scanner2 = new Scanner(System.in);
			String yorn = scanner2.nextLine();
			if (yorn.equals("y")) {
				new Gorm();
			} else {
				System.out.println("Thanks for playing!");
				System.exit(0);
			}
		}

		public void tie() {
			System.out.println("The game is a tie!");
			System.out.println("Would you like to play again? y/n");
			Scanner scanner2 = new Scanner(System.in);
			String yorn = scanner2.nextLine();
			if (yorn.equals("y")) {
				new Gorm();
			} else {
				System.out.println("Thanks for playing!");
				System.exit(0);
			}
		
		}
		
	}

