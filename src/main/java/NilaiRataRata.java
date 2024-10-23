import java.util.Scanner;

public class NilaiRataRata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = scanner.nextDouble();

        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = scanner.nextDouble();

        System.out.print("Masukkan bilangan ketiga: ");
        double bil3 = scanner.nextDouble();

        double rataRata = (bil1 + bil2 + bil3) / 3;

        System.out.println("Rata-rata dari tiga bilangan tersebut adalah: " + rataRata);
    }
}
