// 2022/12/23 17:42

/*
	Latihan Arry
*/

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args){
		//penjumlahan antara dua buah array 
		int[] array1 = {1,6,8,7,4,2,5,8,9};
		int[] array2 = {2,5,8,3,1,4,6,3,2};
		int[] hasil = new int[array1.length]; // supaya tidak merubah alamat & isi dari array1
		
		for(int i = 0; i <array1.length ; i++){
			hasil[i] = array1[i] + array2[i];
		}
		print(array1, "Array 1");
		print(array2, "Array 2");
		print(hasil, "Hasil");
	}
	
	private static void print(int[] array, String pesan){
		System.out.println(pesan + " = " + Arrays.toString(array));
	}
	
	//REVERSE ARRAY
    private static void reverse2(int[] dataArray){
        Arrays.sort(dataArray);
        int buffer;

        for (int i = 0; i < dataArray.length/2 ; i++){
            buffer = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length - 1) - i];
            dataArray[(dataArray.length - 1) - i] = buffer;
        }
    }

    private static void reverse(int[] dataArray){
        Arrays.sort(dataArray);
        int[] arrayBuffer = Arrays.copyOf(dataArray, dataArray.length);

        for (int i = 0; i < dataArray.length; i++){
            dataArray[i] = arrayBuffer[(arrayBuffer.length - 1) - i];
        }
    }

}