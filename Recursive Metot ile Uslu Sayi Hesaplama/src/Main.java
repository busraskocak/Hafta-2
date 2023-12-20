import java.util.Scanner;

public class Main {

    static  int power(int a , int b){
        int result =1;
        for (int i=1;i<=b; i++){
            result *=a;
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Taban Değerini Giriniz : ");
        int a= inp.nextInt();
        System.out.println("Üs Değerini Giriniz:");
        int b= inp.nextInt();

        int result = power(a, b);

        System.out.println("Sonuç: " + result);








    }
}