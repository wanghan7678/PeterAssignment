package com.example.text;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OrdinaryEnglishCleanerTest {

    @Test
    public void testCleanText_normalCases()
    {
        //test general input
        var inputText = "test abcd t3 a4b! word@. lets do!";
        var expecteds = new String[] {"test", "abcd", "t", "a", "b", "word", "lets", "do"};
        var cleaner = new OrdinaryEnglishCleaner();
        String[] cleaned = cleaner.cleanText(inputText);
        assertArrayEquals(expecteds, cleaned);

        //test input only contains special characters
        inputText = "33   !!&&. ";
        cleaned = cleaner.cleanText(inputText);
        assertEquals(0, cleaned.length);

        //text cases to lower
        inputText = "Test, TEST Test@'s";
        expecteds = new String[]{"test", "test", "test", "'s"};
        cleaned = cleaner.cleanText(inputText);
        assertArrayEquals(expecteds, cleaned);
    }
}
