package com.example.arrays.validation;

import com.example.arrays.exception.InvalidArrayDataException;

public interface ArrayValidator {
    void validate(String line) throws InvalidArrayDataException;
}
