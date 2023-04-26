//2023/02/04 20:33

import java.lang.StringBuilder;

/*
	String Builder Java 
	
	jika masih dalam StringBuilder maka harus di jadikan String biasa jika ingin melakukan operasi equlas atau == 
	StringBullder hanya untuk menghemat memory kita
	
	kegunaan String builder yaitu untuk memudahkan kita jika ingin memggangi komponen stirng yg ada di tengah tengah 
	Jika tidak terlalu perlu dengan append dan insert mending pakai String biasa
	untuk memudahkan meng concat string 
	untuk membuat memory lebih hemat 
	
	untuk melakukan String builder harus melakukan import ke library java dengan 
		import java.lang.StringBuilder;
		
	String builder akan sama dengan String 
	perbedaan denga string biasa adalah 
		1. StringBuilder memiliki kapasitas (kapasitas awal 16 karakter) sedangkan String biasa tidak punya 
		2. String biasa jika ada data baru maka ia akan menaruh di memory lain sedangkan StringBuilder dia memiliki kapasitas yang terus berkembang 
	
	lalu membuat Objek baru Syntax : 
		StringBuilder namaVaribel = new StringBuilder();
		StringBuilder nama = new StringBuilder("hehe");
		
	Operasi pada StringBuilder : 
		1. append, berbeda dengan concat, jika concat akan membuat memory baru dan address berubah 
		    jika append dia hanya menambah memori tetapi dengan address yg sama 
		2. insert, unutk menambahkan komponen baru atau nilai di tengah" string 
		3. delete, unutk menhapus komponen yg di tentukan 
		4. setCharAt, untuk merubah index tertentu pada suara string 
		5. replace, untuk mengubah sebuah kata 
		
	Syntax : 
		namaVariabel.append("namaBaru"); //append menambah di depan
		namaVariabel.insert(indexYgInginDiTambah, "kalimatBaru"); //insert menambah di bebas tempat 
		namaVariable.delete(indexAwal,indexAkhir); // mengahpus komonen di sembarang tempat 
		namaVariable.setCharAt(indexYgDitentukan, "namaBaru"); //mengubah ada tempat tertentu 
		namaVariabel.replace(indexAwal,indexAkhir,"kataBaru"); //untuk megubah sebua kata tertentu pada String
*/

public class Main {
	public static void main(String[] args){
		StringBuilder build = new StringBuilder("Hehe ");
		
		printBuild(build);
		
		//append (menambahakan depan)
		build.append("Admin ");
		printBuild(build);
		
		build.append("Kucing Salto ");
		printBuild(build);
		
		//insert (menambahkan bisa custom tempat)
		build.insert(5," Disini Adalah ");
		printBuild(build);
		
		//delete (mengahpus bebas tmpt)
		build.delete(16,25);
		printBuild(build);
		
		//merubah tempat tertentu 
		build.setCharAt(13, 'X');
		printBuild(build);
		
		//replace 
		build.replace(0,4,"Mimin");
		printBuild(build);
		
		//casting menjadi string baru bisa di eksekusi mejadi equals 
		String kalimat = build.toString();
		int adres = System.identityHashCode(kalimat);
		System.out.println("data = " + kalimat);
		System.out.println("Address = " + Integer.toHexString(adres));
	}
	
	private static void printBuild(StringBuilder data){
		System.out.println("data = " + data);
		System.out.println("panjang = " + data.length());
		System.out.println("kapasitas = " + data.capacity());
		
		//melihat addersnya 
		int addres = System.identityHashCode(data);
		System.out.println("address = " + Integer.toHexString(addres));
		System.out.print("\n");
	}
}