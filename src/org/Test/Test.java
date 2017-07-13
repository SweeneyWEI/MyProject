package org.Test;

import java.awt.*;
import java.security.Key;
import java.util.*;
import java.util.List;

/**
 * Created by wx on 17-6-24.
 */
public class Test {
    public static void main(String[] args) {
//        HashMap<String,String> Map=new HashMap();
//        Map.put("aa","sad");
//        Map.put("ss","wsxc");
//        Map.put("sd","zzxc");
//
//        for(String str:Map.keySet()){
//            System.out.println(str+" "+Map.get(str));
//        }
        LinkedList<String> str=new LinkedList();
        str.add("asd");
        str.add("wsx");
        str.add("qaz");
        str.add("asdsd");
        str.get(2);
//        str.subList(2,4).clear();
        for (String key:str)
            System.out.println(key);
//        System.out.println(key);

    }

}
