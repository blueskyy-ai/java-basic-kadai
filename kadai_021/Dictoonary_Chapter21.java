package kadai_021;

import java.util.HashMap;

public class Dictoonary_Chapter21 {
    
    // 辞書として機能するHashMap
    private HashMap<String, String> dictionary;

    // コンストラクタで辞書データを初期化して10通りの単語を追加
    public Dictoonary_Chapter21() {
        dictionary = new HashMap<>();
        
        dictionary.put("apple", "りんご");
        dictionary.put("peach", "桃");
        dictionary.put("banana", "バナナ");
        dictionary.put("lemon", "レモン");
        dictionary.put("pear", "梨");
        dictionary.put("kiwi", "キウィ");
        dictionary.put("strawberry", "いちご");
        dictionary.put("grape", "ぶどう");
        dictionary.put("muscat", "マスカット");
        dictionary.put("cherry", "さくらんぼ");
    }

    // 英単語を調べて結果を出力するメソッド
    public void searchWords(String[] words) {
        // 配列の要素を1つずつ繰り返し処理する
        for (String word : words) {
            // 辞書にキーが存在するかどうか判定
            if (dictionary.containsKey(word)) {
                // 存在する場合、意味を取得して出力
                String meaning = dictionary.get(word);
                System.out.println(word + "の意味は" + meaning);
            } else {
                // 存在しない場合の出力
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
