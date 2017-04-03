package codeTest;

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
		System.out.println(wordCount.countWords("Jamie is having an interesting day"));
		//wordCount.countWords("Jamie is having an interesting day");
	}
	
    public int countWords(String sentence) {
    	int count = 0;
    	char[] charArray = sentence.toCharArray();
    	for(int i = 0; i < charArray.length; i++){
    		if (isSpace(charArray[i])){
    			count++;
    		}
    	}
        return count + 1;//Because there will always be a word after the last space
    }

    /**
     * A helper method which returns whether or not a character is a space.
     */
    private boolean isSpace(char character) {
        return character == ' ';
    }

}
