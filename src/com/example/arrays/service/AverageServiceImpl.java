package com.example.arrays.service;

import com.example.arrays.entity.NumberArray;

import java.util.OptionalDouble;

public class AverageServiceImpl implements AverageService {

    @Override
    public OptionalDouble average(NumberArray array) {
        int[] values = array.getValues();
        if (values.length == 0) {
            return OptionalDouble.empty();
        }
        long sum = 0;
        for (int value : values) {
            sum += value;
        }
        return OptionalDouble.of((double) sum / values.length);
    }
}

