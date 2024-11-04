
package pertemuan6;

import java.util.Scanner;

public class latiha22_perhitunganNilai {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isValid = false;
        double diameter = 0;

        System.out.println("=====Perhitungan Lingkaran=====");
        while (!isValid) {
            System.out.print("Masukkan nilai diameter lingkaran: ");
            String userInput = input.nextLine();

            try {
                diameter = Double.parseDouble(userInput);
                if (diameter > 0) {
                    isValid = true;
                } else {
                    System.out.println("Nilai Diameter Tidak Sesuai");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nilai Diameter Tidak Sesuai");
            }
        }

        // Jika input valid, lakukan perhitungan
        double radius = diameter / 2;
        double luas = Math.PI * radius * radius;
        double keliling = 2 * Math.PI * radius;

        System.out.println("=====Hasil Perhitungan Lingkaran=====");
        System.out.printf("Jari-jari Lingkaran = %.2f cm%n", radius);
        System.out.printf("Luas Lingkaran = %.2f cm²%n", luas);
        System.out.printf("Keliling Lingkaran = %.2f cm%n", keliling);
    }
}
