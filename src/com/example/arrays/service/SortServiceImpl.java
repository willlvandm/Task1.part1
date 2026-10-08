package com.example.arrays.service;

import com.example.arrays.entity.NumberArray;
import com.example.arrays.factory.NumberArrayFactory;

public class SortServiceImpl implements SortService {

    private final NumberArrayFactory factory;

    public SortServiceImpl(NumberArrayFactory factory) {
        this.factory = factory;
    }

    @Override
    public NumberArray bubbleSort(NumberArray array) {
        int[] values = array.getValues();
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                }
            }
        }
        return factory.create(values);
    }

    @Override
    public NumberArray insertionSort(NumberArray array) {
        int[] values = array.getValues();
        for (int i = 1; i < values.length; i++) {
            int key = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > key) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = key;
        }
        return factory.create(values);
    }
}

