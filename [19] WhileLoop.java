// 2022/11/16 20:28

/*
	WHILE LOOP MERUPAKAN SEBUAH CODE PERULANGAN 
	memiliki syntac penulisan sebagai berikut
	while(kondisi_true/false memakai aljabar boolean) {
		
	}
	
	jika kondisi while nya true maka alan ter eksekusi terus
*/

public class Main {
	public static void main (String[] args){
		int a = 0;
		boolean kondisi= true; 
		System.out.println("ini adalah awal");
		
		//PERULANGAN WHILE
		while (kondisi) {
			System.out.println("While loop ke " + a);
			a++;   //UNTUK MELIHAT NILAI A 
			
			// UNTUK MENGHENTIKAN PERULANGAN DI TENGAH JALAN
			if (a == 10){
				kondisi = false;
			}
		}
	}
}