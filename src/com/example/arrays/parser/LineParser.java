package com.example.arrays.parser;

import com.example.arrays.exception.InvalidArrayDataException;

public interface LineParser {
    int[] parse(String line) throws InvalidArrayDataException;
}
