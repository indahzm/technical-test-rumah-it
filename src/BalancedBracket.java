import java.util.ArrayList;
import java.util.List;

public class BalancedBracket {

    public BalancedBracket(String inputBracket) {
        inputBracket = inputBracket.replace(" ", "");

        List<Character> bracketCheck = new ArrayList<>();
        int temp = 0;
        String output = "Balanced";
        if (inputBracket.length()%2 == 0) {
            for (int i = 0; i<inputBracket.length(); i++) {
                if(inputBracket.charAt(i) == '(' ||
                        inputBracket.charAt(i) == '{' ||
                        inputBracket.charAt(i) == '[' ) {
                    if(bracketCheck.size() > temp) {
                        bracketCheck.set(temp, inputBracket.charAt(i));
                    } else {
                        bracketCheck.add(inputBracket.charAt(i));
                    }
                    temp++;
                } else {
                    if (temp >= 1 && ((bracketCheck.get(temp-1) == '(' && inputBracket.charAt(i) == ')') ||
                            (bracketCheck.get(temp-1) == '{' && inputBracket.charAt(i) == '}') ||
                            (bracketCheck.get(temp-1) == '[' && inputBracket.charAt(i) == ']'))) {
                        temp--;
                    } else {
                        output = "Not Balanced";
                        break;
                    }
                }
            }
        } else {
            output = "Not Balanced";
        }
        System.out.println();
        System.out.println("Input : " + inputBracket);
        System.out.println("Output : " + output);
    }
}
