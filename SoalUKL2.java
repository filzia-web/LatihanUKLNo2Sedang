import java.util.Scanner;

public class SoalUKL2 {
 public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Masukkan jari-jari: ");
    double r = input.nextDouble();
    System.out.println("Masukkan tinggi: ");
    double t =  input.nextDouble();

    double hasil = hitungVolume(r,t);
    System.out.println("Volume tabug: " + hasil);
 }
 static double hitungVolume(double jariJari, double tinggi) {
    return Math.PI*  jariJari * jariJari  * tinggi;
 }
}

