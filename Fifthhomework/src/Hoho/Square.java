package Hoho;

/**
 * Created by asus on 2016/10/28.
 */
public class Square extends SuanFa {
   public Square(double newa){
       this.a=newa;
   }
   double a;
   double newArea;
    double area() {
        newArea=a*a;
        return newArea;
    }
}
