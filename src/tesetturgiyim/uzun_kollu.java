package tesetturgiyim;
import java.util.Scanner ;
public class uzun_kollu extends elbise{

    protected String[] uzunKol = new String[]{"badi", "gömlek", "tunik"};
    protected int[] uzunKolFiyat = new int[]{50, 75, 80};
    Scanner scan = new Scanner(System.in);
     protected void uzunKolluSec() {
        java.util.Scanner seçim = new java.util.Scanner(System.in);
        int seçme = 0;
        while (true) {
            System.out.println("Hangi uzun kolluyu seçeceksiniz ? ");
            System.out.println("1: Badi");
            System.out.println("2: Gömlek");
            System.out.println("3: Tunik");
            System.out.println("4: Geriye Dön");
             seçme = scan.nextInt();
            if (seçme == 1) {

                Seçim[1] = uzunKol[0];
                SeciliFiyat[1] = uzunKolFiyat[0]; //elbise dizisinin 0. indisini seçtiğimiz için Seçim dizisinin 0. indisine  yaptığımız seçim eklenir
                System.out.println("Fiyat : " +SeciliFiyat[1]); //SeciliFiyat dizisinin 0.indisine  uzun_kolluFiyat dizisinin 0. indisi eklenir

            } else if (seçme == 2) {
                Seçim[1] = uzunKol[1]; // 
                SeciliFiyat[1] = uzunKolFiyat[1];
                System.out.println("Fiyat : " +SeciliFiyat[1]);
                break;
            } else if (seçme == 3) {
                Seçim[1] = uzunKol[2];
                SeciliFiyat[1] = uzunKolFiyat[2];
                System.out.println("Fiyat : " +SeciliFiyat[1]);
                break;
            } else if (seçme == 4) {
                break;
            } else {
                break;

            }

        }

    }

}
