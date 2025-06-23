package week2.day1;

	import java.util.Arrays;
	import java.util.LinkedHashSet;
	import java.util.Set;
	import java.util.stream.Collectors;

	public class RemoveDuplicateWord {

	    public static void main(String[] args) {
	        String sentence = "We learn java basics as part of java sessons in java week 1";
	        String result = removeDuplicateWords(sentence);
	        System.out.println("Original Sentence: " + sentence);
	        System.out.println("Sentence with unique words: " + result);
	    }

	    public static String removeDuplicateWords(String sentence) {
	        // Split the sentence into words using whitespace as delimiter
	        String[] words = sentence.split("\\s+");

	        // Use LinkedHashSet to maintain insertion order while removing duplicates
	        Set<String> uniqueWords = new LinkedHashSet<>(Arrays.asList(words));

	        // Join the unique words back into a string
	        return String.join(" ", uniqueWords);

	        // Alternative using streams:
	        // return Arrays.stream(sentence.split("\\s+")).distinct().collect(Collectors.joining(" "));
	    }
	}