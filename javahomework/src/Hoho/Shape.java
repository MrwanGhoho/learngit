package Hoho;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by asus on 2016/10/28.
 */
public class Shape {
   public  static void main(String args []){
       SuanFa square=new Square(2);
       System.out.println("正方形面积="+square.area());
       SuanFa triange=new Triangle(3,4,5);
       System.out.println("三角形面积="+triange.area());
       SuanFa circle=new Circle(3);
       System.out.println("圆的面积="+circle.area());
   }
}

