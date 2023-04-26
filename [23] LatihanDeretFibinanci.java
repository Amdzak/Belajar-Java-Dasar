// 2022/11/19 12:57
// PROGRAM DERET FINONANCI

import java.util.*;

public class Main {
	public static void main (String[] args){
		//PEMBUATAN OBJEK SCANNER
		Scanner input = new Scanner(System.in);
		
		//TIPE DATA 
		int fn=1,fn1=1,fn2=0,n;
		
		//INPUT USER 
		System.out.println("PROGRAM FIBONANCI SEDERHANA");
		System.out.print("Masukan akhir nilai fibonanci : ");
		n = input.nextInt();
		
		//PERULANGAN FIBONANCI 
		for(int i = 0; i <= n ; i++){
			System.out.println("Nilai fibonanci ke " + i + " adalah " + fn);
			fn = fn1 + fn2;
			fn2 = fn1;
			fn1 = fn;
		}
	}
}