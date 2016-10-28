package Hoho;

/**
 * Created by asus on 2016/10/28.
 */
public class Triangle extends SuanFa {
    public Triangle(int newa,int newb,int newc){
        this.a=newa;
        this.b=newb;
        this.c=newc;
    }
    int a,b,c;
    double newArea,s;
    double area() {
        s=(a+b+c)*0.5;
        newArea= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return newArea;
    }
}
