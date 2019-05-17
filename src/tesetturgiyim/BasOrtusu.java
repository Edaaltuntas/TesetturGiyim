package tesetturgiyim;

import java.util.Scanner;

public class BasOrtusu  extends TesetturGiyim{

    protected String[] BaşÖrtü = new String[]{"şal", "eşarp", "yazma"};
    protected int[] ÖrtüFiyat = new int[]{50, 100, 25};
    renk Renk1 = new renk();
    Fiyat fiyat1 = new Fiyat();

    public void BasOrtusu() {

    }

    public void basOrtuSec() { // diğer (...)Sec metodlarında yağtığımız işlemlere benzer şekilde burada da aynı işlemleri yapıyoruz
        int seçim;
        Scanner scan = new Scanner(System.in);
        while(true){
        System.out.println("Neye Bakmak İstiyorsunuz ? ");
        System.out.println("1: Şal ");
        System.out.println("2: Eşarp ");
        System.out.println("3: Yazma ");
        System.out.println("4: Geri Dön");                               
        seçim = scan.nextInt();
         switch(seçim)
        {
            case 1 :
            Seçim[5] = BaşÖrtü[0] ;
            SeciliFiyat[5] = ÖrtüFiyat[0];
            System.out.println("Fiyat : " +SeciliFiyat[5]);
            break;
            case 2 :
            Seçim[5] = BaşÖrtü[1] ;
            SeciliFiyat[5] = ÖrtüFiyat[1];
            System.out.println("Fiyat : " +SeciliFiyat[5]);
            break;
            case 3 :
            Seçim[5] = BaşÖrtü[2] ;
            System.out.println("Fiyat : " +SeciliFiyat[5]);
            break ;
            case 4 :
            break;               
               
        }
         break;
        }
    }
    /*private String şal;
    private String eşarp;
    private String yazma;
    private boolean yazlık;
    
    public BaşÖrtüsü(){
        this.şal="";
        this.eşarp="";
        this.yazma="";
        this.yazlık=true;
    }
    public BaşÖrtüsü(String şal, String eşarp, String yazma, boolean yazlık) {
        this.şal=şal;
        this.eşarp=eşarp;
        this.yazma=yazma;
        this.yazlık=true;
    }
     */
}
