// 2022/11/15 18:16
//KALKULATOR DENGAN IF ELSE

import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		Scanner input;
		
		float a,b,hasil;
		char operasi;
		input = new Scanner(System.in);
		
		System.out.print("Masukan Bilangan a :");
		a = input.nextFloat();
		System.out.print("Masukan Simbol Operasi : ");
		operasi = input.next().charAt(0);
		System.out.print("Masukan Bilangan b : ");
		b = input.nextFloat();
		
		System.out.println("Hasil " + a + " " + operasi + " " + b ); 
		
		if (operasi == '*'){
			hasil = a * b; 
			System.out.println("Adalah = " + hasil);
		} else if (operasi == '/'){
			if (b == 0) {
				System.out.println("Pembagi 0 Memiliki nilai tak terbatas");
			}
			else {
				hasil = a / b;
				System.out.println("Adalah = " + hasil);
			}
		} else if (operasi == '+'){
			hasil = a + b;
			System.out.println("Adalah = " + hasil);
		} else if (operasi == '-'){
			hasil = a  - b;
			System.out.println("Adalah = " + hasil);
		} else {
			System.out.println("Operator tidak di temukan");
		}
	}
}