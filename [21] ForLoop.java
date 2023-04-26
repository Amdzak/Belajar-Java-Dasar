// 2022/11/19 12:10

/*
	For Loop merupakan sebuah syntax code perulangan yang memungkinkan kita untuk melakukan pembatasan pada perulangan tersebut 
	tidak seperti while larena di dalam for dia sudah bisa melakukan pemberhentian perulangan itu sendiri
	syntax for loop : 
	for (inisialisasi ; Konsidi ; stepnilai){
		//CODE
	}
*/

public class Main {
	public static void main (String[] args){
		System.out.println("Awal program");
		
		System.out.println("Loop Pertama");
		
		//PERULANGAN FOR ++
		for(int nilai = 0 ; nilai <= 10 ; nilai++){
			System.out.println("For Loop ke " + nilai);
		}
		
		System.out.println("Loop Kedua");
		//PERULANGAN FOR --
		for(int ni = 10; ni >= -5; ni--){
			System.out.println("Perulangan ke2 "+ ni);
		}
		
		System.out.println("Loop Kedua");
		//PERULANGAN FOR 
		int ni = 10;
		for(; ni >= 0; ni--){
			System.out.println("Perulangan ke2 "+ ni);
		}
		
		System.out.println("Akhir Program");
	}
}