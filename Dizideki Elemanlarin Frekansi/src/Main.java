import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static boolean isFind(int[] arr, int value, int index) {
        for (int i = 0; i < index; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 5, 20, 4, 10, 3, 5, 7, 20, 4, 10, 3};
        System.out.println("Dizi: " + Arrays.toString(list));

        for (int i = 0; i < list.length; i++) {
            int count = 0;

            // Eğer bu eleman daha önce kontrol edildiyse, tekrar etme
            if (!isFind(list, list[i], i)) {
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        count++;
                    }
                }
                System.out.println(list[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
