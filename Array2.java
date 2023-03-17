
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {

        // membuat array buah-buahan
        String[] barang = new String[5];

        // membuat scanner
        Scanner scan = new Scanner(System.in);

        // mengisi data ke array
        for( int i = 1; i < barang.length; i++ ){
            System.out.print("Kata ke-" + i + ": ");
            barang[i] = scan.nextLine();
        }

        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String x : barang ){
            System.out.println(x);
        }

    }
}