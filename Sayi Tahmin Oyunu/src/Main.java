import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100); //Rastgele sayı üretme

        Scanner input = new Scanner(System.in);
        int right = 0; //Oyun için hak belirtme
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);
        while (right < 5) {
            System.out.print("Lütfen tahmininizi giriniz:");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasında bir değer giriniz");
                if (!isWrong) {
                    isWrong = true;
                    System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.");
                } else {
                    right++;
                    System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak: " + (5 - right));
                }
                continue;


            }

            if (selected == number) {
                System.out.println("Tebrikler doğru tahmin" + number);
                isWin = true;
                break;
            } else {
                wrong[right] = selected;
                System.out.println("Hatalı bir sayı girdiniz");
                if (selected > number) {
                    System.out.println(selected + " sayısı,gizli sayıdan büyüktür.");
                } else {
                    System.out.println(selected + " sayısı, gizli sayıdan küçüktür.");
                }
                right++;
                System.out.println("Kalan Hakkınız " + (5 - right));
            }

        }
        if (!isWin && !isWrong) {
            System.out.println("Kaybettiniz!");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));

        }


    }
}