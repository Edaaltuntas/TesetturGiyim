package tesetturgiyim;

public class pantolon extends etek {

    protected String[] pantolon = new String[]{"ispanyol", "boru_paça"};
    protected int[] pantolonFiyat = new int[]{125, 100};

    public void pantolonSec()
    

    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int seçme = 0;
        while (true) {
            System.out.println("Hangi pantolonu seçeceksiniz ? ");
            System.out.println("1: İspanyol");
            System.out.println("2: Boru Paça");
            System.out.println("3: Geriye Dön");
             seçme = input.nextInt();
            if (seçme == 1) {

                Seçim[3] = pantolon[0];
                SeciliFiyat[3] = pantolonFiyat[0];
                System.out.println("Fiyat : " +SeciliFiyat[3]);
                break;
            } else if (seçme == 2) {
                Seçim[3] = pantolon[1];
                SeciliFiyat[3] = pantolonFiyat[1];
                System.out.println("Fiyat : " +SeciliFiyat[3]);
                break;
            } else if (seçme == 3) {
                break;
            } else {
                break;

            }

        }

    }
}
