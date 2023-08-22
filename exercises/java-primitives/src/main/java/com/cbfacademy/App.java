package com.cbfacademy;
import com.cbfacademy.ArithmeticExercises;


public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        float operand1 = 12.0f;
        float operand2 = 20.0f; 
        ArithmeticExercises exercises = new ArithmeticExercises();

        System.out.println(exercises.AddFloat(operand1, operand2));
        System.out.println(exercises.SubtractFloat(operand1, operand2));
        System.out.println(exercises.MultiplyFloat(operand1, operand2));
        System.out.println(exercises.DivideFloat(operand1, operand2));

    }
}
