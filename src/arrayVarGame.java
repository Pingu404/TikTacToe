import java.util.Scanner;
import java.util.ArrayList;

public class arrayVarGame {

	arrayVarGame() {
	
		//The rows
		String[] row1 = { "__", "__", "__"};
		String[] row2 = { "__", "__", "__"};
		String[] row3 = { "__", "__", "__"};
		int turns = 0;
		int xoro = 0;
		//prints the actual code
		System.out.println("  0  1  2");
		System.out.println("1 "+row1[0]+"|"+row1[1]+"|"+row1[2]);
		System.out.println("2 "+row2[0]+"|"+row2[1]+"|"+row2[2]);
		System.out.println("3 "+row3[0]+"|"+row3[1]+"|"+row3[2]);
		
		
	//I orignaly made it without using rows or arrays so i am making this one now. lol
		System.out.println("Welcome to the version of tiktactoe I was supposed to make.");
		-
		
		
		
		do {
			if (xoro == 0)
			{
				System.out.println("Please enter the row");
				Scanner scanner1 = new Scanner(System.in);
				String rowX = scanner1.nextLine();
				
				
				System.out.println("what is the colloum");
				Scanner scanner1 = new Scanner(System.in);
				String input1 = scanner1.nextLine();
				int  colX = Integer.parseInt(input1);
				
				if (rowX = "1" || row1[colX] = "__") {
					A[colX] = "X ";
				} else if (row1[colX] = "__" && (rowX.equals("2"))) {
					row2[colX] = "X ";
				} else if (rowX == 3) {
					row3[colX] = "X ";
				} else
				
				System.out.println("  0  1  2");
				System.out.println("1 "+row1[0]+"|"+row1[1]+"|"+row1[2]);
				System.out.println("2 "+row2[0]+"|"+row2[1]+"|"+row2[2]);
				System.out.println("3 "+row3[0]+"|"+row3[1]+"|"+row3[2]);
			 xoro++;
			}
			if (xoro == 1) {
				
			}
			
		Scanner scanner2 = new Scanner(System.in);
		String move = scanner2.nextLine();
		} while (turns < 9);
		
	}
	
	
	
	
	
	
	
	
	
}
