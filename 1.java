class First {
  public static void main(String[] args) {
    System.out.println("Javaを楽しもう！");
  }
}

class Ex1_03_2 {
	public static void main (String[] args) {
		System.out.println("Hello World!! Error is cleared!!" );
	}
}

class Ex1_04_1 {
  public static void main (String[] args) {
    for(int i = 1 ; i <= 9  ; i++) {
      String disp3 = "";
      for(int j = 1 ; j <= 9  ; j++) {
        disp3 = disp3 + i*j + " ";
      }
      if(args.length == 1) {
        if(i == Integer.parseInt(args[0])){
          System.out.println(disp3);
        }
      }
      else{
          System.out.println(disp3);
      }
    }
  }
}

class Ex1_05_1 {
	public static void main (String[] args) {

    int    itIndustryLifetimeWage   = 262870000 ;    //IT業界の生涯賃金

    long   itIndustryMarketScale    = 13330000000000L ;       //IT業界の市場規模

    char   myFavoriteKanji          = '楽' ;    //自分の好きな漢字１文字

		String  myAimingJob             = "歌手" ;    //自分のなりたい職業

    boolean  isPreviousGraduate     = true ;     //自分が既卒がどうか
	}
}

boolean answer4 = (5>=3+2||2+8!=9) && !(6==2+4);
System.out.println(answer4);

int calc2 = 10;
int answer2 = ++calc2;
System.out.println(calc2);
System.out.println(answer3);

int calc3 = 10;
int answer3 = calc3++;
System.out.println(calc3);
System.out.println(answer3);

class Ex1_07_2 {
	public static void main (String[] args) {

		byte  calc1_1 = 1 ;
		short calc1_2 = 2 ;
		long  calc1_3 = 300000000000L ;
		long answer1 = calc1_1 + calc1_2 + calc1_3 ;
		System.out.println( answer1 );


		byte   calc2_1 = 4 ;
		double calc2_2 = 5 ;
		int    calc2_3 = 6 ;
		double  answer2 = calc2_1 + calc2_2 + calc2_3 ;
		System.out.println( answer2 );


		short  calc3_1 = 7 ;
		String calc3_2 = "8" ;
		int    calc3_3 = 9 ;
		int    answer3 = calc3_1 + Integer.parseInt(calc3_2) + calc3_3 ;
		System.out.println( answer3 );


		int    calc4_1 = 10 ;
		long   calc4_2 = 11 ;
		int    answer4 = calc4_1 + (int)calc4_2;
		System.out.println( answer4 );

	}
}