import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("|| Program Konversi Suhu Air ||");
        System.out.println("===============================");
        System.out.println("Input Data");
        System.out.println("==========");
        System.out.print("Suhu Dalam Celcius : ");
        double celcius = scanner.nextDouble();
        Konversi konversiAir = new Konversi(celcius);
        while (true) {
            System.out.println("Opsi");
            System.out.println("====");
            System.out.println("1. LIhat Data Konversi");
            System.out.println("2. Edit data konversi");
            System.out.println("3. Exit");
            System.out.print("Pilih : ");
            int pilih = scanner.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Suhu Dalam Celcius : " + celcius);
                    System.out.println("Suhu Dalam Fahrenheit : " + konversiAir.fahrenheit);
                    System.out.println("Suhu Dalam Reamur : " + konversiAir.reamur);
                    System.out.println("Suhu Dalam Kelvin : " + konversiAir.kelvin);
                    Konversi.kondisiAir(celcius);
                    break;
                case 2:
                    System.out.println("Input Data");
                    System.out.println("==========");
                    System.out.print("Suhu Dalam Celcius : ");
                    double celciusEdit = scanner.nextDouble();
                    Konversi konversiAirEdit = new Konversi(celcius);
                    System.out.println("Suhu Dalam Celcius : " + celciusEdit);
                    System.out.println("Suhu Dalam Fahrenheit : " + konversiAirEdit.fahrenheit);
                    System.out.println("Suhu Dalam Reamur : " + konversiAirEdit.reamur);
                    System.out.println("Suhu Dalam Kelvin : " + konversiAirEdit.kelvin);
                    Konversi.kondisiAir(celcius);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak ada. Mohon masukkan opsi yang tersedia");
            }
        }
    }


}
