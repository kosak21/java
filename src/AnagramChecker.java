import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()){
            return false;
        }

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        String word1="столик";
        String word2="листок";

        if (areAnagrams(word1, word2)) {
            System.out.println(word1 + " и " + word2 + " — анаграммы.");
        } else {
            System.out.println(word1 + " и " + word2 + " — не анаграммы.");
        }

    }
}
