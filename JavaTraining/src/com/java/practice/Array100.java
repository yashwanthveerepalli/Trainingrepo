package com.java.practice;

import java.util.*;

public class Array100 {
public static void main(String []args) {
int sum=0;
ArrayList<Integer> list = new ArrayList<Integer>();
for (int i=1; i<=100; i++) {
list.add(new Integer(i));
}
Collections.shuffle(list);
for (int i=1; i<=99; i++) {

sum+=list.get(i);
}
int missing=5050-sum;
System.out.print(missing);

}
}