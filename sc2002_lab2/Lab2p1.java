package sc2002_lab2;

import java.util.Random;
import java.util.Scanner; 
public class Lab2p1 { 
    public static void main(String[] args) { 
		int choice; 
		Scanner sc = new Scanner(System.in); 
		do { 
			System.out.println("Perform the following methods:"); 
			System.out.println("1:  multiplication test"); 
			System.out.println("2:  quotient using division by subtraction"); 
			System.out.println("3:  remainder using division by subtraction"); 
			System.out.println("4:  count the  number of digits"); 
			System.out.println("5:  position of a digit"); 
			System.out.println("6:  extract all odd digits"); 
			System.out.println("7:  quit"); 
			System.out.printf("Choice is: ");

			choice = sc.nextInt();
			int m,n;
			long z;
			switch (choice) { 
			    case 1: /* add mulTest() call */ 
			    	mulTest(sc);
			        break; 
			    case 2: /* add divide() call */
					System.out.printf("m is: ");
			    	m = sc.nextInt();
					System.out.printf("n is: ");
			    	n = sc.nextInt();
			    	divide(m,n);
			    	break;  
			    case 3: /* add modulus() call */ 
					System.out.printf("m is: ");
			    	m = sc.nextInt();
					System.out.printf("n is: ");
			    	n = sc.nextInt();
			    	modulus(m,n);
			    	break;  
			    case 4: /* add countDigits() call */ 
					System.out.printf("n is: ");
					n = sc.nextInt();
					countDigits(n);
			        break; 
			    case 5: /* add position() call */
					System.out.printf("n is: ");
					n = sc.nextInt();
					System.out.printf("Target is: ");
					int digit = sc.nextInt();
					position(n, digit) ;
			            break;  
			    case 6: /* add extractOddDigits() call */ 
					System.out.printf("n is: ");
			    	z = sc.nextLong();
			    	extractOddDigits(z);
			    	break;
			    case 7: System.out.println("Program terminating!!"); 
			} 
			System.out.println();
		} while (choice < 7); 
		sc.close();
	}
    public static void mulTest(Scanner sc) {
    	int num1, num2, count=0;
    	int answer;
    	// call the random object
    	Random rng = new Random();
    	for (int i=0; i<5; i++) {
    		num1 = rng.nextInt(1,10);
    		num2 = rng.nextInt(1,10);
    		System.out.printf("How much is %d times %d? ", num1, num2);
    		answer = sc.nextInt();
    		if (answer == num1*num2) count++;
    	}
    	System.out.printf("%d answers out of 5 are correct\n", count);
    }
    public static int divide (int m, int n) {
    	if (n==0) {
    		System.out.println("Cannot divide by 0");
    		return 0;
    	}
		System.out.printf("%d/%d = %d\n",m, n, m/n);
    	return m/n;
    }
    public static int modulus(int m, int n) {
		System.out.println(m +"%"+ n + " = " + m%n);
    	return m%n;
    }
    public static int countDigits(int n) {
		if (n<0) {
			System.out.println("Error input!!");
			return 0;
		}
		
    	int count=0;
    	while (n>0) {
			n = n - n%10;
    		n/=10;
    		count++;
    	}
		System.out.printf("n: %d\n",count);
    	return count;
    }
    public static int position (int n, int digit) {
    	int count=1;
    	while (n>0) {
    		if (n%10 == digit) {
				System.out.printf("position = %d\n",count);
    			return count;
			}
    		n/=10;
    		count++;
    	}

		System.out.printf("position = %d\n",-1);
    	return -1;
    }
    public static long extractOddDigits(long n) {
    	if (n<0) {
    		return 0;
    	}
    	long value = 0;
    	while (n>0) {
    		if (n%2 == 1) {
    			value = value * 10 + n%10;
    		}
			n/=10;
    	}
		n = value;
		value = 0;
		while (n>0) {
    		if (n%2 == 1) {
    			value = value * 10 + n%10;
    		}
			n/=10;
    	}
    	System.out.printf("oddDigits = %d\n",value);
		return value;
    }
} 
		 