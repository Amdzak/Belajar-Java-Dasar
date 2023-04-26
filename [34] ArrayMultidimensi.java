// 2023/01/11 09:54

import java.util.Arrays;

/*
	ARRAY MULTI DIMENSI 
	bisa menaruh array sevara bersamaan atau dalam jumlah banyak 
	jika ada 2 array 1dimensi di gabubgkan menjadi 1 tempat maka di sebut array 2dimensi 
	jika ada array 2dimensi di gabungkan dengan array 1dimensi maka akan menghasilkan array 3dimensi 
	jika ada array 3dimensi lalu saat kita megaksesnya menjadikan kita membuat array baru 3dimensi maka di sebut array 4dimensi
	aray 3d memiliki 3jumlah index Contoh:
	int[][][] aray3d = new int[unutkMembuatTotalKotak][Baris][Kolom];
	
	Syntax penulisan array 2dimensi ASSINGMENT : 
	int[][] Array = {{indexArrat},{indexarray}};
	int[][] array = { 
		{16,9,5,4}, 
		{7,4,3,6,9} 
		};
		
	Syntax penulisan array 2dimensi DEKLARASI : 
	int[][] array = new int[JumlahIndex][JumlahIndex];
	int[][] array = new int[5][4]; //5BARIS DENGAN 4 KOLOM seperti dibawah
	//OUTPUT 
	[0,0,0,0]
	[0,0,0,0]
	[0,0,0,0]
	[0,0,0,0]
	[0,0,0,0]
*/

public class Main {
	
	public static void main(String[] args){
		//TIPE DATA 
		int[][] aray = new int[3][4]; // MEMILIKI 3jumlh array1 dimansi dan 4buah index didalam nya 
		int [][] array2d = { 
			{4,6},
			{6,4}
			};
		
		System.out.println("Belajar Array 2D");
		print(array2d);
		print(aray);
		
		//LOOPING ARRAY 2D MANUAL 
		for(int i = 0; i < aray.length;i++){ //MEMBUAT 1 BARIS
			for(int j = 0; j < aray[i].length;j++){ //aray[i].length UNTUK MENAMPILKAN SETIAP INDEX DALAM ARRAY 
				System.out.print(aray[i][j]); //UNTUK MENAMPILKAN SEMUA ARRAY
			}
			System.out.print("\n");//UNTUK MEMBERI ENTER DI AKHIR INDEX ARRAY 
		}
		
		
	}
	
	private static void print(int[][] array){
		for(int i = 0; i<array.length;i++){
			System.out.println(Arrays.toString(array[i]));
		}
	}
}