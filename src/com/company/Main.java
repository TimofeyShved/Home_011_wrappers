package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    //Обёртки

    public static void main(String[] args) {
        Byte b;
        Short sh=new Short("4"); //сам распарсит
        Integer i=5;
        Long l;
        Boolean bl;
        Character ch;
        Float f;
        Double db;

        i+=sh;
        System.out.println(i);

        //Удобно преминять с массивами-коллекциями
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(9);

        //перебор и вывод на экран
        for (int k:list){
            System.out.println(k);
        }

        //для сравнения необходима команда, так как обёртка - это ссылка
        if(i.equals(list.get(2))){
            System.out.println(true);
        }

        list=null;// с этого момента он помечен на удаление

        System.gc();
        //Вызывает сборщик мусора
    }
}
