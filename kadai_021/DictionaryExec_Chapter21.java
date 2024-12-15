package kadai_021;

public class DictionaryExec_Chapter21 {
	
	public static void main(String[] args) {
		//インスタンス化
		Dictionary_Chapter21 dictionary = new Dictionary_Chapter21();
		
		//調べる英単語を配列にセットする
		String[] words = new String[]{"apple", "banana", "grape", "orange"};
		dictionary.searchWord(words);  //引数を渡してメソッドを実行する
				
		
	}
}