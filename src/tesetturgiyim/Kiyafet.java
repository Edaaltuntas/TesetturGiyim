package tesetturgiyim;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Kiyafet  {

    //renk Renk = new renk();
    Scanner seçim = new Scanner(System.in);
    Fiyat fiyat = new Fiyat();
    
     hirka hırka = new hirka() ; // hırka, bütün sınıfların alt sınıfı olduğu için , hırka nesensi oluşturarak bütün sınıfların metodlarına
                                 // ulaşıp Kiyafet sınıfında kullanmayı sağlamış olacağız
    public void Kiyafet()
    {
      
    }

    public void KiyafetSec() {
        int seçme = 0;
        
        while (true) {
            System.out.println("Hangi Kıyafeti Seçmek İstersiniz: ");
            System.out.println("1:Elbise");
            System.out.println("2:Uzun Kollu");
            System.out.println("3:Etek");
            System.out.println("4:Pantolon");
            System.out.println("5:Hırka");
            System.out.println("6:Geri Dön");
            seçme = seçim.nextInt();
            switch (seçme) {
                case 1:
                      hırka.elbiseSec();
                    
                    continue;

                case 2:

                   hırka.uzunKolluSec();
                    continue;

                case 3:
                   
                    hırka.etekSec();
                    continue;

                case 4:

                    hırka.pantolonSec();
                    continue;
                case 5:

                    hırka.hirkaSec();
                    continue;

                case 6:
                    break;
            }
            break;
            
        }
                
    }

    

}
