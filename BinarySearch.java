import java.util.*;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        String[] inventaris = sc.nextLine().split(" ");
        String key = sc.nextLine();

        Arrays.sort(inventaris);

        int pos = binarySearch(inventaris, key);

        // Output hasil pencarian
        if (pos != -1) {
            System.out.println("Ditemukan di indeks ke-" + pos);
        } else {
            System.out.println("Data tidak ditemukan");
        }

        sc.close();
    }

    public static int binarySearch(String[] arr, String X) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // Jika elemen tengah adalah X
            if (arr[mid].equals(X)) {
                return mid;
            }

            // Jika X lebih kecil dari elemen tengah, cari di sisi kiri
            if (arr[mid].compareTo(X) > 0) {
                high = mid - 1;
            }
            // Jika X lebih besar dari elemen tengah, cari di sisi kanan
            else {
                low = mid + 1;
            }
        }

        // Jika tidak ditemukan
        return -1;
    }
}
