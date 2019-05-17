package tesetturgiyim;

public class etek extends uzun_kollu {

    protected String[] etek = new String[]{"uzun", "kısa"};
    protected int[] etekFiyat = new int[]{70, 90};

    protected void etekSec()
    

    {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int seçme = 0;
        while (true) {
            System.out.println("Hangi eteği seçeceksiniz ? ");
            System.out.println("1: Uzun");
            System.out.println("2: Kısa");
            System.out.println("3: Geriye Dön");
             seçme = scan.nextInt();
            if (seçme == 1) {

                Seçim[2] = etek[0];
                SeciliFiyat[2] = etekFiyat[0];
                System.out.println("Fiyat : " +SeciliFiyat[2]); // etek ve uzun_kollu sınıflarında yaptığımız işlemleri burada da yapıyoruz
                break;
            } else if (seçme == 2) {
                Seçim[2] = etek[1];
                SeciliFiyat[2] = etekFiyat[1] ;
                System.out.println("Fiyat : " +SeciliFiyat[2]);
                break;
            } else if (seçme == 3) {
                break;
            } else {
                break;

            }

        }

    }
}
