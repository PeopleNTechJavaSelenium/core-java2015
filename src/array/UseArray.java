package array;

import java.util.Scanner;

public class UseArray {

	public static void main(String[] args) {
		
		int [] numbers = new int[10]; 
		

		System.out.println(" Please enter your number : ");
		Scanner sc = new Scanner(System.in);
		for(int j=0; j<numbers.length; j++){
			numbers[j] = sc.nextInt();
		}
		
		for(int i=0; i<numbers.length; i++){
			if((numbers[i])%2==0){
			System.out.println(numbers[i]);
			}
		
		}	
	}
}
