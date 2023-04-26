// 2022/12/17 13:45 

import java.util.Arrays;

/*
	FOR EACH PADA ARRAY 
	penggunaan for each pada array yaitu pada saat 
	jika index pada for standard tidak berguna lagi 
	dalam hal jika kita hanya ingin melooping tanpa memakai index maka tidak perlu dengan for

	
	yaitu penggunaan perulangan yang ada pada array memiliki syntax tersendiri 
	Syntax : 
		for ( newTipeData + Variabel : Variabel array) {
			Sout Variabel
		}
		
		for (int awal : ArrayAngka){
			System.out.println(awal);
		}
*/

public class Main {
	public static void main (String[] args){
		int angka[] = {1,215,6,7,5,3};
		
		//LIBRARY ARRAY 
		System.out.println("Dengan menggunakan Library Arrays :");
		System.out.println(Arrays.toString(angka));
		
		//LOOPING STANDART 
		System.out.println("\nDengan menggunakan For Standart :");
		for (int i = 0; i<5; i++ ){
			System.out.println("Index array ke " + i + " adalah = " + angka[i]);
		}
		
		//LOOPING DENGAN PROPERTY ARRAY 
		System.out.println("\nDengan menggunakan For Property length :");
		for(int i=0; i < angka.length; i++){
			System.out.println("Index array ke " + i + " adalah = " + angka[i]);
		}
		
		//LOOPING DENGAN COLLECTION ARRAY
		System.out.println("\nDengan menggunkan For each :");
		for (int bil : angka){
			System.out.println("Angka pada Looping ini = "+bil);
		}
	}
}