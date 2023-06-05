import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzle {
    public static void main(String[] args) {
        PuzzleJava instance = new PuzzleJava();
        System.out.println(instance.getTenRolls());
        System.out.println(instance.getRandomLetter());
        System.out.println(instance.generatePassword());
        System.out.println(instance.getNewPasswordSet(5));
    }
}
