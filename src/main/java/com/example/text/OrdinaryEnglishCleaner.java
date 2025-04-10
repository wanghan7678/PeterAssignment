package com.example.text;

public class OrdinaryEnglishCleaner implements ITextCleaner {

    private static final String DEFAULT_PATTERN = "[^a-zA-Z']";
    
    private String pattern = DEFAULT_PATTERN;
        
    public void setPattern(String pattern)
    {
        this.pattern = pattern;
    }

    public String getPattern()
    {
        return this.pattern;
    }

	@Override
	public String[] cleanText(String inputText) {
		return inputText.toLowerCase().replaceAll(pattern, " ").split("\\s+");
	}

}
