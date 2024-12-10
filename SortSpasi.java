import java.util.*;

public class SortSpasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta banyaknya barang yang akan diinput
        System.out.print("Masukkan banyak barang: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Meminta data inventaris
        System.out.print("Masukkan data inventaris (dipisahkan dengan spasi): ");
        String[] items = scanner.nextLine().split("\\s+");

        // Memastikan jumlah barang sesuai input pengguna
        if (items.length != n) {
            System.out.println("Jumlah barang tidak sesuai dengan input panjang.");
            return;
        }

        // Mengurutkan array secara ascending
        Arrays.sort(items);

        // Menampilkan hasil
        System.out.println("Data inventaris terurut:");
        for (String item : items) {
            System.out.print(item + " ");
        }
        System.out.println();

        scanner.close();
    }
}

