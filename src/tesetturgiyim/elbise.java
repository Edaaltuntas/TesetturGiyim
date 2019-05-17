package tesetturgiyim;

import java.util.Scanner;

public  class elbise  extends TesetturGiyim{
    protected  String[] elbise = new String[]{"günlük","abiye"};
    Scanner scan = new Scanner(System.in);
    protected  int[] elbiseFiyat = new int[]{120,450}; // Sırasıyla : günlük ve abiye fiyatı belirlenir. 
    //  Kiyafet kıyafet= new Kiyafet();       
    protected  void elbiseSec() {
        
        int seçme = 0;
        while(true){
        System.out.println("Hangi elbiseyi seçeceksiniz ? ");
        System.out.println("1: Günlük");
        System.out.println("2: Abiye");
        System.out.println("3: Geriye Dön");
        seçme = scan.nextInt();
        if(seçme == 1)
    {
     
     Seçim[0] = elbise[0];// elbise dizisinin 0. indisini seçtiğimiz için Seçim dizisinin 0. indisine  yaptığımız seçim eklenir 
     SeciliFiyat[0]= elbiseFiyat[0] ; //SeciliFiyat dizisinin 0.indisine  elbiseFiyat dizisinin 0. indisi eklenir
        System.out.println("Fiyat : " +SeciliFiyat[0]);
     break;
            
    }
    else if(seçme==2)
    {
        Seçim[0] = elbise[1]; // elbise dizisinin 1. indisi seçtiğimiz için Seçim dizisinin 0. indisine yaptığımız seçim eklenir.
        SeciliFiyat[0]= elbiseFiyat[1];// SeciliFiyat dizisinin 0.indisine  elbiseFiyat dizisinin 1. indisi eklenir
        System.out.println("Fiyat : "+SeciliFiyat[0]);
        break;
    }
    else if(seçme==3)
    {
        break;
    }
    else {
        break;
        
    }
        
    
    
        
    
    
    }
    
        
        
    }    
    }

