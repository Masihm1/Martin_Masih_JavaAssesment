import java.util.Random;
import java.util.Scanner;

public class Barren_Game
{
		Scanner input;
	String[][] board;	
		String compassdirection;
	int boardDimension;
	int generationPoint;
	int xplayerLoco;
	int yplayerLoco;
		int row;
		int column;
		
	Random atRandom;
		boolean stilinPlay;
		
	public static void main(String[] args)
		{
		
		System.out.println("The Barren Moor Welcomes you!\n"
			+"\n" 
			+"Your objective is to find the calabasas treasure without loosing your soul to the infinite grey swamp!\n"
			+ "\nAll The Best & Be careful!\n"
		+"\nOh you also have a magic compass to guide you!\n"
			+"\n" 
		
		+ "\nFirst Step;");
		
	
	Barren_Game barren_game = new Barren_Game();
	 
	   barren_game .input = new Scanner(System.in);
	System.out.println("Enter the number of rows you would like the swap to be:");
	
	barren_game .row = barren_game .input.nextInt();
	
System.out.println("Second Step;:");
	
	System.out.println("Enter the number of columns you would like the swamp to be:");
	  barren_game .column = barren_game .input.nextInt();
	  barren_game .theBoard();

 barren_game .locationofplayer();
	
		}
   
	
public void deployBoard()

	{
			for (int row = 0; row < board.length; row++) 
		{
			
				for (int column = 0; column < board[row].length; column++) 
			{
					System.out.print(board[row][column] + " ");
				
				}
				System.out.println("");
			}
	}
		public void locationofplayer()
	{
			generateplayer();
			
			stilinPlay = true;		xplayerLoco = generationPoint;
			yplayerLoco = generationPoint;
			
Random atRandom = new ();
			
int no1 = atRandom.nextInt(row);
	int no2 = atRandom.nextInt(column);
	board[no1][no2] = Integer.toString(8);
			
		theBoard();
			
		
while(stilinPlay == true)
			{
				for(int row = 0; row < board.length; row++)
					for(int column = 0; column < board[row].length; column++)
					{
	if(row == xplayerLoco && column == yplayerLoco)
			{
							board[row][column] = "*";
				}
						else
					{
							board[row][column] = "-";
		}
					}	
			
				deployBoard();
				
		System.out.println("Please Start by rubbing your magic compass and entering a direction ('West', 'South', 'East' or 'North'?)");
				Scanner dir = new Scanner(System.in);
		compassdirection = dir.nextLine();
		
			if(compassdirection.equalsIgnoreCase("North")) 
				{
		xplayerLoco--;
					System.out.println("Abracadabra You have moved north.");
			}
				else if(compassdirection.equalsIgnoreCase("East")) 
	
			{
				yplayerLoco++;
			
	System.out.println("Abracadabra You have moved east.");
		}
				else if(compassdirection.equalsIgnoreCase("South")) 
			{
					xplayerLoco++;
				
					
					System.out.println("Abracadabra You have moved south.");
	
			}
				else if(compassdirection.equalsIgnoreCase("West")) 
				{		yplayerLoco--;
		System.out.println("Abracadabra You have moved west.");
				}
	
				else 
			{
					
		System.out.println("Please rub your magic compass and enter a direction!");
				}
				
				if(xplayerLoco == no1 && yplayerLoco == no2)
				{
					dir.close();
			System.out.println("WELL DONE!! YOU DID IT!!!\n"
							+ "you have survied the Barren Moor\n"
					+ "You got found the calabasas treasure!\n"
				        + "Now please make your way back to base!\n");
				
			System.out.println("Created by Martin Masih\n");
				
					stilinPlay = false;
				}
				else
				{
	 distanceX = no1 - xplayerLoco;
				double distanceY = no2 - yplayerLoco;
			double squareDistX = distanceX * distanceX;	
		double squareDistY = distanceY * distanceY;
				
		double distFromWin = Math.sqrt(squareDistX + squareDistY);
			System.out.println("The magic compass predics you are currenlty " + distFromWin + "m far from the calabasas treasure, please! .");
					continue;
}
		}
}
	
	   public int generateplayer() 
		{
			generationPoint = Math.round row / 2);
			return generationPoint;
		}
		
public int theBoard() 
		{
			board = new String[row][column];

	for (int = 0; row < board.length; row++) 
			{
			
				
for (int column = 0; column < board[row].length; column++)
		{
					board[row][column] = "-";
			}
				}

		boardDimension = row * column;
		return boardDimension;
		}

}