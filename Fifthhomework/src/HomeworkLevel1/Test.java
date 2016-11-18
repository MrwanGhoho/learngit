package HomeworkLevel1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by asus on 2016/11/17.
 */
public class Test {
    public static void main(String[] args){
        System.out.println("输入根目录");
       Scanner scan=new Scanner(System.in);
        String catalog=scan.next();
        System.out.println("输入关键字");
        Scanner show=new Scanner(System.in);
        String keyWords=show.next();
        try {
            Search FileSearch=new Search(catalog,keyWords);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
