package kadai_018;

public class katoExec_Chapter18 {
	
	public static void main(String[] args) {
		
		//花子のインスタンスを親クラスChapter18へ代入
		katoHanako_Chapter18 hanako = new katoHanako_Chapter18();
		hanako.setGivenName();
		hanako.execIntroduce();
		
		//一郎のインスタンスを親クラスChapter18へ代入
		katoIchiro_Chapter18 ichiro = new katoIchiro_Chapter18();
		ichiro.setGivenName();
		ichiro.execIntroduce();
		
		//太郎のインスタンスを親クラスChapter18へ代入
		katoTaro_Chapter18 taro = new katoTaro_Chapter18();
		taro.setGivenName();
		taro.execIntroduce();
		
	}
	
	
	
}
