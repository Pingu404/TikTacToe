import java.util.Scanner;

public class Game {

	Game() {
		
	int turns = 1;
	boolean gamePlaying = true;
	
	String a1 = "__";
	String b1 = "__";
	String c1 = "__";
	String a2 = "__";
	String b2 = "__";
	String c2 = "__";
	String a3 = "__";
	String b3 = "__";
	String c3 = "__";
	int movesSoFar = 0;
	int gameLength = 0;
	
	//the orignal bord
	System.out.println("  a  b  c");
	System.out.println("1 "+a1+"|"+b1+"|"+c1);
	System.out.println("2 "+a2+"|"+b2+"|"+c2);
	System.out.println("3 "+a3+"|"+b3+"|"+c3);
		
		System.out.println("Welcome to TikTacToe!!!");
		System.out.println("please input the move for X to begin");
	
	do {
		
	
	if (turns == 1) {
		
		Scanner scanner2 = new Scanner(System.in);
		String move = scanner2.nextLine();
		//Sets the value for the move
		if (move.equals("a1")&&(a1.equals("__"))) {
	    a1 = "X "; 
	    gameLength++;
		}
		if (move.equals("a2")&&(a2.equals("__"))) {
		    a2 = "X "; 
		    gameLength++;
			}
		if (move.equals("a3")&&(a3.equals("__"))) {
			    a3 = "X "; 
			    gameLength++;
			}
		if (move.equals("b1")&&(b1.equals("__"))) {
		    b1 = "X "; 
		    gameLength++;
			}
		if (move.equals("b2")&&(b2.equals("__"))) {
		    b2 = "X "; 
		    gameLength++;
			}
		if (move.equals("b3")&&(b3.equals("__"))) {
		    b3 = "X ";
		    gameLength++;
			}
		if (move.equals("c1")&&(c1.equals("__"))) {
		    c1 = "X "; 
		    gameLength++;
			}
		if (move.equals("c2")&&(c2.equals("__"))) {
		    c2 = "X "; 
		    gameLength++;
			}
		if (move.equals("c3")&&(c3.equals("__"))) {
		    c3 = "X "; 
		    gameLength++;
			}
		
		//prints out the new bord
		System.out.println("  a  b  c");
		System.out.println("1 "+a1+"|"+b1+"|"+c1);
		System.out.println("2 "+a2+"|"+b2+"|"+c2);
		System.out.println("3 "+a3+"|"+b3+"|"+c3);
		 
		if((a1.equals("X "))&&(a2.equals("X "))&&(a3.equals("X ")))
		{
			System.out.println("X WINS");
			botxWins();
		
		}
		
		if((b1.equals("X "))&&(b2.equals("X "))&&(b3.equals("X ")))
		{
			System.out.println("X WINS");
			botxWins();
		
		}
		if((c1.equals("X "))&&(c2.equals("X "))&&(c3.equals("X ")))
		{
			System.out.println("X WINS");
			botxWins();
		
		}
		if((a1.equals("X "))&&(b1.equals("X "))&&(c1.equals("X ")))
		{
			System.out.println("X WINS");
			botxWins();
		
		}
		if((a2.equals("X "))&&(b2.equals("X "))&&(c2.equals("X ")))
		{
			System.out.println("X WINS");
			botxWins();
		
		}
		if((a3.equals("X "))&&(b3.equals("X "))&&(c3.equals("X ")))
		{
			System.out.println("X WINS");
			botxWins();
		}
		if((a1.equals("X "))&&(b2.equals("X "))&&(c3.equals("X ")))
		{
			System.out.println("X WINS");
			botxWins();
		
		}
		if((a3.equals("X "))&&(b2.equals("X "))&&(c1.equals("X ")))
		{
			System.out.println("X WINS");
			botxWins();
		}
		
		
		
		if (gameLength == 9) {
			System.out.println("Good Time, It was a tie!!! Would you like to play again?? y/n");
			
			Scanner scanner22 = new Scanner(System.in);
			String tie =  scanner22.nextLine();
			
			if (tie.equals("y")) {
				new Game(); 
			}
			else
			{
				System.out.println("Thanks for Playing!!!");
			}
		}
		turns++;
	}
	
	if (turns == 2) {
	 
		
		int num = (int)(Math.random() * 8);
		
		if ((num == 0)&&(a1.equals("__")))
		{ 
			a1 = "0 "; 
			gameLength++;
		} 
		else if ((num == 1)&&(a2.equals("__")))
		{
			a2 = "0 "; 
		gameLength++;
			 
		}
		 else if ((num == 2)&&(a3.equals("__")))
			{
				a3 = "0 "; 
			gameLength++;
				 
			}
		 else if ((num == 3)&&(b1.equals("__")))
			{
				b1 = "0 "; 
			gameLength++;
				 
			}
		 else if ((num == 4)&&(b2.equals("__")))
			{
				b2 = "0 "; 
			gameLength++;
				 
			}
		 else if ((num == 5)&&(b3.equals("__")))
			{
				b3 = "0 "; 
			gameLength++;
				 
			}
		 else if ((num == 6)&&(c1.equals("__")))
			{
				c1 = "0 "; 
			gameLength++;
				 
			}
		 else if ((num == 7)&&(c2.equals("__")))
			{
				c2 = "0 "; 
			gameLength++;
				 
			}
		 else if ((num == 8)&&(c3.equals("__")))
			{
				c3 = "0 "; 
			gameLength++;
				 
			}
		 else {
			 turns = 3;
		 }
		
		
		
		System.out.println("  a  b  c");
		System.out.println("1 "+a1+"|"+b1+"|"+c1);
		System.out.println("2 "+a2+"|"+b2+"|"+c2);
		System.out.println("3 "+a3+"|"+b3+"|"+c3);
		
		
		if((a1.equals("0 "))&&(a2.equals("0 "))&&(a3.equals("0 ")))
		{
			System.out.println("0 WINS");
			turns++;
			botoWins();
		
		}
		
		if((b1.equals("0 "))&&(b2.equals("0 "))&&(b3.equals("0 ")))
		{
			System.out.println("0 WINS");
			turns++;
			botoWins();
		}
		if((c1.equals("0 "))&&(c2.equals("0 "))&&(c3.equals("0 ")))
		{
			System.out.println("0 WINS");
			turns++;
			botoWins();
		
		}
		if((a1.equals("0 "))&&(b1.equals("0 "))&&(c1.equals("0 ")))
		{
			System.out.println("0 WINS");
			turns++;
			botoWins();
		}
		if((a2.equals("0 "))&&(b2.equals("0 "))&&(c2.equals("0 ")))
		{
			System.out.println("0 WINS");
			turns++;
			botoWins();
		
		}
		if((a3.equals("0 "))&&(b3.equals("0 "))&&(c3.equals("0 ")))
		{
			System.out.println("0 WINS");
			turns++;
			botoWins();
		
		}
		if((a1.equals("0 "))&&(b2.equals("0 "))&&(c3.equals("0 ")))
		{
			System.out.println("0 WINS");
			turns++;
			botoWins();
		
		}
		if((a3.equals("0 "))&&(b2.equals("0 "))&&(c1.equals("0 ")))
		{
			System.out.println("0 WINS");
			turns++;
			botoWins();	
			
			if (gameLength == 9) {
				System.out.println("Good Time, It was a tie!!! Would you like to play again?? y/n");
				
				Scanner scanner22 = new Scanner(System.in);
				String tie =  scanner22.nextLine();
				
				if (tie.equals("y")) {
					new Game(); 
				}
				else
				{
					System.out.println("Thanks for Playing!!!");
				}
			}

		
		
	}
		turns --;
	
	}
	 
	if (turns == 3)
	{
		turns--;
	}
	
	} while (gamePlaying == true);
	}
	
  public static void botxWins() {
		System.out.println("x Good Game! Would you like to play again??? y/n");
		
		Scanner scanner3 = new Scanner(System.in);
		String yn = scanner3.nextLine();
		
	if (yn.equals("y")) {
		new Game();
	}
	else
	{
		System.out.println("Thanks for playing!");
	}
		
	}
	
  public static void botoWins() {
		System.out.println("Good Game! Would you like to play again??? y/n");
		
		Scanner scanner3 = new Scanner(System.in);
		String yn = scanner3.nextLine();
		
	if (yn.equals("y")) {
		new Game();
	}
	else
	{
		System.out.println("Thanks for playing!");
	}
	}

}

