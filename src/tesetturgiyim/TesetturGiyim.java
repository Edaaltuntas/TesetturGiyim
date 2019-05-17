package tesetturgiyim;

import java.io.FileNotFoundException;
import jdk.nashorn.internal.runtime.regexp.joni.Syntax;

public class TesetturGiyim {
    
    static String[] Seçim = new String[6]; // yapacağımız seçimleri kaydetmek için kullandığımız dizi
     static int[] SeciliFiyat = new int[6]; // yaptığımız seçimlerin fiyatlarını tutan dizi
public static void main(String[] args) throws FileNotFoundException {
    
    java.util.Scanner scan = new java.util.Scanner(System.in);
    Kiyafet kiyafet =new Kiyafet();
    Fis fiş = new Fis();
    
    int seçim = 0;
        OUTER:
        while (true) {
            System.out.println("Eda Giyim'e hoşgeldiniz ! ");
            System.out.println("Neye Bakmak İstiyorsunuz ? ");
            System.out.println("1: BaşÖrtüsü al");
            System.out.println("2: Kıyafet  al");
            System.out.println("3: Sepettekileri göster");
            System.out.println("4: Fişi göster ");
            System.out.println("5: Çıkış Yap");
            seçim = scan.nextInt() ;
            switch (seçim) {
                case 1:
                    BasOrtusu b=new BasOrtusu();
                    b.basOrtuSec();
                    continue;
                case 2:
                    kiyafet.KiyafetSec();
                    continue;
                case 3:
                    for (int i = 0; i <Seçim.length; i++) {
                        System.out.println(i+1 +" : "+Seçim[i] + " "+SeciliFiyat[i] +"TL");
                    }
                    
                    continue;
                case 4:
                    fiş.FisCikar();
                    break;
                case 5:
                    System.out.println("Yine bekleriz");
                    break OUTER;
                default:
                    System.out.println("Hatalı giriş yaptınız");
                    continue;
            }
        }
    }
    
}
