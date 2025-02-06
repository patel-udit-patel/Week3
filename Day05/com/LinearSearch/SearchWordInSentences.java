package Day05.com.LinearSearch;

import java.util.Scanner;

public class SearchWordInSentences {
    //method iterates array and finds if sentence contains word
    public static String findSentence(String[] sentences, String word) {
        for (String sentence : sentences) {
            //checking if sentence contains target word
            if (sentence.contains(word)) {
                return sentence;
            }
        }
        return "Not Found";
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //taking number of sentences
        System.out.println("Enter number of sentences ");
        int numberOfSentences=input.nextInt();

        //Taking sentences from user
        System.out.println("Enter sentences ");
        String[] sentences = new String[numberOfSentences];
        for(int i=0;i<numberOfSentences;i++) {
            sentences[i]=input.nextLine();
        }

        //Taking words to find from user
        System.out.println("Enter word to find ");
        String wordToFind = input.nextLine();
        String result = findSentence(sentences, wordToFind);

        System.out.println("Result: " + result);
    }
}

