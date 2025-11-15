package day05;

import java.util.ArrayList;
import java.util.List;

public class P05_List {
    public static void main(String[] args) {
        /*
         * Input olarak verilen listteki isimlerden
         * icinde a harfi bulunanlari silen bir program yaziniz
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        List<String> list = new ArrayList<>();

        list.add("Ali");
        list.add("Veli");
        list.add("Ayşe");
        list.add("Fatma");
        list.add("Ömer");
        System.out.println("İlk List"+list);

        List<String> newList = new ArrayList<>();

        for(String s: list){
            if(!s.toLowerCase().contains("a")){
                newList.add(s);
            }
        }

        System.out.println("Yeni oluşan list: "+newList);





    }
}
