// 2022/10/18 17:09
public class Main{
	public static void main (String[] args){
		/* Operator komparasienjadikan hasil dalam bentuk boolean (True atau False) 
			Symbiol pada operator komparasi: 
				==  equal
				!=   not equal
				>   lebih besar
				<   kurang dari
				>= lebih besar sama dengan 
				<= kurang dari sama dengan
	    */
	// TIPE DATA 
	int a,b;
	boolean hasil;
	
	// KOMPARASI EQUAL 
	a = 10;
	b = 10;
	hasil = (a == b) ;
	System.out.print("Operasi Sama : ");
	System.out.printf("%d == %d  --> %s \n", a,b,hasil);
	
	// KOMPARASI NOT EQUAL 
	a = 11;
	b = 12;
	hasil = (a != b);
	System.out.print("Operasi Pertidak Samaan :");
	System.out.printf("%d != %d --> %s \n",a,b,hasil);
	
	// KOMPARASI LEBIH BESAR 
	a = 10;
	b = 2;
	hasil = (a > b);
	System.out.print("Operasi Lebih Besar : ");
	System.out.printf("%d > %d --> %s \n",a,b,hasil);
	
	//OPERASI LEBIH KECIL 
	a = 10;
	b = 8;
	hasil = (a < b);
	System.out.print("Operasi Lebih Kecil : ");
	System.out.printf("%d < %d --> %s \n",a,b,hasil);
	
	//OPERASI LEBIH BESAR SAMA DENGAN 
	a = 10;
	b = 11;
	hasil = (a >= b);
	System.out.print("Operasi Lebih Besar Sama Dengan : ");
	System.out.printf("%d >= %d --> %s \n",a,b,hasil);
	
	//OPERASI LEBIH KECIL SAMA DENGAN 
	a = 10;
	b = 71;
	hasil = (a <= b);
	System.out.print("Operasi Lebih Kecil Sama Dengan : ");
	System.out.printf("%d <= %d --> %s \n",a,b,hasil);
	
	}
}