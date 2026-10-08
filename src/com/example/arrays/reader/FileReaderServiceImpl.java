package com.example.arrays.reader;

import com.example.arrays.exception.InvalidArrayDataException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReaderServiceImpl implements FileReaderService {

    @Override
    public List<String> readLines(String path) throws InvalidArrayDataException {
        try {
            return Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            throw new InvalidArrayDataException("Cannot read file: " + path, e);
        }
    }
}

