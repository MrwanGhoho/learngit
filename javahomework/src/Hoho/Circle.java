package Hoho;

/**
 * Created by asus on 2016/10/28.
 */
public class Circle extends SuanFa {
    public Circle(double newa){
       this.a=newa;
    }
    double newArea;
    double a;
    final double pi=3.1415;
    double area() {
        newArea=pi*a*a;
        return newArea;
    }


}
