import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Kullanıcıdan veri al.
        Scanner input = new Scanner(System.in);

        int row;
        int column;

        System.out.print("Satır sayısını giriniz: ");
        row = input.nextInt();
        System.out.print("Sütun Sayısını Giriniz: ");
        column = input.nextInt();

        // Satır ve sutün için matris oluşturma
        int[][] matris = new int[row][column];

        // Matris elemanlarını kullanıcıdan al
        System.out.println("Matris elemanlarını giriniz:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Matris[" + i + "][" + j + "]: ");
                matris[i][j] = input.nextInt();
            }
        }

        // Matrisin transpozunu al
        int[][] transpoz = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpoz[j][i] = matris[i][j];
            }
        }

        // Transpoz matrisini yazdır
        System.out.println("Transpoz");

        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
