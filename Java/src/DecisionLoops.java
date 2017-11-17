import java.util.Scanner;

public class DecisionLoops 
{
	
	public static void main(String[] args)
	{
		int x = 1;
		System.out.println("Hello Git");
		
		while (x <= 4) //while loop - it's the simplest loop
		{
			System.out.println("Value of x: " + x);
			x++;
		}
		
		StringBuffer string = new StringBuffer(); //while loop with strings
		char c;
		System.out.println("Enter a string");
		try
		{
			while ( (c = (char) System.in.read()) != '\n') 
			{
				string.append(c); //appends a character
			}
		}
		catch (Exception e)
		{
			System.out.println("Error in input, try again!");
		}
		System.out.println("You have entered...");
		System.out.println(string);
		
		//more efficient way to read and print string
		System.out.println("\nEnter Your Username");
		Scanner scan = new Scanner(System.in);
		String username = scan.nextLine();
		System.out.println("Your username is " + username);
		scan.close();	
		
	}
	
	
}

