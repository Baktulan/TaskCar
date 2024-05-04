public class Triangle {
    double a;
    double b;
    double c;

    public void getArea(double a ,double b ,double c){
        double s =(a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println( "Area of triangle:  "+area);
    }
}
