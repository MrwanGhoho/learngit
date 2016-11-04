package Homework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by asus on 2016/11/3.
 */
public class levelTwo {
    public static void main(String args[]) {
        List<String> list = new ArrayList<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("write the amounts:");
        int b = scanner.nextInt();
        for (int i = 0; i <b; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("write the element:");
            String a = scan.next();
            list.add(a);
        }
        System.out.println("输出方式1:");
        for (String List : list) {
            System.out.println(List);
        }
        System.out.println(list.size());
        System.out.println("输出方式2:");
        for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j));
        }
        System.out.println("输出方式3：");
        Iterator it=list.iterator();
        while(it.hasNext()){
           String k= (String) it.next();
            System.out.println(k);
        }

    }
}
