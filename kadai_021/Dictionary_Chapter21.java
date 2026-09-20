package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {


	public void searchWords(String[] words) {
    	  	HashMap<String,String> dog = new HashMap<>();

        
        dog.put("apple", "りんご");
        dog.put("peach", "桃");
        dog.put("banana", "バナナ");
        dog.put("lemon", "レモン");
        dog.put("pear", "梨");
        dog.put("kiwi", "キウィ");
        dog.put("strawberry", "いちご");
        dog.put("grape", "ぶどう");
        dog.put("muscat", "マスカット");
        dog.put("cherry", "さくらんぼ");

	for(

	String word:words)
	{
		if (dog.containsKey(word)) {
			String meaning = dog.get(word);
			System.out.println(word + "の意味は" + meaning);
		} else {
			System.out.println(word + "は辞書に存在しません");
		}
	}
}}
