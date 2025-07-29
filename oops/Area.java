package twentynine;
abstract class Shape{
abstract float RectangleArea(int length,int breadth);
abstract float SquareArea(int s);
abstract double CircleArea(int r);
}
public class Area extends Shape{
    float RectangleArea(int length,int breadth){
        return length*breadth;
    }
    float SquareArea(int s){
        return s*s;
    }
    double CircleArea(int r){
        return Math.PI*r*r;
    }
    public static void main(String[] args) {
        Area a=new Area();
        System.out.println("area of circle "+a.CircleArea(5));
        System.out.println("area of square "+a.SquareArea(5));
        System.out.println("area of rectangle "+a.RectangleArea(2, 5));
    }
}
