/**
*
* @author Yazar adı ve mail: Ayşegül Özsoy aysegul.ozsoy@ogr.sakarya.edu.tr
* @since Programın yazıldığı tarih:23.04.2023
* <p>
* Sınıf ile ilgili açıklama: 1.Öğretim A sınıfı
* </p>
*/

package kutuphane;

public class OperatorCounter {
  public  int single; // tekli 
  public int double_; // ikili
  public int comparison; // ilişkisel ya da karşılaştırma
  public int logical; // mantıksal
  public  int arithmetic; //sayısal 
  public void OperatorCounter() {
	  this.single=0;
	  this.double_=0;
	  this.comparison=0;
	  this.logical=0;
	  this.arithmetic=0;
  }
  
  @Override
  public String  toString() {
	  return "single: " + this.single + " double: " + this.double_ + " comparison: " + this.comparison +  " logical: " + this.logical + " arithmetic: " + this.arithmetic;
  }

}
