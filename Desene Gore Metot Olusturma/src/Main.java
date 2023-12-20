import java.util.Scanner;

public class Main {
    static void desen(int n){
        if (n<=0){
            System.out.println("Son Sayı: " + n);
            return;
        }
        System.out.println("Sayı :" + (n-5));
        desen(n-5);
        if (n-5>0){
            System.out.println("Sayı :" + (n-5));
        }

    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n= input.nextInt();
        desen(n);
    }
}