import java.util.Scanner;

public class SortInsertion {

    public static void main(String[] args) {
        // Array yang akan diinputkan
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah barang: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan data inventaris (dipisahkan dengan spasi): ");
        String[] inventory = scanner.nextLine().split(" ");

        if (inventory.length != n) {
            System.out.println("Jumlah inventaris tidak sesuai dengan input jumlah barang!");
            return;
        }

        insertionSortDescending(inventory);

        System.out.println("\n\nArray setelah sorting:");
        for (String item : inventory) {
            System.out.print(item + " ");
        }

        scanner.close();
    }

    // Metode Insertion Sort
    public static void insertionSortDescending(String[] array) {
        int n = array.length;
        for (int j = 1; j < n; j++) { // Cek Dari Elemen ke2
            String key = array[j]; // Elemen yang akan diurutkan
            int i = j - 1;

            // Geser elemen yang lebih kecil dari key ke kanan
            while (i >= 0 && array[i].compareTo(key) < 0) {
                array[i + 1] = array[i];
                i = i - 1;
            }

            // Masukkan key ke posisi yang benar
            array[i + 1] = key;
        }
    }
}
