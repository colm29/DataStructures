package com.codewithmosh;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addLast(40);
        list.addLast(50);
        var array = list.getMiddleNode();
        System.out.println(list.getMiddleNode());
    }
}
