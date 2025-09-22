package com.nbicocchi.exercises.arrays;

import java.util.random.RandomGenerator;

public class FillArray {
    public static double[] fillArray(int size, double value, boolean addNoise){
        RandomGenerator random = RandomGenerator.getDefault();
        double[] array = new double[size];
        for(int i = 0; i < size; i++){
            if(addNoise){
                array[i] = random.nextDouble(value - (value * 0.05), value + (value *0.05 ));
            }else {
                array[i] = value;
            }
        }
        return array;
    }
}
