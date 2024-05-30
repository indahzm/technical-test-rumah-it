public class HighestPalindrome {

    private static Integer k;
    private static char[] inputChar;
    private static int replacement;

    public String firstRecursive(int i, int j) {

        if(inputChar[i] != inputChar[j]) {
            if (inputChar[i] > inputChar[j])
                inputChar[j] = inputChar[i];
            else
                inputChar[i] = inputChar[j];
            replacement++;
            if(replacement > k)
                return "-1";
        }

        i++;
        j--;
        return i<j ? firstRecursive(i,j) : String.valueOf(replacement);
    }

    public int secondRecursive(int i, int j) {
        if(i == j && replacement < k) {
            inputChar[i] = '9';
        }
        if (inputChar[i] != '9') {
            if(replacement < k && (i == 0 || i == j)) {
                inputChar[i] = inputChar[j] = '9';
                replacement++;
            } else if (replacement <= k-2) {
                inputChar[i] = inputChar[j] = '9';
                replacement += 2;
            }

        }
        i++;
        j--;
        return i<=j ? secondRecursive(i,j) : replacement;
    }

    public HighestPalindrome(String input, Integer replaceCount) {
        k = replaceCount;
        inputChar = input.toCharArray();
        replacement = 0;

        String output = firstRecursive(0, input.length()-1);

        if(output.equals("-1")) {
            System.out.println(output);
            return;
        }
        secondRecursive(0,input.length()-1);
        System.out.println();
        System.out.println("Input : " + input);
        System.out.println("k : " + k);
        System.out.println("Output : ");
        System.out.println(inputChar);
    }
}
