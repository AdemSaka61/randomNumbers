import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class rastgele {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        System.out.print("Tahmin hakkı giriniz : ");
        int predition = input.nextInt();
        int sayi, i = 0;
        int right = predition;
        int[] selects = new int[predition];

        while (i++ <= predition) {
            System.out.print("Sayı giriniz : ");
            sayi = input.nextInt();
            if (sayi < 0 || sayi > 100) {
                System.out.println("lütfen 0 ile 100 arasında bir değer giriniz.");
                continue;
            }
            if (sayi == number) {
                System.out.print("Sayıyı doğru tahmin ettiniz.");
                break;

            } else {
                System.out.println("Hatalı sayı girdiniz.");
            }
            if (sayi > number) {
                System.out.println("Girdiğiniz sayı tutulan sayıdan büyük daha küçük tahminde bulunun");
                System.out.println("Kalan hakkınız : " + (--right));
                if (right == 0){
                    System.out.println("Oyun bitti. Kaybettiniz!");
                }

            } else if (sayi < number) {
                System.out.println("Girdiğiniz sayı tutulan sayıdan küçük daha büyük tahminde bulunun");
                System.out.println("Kalan hakkınız : " + (--right));
                if (right == 0){
                    System.out.println("Oyun bitti. Kaybettiniz!");
                }

            }


        }




    }
}
