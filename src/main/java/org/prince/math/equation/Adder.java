package org.prince.math.equation;

public class Adder extends  CalculateBase{

    @Override
    public void calculate() {
        double value = getLeftVal() + getRightVal();
        setResult(value);
    }
}
