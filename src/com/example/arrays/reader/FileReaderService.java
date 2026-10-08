package com.example.arrays.reader;

import com.example.arrays.exception.InvalidArrayDataException;

import java.util.List;

public interface FileReaderService {
    List<String> readLines(String path) throws InvalidArrayDataException;
}
