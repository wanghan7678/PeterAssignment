package com.example.text;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OrdinaryEnglishCounter implements ITextCounter {

    private Map<String, Integer> countsMap;
    public OrdinaryEnglishCounter()
    {
        countsMap = new HashMap<String, Integer>();
    }
    public OrdinaryEnglishCounter(Map<String, Integer> countsMap)
    {
        this.countsMap = countsMap;
    }
    
    private List<Map.Entry<String, Integer>> sortCountsByFrequency(Map<String, Integer> inputCountsMap)
    {
        var sorted = new ArrayList<Map.Entry<String, Integer>>();
        inputCountsMap.entrySet()
        .stream()
        .sorted(Map.Entry.comparingByValue())
        .forEach(sorted::add);
        return sorted;
    }

	@Override
	public Map<String, Integer> createCountsMap(String[] contents) {
		for (String word: contents)
        {
            if(!word.isEmpty())
            {
                countsMap.put(word, countsMap.getOrDefault(word, 0) + 1);
            }
        }
        return countsMap;
	}

	@Override
	public List<Entry<String, Integer>> findTopK(int k) {
		var sortedEntries = sortCountsByFrequency(countsMap);
        var result = new ArrayList<Map.Entry<String, Integer>>();
        var size = countsMap.size();
        var topK = size > k ? k:size;
        for(int i=0 ; i < topK - 1 ; i ++)
        {
            result.add(sortedEntries.get(size-1-i));
        }
        return result;
	}

}
