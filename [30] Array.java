//2022/12/17 13:07

import java.util.Arrays; //LIBRARY DI GUNAKAN MENGUBAH ARRAY MENJADI STRING

/*
    ASSIGMENT ARRAY:
	Array (Sebuah KUMPULAN)
	array ada sebuah kumpulan data primitif (int,double,float,long,byte,char)
	Syntax penulisan array 
		TipeData[]  NamaVariabel = {isi data harus di pisahkan dengan koma};
		TipeData NamaVariabel[] = {isi data harus di pisahkan dengan koma};
		int [] Angka = {1,4,7,5}; 
	
	untuk mengakses harus dengan index, index adalah data yang ada di dalam kurung kurawal 
	int a = angka[0]
	
	//DEKLARASI ARRAY
	Syntax : 
		Tipedata [] NamaVariabel = new tipedata[JumlahArray];
		int angak[] = new int[3];
*/

public class Main {
	public static void main (String[] args){
		//ASSIGMENT PADA ARRAY
		//tipedata [] nama = {kompoenn,komponen};
		int[] arayint = {1,2,3,4}; 
		System.out.println("ini adalah ASSINGMENT pada array");
		System.out.println(arayint[2]);
		
		//DEKLARASI PADA ARRAY 
		System.out.println("ini adalah DEKLARASI pada array");
		float[] arayfloat = new float[4];
		
		arayfloat[2] = 17f;
		
		System.out.println(arayfloat[0]);
		System.out.println(arayfloat[1]);
		System.out.println(arayfloat[2]);
		System.out.println(arayfloat[3]);
		
		/*  
			UNTUK MEMBACA ATAU MENGOUTPUTKAN ARRAY DENGAN CARA YANG MUDAH BISA MENGGUNAKAN  
			LIBRARY JAVA.UTIL.ARRAYS 
			
			syntax penulisan:
			System.out.println(Arrays.toString(NamaVariabelYangAdaArray));
		*/ 
		
		System.out.println(Arrays.toString(arayfloat));
		System.out.println(Arrays.toString(arayint));
	}
}