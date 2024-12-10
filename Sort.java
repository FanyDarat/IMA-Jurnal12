import java.util.Arrays;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int panjang = s.nextInt();
        s.nextLine();
        String[] array = new String[panjang];

        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < panjang; i++) {
            array[i] = s.nextLine();
        }

        Arrays.sort(array);

        System.out.println("Hasil Pengurutan");
        for (String a : array) {
            System.out.print(a + " ");
        }
    }
}