package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void searchWord(String[] words) {
		//HashMapの宣言
		HashMap<String,String> dictionary = new HashMap<String,String>();
		
		//辞書に10個の意味と単語を追加する
		dictionary.put("apple", "りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウィ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
		//繰り返し処理for文で辞書に単語があるか確認
		for(int i = 0; i < words.length; i++) {
			String result = dictionary.get(words[i]);  //検索結果をresultにいれた
			if(result == null) {
			    System.out.println(words[i] + "は辞書に存在しません"); //存在しない時
			} else {
				System.out.println(words[i] + "は" + result + "という意味です");
			}
		}
	}
}
