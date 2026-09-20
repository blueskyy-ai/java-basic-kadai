package kadai_28;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

public String getMyChoice() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("自分のじゃんけんの手を入力しましょう");
    System.out.println("グーはrockのrを入力しましょう");
    System.out.println("チョキはscissorsのsを入力しましょう");
    System.out.println("パーはpaperのpを入力しましょう");

    String myChoice = scanner.next();

    return myChoice;
}

public String getRandom() {
    String[] choices = {"r", "s", "p"};

    int randomNumber = (int) Math.floor(Math.random() * 3);

    return choices[randomNumber];
}

public void playGame(String myChoice, String randomChoice) {
    HashMap<String, String> hands = new HashMap<>();

    hands.put("r", "グー");
    hands.put("s", "チョキ");
    hands.put("p", "パー");

    System.out.println("自分の手は" + hands.get(myChoice)
            + ",対戦相手の手は" + hands.get(randomChoice));

    if (myChoice.equals(randomChoice)) {
        System.out.println("あいこです");
    } else if (
        (myChoice.equals("r") && randomChoice.equals("s")) ||
        (myChoice.equals("s") && randomChoice.equals("p")) ||
        (myChoice.equals("p") && randomChoice.equals("r"))
    ) {
        System.out.println("自分の勝ちです");
    } else {
        System.out.println("自分の負けです");
    }
}
}

