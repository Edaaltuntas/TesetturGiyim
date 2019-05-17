package tesetturgiyim;

public class hirka extends pantolon {
    
    protected String[] hırka = new String[]{"uzun", "kısa"};
    protected int[] hırkaFiyat = new int[]{40, 60};
    public void hirka()
    {
        
    }
    protected void hirkaSec()
    

    {
      java.util.Scanner input = new java.util.Scanner(System.in) ;
        int seçme = 0;
        while (true) {
            System.out.println("Hangi hırkayı seçeceksiniz ? ");
            System.out.println("1: Uzun");
            System.out.println("2: Kısa");
            System.out.println("3: Geriye Dön");
            seçme = input.nextInt();
            if (seçme == 1) {

                Seçim[4] = hırka[0];
                SeciliFiyat[4] = hırkaFiyat[0];
                System.out.println("Fiyat : " +SeciliFiyat[4]);
                break;
                

            } else if (seçme == 2) {
                Seçim[4] = hırka[1];
                SeciliFiyat[4] = hırkaFiyat[1];
                System.out.println("Fiyat : " +SeciliFiyat[4]);
                break;
            } else if (seçme == 3) {
                break;
            } else {
                break;

            }

        }

    }

}
