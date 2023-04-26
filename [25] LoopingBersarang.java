// 2022/11/22 21:12
// LOOPING BERSARANG MEMBUAT KOTAK DAN SEGITIGA 
// DENGAN MEMANFAATKAN BREAK

public class Main {
	public static void main(String[] args){
		//PERSEGI 
		for(int i = 0; i < 5 ; i++){ //UNTUK MEMBUAT KOLOM
			for(int j = 0; j < 5 ; j++){ //UNTUK MEMBUAT 1 BARIS
				System.out.print("* "); 
			}
			System.out.print("\n");//
		}
		
		System.out.print("\n");
		
		//SEGITIGA
		for(int i = 0; i < 5 ; i++){ //UNTUK MEMBUAT KOLOM
			for(int j = 0; j < 5 ; j++){ //UNTUK MEMBUAT 1 BARIS
				System.out.print("* "); 
				if (i == j){
					break;
				}
			}
			System.out.print("\n");//UNTUK MEMBUAT ENTER LINE 
		}
		
		System.out.print("\n");
		
		//SEGITIGA PENCERMINAN
		for(int i = 0; i < 5 ; i++){ 
			for(int j = 0; j < 5 ; j++){ 
				System.out.print("* "); 
				if ((i+j) == 4){
					break;
				}
			}
			System.out.print("\n");
		}
		
		System.out.print("\n");
		
		//KERUCUT KEBALIK 
		for(int i = 0; i < 9 ; i++){ 
			for(int j = 0; j < 9 ; j++){ 
				System.out.print("* "); 
				if (i == j) {
					break;
				} else if ((i+j) == 8) {
					break;
				}
			}
			System.out.print("\n");
		}
	}
}