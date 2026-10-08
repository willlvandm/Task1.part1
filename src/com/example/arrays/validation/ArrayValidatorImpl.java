package com.example.arrays.validation;

import com.example.arrays.exception.InvalidArrayDataException;

import java.util.regex.Pattern;

public class ArrayValidatorImpl implements ArrayValidator {

    private static final Pattern VALID_LINE = Pattern.compile("\\s*-?\\d+(\\s*[;,\\-]\\s*-?\\d+)*\\s*");

    @Override
    public void validate(String line) throws InvalidArrayDataException {
        if (line == null || line.trim().isEmpty()) {
            throw new InvalidArrayDataException("Line is empty");
        }
        if (!VALID_LINE.matcher(line).matches()) {
            throw new InvalidArrayDataException("Invalid line format: " + line);
        }
    }
}

