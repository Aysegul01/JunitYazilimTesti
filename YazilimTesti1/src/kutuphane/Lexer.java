
/**
*
* @author Yazar adı ve mail: Ayşegül Özsoy aysegul.ozsoy@ogr.sakarya.edu.tr
* @since Programın yazıldığı tarih:23.04.2023
* <p>
* Sınıf ile ilgili açıklama: 1.Öğretim A sınıfı
* </p>
*/

package kutuphane;

import kutuphane.Position;

public class Lexer {
	private String text;
	private Position pos;
	private char currentChar;

	public Lexer(String text) {
		this.text = text;
		this.pos = new Position(0, 0, 0, text);
		this.currentChar = text.charAt(0);
	}

	public void updateCurrentChar() {
		this.pos.update(this.currentChar);
		this.currentChar = (this.pos.idx < this.text.length()) ? this.text.charAt(this.pos.idx) : '\0';
	}

	public OperatorCounter countOperators() {
      
    	OperatorCounter operator_counter = new OperatorCounter();


        while (this.currentChar != '\0') {
        	
        	System.out.println(this.currentChar);
        	 String currentChar = String.valueOf(this.currentChar);

        	 if (" \t".indexOf(currentChar) != -1) {         
        		 System.out.println("ilk if'e girdi");
        		 this.updateCurrentChar();
               
            }else if (";\n".indexOf(currentChar) != -1) {
       
          
                this.updateCurrentChar();
            }
            else if ("0123456789".indexOf(currentChar) != -1) {
            	this.updateCurrentChar();
           } else if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ_".indexOf(currentChar) != -1) {
        	   this.updateCurrentChar();
           } else if (this.currentChar == '%') {
                this.updateCurrentChar();
                if(this.currentChar=='=') {
                   	operator_counter.double_ +=1;
                   	operator_counter.arithmetic += 1;
                   	this.updateCurrentChar();
                }else {
    					operator_counter.single += 1;
    					operator_counter.arithmetic += 1;
    			}
            } else if (this.currentChar == '+') {

                this.updateCurrentChar();
                
                if (this.currentChar == '+') {
                	operator_counter.double_ +=1;
                	operator_counter.arithmetic +=1;
                	this.updateCurrentChar();
               } else if(this.currentChar=='=') {
               		operator_counter.double_ +=1;
               		operator_counter.arithmetic += 1;
               		this.updateCurrentChar();
               }
                else {
                	operator_counter.arithmetic += 1;
                	operator_counter.single += 1; 
               }
            } else if (this.currentChar == '-') {
            		this.updateCurrentChar();
             
                if (this.currentChar == '-') {
                	operator_counter.double_ +=1;
                	operator_counter.arithmetic +=1;
                	this.updateCurrentChar();
                }
                else if(this.currentChar=='=') {
                	operator_counter.double_ +=1;
                	operator_counter.arithmetic += 1;
                	this.updateCurrentChar();
                }
                else {
                	operator_counter.arithmetic += 1;
                	operator_counter.single += 1; 
                }
             } else if (this.currentChar == '*') {
                 this.updateCurrentChar();
                 if(this.currentChar=='=') {
                    	operator_counter.double_ +=1;
                    	operator_counter.arithmetic += 1;
                    	this.updateCurrentChar();
                 }else {
     					operator_counter.single += 1;
     					operator_counter.arithmetic += 1;
     			}
            } else if (this.currentChar == '/') {
                 this.updateCurrentChar();
                 if(this.currentChar=='=') {
                    	operator_counter.double_ +=1;
                    	operator_counter.arithmetic += 1;
                    	this.updateCurrentChar();
                 }else {
     					operator_counter.single += 1;
     					operator_counter.arithmetic += 1;
     			}
            } else if (this.currentChar == '^') {
               this.updateCurrentChar();
               if(this.currentChar=='=') {
               	operator_counter.double_ +=1;
               	operator_counter.arithmetic += 1;
               	this.updateCurrentChar();
            }else {
					operator_counter.single += 1;
					operator_counter.arithmetic += 1;
			}
            }else if (this.currentChar == '=') {
                this.updateCurrentChar();
	            if (this.currentChar == '=') {
	                	operator_counter.double_ +=1;
	                	operator_counter.comparison +=1;
	                	this.updateCurrentChar();
	            }else {
	           	       operator_counter.single +=1;                	
	           	       operator_counter.arithmetic +=1; 
	           	 }
          } else if (this.currentChar == '!') {
        	   
                 this.updateCurrentChar();
	            if (this.currentChar =='=') {
	               
	           	    operator_counter.double_ +=1;
	              	operator_counter.comparison +=1;
	           	    this.updateCurrentChar();
	           } else {
	         	       operator_counter.single +=1;                	
	         	       operator_counter.logical +=1; 
	           }
           }
           else if (this.currentChar == '<') {
        	   
        	  
        	   this.updateCurrentChar();
				if (this.currentChar == '=') {

					operator_counter.double_ += 1;
					operator_counter.comparison += 1;
					this.updateCurrentChar();
				} else {
					operator_counter.single += 1;
					operator_counter.comparison += 1;
				}
			} else if (this.currentChar == '>') {
				this.updateCurrentChar();
				if (this.currentChar == '=') {

					operator_counter.double_ += 1;
					operator_counter.comparison += 1;
					this.updateCurrentChar();
				} else {
					operator_counter.single += 1;
					operator_counter.comparison += 1;
				}
	               
			}  else if (this.currentChar == '&') {
            		this.updateCurrentChar();
             
                if (this.currentChar == '&') {
                	operator_counter.double_ +=1;
                	operator_counter.logical +=1;
                	this.updateCurrentChar();
                }
                else if(this.currentChar=='=') {
                	operator_counter.double_ +=1;
                	operator_counter.arithmetic += 1;
                	this.updateCurrentChar();
                }
                else {
                	operator_counter.arithmetic += 1;
                	operator_counter.single += 1; 
                }
			} else if (this.currentChar == '|') {
            		this.updateCurrentChar();
             
                if (this.currentChar == '|') {
                	operator_counter.double_ +=1;
                	operator_counter.logical +=1;
                	this.updateCurrentChar();
                }
                else if(this.currentChar=='=') {
                	operator_counter.double_ +=1;
                	operator_counter.arithmetic += 1;
                	this.updateCurrentChar();
                }
                else {
                	operator_counter.arithmetic += 1;
                	operator_counter.single += 1; 
                }
			
			}else {
				this.updateCurrentChar();
			}
		}
		return operator_counter;
	}
}
