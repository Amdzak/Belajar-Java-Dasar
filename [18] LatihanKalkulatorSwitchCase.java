// 2022/11/16 20:13
// KALKULATOR DENGAN MENGGUNAKAN SWITCH CASE

import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner input;
		float a,b,hasil;
		String operator;
		
		input = new Scanner(System.in);
		
		System.out.print("Masukan nilai a : ");
		a = input.nextFloat();
		System.out.print("Masukan Simbol Operator : ");
		operator = input.next();
		System.out.print("Masukan nilai b : ");
		b = input.nextFloat();
		
		switch(operator){
			case "+" : 
				hasil = a + b;
				System.out.println("\n" + a + operator + b +" = " + hasil);
				break;
			case "-" :
				hasil = a - b;
				System.out.println("\n" + a + operator + b +" = " + hasil);
				break;
			case "/" :
				hasil = a / b;
				System.out.println("\n" + a + operator + b +" = " + hasil);
				break;
			case "*" : 
				hasil = a * b;
				System.out.println("\n" + a + operator + b +" = " + hasil);
				break;
			default : 
				System.out.println("operator " + operator + " tidak di temukan");
		}
	}
}