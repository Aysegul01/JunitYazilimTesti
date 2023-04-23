/**
*
* @author Yazar adı ve mail: Ayşegül Özsoy aysegul.ozsoy@ogr.sakarya.edu.tr
* @since Programın yazıldığı tarih:23.04.2023
* <p>
* Sınıf ile ilgili açıklama: 1.Öğretim A sınıfı
* </p>
*/

package kutuphane;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class unitTest 
{

			  @Test
		  public void testHesaplaUcgeninAlani(){
		    System.out.println("Start testHesaplaUcgeninAlani()... ");
		    hesaplama hesapla = new hesaplama();
		    int sonuc=hesapla.hesaplaUcgenAlani(3, 2);
		    Assert.assertEquals(sonuc, 3);
		    System.out.println("Sonuç: " + sonuc);
		    System.out.println("End testHesaplaUcgeninAlani()...");
		  }
}


