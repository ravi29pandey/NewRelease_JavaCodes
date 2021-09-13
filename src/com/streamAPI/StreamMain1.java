package com.streamAPI;

import com.sun.javafx.scene.control.skin.ListCellSkin;

import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {
    public static void main(String[]args){

        List<Integer> list1=Arrays.asList(2,6,78,97,90);//immutable list

        System.out.println(list1);

        List<Integer> list2=new ArrayList<>();//mutable way of creating list
        list2.add(5);
        list2.add(4);
        list2.add(34);
        list2.add(2);

        System.out.println(list2);


        List<Integer> list3=new ArrayList<>(Arrays.asList(2,6,78,90,90));//mutable way of creating list
        list3.add(5);
        list3.add(4);
        list3.add(34);
        list3.add(2);

         System.out.println(list3);


         //Without using  Stream

        List<Integer> listEvenNum=new ArrayList<>();
       for(Integer i: list1){

           if(i%2==0){
               listEvenNum.add(i);
           }
       }

       System.out.print(listEvenNum);

       //Using StreamAPI

        //Stream method is being called and to perform operation we are storing in type stream
       /* Stream<Integer>  stream= list2.stream();
        List<Integer> newList =stream.filter(i->i%2==0).collect(Collectors.toList());*/
        List<Integer> newList=list2.stream().filter(i->i%2==0).collect(Collectors.toList());;

        System.out.print(newList);

        List<Integer> Greaterthan10List=list3.stream().filter(i->i>10).collect(Collectors.toList());

        System.out.print("Greater than 10 " +list3.stream().filter(i->i>10).collect(Collectors.toList()));
    }


}
