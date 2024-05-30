import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WeightedStrings {
    public WeightedStrings(String input, String inputQueries) {
        //      Input queries (separate with commas)
        inputQueries = inputQueries.replaceAll(" ", "");
        List<Integer> queries = new ArrayList<>();
        try {
            queries = Arrays.stream(inputQueries.split(","))
                    .map(w -> Integer.valueOf(w)).collect(Collectors.toList());
        } catch (NumberFormatException e) {
            System.out.println("Your input is not a number. Please check your input and try again");
        }

        List<Integer> data = new ArrayList<>();
        char temp = input.charAt(0);
        data.add((input.charAt(0) - 'a' + 1));
        int charCount = 1;
        for(int i = 1; i<input.length(); i++) {
            if (temp == input.charAt(i)) {
                charCount++;
                data.add((input.charAt(i) - 'a' + 1) * charCount);
            } else {
                charCount = 1;
                data.add(input.charAt(i) - 'a' + 1);
            }
            temp = input.charAt(i);
        }

        List<String> output = new ArrayList<>();
        for(int i=0; i<queries.size(); i++) {
            if(data.contains(queries.get(i))) {
                output.add("Yes");
            } else {
                output.add("No");
            }
        }
        System.out.println();
        System.out.println("Input : " + input);
        System.out.println("Queries : " + inputQueries);
        System.out.println("Output : " + output);

    }
}
