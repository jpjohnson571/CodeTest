package com.code.test;

import org.junit.Assert;
import org.junit.Test;

public class CountWordsTest {

    CountWords countWords = new CountWords();

    @Test
    public void countWordsTest() {
        int count = countWords.countWords("The quick brown fox jumped over the lazy dog.");
        Assert.assertEquals(count, 9);
    }

}
