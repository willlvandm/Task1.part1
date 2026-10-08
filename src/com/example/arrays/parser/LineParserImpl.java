package com.example.arrays.parser;

import com.example.arrays.exception.InvalidArrayDataException;

public class LineParserImpl implements LineParser {

    private static final String SEPARATOR = "[;,\\-]";

    @Override
    public int[] parse(String line) throws InvalidArrayDataException {
        String[] tokens = line.trim().split(SEPARATOR);
        int[] result = new int[tokens.length];

        for (int i = 0; i < tokens.length; i++) {
            try {
                result[i] = Integer.parseInt(tokens[i].trim());
            } catch (NumberFormatException e) {
                throw new InvalidArrayDataException("Cannot parse number: " + tokens[i], e);
            }
        }
        return result;
    }
}

