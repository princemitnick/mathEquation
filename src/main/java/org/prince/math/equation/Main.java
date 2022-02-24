package org.prince.math.equation;

import org.prince.math.model.Rectangle;
import org.prince.math.service.calculator.Calculator;
import org.prince.math.service.calculator.CalculatorImpl;
import org.prince.math.service.etudiant.EtudiantService;
import org.prince.math.service.etudiant.EtudiantServiceImpl;
import org.prince.math.service.rectangle.RectangleImpl;
import org.prince.math.service.rectangle.RectangleIntr;

public class Main  {

    private static Calculator calculator = new CalculatorImpl();
    private static RectangleIntr rectangle = new RectangleImpl();
    private static EtudiantService etudiantService = new EtudiantServiceImpl();

    public static void main(String... args){
        /*Multiplier multiplier = new Multiplier();
        doCalculation(multiplier, 8, 2);
        */

        //System.out.println(calculator.add(3,4));
        //System.out.println(rectangle.surface(new Rectangle(4.0d, 2.0d)));
        etudiantService.add(null);
        System.out.println(etudiantService.findAll());
        System.out.println("Prince Stanley");
        System.out.println("ZLDEV");
        System.out.println("Test 1.1.1.1");

    }

    /*public static void doCalculation (CalculateBase calculation, double leftValue, double rightvalue){
        calculation.setLeftVal(leftValue);
        calculation.setRightVal(rightvalue);

        calculation.calculate();
        System.out.println("Calculation result : "+calculation.getResult());

    }*/
}
