package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Scanner;

import com.example.text.*;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var textCleaner = new OrdinaryEnglishCleaner();
        var textCounter = new OrdinaryEnglishCounter();
        System.out.println("Please input the file name: ");
        var filePath = scanner.nextLine();
        System.out.println("Loading the file..." + filePath);
        try
        {
            var reader = new BufferedReader(new FileReader(filePath));
            String line;
            while((line=reader.readLine()) != null)
            {
                var cleaned = textCleaner.cleanText(line);
                textCounter.createCountsMap(cleaned);
            }
            reader.close();
        }
        catch(IOException ioException)
        {
            System.out.println("File loading exception!");
            System.out.println(ioException.getMessage());
        }
        finally
        {
            scanner.close();
        }
        System.out.println("finish the file loading.");
        System.out.println(" the top words are: ");
        var topK = textCounter.findTopK(10);
        for(Map.Entry<String, Integer> entry: topK)
        {
            System.out.println("The word '" + entry.getKey() + "' appears " + entry.getValue() + " times.");
        }
    }
    
}
