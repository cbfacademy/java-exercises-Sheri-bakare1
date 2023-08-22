package com.cbfacademy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowControlExercises {

    public List<String> fizzBuzz(List<Integer> numbers) {
        // TODO - Implement this method such that
        //  it creates a list where for each element of the input list ${numbers}
        //  - if the ${element} is divisible by 3, it adds “Fizz” to the list
        //  - if the ${element} is divisible by 5, it adds “Buzz” to the list
        //  - if the ${element} is divisible by both 3 and 5, it adds “FizzBuzz” to the list
        //  - it adds the element to the list in any other case
        //  - it returns the constructed list
        List<String> newList = new ArrayList<>();
     
        for (int i = 0; i< numbers.size(); i++) {
            Integer elem = numbers.get (i);
            
             if (elem % 3 == 0 && elem % 5 == 0) {
                newList.add ("FizzBuzz");
            

             } else if (elem % 3 == 0) {
                newList.add("Fizz" );
            }
            else if (elem % 5 == 0) {
                    newList.add("Buzz" );
            
           
            } else {
                newList.add(elem.toString());
            }
                
        }
        System.out.println(newList);

        return newList;
    
    }

    public String whichMonth(Integer number) {
        // TODO - Implement this method such that
        //  - it returns the month corresponding to the input ${number}
        //  - if the ${number} is invalid, the method should return "Invalid month number"
       
                String month;
                switch (number) {
                    case 1:
                        month = "January";
                        break;
                    case 2:
                        month = "February";
                        break;
                    case 3:
                        month = "March";
                        break;
                    case 4:
                        month = "April";
                        break;
                    case 5:
                        month = "May";
                        break;
                    case 6:
                        month = "June";
                        break;
                    case 7:
                        month = "July";
                        break;
                    case 8:
                        month = "August";
                        break;
                    case 9:
                        month = "September";
                        break;
                    case 10:
                        month = "October";
                        break;
                    case 11:
                        month = "November";
                        break;
                    case 12:
                        month = "December";
                        break;
                    default:
                        month = "Invalid month number";
                }
                return month;
            }
            


    public Map<String, Integer> sumOfOddsAndSumOfEvens() {
        // TODO - Implement this method such that
        //  - creates and initialises a list of 100 numbers - from 1 to 100
        //  - determines the sum of all the even numbers in the list
        //  - determines the sum of all the odd numbers in the list
        //  - returns a map with two entries:
        //      {"SumOfEvens", calculatedSumOfEvens}, {"SumOfOdds", calculatedSumOfOdds}

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }

        int sumOfEvens = 0;
        int sumOfOdds = 0;
             for (int num : numbers) {
            if (num % 2 == 0) {
                sumOfEvens += num;
            } else {
                sumOfOdds += num;
            }
        }

        Map<String, Integer> result = new HashMap<>();
        result.put("SumOfEvens", sumOfEvens);
        result.put("SumOfOdds", sumOfOdds);
   

        return result;

    }

    public List<Integer> reverse(ArrayList<Integer> numbers) {
        // TODO - Implement this method such that
        //  - it takes an array list of integers
        //  - it returns the list in reverse order
        throw new RuntimeException("Not implemented");
    }

    public String getName() {
        return "Flow Control Exercises";
    }
}
