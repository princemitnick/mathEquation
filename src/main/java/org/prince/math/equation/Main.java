package org.prince.math.equation;

import org.prince.math.equation.service.Calculator;
import org.prince.math.equation.service.CalculatorImpl;

public class Main  {

    private static Calculator calculator = new CalculatorImpl();

    public static void main(String... args){
        /*Multiplier multiplier = new Multiplier();
        doCalculation(multiplier, 8, 2);
        */

        System.out.println(calculator.add(3,4));

    }

    /*public static void doCalculation (CalculateBase calculation, double leftValue, double rightvalue){
        calculation.setLeftVal(leftValue);
        calculation.setRightVal(rightvalue);

        calculation.calculate();
        System.out.println("Calculation result : "+calculation.getResult());

    }*/
}
