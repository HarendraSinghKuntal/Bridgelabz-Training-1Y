import java.util.Scanner;
class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base:");
        double Base = sc.nextDouble();   
        System.out.println("Enter Height:");
        double Height = sc.nextDouble(); 
        double area = (Base * Height) / 2;
        System.out.println("Area of Triangle is: " + area);
        sc.close();
    }
}
