import java.io.PrintStream;
import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 System.out.println("--------calculator-----------");
		 System.out.println("please enter two number:");
			int a =sc.nextInt();
			int b = sc.nextInt();        

		System.out.println("Enter 1 for Addition"); 
		System.out.println("Enter 2 for Substraction"); 
		System.out.println("Enter 3 for Division"); 
		System.out.println("Enter 4 for Multiplication"); 
		int operation=sc.nextInt();
	
		  
	      
		 switch (operation){
       
		   case 1:
			   /*Result="a+b";*/
            System.out.println (a+b);
         
			break;
			
		
			
		  case 2:
			 /*Result="a-b";*/
			System.out.println(a-b);
			break;
			
	    case 3:
	    
	    	/*Result="a/b";*/
			System.out.println(a/b);
			break;
			
		case 4:
	
			/*Result= "a*b";*/
			System.out.println(a*b);
			break;

		default:
			System.out.println("Please enter valid operation type");
			break;
		}

		/*
		 * System.out.println("Please Enter Number 1"); int a =sc.nextInt();
		 * 
		 * System.out.println("Please Enter Number 2"); int b = sc.nextInt();
		 */

	}

	/*private static int num11(int num12, int num13, int num14) {
		// TODO Auto-generated method stub
		return 0;
	}

	private static int b(int i, int j, int k) {
		// TODO Auto-generated method stub
		return 0;
	}*/

}
