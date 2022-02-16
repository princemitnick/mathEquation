package org.prince.math.equation;

public class Substracter extends CalculateBase{

    @Override
    public void calculate() {
        double value = getLeftVal() - getRightVal();
        setResult(value);
    }
}
