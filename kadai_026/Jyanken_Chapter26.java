package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	public  String getMyChoice() {	
		//scannerクラスは空白文字を取得できる。scanner宣言する
		Scanner scanner = new Scanner(System.in); 
		
		//じゃんけんの手を入力する
	     String r = "r";
	     String s = "s";
	     String p = "p";

		//正しい手かどうか判断
		while(true) {
		 System.out.println("自分のじゃんけんの手を入力しましょう");
		 System.out.println("グーはrockを入力しましょう");
		 System.out.println("チョキはscissorsのsを入力しましょう");
		 System.out.println("パーはpaperのpを入力しましょう");
			
		//入力したものを取得できる
		 String choice = scanner.next(); 
		 if(!(choice.equals(r)||choice.equals(s)||choice.equals(p))) {
			 System.out.println("正しい手を入力してください");
			 continue;
		 }  else {
			 scanner.close();
			 return choice;
		 }
			
	    }
	}
	 //対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom(){
		//じゃんけんの手の配列
		String[] hands = {"r","s","p"};
		return hands[(int) Math.floor(Math.random() * 3)];    	
	}
	
	//じゃんけんの手を出力する
	public  void playGame(String me, String you) {
		//HashMapの宣言
		HashMap<String,String> hands = new HashMap<String,String>();
		
		//宣言
		hands.put("r", "グー");
		hands.put("s","チョキ");
		hands.put("p","パー");
		
		System.out.println("自分の手は" + hands.get(me) + ",対戦相手の手は" + hands.get(you));
		
		if(me.equals(you)){
			System.out.println("あいこです");
		} else if((me.equals("r") && you.equals("s"))||
				  (me.equals("s") && you.equals("p"))||
				  (me.equals("p") && you.equals("r"))) {
			System.out.println("自分の勝ちです");
		}   else {
			System.out.println("自分の負けです");
		}
     	}
	}

