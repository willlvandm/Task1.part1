package com.example.arrays.service;

import com.example.arrays.entity.NumberArray;

import java.util.Optional;
import java.util.OptionalDouble;

public interface AverageService {
    OptionalDouble average(NumberArray array);
}

