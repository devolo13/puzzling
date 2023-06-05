import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class PuzzleJava {
    Random randMachine = new Random();

    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> results = new ArrayList<Integer>();
        for (int rolls = 0; rolls < 10; rolls ++){
            results.add(randMachine.nextInt(20) + 1);
        }
        return results;
    }

    public String getRandomLetter(){
        ArrayList<String> letters = new ArrayList<String>();
        for (char c = 'a'; c <= 'z'; ++c){
            String letter = new String();
            letter = letter + c;
            letters.add(letter);
        }
        int num = randMachine.nextInt(26);
        return letters.get(num);
    }

    public String generatePassword(){
        String password = new String();
            for (int i = 0; i < 8; i++){
                password = password + getRandomLetter();
            }
        return password;
    }
    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordList = new ArrayList<String>();
        for (int i = 0; i < length; i ++){
            passwordList.add(generatePassword());
        }
        return passwordList;
    }
}

