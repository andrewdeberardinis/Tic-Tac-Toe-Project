import java.util.Scanner;
public class TTTBoard
	{

		static String[] [] board = new String [3] [3];
		
		
		
		
		public static void main(String[] args)
			{
				prepareBoard();
				displayBoard();
				movePlayer();	
				displayBoard();
			}
				
		public static void movePlayer()
		{
			
			System.out.println("Pick a spot");
			Scanner supa = new Scanner (System.in);
			String move = supa.nextLine();
			
			int row = 0;
			int col = 0;
			
			switch (move.substring(0,1))
			{
				case "A":
				case "a":
						{
							row = 0;
							break;
						}
						
				case "B":
				case "b":
						{
							row = 1;
							break;
						}
				case "C":
				case "c":
						{
							row = 2;
							break;
						}
			
			col = Integer.parseInt(move.substring(1)) - 1;
			System.out.println();
			
			}
			
			
			
			
			
			
//			if(move.equals("A1") || move.equals("a1"))
//				{
//					if(board [0][0].equals("a1"))
//						{
//							board [0] [0] = "X";
//						}
//				}
//			
//			else 
//				{
//					movePlayer();
//				}
//		
			
			
			
		}
		
		
		
		public static void prepareBoard()
		{
			
			for(int row = 0; row < 3; row++)
				{
					for(int col = 0; col < 3; col++)
						{
							board [row][col] = " ";
						
						}
		
				}
		}
		
		
	
		
		public static void displayBoard()
				{
					
				System.out.println("    1   2   3    ");
				System.out.println("  -------------  ");
				System.out.println("A | " + board [0] [0] + " | " + board [0] [1] + " | " + board [0] [2] + " |  ");
				System.out.println("  -------------  ");
				System.out.println("B | " + board [1] [0] + " | " + board [1] [1] + " | " + board [1] [2] + " |  ");
				System.out.println("  -------------  ");
				System.out.println("C | " + board [2] [0] + " | " + board [2] [1] + " | " + board [2] [2] + " |  ");
				System.out.println("  -------------  ");
					
					
					
				}

			

	}
