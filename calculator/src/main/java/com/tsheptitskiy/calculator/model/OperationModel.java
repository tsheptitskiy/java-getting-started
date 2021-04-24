package com.tsheptitskiy.calculator.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Taras Sheptytskyi
 */
@Getter
@Setter
public class OperationModel {
    private String operation;
    private int a;
    private int b;
    private int c;

    public OperationModel() {
    }

    public OperationModel(int c) {
        this.c = c;
    }

    public OperationModel(String operation) {
        this.operation = operation;
    }

    public OperationModel(int a, int b) {
        this.a = a;
        this.b = b;
    }
}