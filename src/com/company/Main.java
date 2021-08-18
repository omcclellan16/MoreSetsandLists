package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {



    public static void main(String[] args) {
        ArrayList<Integer> t = new ArrayList<Integer>();
        // lists are just like arrays, except a bit slower, and they can change size (can add, remove)
        // have almost identical properties to sets...
        t.add(1);
        t.add(2);

        //lists know where things are, unlike sets - so you can index things :) see below
        t.get(t.indexOf(1));
        System.out.println(t.get(1));
        // this is how we get the index of a number (remember, we start counting from 0

        // we can also set (swap) an element at a certain index - see below
        //t.set(index, element)
        t.set(0,5);
        System.out.println(t.set(0,5));

        // we can also do t.size, t.isempty, etc...

        ArrayList<Integer> u = new ArrayList<Integer>();
        u.add(1);
        u.add(2);
        u.add(4);
        u.add(5);
        u.add(7);
        u.subList(1,4);
        System.out.println(u.subList(1,4));
        // this prints a range of indexes, here, we print from index 1 to index 4, but not including index 4.



    }
}
