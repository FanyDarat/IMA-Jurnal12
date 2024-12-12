import java.util.Scanner;

public class LinearSeach {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta banyaknya barang yang akan diinput
        System.out.print("Masukkan jumlah barang: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Membersihkan buffer

        // Meminta input data inventaris dalam bentuk string
        System.out.print("Masukkan data inventaris (dipisahkan dengan spasi): ");
        String[] items = scanner.nextLine().split("\\s+");

        // Memastikan jumlah barang sesuai dengan input panjang
        if (items.length != n) {
            System.out.println("Jumlah barang tidak sesuai dengan input panjang.");
            return;
        }

        System.out.println();

        // Meminta key yang dicari
        System.out.print("Masukkan item yang dicari: ");
        String searchKey = scanner.nextLine();

        // Melakukan pencarian linear
        int pos = linearSearch(items, searchKey);

        if (pos != -1) {
            System.out.println("Data ditemukan di indeks ke-" + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }

    }

    // Fungsi Linear Search untuk mencari item dalam array
    public static int linearSearch(String[] data, String searchKey) {
        // Loop hingga akhir array
        for (int index = 0; index < data.length; index++) {
            if (data[index].equals(searchKey)) {
                return index + 1; // Mengembalikan index dari searchKey
            }
        }
        return -1; // Jika tidak ditemukan, kembalikan -1
    }
}
