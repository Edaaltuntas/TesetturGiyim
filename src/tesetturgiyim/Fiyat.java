package tesetturgiyim;
public  class Fiyat {
    
   
    public void Fiyat()
    {
        
    }
    public int FiyatBul(int[] x)     // SeciliFiyat dizisini parametre olarak alarak toplam fiyatı hesaplar
    {   
        int toplam = 0;
        
        
        for (int i = 0; i < x.length; i++) {
          
            toplam += x[i];
            
        }
        return toplam ;
    }
}
