//2023/01/27 17:41

import java.util.Arrays;

/*
	MENGENAL ARRAY MULTI DIMENSI LEBIH DALAM 
	
	aray multi dimensi dalam java bisa di taruh banyak komponen 
	karena mereka masih sama dalam 1 memori 
	jika index dalam array ke 0 ada 4 biji 
	dan index dalam array ke 1 ada 2 biji 
	maka tetap bisa berjalan dengan semestinya 
	dengan syarat tipe data nya harus sama 
	
*/

public class Main {
	public static void main(String[] args){
		int[][] aray = {
			{1,2,3,4},
			{1,6,4},
			{2}
		};
		
		System.out.print(Arrays.deepToString(aray));
	}
}