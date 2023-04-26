import java.util.Arrays;
/*
    OPERASI PADA ARRAY
    Mengubah array menjadi string dengan menggunakan library Arrays 
    memiliki syntax 
        System.out.println(Arrays.toString(variabelArray));
        
    MENGKOPI ARRAY 
        FOR : 
            for(int i = 0 ; i < VariabelAray.length;i++){
                TipeData[] NamaVariabel = VariabelArayYngInginDiCopy[i];
            }

        copyOf : 
            TipeData[] NamaArray = Arrays.copyOf(YngInginDiCopi,PnjangArrayYgInginDiCopy);

        copyOfRange :
            Yaitu mengkopi array berdasarkan lokasi yang ingin di kopi saja
            TipeData[] NamaArray = Arrays.copyOfRange(ArrayYgInginDiCopy,IndexAwalArray,BatasAkhirIndexArray);

    
    FILL ARRAY DENGAN LIBRARY ARRAYS
        Fill array di gunakan untuk mengisi nilai indx pada array dengan sama rata
        jika kita telah menginisiasi(dekklarasi sebuah array) maka kita bisa melakukan fill pada array itu 
        Syntax:
            Arrays.fill(ArrayYgInginDiFill,NominalYgInginDiMasukan);

    KOMPARASI ARRAY
        Membandingkan nilai 2 buah array apakah sama atau beda  
        dalam membandingkan isi atau nilai dalam array tidak bisa menggunakan ==
        harus memakai Arrays.equals(); sebab membandingkan nilai didalamnya
        HANYA UNTUK ARRAY DENGAN ARRAY  HASIL BOOLEAN
        Syntax:
            Arrays.equals(Array1,Array2);

        Array mana yang lebih besar dengan menggunakan Arrays.compare
        maka akan terlihat nilainya 1/0/-1
        jika nilainya 1 berarti array itu lebih besar
        jika nilainya 0 berarti array itu lebih kecil
        jika nilainya -1 berarti array itu sama
        HASIL OUTPUT INTERGER
        Syntax:
            Arrays.compare(Array1,Array2);

        Mengecek index array yang mana berbeda dengan menggukana array mismatch
        output nya hanya berupa index keberapa dari array itu yang berbeda
        HASIL OUTPUT INTERGER
        Syntax:
            Arrays.mismatch(Array1,Array2);

    SEARCH ARRAY:
        Berfungi untuk mencari index array yang ingin kita temukan 
        jika ada banyak index array maka kesulitan maka cara pealing mudah dengan menggunakan library Arrayas
        kekurangan dari search array dengan arrays library yaitu kita harus 
        mensortir terlebih dahulu array nya lalu baru kita search
        Syntax sort array:
            Arrays.sort(ArayYgInginDiSirt);
        Syntax:
            Arrays.binarySearch(ArrayYgInginDiCari,AngkaMana);
*/

public class Main{
    
    public static void main(String[] args) {
        int[] Angka = {1,2,3,4,5};
        
        //Memgubah aray menjadi string
        System.out.println("\nMengubahh aray menjadi string : ");
        print(Angka);
        
        //Mengkopi array
        int[] bil = new int[5];
        System.out.println("\nMengkopi array : ");
        print(Angka);
        print(bil);  
        System.out.println("Mengkopi dengan loop ");
        for(int i = 0 ; i < Angka.length;i++){
            bil[i] = Angka[i];
        }
        print(Angka);
        print(bil);  
        
        //Mengkopi array dengan copyOf
        System.out.println("\n Mengkopi dengan copyOf");
        int[] bil2 = Arrays.copyOf(Angka,5);
        print(Angka);
        print(bil2);

        //Mengkopi array dengan copyOfRange
        System.out.println("\n Mengkopi dengan copyOfRange");
        int[] bil3 = Arrays.copyOfRange(Angka, 1, 7);
        print(Angka);
        print(bil3 );
        
        //Fill array
        System.out.println("\n Fill array dengan Arrays.fill");
        int[] Aray1 = new int[10];
        print(Aray1);
        Arrays.fill(Aray1, 5);
        print(Aray1);
        
        //Komparasi pada array
        System.out.println("\n Komparasi pada array");
        int[] Aray2 = {1,2,3,2,5};
        int[] Aray3 = {1,2,3,4,5};
        
        System.out.println("Membandingkan antara 2 buah arraray dengan .equals");
        System.out.println(Arrays.equals(Aray2, Aray3)); //HASIL TRUE
        
        if(Arrays.equals(Aray2, Aray3)){
            System.out.println("\nARRAY SAMA");
        } else{
            System.out.println("\nARRAY BEDA");
        }
        
        System.out.println("\nMengecek array mana yang lebih besar");
        System.out.println(Arrays.compare(Aray3, Aray1));
        
        System.out.println("\nMengecek index array mana yang berbeda");
        System.out.println(Arrays.mismatch(Aray3,Aray2));
        
        //sort array
        System.out.println("\nSorting array menggunakan binary search");
        int[] anka = {1,2,3,4,1,2,5,3,7,4,5};
        print(anka);
        Arrays.sort(anka);
        print(anka);
        
        //search array
        System.out.println("\nSearch array menggunakan binary search");
        int dicari = 7;
        int index = Arrays.binarySearch(anka, dicari);
        
        System.out.println("angka  " + dicari + " Index ke = " + index);
    }
    
    private static void print(int[] bilangan){
        System.out.println("Aray = " + Arrays.toString(bilangan));
    }
}