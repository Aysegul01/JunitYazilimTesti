/**
*
* @author Yazar adı ve mail: Ayşegül Özsoy aysegul.ozsoy@ogr.sakarya.edu.tr
* @since Programın yazıldığı tarih:23.04.2023
* <p>
* Sınıf ile ilgili açıklama: 1.Öğretim A sınıfı
* </p>
*/

package kutuphane;

public class Position {
	public int idx;
	public int col;
	public String ftxt;
	public int ln;
	public Position(int idx, int ln, int col, String ftxt ) {
		this.idx = idx;
		this.col = col;
		this.ftxt = ftxt;
		this.ln=ln;
		
	}

	public Position update(char currentChar) {
		
	    this.idx += 1;
	    this.col += 1;
	    if(currentChar=='\n') {
	    	this.ln +=1;
	    	this.col=0;
	    }
	    return this;
	}


}
