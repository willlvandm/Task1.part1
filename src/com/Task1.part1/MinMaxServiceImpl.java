package com.example.arrays.service;

import com.example.arrays.entity.NumberArray;

import java.util.Optional;

public class MinMaxServiceImpl implements MinMaxService {

    @Override
    public Optional<Integer> findMin(NumberArray array) {
        int[] values = array.getValues();
        if (values.length == 0) {
            return Optional.empty();
        }
        int min = values[0];
        for (int value : values) {
            if (value < min) {
                min = value;
            }
        }
        return Optional.of(min);
    }

    @Override
    public Optional<Integer> findMax(NumberArray array) {
        int[] values = array.getValues();
        if (values.length == 0) {
            return Optional.empty();
        }
        int max = values[0];
        for (int value : values) {
            if (value > max) {
                max = value;
            }
        }
        return Optional.of(max);
    }
}

