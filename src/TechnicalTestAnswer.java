public class TechnicalTestAnswer {

    public static void main(String[] args) {
        System.out.println("Task 1");
        System.out.println("Weighted Strings");
        new WeightedStrings("abbcccd", "1, 3, 9, 8");
        new WeightedStrings("xhhageeeikk", "2, 8, 13, 22, 24");
        new WeightedStrings("helloworld", "5, 7, 11, 17, 19, 23");
        System.out.println("=======================================================");
        System.out.println();

        System.out.println("Task 2");
        System.out.println("Balanced Bracket");
        new BalancedBracket("{[()]}");
        new BalancedBracket("{ [ ( ] ) }");
        new BalancedBracket("{ ( ( [ ] ) [ ] ) [ ] }");
        System.out.println("=======================================================");
        System.out.println();

        System.out.println("Task 3");
        System.out.println("Highest Palindrome");
        new HighestPalindrome("3943", 1);
        new HighestPalindrome("932239", 2);
        new HighestPalindrome("4343504", 3);
        System.out.println("=======================================================");

    }
}