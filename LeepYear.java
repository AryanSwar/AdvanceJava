//WAJP TO FIND A LEEP YEAR NOT.

import java.util.Scanner;
class LeepYear{
	public static void leapYear(int a){
		if((a%4 == 0 && a%100 != 0 ) || a%400 == 0){
			System.out.println("This year is leep year : "+a);
		}
		else{
			System.out.println("This year is not a leep year : "+a);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year : ");
		int b = sc.nextInt();
		leapYear(b);
	}
}