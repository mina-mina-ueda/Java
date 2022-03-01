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