/**
*
* @author Yazar adı ve mail: Ayşegül Özsoy aysegul.ozsoy@ogr.sakarya.edu.tr
* @since Programın yazıldığı tarih:23.04.2023
* <p>
* Sınıf ile ilgili açıklama: 1.Öğretim A sınıfı
* </p>
*/

package kutuphane;

import kutuphane.Lexer;
class Static {

	public static void main(String[] args) {
		//  Test 1 
		String text1 = "x = 1; y=2; x==2 ";
		Lexer lexer=new Lexer(text1);
		OperatorCounter operator_counter = lexer.countOperators();
		System.out.println( operator_counter );
		System.out.println("Finish");
		
        //Test2
		String text2="x++; y--;";
		Lexer lexer2=new Lexer(text2);
		OperatorCounter operator_counter2 = lexer2.countOperators();
		System.out.println( operator_counter2 );
		System.out.println("Finish");
		
		// Test3
		String text3 = "x += 5; y -= 3;";
		Lexer lexer3 = new Lexer(text3);
		OperatorCounter operator_counter3 = lexer3.countOperators();
		System.out.println(operator_counter3);
		System.out.println("Finish");
		
		// Test4
		String text4 = "x<=4; y>=0; z<5; m>9;";
		Lexer lexer4 = new Lexer(text4); 
		OperatorCounter operator_counter4 = lexer4.countOperators();
		System.out.println(operator_counter4);
		System.out.println("Finish");
		
		
		// Test5
		String text5 = "x=2 ;x *= 3; y=48; y/=3;";
		Lexer lexer5 = new Lexer(text5);
		OperatorCounter operator_counter5 = lexer5.countOperators();
		System.out.println(operator_counter5);
		System.out.println("Finish");
		
		// Test6
		String text6 = "x=2 ;x *= 3; y=48; y/=3;";
		Lexer lexer6 = new Lexer(text6);
		OperatorCounter operator_counter6 = lexer6.countOperators();
		System.out.println(operator_counter6);
		System.out.println("Finish");

		// Test7
		String text7 = "x=20 ;x % 3";
		Lexer lexer7 = new Lexer(text7);
		OperatorCounter operator_counter7 = lexer7.countOperators();
		System.out.println(operator_counter7);
		System.out.println("Finish");
		
		// Test8
		String text8 = "x=20 ;x %= 3;";
		Lexer lexer8 = new Lexer(text8);
		OperatorCounter operator_counter8 = lexer8.countOperators();
		System.out.println(operator_counter8);
		System.out.println("Finish");
		
		// Test9
		String text9 = "x=0 ; y=1; y||x;";
		Lexer lexer9 = new Lexer(text9);
		OperatorCounter operator_counter9 = lexer9.countOperators();
		System.out.println(operator_counter9);
		System.out.println("Finish");
		
		// Test10
		String text10 = "x=1 ;y=0 ;y|x==a;";
		Lexer lexer10 = new Lexer(text10);
		OperatorCounter operator_counter10 = lexer10.countOperators();
		System.out.println(operator_counter10);
		System.out.println("Finish");
		
		// Test11
		String text11 = "x=1 ;y=0; y!=x;";
		Lexer lexer11 = new Lexer(text11);
		OperatorCounter operator_counter11 = lexer11.countOperators();
		System.out.println(operator_counter11);
		System.out.println("Finish");

		// Test12
		String text12 = "x=1 ;y=0; y&&x=m;";
		Lexer lexer12 = new Lexer(text12);
		OperatorCounter operator_counter12 = lexer12.countOperators();
		System.out.println(operator_counter12);
		System.out.println("Finish");
		
		// Test13
		String text13 = "x=78 ;y=56; x-y==22";
		Lexer lexer13 = new Lexer(text13);
		OperatorCounter operator_counter13 = lexer13.countOperators();
		System.out.println(operator_counter13);
		System.out.println("Finish");
		
		// Test14
		String text14 = "x=3 ;y=5; y*x=15;";
		Lexer lexer14 = new Lexer(text14);
		OperatorCounter operator_counter14 = lexer14.countOperators();
		System.out.println(operator_counter14);
		System.out.println("Finish");

		// Test15
		String text15 = "x=12 ;y=6;x%y;";
		Lexer lexer15 = new Lexer(text15);
		OperatorCounter operator_counter15 = lexer15.countOperators();
		System.out.println(operator_counter15);
		System.out.println("Finish");

	}

}
