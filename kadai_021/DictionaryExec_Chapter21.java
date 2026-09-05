package kadai_021;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        
        // 辞書クラスのインスタンスを作成
        Dictoonary_Chapter21 dict = new Dictoonary_Chapter21();
        
        // 調べる英単語を配列にセット
        String[] wordsToSearch = {"apple", "banana", "grape", "orange"};
        
        // 辞書で検索を実行
        dict.searchWords(wordsToSearch);
    }
}


