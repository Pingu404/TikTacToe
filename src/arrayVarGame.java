import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;

public class arrayVarGame {
	
	public String[] row1 = { "__", "__", "__"};
	public String[] row2 = { "__", "__", "__"};
	public String[] row3 = { "__", "__", "__"};
	public int turns = 0;
	public int xoro = 0;  
	//lol
	arrayVarGame() {
		JFrame frame = new JFrame("Tic Tac Toe");
		
	
		
		GridLayout grid = new GridLayout(3, 3);

	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setSize(600, 600);
	        frame.setLayout(grid);
	        frame.setResizable(false);

	        JButton button1 = new JButton(row1[0]);
	        JButton button2 = new JButton(row1[1]);
	        JButton button3 = new JButton(row1[2]);
	        JButton button4 = new JButton(row2[0]);
	        JButton button5 = new JButton(row2[1]);
	        JButton button6 = new JButton(row2[2]);
	        JButton button7 = new JButton(row3[0]);
	        JButton button8 = new JButton(row3[1]);
	        JButton button9 = new JButton(row3[2]);

	        frame.add(button1);
	        frame.add(button2);
	        frame.add(button3);
	        frame.add(button4);
	        frame.add(button5);
	        frame.add(button6);
	        frame.add(button7);
	        frame.add(button8);
	        frame.add(button9);
	        
	    //add all of the other buttons    
	 button1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent evt) {
             // delegate to event handler method
            if (row1[0].equals("__")) {
        	 if (xoro == 0) { 
            		row1[0] = "X ";
            		xoro++;
            	 } else if (xoro == 1) {
            		 row1[0] = "0 ";
            		 xoro--; } } else { System.out.println("Invalid Move"); } } });
}
	
	
	public void winCheck() {
		//Add all of the other possable winns
		if (row1[0].equals(row1[1].equals(row1[2]))&&(!row1[0].equals("__"))) {
			
		}
		
		
	}
}
	