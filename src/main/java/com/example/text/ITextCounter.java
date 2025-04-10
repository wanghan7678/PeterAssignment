package com.example.text;

import java.util.List;
import java.util.Map;

public interface ITextCounter {
    Map<String, Integer> createCountsMap(String[] contents);
    List<Map.Entry<String, Integer>> findTopK(int k);
}
