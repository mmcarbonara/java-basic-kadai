package kadai_026;

public class JyankenExec_Chapter26 {
	public static void main(String[] args) {
	//インスタンス化
	Jyanken_Chapter26  jyanken = new Jyanken_Chapter26();
	
	//自分のジャンケンの手を入力する
	String myChoice = jyanken.getMyChoice();
	String yourChoice = jyanken.getRandom();
    jyanken.playGame(myChoice,yourChoice);
}
}
