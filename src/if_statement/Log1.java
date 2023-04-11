package if_statement;

import java.util.Scanner;

public class Log1 {

	public static void main(String[] args)
	{
//		A school has following rules for grading system:
//			a. Below 25 - F
//			b. 25 to 45 - E
//			c. 45 to 50 - D
//			d. 50 to 60 - C
//			e. 60 to 80 - B
//			f. Above 80 - A
//			Ask user to enter marks and print the corresponding grade.
		Scanner sac = new Scanner(System.in);
		System.out.println("Enter your Mark");
		int mrk = sac.nextInt();
		
		if(mrk<25) 
		{
			System.out.println("Your Fail");
		}
		if(mrk>=25 && mrk <45) 
		{
			System.out.println("Your grade is E");
		}
		if(mrk>=45 && mrk<50) 
		{
			System.out.println("Your grade is D");
		}
		if(mrk>=50 && mrk<60) 
		{
			System.out.println("Your grade is C");
		}
		if(mrk>=60 && mrk<80) 
		{
			System.out.println("Your grade is B");
		}
		if(mrk>=80 && mrk<=100) 
		{
			System.out.println("Your grade is A");
		}
		else 
		{
			System.out.println("Not Correct Mark");
		}


	}

}
