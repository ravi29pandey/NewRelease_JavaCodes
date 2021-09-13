package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamObject {

    public static void main(String[]args){


        //filter(Predicate)
        //Predicate  is an interface which is  a boolean value function ? True : False
        //filter method work on that true false criteria.



        //map(Function)
        //Function returns value where predictae returns True : False
        /*we can perform opertaion on each element*/

        List<String> names=new ArrayList<>();
        names.add("Aman");
        names.add("Ravi");
        names.add("Saurabh");
        names.add("Namit");

        System.out.println("Names starts with A "+names.stream().filter(e->e.startsWith("A")).collect(Collectors.toList()));

        names.stream().forEach(
                e->{
                    System.out.println(e);
                }
        );

       names.stream().forEach(System.out::println);


        List<Integer> nums=new ArrayList<>();
        nums.add(5);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        nums.add(1);

        System.out.println("Square of num :"+nums+nums.stream().map(i->i*i).collect(Collectors.toList()));


        //sort
        nums.stream().sorted().forEach(System.out::println);

        //min
      Integer int_min=  nums.stream().min((x,y)->x.compareTo(y)).get();
        System.out.println(int_min+ "MINIMUM");

        Integer int_max=nums.stream().max((x,y)->x.compareTo(y)).get();
        System.out.println(int_max + "MAXIMUM");

    }
}
