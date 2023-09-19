import java.util.Scanner;
import java.util.ArrayList;
	
public class TikTacToe {

	TikTacToe() {
	/*	
		a  b   c
	1	__|__|__
	2	__|__|__
	3	__|__|__
	
	
	winners: a1 a2 a3, b1 b2 b3, c1 c2 c3, a1 b1 c1, a2 b2 c2, a3 b3 c3, a1 b2 c3, c1 b2 a1,
	*/
	
		
		
	String a1 = "__";
	String b1 = "__";
	String c1 = "__";
	String a2 = "__";
	String b2 = "__";
	String c2 = "__";
	String a3 = "__";
	String b3 = "__";
	String c3 = "__";
	int turns = 1;
	int movesSoFar = 0;
	
	//the orignal bord
	System.out.println("  a  b  c");
	System.out.println("1 "+a1+"|"+b1+"|"+c1);
	System.out.println("2 "+a2+"|"+b2+"|"+c2);
	System.out.println("3 "+a3+"|"+b3+"|"+c3);
		
		System.out.println("Welcome to TikTacToe!!!");
		System.out.println("please input the move for x to begin");
		
		
		
		
			
		
			do {
		
			Scanner scanner2 = new Scanner(System.in);
			String move = scanner2.nextLine();
			//Sets the value for the move
			if (move.equals("a1")&&(a1.equals("__"))) {
		    a1 = "X "; 
			}
			if (move.equals("a2")&&(a2.equals("__"))) {
			    a2 = "X "; 
				}
			if (move.equals("a3")&&(a3.equals("__"))) {
				    a3 = "X "; 
				}
			if (move.equals("b1")&&(b1.equals("__"))) {
			    b1 = "X "; 
				}
			if (move.equals("b2")&&(b2.equals("__"))) {
			    b2 = "X "; 
				}
			if (move.equals("b3")&&(b3.equals("__"))) {
			    b3 = "X "; 
				}
			if (move.equals("c1")&&(c1.equals("__"))) {
			    c1 = "X "; 
				}
			if (move.equals("c2")&&(c2.equals("__"))) {
			    c2 = "X "; 
				}
			if (move.equals("c3")&&(c3.equals("__"))) {
			    c3 = "X "; 
				}
			
			//prints out the new bord
			System.out.println("  a  b  c");
			System.out.println("1 "+a1+"|"+b1+"|"+c1);
			System.out.println("2 "+a2+"|"+b2+"|"+c2);
			System.out.println("3 "+a3+"|"+b3+"|"+c3);
			 
			if((a1.equals("X "))&&(a2.equals("X "))&&(a3.equals("X ")))
			{
				System.out.println("X WINS");
				turns++;
				xWins();
			
			}
			
			if((b1.equals("X "))&&(b2.equals("X "))&&(b3.equals("X ")))
			{
				System.out.println("X WINS");
				turns++;
				xWins();
			
			}
			if((c1.equals("X "))&&(c2.equals("X "))&&(c3.equals("X ")))
			{
				System.out.println("X WINS");
				turns++;
				xWins();
			
			}
			if((a1.equals("X "))&&(b1.equals("X "))&&(c1.equals("X ")))
			{
				System.out.println("X WINS");
				turns++;
				xWins();
			
			}
			if((a2.equals("X "))&&(b2.equals("X "))&&(c2.equals("X ")))
			{
				System.out.println("X WINS");
				turns++;
				xWins();
			
			}
			if((a3.equals("X "))&&(b3.equals("X "))&&(c3.equals("X ")))
			{
				System.out.println("X WINS");
				turns++;
				xWins();
			}
			if((a1.equals("X "))&&(b2.equals("X "))&&(c3.equals("X ")))
			{
				System.out.println("X WINS");
				turns++;
				xWins();
			
			}
			if((a3.equals("X "))&&(b2.equals("X "))&&(c1.equals("X ")))
			{
				System.out.println("X WINS");
				turns++;
				xWins();
			}
			
			if (movesSoFar == 9)
			{
				System.out.println("The game is a tie!!!");
				turns++;
			}
						
			
				Scanner scanner = new Scanner(System.in);
				String move0 = scanner.nextLine();
				//Sets the value for the move
				
				if (move0.equals("a1")&&(a1.equals("__"))) {
			    a1 = "0 "; 
				}
				if (move0.equals("a2")&&(a2.equals("__"))) {
				    a2 = "0 "; 
					}
				if (move0.equals("a3")&&(a3.equals("__"))) {
					    a3 = "0 ";  
					}
				if (move0.equals("b1")&&(b1.equals("__"))) {
				    b1 = "0 "; 
					}
				if (move0.equals("b2")&&(b2.equals("__"))) {
				    b2 = "0 "; 
					}
				if (move0.equals("b3")&&(b3.equals("__"))) {
				    b3 = "0 "; 
					}
				if (move0.equals("c1")&&(c1.equals("__"))) {
				    c1 = "0 "; 
					}
				if (move0.equals("c2")&&(c2.equals("__"))) {
				    c2 = "0 "; 
					}
				if (move0.equals("c3")&&(c3.equals("__"))) {
				    c3 = "0 "; 
					}
				
				//prints out the new bord
				System.out.println("  a  b  c");
				System.out.println("1 "+a1+"|"+b1+"|"+c1);
				System.out.println("2 "+a2+"|"+b2+"|"+c2);
				System.out.println("3 "+a3+"|"+b3+"|"+c3);
				
				
				if((a1.equals("0 "))&&(a2.equals("0 "))&&(a3.equals("0 ")))
				{
					System.out.println("0 WINS");
					turns++;
					oWins();
				
				}
				
				if((b1.equals("0 "))&&(b2.equals("0 "))&&(b3.equals("0 ")))
				{
					System.out.println("0 WINS");
					turns++;
					oWins();
				}
				if((c1.equals("0 "))&&(c2.equals("0 "))&&(c3.equals("0 ")))
				{
					System.out.println("0 WINS");
					turns++;
					oWins();
				
				}
				if((a1.equals("0 "))&&(b1.equals("0 "))&&(c1.equals("0 ")))
				{
					System.out.println("0 WINS");
					turns++;
					oWins();
				}
				if((a2.equals("0 "))&&(b2.equals("0 "))&&(c2.equals("0 ")))
				{
					System.out.println("0 WINS");
					turns++;
					oWins();
				
				}
				if((a3.equals("0 "))&&(b3.equals("0 "))&&(c3.equals("0 ")))
				{
					System.out.println("0 WINS");
					turns++;
					oWins();
				
				}
				if((a1.equals("0 "))&&(b2.equals("0 "))&&(c3.equals("0 ")))
				{
					System.out.println("0 WINS");
					turns++;
					oWins();
				
				}
				if((a3.equals("0 "))&&(b2.equals("0 "))&&(c1.equals("0 ")))
				{
					System.out.println("0 WINS");
					turns++;
					 oWins();
					
				}
		}
			while (turns < 2);
				//hi
	}
		
		
	
	  public static void oWins() {
		
		int wins1 =+ 1;
		System.out.println("0 has won "+ wins1 + " times!");
		
System.out.println("Would you like to play again? y/n");
		
		Scanner scanner3 = new Scanner(System.in);
		String play = scanner3.nextLine();
		 if (play.equals("y"))
		 {
			 new TikTacToe();
		 }
		 
	}
	
   public static void xWins() {
		
	   
		int wins =+ 1;
		System.out.println("X has won "+ wins + " times!");
		
System.out.println("Would you like to play again? y/n");
		 
		Scanner scanner3 = new Scanner(System.in);
		String play = scanner3.nextLine();
		 if (play.equals("y"))
		 {
			 new TikTacToe();
		 }
	}
	
	public static void main(String[] args) {
		 
		System.out.println("Hello and Welome to TicTacToe!!!!");
		System.out.println("Would you like to play agenst a 'bot' or agenst 'someone else'???");
		
		Scanner scanner8 = new Scanner(System.in);
		String whoToPlay = scanner8.nextLine();
		
		if (whoToPlay.equals("bot")) 
		{
			new botGame();
		} 
		else
		{
			new TikTacToe();
		}
		



	}

}
