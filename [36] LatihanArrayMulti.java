//2023/01/29 12:00

import java.util.Arrays;

/*
	Latihan Array multidimensi 
	Pertambahan dan perkalian dalam matrix 
	syarat jumlah kedua kolom dan baris harus sama 
	inti dari latihan ini yaitu membuat penjumlahan dalam sebuah array 2dimensi 
	yang menggunakan permodelan matrix sebagai persoalan
*/

public class Main {
	public static void main(String[] args) {
		int[][] matrixa = {
			{1,2,3},
			{4,5,6},
			{7,8,9}
		};
		
		int[][] matrixb = {
			{11,12,13},
			{14,15,16},
			{17,18,19}
		};
		
		printaray(matrixa);
		printaray(matrixb);
		
		int[][] hasiltambah = tambah(matrixa,matrixb);
		printaray(hasiltambah);
		
		kali(matrixa,matrixb);
		
	}
	
	private static int[][] kali(int[][] matrixa, int[][] matrixb){
		//Perkalian matrix 
		int buffer;
		int baris = matrixa.length;
		int kolom = matrixa[0].length;
		
		int barisb = matrixb.length;
		int kolomb = matrixb[0].length;
		
		// jika a * b maka jumlah baris akan mengikuti matrix a dan jumlah kolom akan mengikuti matrix b
		int[][] hasilkali = new int[baris][kolomb];
		
		for(int i = 0; i < baris ; i++){ // Untuk mengambil setiap baris pada mateix pertama
			for(int j = 0; j < kolomb; j++){ // Untuk mengambil setiap kollom pada matriks kedua 
			buffer = 0; // semua nilainya akan berubah kembali menjadi 0 setelah loop di lakukan
				for(int k = 0; k < kolom; k++){ // untuk melakukan eksekusi program matematis 
					buffer += matrixa[i][k] * matrixb[k][j]; // artinya di untuk matrix a dia akan mengambil di setiap baris yang ada, dan untuk matrix b dia akan mengabil di setiap kolom yang ada
				}
				hasilkali[i][j] = buffer;
			}
		}
		printaray(hasilkali); 
		return hasilkali;
	}
	
	private static int[][] tambah(int[][] matrix1,int[][] matrix2){
		int baris = matrix1.length;
		int kolom = matrix1[0].length;
		
		int barisb = matrix2.length;
		int kolomb = matrix2[0].length;
		
		
		//MEMBUAT KONDISI DIMANA ADA SALAH 1 ARRAY YANG TIDAK SAMA JUMLAH BARIS DAN KOLOM 
		int[][] hasil = new int[baris][kolom];  //Untuk membuat sebuah array kosong karena ada kata" new
		if(baris == barisb && kolom == kolomb){
			
			for(int i=0; i < baris;i++){
				for(int j = 0; j < kolom;j++){
					hasil[i][j] = matrix1[i][j] + matrix2[i][j];
				}
			}
		} else {
			System.out.print("Jumlah Baris atau Kolom tidak sama");
		}
		return hasil;
	}
	
	private static void printaray(int[][] data){
		int baris = data.length; //UNTUK MENGAMBIL BARIS PADA ARRAY
		int kolom = data[0].length; //UNTUK MENGAMBIL KOLOM YAITU HANYA KOMPINEN NYA AJA 
		
		for(int i =0; i < baris;i++){
			System.out.print("[");
			for (int j = 0; j< kolom;j++){
				System.out.print(data[i][j]);
			
				if(j < kolom -1){ // j awal di isi 1 krn j++, sedangkan kolom didapatkan dari baris 24 data.length, jika seandainya kolomnya ada 4, maka 1 < (4-1), 1< 3 maka akan print koma
					System.out.print(",");
				} else{
					System.out.print("]");
				}
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	
}