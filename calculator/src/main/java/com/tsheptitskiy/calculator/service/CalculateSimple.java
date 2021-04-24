package com.tsheptitskiy.calculator.service;

import com.tsheptitskiy.calculator.model.OperationModel;
import org.springframework.stereotype.Service;

/**
 * @author Taras Sheptytskyi
 */

@Service
public class CalculateSimple {

    public int add(OperationModel operationModel) {
        return operationModel.getA() + operationModel.getB();
    }

    public int subtract(OperationModel model){
        return model.getA() - model.getB();
    }
}