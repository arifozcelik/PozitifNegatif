package NesneYonelimliProgramlamaKitap;

import java.util.Scanner;

public class PozitifNegatif {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        int b,a,i;
        int po = 0, ne =0;
        System.out.println("Kaç sayı gireceksin?");
        b = tara.nextInt();
        System.out.println("Sayıları girin...:");
        for (i = 1; i<=b; i++)
        {
            a = tara.nextInt();
            if (a >= 0)
                po += 1;
            if (a < 0)
                ne += 1;
        }
        System.out.println("pozitif sayısı: \n" +po);
        System.out.println("Negatif sayısı: \n" + ne);
    }
}
