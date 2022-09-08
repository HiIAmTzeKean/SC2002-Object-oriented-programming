package sc2002_lab2;

import java.util.Random;
import java.util.Scanner; 
public class Lab2p1 { 
    public static void main(String[] args) { 
		int choice; 
		Scanner sc = new Scanner(System.in); 
		do { 
			System.out.println("Perform the following methods:"); 
			System.out.println("1:  miltiplication test"); 
			System.out.println("2:  quotient using division by subtraction"); 
			System.out.println("3:  remainder using division by subtraction"); 
			System.out.println("4:  count  the  number of digits"); 
			System.out.println("5:  position of a digit"); 
			System.out.println("6:  extract all odd digits"); 
			System.out.println("7:  quit"); 
			choice = sc.nextInt(); 
			
			int m,n;
			long z;
			switch (choice) { 
			    case 1: /* add mulTest() call */ 
			    	mulTest();
			        break; 
			    case 2: /* add divide() call */ 
			    	m = sc.nextInt();
			    	n = sc.nextInt();
			    	divide(m,n);
			    	break;  
			    case 3: /* add modulus() call */ 
			    	m = sc.nextInt();
			    	n = sc.nextInt();
			    	System.out.printf("%d % %d = %d", m,n,modulus(m,n));
			    	break;  
			    case 4: /* add countDigits() call */ 
			            break; 
			    case 5: /* add position() call */ 
			            break;  
			    case 6: /* add extractOddDigits() call */ 
			    	z = sc.nextLong();
			    	System.out.printf("oddDigits = %d",extractOddDigits(z));
			    	break;
			    case 7: System.out.println("Program terminating …."); 
			}  
		} while (choice < 7); 
		sc.close();
	}
    public static void mulTest() {
    	int num1, num2, count=0;
    	int answer;
    	// call the random object
    	Scanner sc = new Scanner(System.in); 
    	Random rng = new Random();
    	for (int i=0; i<5; i++) {
    		num1 = rng.nextInt();
    		num2 = rng.nextInt();
    		System.out.printf("How much is %d times %d? ", num1, num2);
    		answer = sc.nextInt();
    		if (answer == num1*num2) count++;
    	}
    	sc.close();
    	System.out.printf("%d answers out of 5 are correct", count);
    }
    public static int divide (int m, int n) {
    	if (n==0) {
    		System.out.println("Cannot divide by 0");
    		return 0;
    	}
    	return m/n;
    }
    public static int modulus(int m, int n) {
    	return m%n;
    }
    public static int countDigits(int n) {
    	int count=0;
    	while (n>0) {
    		n%=10;
    		count++;
    	}
    	return count;
    }
    public static int position (int n, int digit) {
    	int count=0;
    	while (n>0) {
    		if (n%10 == digit)
    			return count;
    		n%=10;
    		count++;
    	}
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
    			n&=10;
    		}
    	}
    	return value==0? -1: value;
    }
} 
		 