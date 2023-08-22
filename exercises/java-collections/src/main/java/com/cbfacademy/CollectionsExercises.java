package com.cbfacademy;

import java.util.*;
public class CollectionsExercises {
    public static void main(String[] args) {
        System.out.println(new CollectionsExercises().useArrayDeque());
    }
    /*public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        LinkedList<Integer> integers = new LinkedList<> ();
        
        //  - add 4 as the first element of the list
        integers.add(e:4);
        //  - then add 5, 6, 8, 2, 9 to the the list
        integers.add(e:5);
        integers.add(e:6);
        integers.add(e:8);
        integers.add(e:2);
        integers.add(e:9);

        //  - add another 2 as the last element of the list
        integers.add(e:2);

        //  - add 4 as the 3rd element of the list
        integers.add(index:3, element:4);

        //  - invoke the method element() on the list and print the result on the screen
        integers.element();
        
        //  - return the list
        return integers;

        throw new RuntimeException("Not implemented");
    }*/

    //public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        //throw new RuntimeException("Not implemented");
    //}

    public ArrayDeque<Integer> useArrayDeque() {
        
        // TODO: create an empty arrayDeque
        ArrayDeque<Integer> integers = new ArrayDeque<> ();

        //  - add 5, 6, 8, 9 to the the stack
        integers.add(5);
        integers.add(6);
        integers.add(8);
        integers.add(9);

        //  - print the first element of the queue on the screen
        System.out.println(integers.getFirst());

        //  - print the last element of the queue on the screen
        System.out.println(integers.getLast());

        //  - invoke the method poll() on the queue and print the result on the screen
        integers.poll();
        //  - invoke the element() method on the queue and print the result on the screen
        integers.element();
        //  - return the queue
        //throw new RuntimeException("Not implemented");
        return integers; 
    }

    //public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of keys from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        //throw new RuntimeException("Not implemented");
    //}

    //public String getName() {
        //return "Collections Exercises";
    }

