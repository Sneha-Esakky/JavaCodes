package javaCodes;

import java.util.Scanner;

public class Nprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number of prime numbers required to print");
		int number = s.nextInt();
		int count = 0;
		int num=2;
		while(count < number){
			if(isPrime(num)){
				System.out.println(num);
				count++;
			}
			
			num++;
	  }
	}	
		public static boolean isPrime(int n) {
			if(n<2)
				return false;
			int prime =0;
			for(int i=2; i<=n/2; i++) {
				if(n%i==0) {
					prime++;
					break;	
				}		
			}
			if(prime==0 && n!=1) 
				return true;
			else
				return false;
		}
	}



	