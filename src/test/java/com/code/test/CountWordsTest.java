package com.code.test;

import org.junit.Assert;
import org.junit.Test;

public class CountWordsTest {

    CountWords countWords = new CountWords();

    @Test
    public void countWordsTest() {
        int count = countWords.countWords("The quick brown fox jumped over the lazy dog.");
        Assert.assertEquals(count, 9);
        
        int count1 = countWords.countWords("");
        Assert.assertEquals(count1, 0);
        
        int count2 = countWords.countWords("     JJAMIE     JJOHNSON. ");
        Assert.assertEquals(count2, 2);
    }

}
