/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tesetturgiyim;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 *
 * @author asus
 */
public class Fis extends TesetturGiyim{
    Fiyat fiyat1 = new Fiyat();
    
    public void FisCikar() throws FileNotFoundException // Projemizin içinde bir text dosyası açarak Seçim dizisini ve SeciliFiyat dizisini yazdırır.
    {
        File file = new File("test.txt");
        PrintWriter output = new PrintWriter(file);
        output.println("FİŞ---------------------------");
        for (int i = 0; i <Seçim.length; i++) {
            output.println(Seçim[i] + ":  "+SeciliFiyat[i]+"TL");
        }
        output.println("Toplam Fiyat : "+fiyat1.FiyatBul(SeciliFiyat)+"TL");
        output.close() ;
    }
}
