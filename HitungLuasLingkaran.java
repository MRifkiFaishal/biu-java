import java.util.Scanner;

public class HitungLuasLingkaran {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double jariJari, luas;

    System.out.print("Masukkan jari-jari lingkaran: ");
    jariJari = input.nextDouble();

    luas = Math.PI * Math.pow(jariJari, 2);
    System.out.println("Luas lingkaran dengan jari-jari " + jariJari + " adalah " + luas);
  }
}