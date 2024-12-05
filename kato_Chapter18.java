package kadai_018;

public abstract class kato_Chapter18 {
	//姓を表すフィールド
	public String familyName = "加藤";
	//名を表すフィールド
	public String givenName;
	//住所を表すフィールド
	public String address = "住所は東京都中区○×";
	
	public void commonIntroduce() {	
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
    }
	
	//個別の紹介を出力メソッド
	public abstract void eachIntroduce();
	
	//それぞれの個人紹介を実行     実行の書き方
	public void execIntroduce() {
		this.commonIntroduce();
		this.eachIntroduce();
		
		System.out.println();
	}
	

}


