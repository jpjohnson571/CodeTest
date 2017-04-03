package com.code.test;

public class CountWords {

    /**
     * Test Instructions:
     *      Implement a method that counts all the words in a sentence
     *      and returns the count. For this test, a word consists of a
     *      sequence of characters other than a space. Do not worry about
     *      detecting other types of white space.
     *
     *      The code should use the isSpace() method defined below. You
     *      should also implement unit tests that ensure your code is
     *      production quality.
     */
	public static void main(String[] args) {
		CountWords wordCount = new CountWords();
		SentenceInput sentence = new SentenceInput();
		String input = sentence.getUserInput("Enter a sentence to evaluate:");
		
		System.out.println(wordCount.countWords(input));
		
	}
	
    public int countWords(String sentence) {
    	int count = 0;
    	int sLength = 0;
    	boolean isWord = false;
    	
    	if (sentence.isEmpty()){
    		return 0;
    	}
    	sentence = sentence.trim();
    	sLength = sentence.length() - 1;
    	char[] charArray = sentence.toCharArray();
    	
    	for(int i = 0; i < charArray.length; i++){
    		if (!isSpace(charArray[i]) && i != sLength){
    			isWord = true;
    		} else if (isSpace(charArray[i]) && isWord){
    			count++;
    			isWord = false;
    		} else if (!isSpace(charArray[i]) && i == sLength){
    			count++;
    		}
    	}
        return count;
    }

    /**
     * A helper method which returns whether or not a character is a space.
     */
    private boolean isSpace(char character) {
        return character == ' ';
    }

}
