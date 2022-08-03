import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("*** Hesap Makinesi Uygulamas? ***\n");

        System.out.print("?lk say?y? giriniz > ");
        int sayi1=s.nextInt();

        System.out.print("?kinci say?y? giriniz > ");
        int sayi2=s.nextInt();

        System.out.print("(1) Toplama\n(2) ??karma\n(3) ?arpma\n(4) B?lme\n??lemi giriniz > ");
        int islem=s.nextInt();

        switch (islem){
            case 1:
                System.out.print("\n"+sayi1+" + "+sayi2+" = "+(sayi1+sayi2));
                break;
            case 2:
                System.out.print("\n"+sayi1+" - "+sayi2+" = "+(sayi1-sayi2));
                break;
            case 3:
                System.out.print("\n"+sayi1+" * "+sayi2+" = "+(sayi1*sayi2));
                break;
            case 4:
                System.out.print("\n"+sayi1+" / "+sayi2+" = "+(sayi1/sayi2));
                break;
        }
    }
}
