package com.intro.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        HashMap users = new HashMap();

        users.put("Tim", 13);
        users.put("Dulce", 23);

        if(users.containsKey("Tim")){
            System.out.println("Yay");

        }else {
            System.out.println("Nay");
        }

        System.out.println("Current Users List: " + users.values());

        System.out.println("Entire Value Set: " + users.entrySet());

        Iterator it = users.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();

            System.out.println(pair.getKey() + "." + pair.getValue());
        }

        HashMap<String, Integer> newPlayer = new HashMap<>();

        newPlayer.put("Sue", 24);

        System.out.println("List of New Players: " + newPlayer.entrySet());

        HashMap<Integer, String> newAdmin = new HashMap<>();
        newAdmin.put(23, "Johnny");

        System.out.println("List of New Admins: " + newAdmin.entrySet());
        System.out.println("List of New Admins: " + newAdmin.keySet());

        newAdmin.replace(23, "Johnny", "Tim");

        System.out.println("List of New Admins: " + newAdmin.entrySet());
        System.out.println("List of New Admins: " + newAdmin.keySet());



    }
}
