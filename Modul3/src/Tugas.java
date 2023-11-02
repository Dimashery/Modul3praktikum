import java.util.Scanner;

/**
 * Pembuatan Perhitungan Logaritma di Java
 */
public class Tugas {



    public double angka;
    public int perhitunganLogaritma(){

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka untuk menghitung Logaritma : ");
        angka = input.nextDouble();

        //Menghitung Logaritma

        double hasil = Math.log(angka);

        System.out.println("Hasil dari Logaritma alami dari " +angka+ " adalah " +hasil);

        return 0;
    }

    /**
     *
     * @param args Method ini digunakan untuk membuat objek lalu dipanggil
     */

    public static void main(String[] args) {

        Tugas tgs = new Tugas();
        tgs.perhitunganLogaritma();

    }

}
