package game;

import java.util.Random;
import java.util.Scanner;

public class game{

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner =new Scanner (System.in);
		System.out.println("Welcome to the fucking game ");
//		Random value generation
		Random random=new Random();
		int Computer=random.nextInt(99);
		System.out.println("The random value is "+Computer);
//      Integer to string conversion		
	   String s=String.valueOf(Computer);
	   char j=s.charAt(0);
	   System.out.println("first hidden value"+j);
	   char k=s.charAt(1);
	   System.out.println("first hidden value"+k);
	   while(Computer<11) {
		   Computer++;
	   }
	   while(true) {
//		Input from the User    
		   String CharInp=scanner.nextLine();
		   int input=Integer.parseInt(CharInp);
		   if(input<11) {
			  System.out.println("You entered 1 level number");
			  continue;
		   }
		   char charInput1=CharInp.charAt(0);
		   char charInput2=CharInp.charAt(1);
		   if(charInput1==charInput2) {
			   charInput2++;
		   }
		   if(input==Computer) {
			   System.out.println("Congratulations");
		   }
		   else if(charInput1==j||charInput2==k) {
			 System.out.println("1B,OC");
		 }
		   else if(charInput1==k && charInput2==j) {
			   System.out.println("0B,2C");
		   }
		 else if(charInput1==k || charInput2==j) {
			 System.out.println("0B,1C");
		 }
	
		 else {
			 System.out.println("0B,0C");
		 }
	   }
	   
	   
	}

}