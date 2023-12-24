import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Kullanıcıdan verileri al

        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n :");
        int n = scan.nextInt();

        //Kullanıcıdan dizinin elemanlarını al
        int[] list = new int[n];

        System.out.println("Dizinin elemanlarını giriniz :");
        for (int i = 0; i < list.length; i++) {
            System.out.print("Eleman" + (i + 1) + ": ");
            list[i]= scan.nextInt();
        }
        Arrays.sort(list); // Dizi sıralama
        System.out.println("Sıralanmış Dizi: "); //Sıralanmış diziyi ekrana bastırma
        for (int i : list){
            System.out.println(i + " ");

        }


    }
}