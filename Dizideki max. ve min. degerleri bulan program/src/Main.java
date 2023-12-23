import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = input.nextInt();

        int[] list = {56, 34, -1, 78, 2, -33, 55,85};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int min = list[0];
        int max = list[list.length -1];

        for (int i : list) {
            if (i < number && i > min) {
                min = i;
            }
            if (i > number && i < max) {
                max = i;
            }
        }
        System.out.println("Min değer : " + list[0]);
        System.out.println("Max değer :" + list[list.length -1] );
        System.out.println("En küçüğe yakın değer :" +min);
        System.out.println("En büyüğe yakın değer :" +max);




    }
}