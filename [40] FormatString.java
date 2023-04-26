//2023/02/05 12:07

import java.util.Formatter;

/*
	Format String 
	Dapat di save kedalam String
	merupakan cara mudah untuk mengilustrasikan sebuah kalimat yang membutuhkan kata yang sama secara berulang 
	dariapa melakukan dengan + lebih baik dengan Format String
	Langkah awal untuk menulis kedalam file 
	
	Format Sring di tandai dengan adanya simbol %
		%s = untuk tipe data String;
		%d = untuk tipe data Integer 
		%f = untuk tipe data float double 
		%c = untuk tipe data chat 
		%b = untuk tipe data boolean
		
	mengganti sebuah tulisan dengan menggunakan sout, Syntax
		System.out.printf("Kalimat %s", namaVariabelYgInginDiMasukan); //%s menandakan bahwa itu format String

	Property Struktur format  
	di awali dengan simbol % sebagai formarter lalu di ikuti oleh convertion 
		%convertion
	Syntax Struktur format: 
		%[argumen_index][flags][width][.precision] conversion
	Penjelasan 
		[argumen_index] = index_ke$ (berfungsi jika ingin menuliskan seara berulang dari sebuah kalimat) contoh %1$s
		[flags] = + - (merupakan nilai nilai yang ingin kita masukan kedalam stirng kita value nya + atau - flags akan lebih terlihat jika di padukan dengan width)
		[width] = nilai_berupa_angka (width atau lebar berfungsi sebagai memberi slot tambahan atau karakter kosong tambahan,jika ingin memberi width maka lihat terlebih dahulu jumlah karakter nya, jika ada flags lalu flags nya - maka akan rata kiri dan memberi slot kosong di kanan, jika flags nya + maka akan memberikan slot kosong di kiri)
		[.precision] = .nilaiBerupaAngka (untuk melihat berapa angka di belakang koma, atau membutkan angka)
*/

public class Main {
	public static void main(String[] args){
		String nama = "Luffy";
		int umur = 17;
		
		//output manual tanpa format stirng 
		System.out.println("Nama saya " + nama + " Umur saya " + umur);
		
		//output dengan formst string 
		System.out.printf("Nama saya adalah %s, umur saya adalah %d%%\n",nama,umur);
		
		//%[Argumen index]
		System.out.println("\nArgumen index");
		
		//Luffy kemana perginya Luffy 
		System.out.printf("\n%s kemana perginya %s\n",nama,nama); //tanpa argumenindex
		System.out.printf("%1$s kemana perginya %1$s\n",nama); //dengan argumenindex 
		
		// Umur Luffy berapa? Umurnya adalah 17, 17 thn adalah umur Luffy 
		System.out.printf("umur %1$s berapa? Umurnya adalah %2$d, \n%2$dthn adalah umur %1$s\n",nama,umur);
		
		//%[flags]
		System.out.println("\nFlags");
		int nilai = 5; 
		int nilai1 = 8;
		int hasil = nilai1 - nilai;
		System.out.printf("%d - %d = %+d\n",nilai,nilai1,hasil); //flags +
		
		//%[width]
		System.out.println("\nWidth");
		int nilai3 = 1000;
		System.out.println("INTEGER ");
		System.out.printf("%d\n",nilai3);
		System.out.printf("%5d\n",nilai3);
		System.out.printf("%-5d\n",nilai3);
		System.out.printf("%+5d\n",nilai3); //akan mengambil slot di dalam string nya 
		System.out.printf("%+-6d\n",nilai3); //flags di gabungkan
		System.out.printf("%10d\n",nilai3);
		System.out.printf("% 10d\n",nilai3); //spasi akan di masukan di dalam slot kosong
		System.out.printf("%010d\n",nilai3);//flags = "0",mengakibatkan leading "0" didepan
		System.out.printf("%+10d\n",nilai3);//penambahan + di depanya
		System.out.printf("%+010d\n",nilai3);
		int nilai4 = 10000000;
		System.out.printf("%,10d\n",nilai3); //flags = "," maka akan menandalan delimater setiap seribu 
		System.out.printf("%-,10d\n",nilai4);
		
		System.out.println("\nFLOATING POINT");
		float n = 1.543f;
		System.out.printf("%f\n",n);
		System.out.printf("%+9f\n",n); //floating point akan mengambil width dengan 6 desimal

		System.out.println("\n.precision");
		float a = 15.678f;
		System.out.printf("%f \n",a); //format biasa
		System.out.printf("%.1f \n",a);
		System.out.printf("%.2f \n",a);
		System.out.printf("%+08.2f \n",a); //gabungkan dengan width 
		
		//contoh 
		System.out.println("\n Contoh");
		String u = "Kipli";
		float ip = 35.75673f;
		
		System.out.printf("IPK %s = %.2f, %1$s senang\n",u,ip);
		
		//SAVE FORMAT INI KEDALAM VAR STRING 
		String info = String.format("IPK %s = %.2f, %1$s senang\n",u,ip); //SAVE KE VARIABEL
		System.out.println(info);
		
		//SAVE FORMAT KE STIRNG BUILDER 
		StringBuilder build = new StringBuilder(); //membuat builder baru 
		Formatter format = new Formatter(build); //membuat formater yg akan memasukan nya ke builder
		
		format.format("IPK %s = %.2f, %1$s senang\n",u,ip);
		
		System.out.println(build);
	}
}