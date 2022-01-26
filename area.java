import java.util.Scanner;

class shape{
    int a,b,c;
    double area;
    double calc(int a)
    {
       area=3.14*(Math.pow(a, 2));
       return area;
    }
    double calc(int a,int b)
    {
        area=a*b;
        return area;
    }
     double calc(int a, int b, int c){
         area = (a+b+c)/2;
         area = Math.sqrt((area*(area-a)*(area-b)*(area-c)));
         return area;
     }
}
class area {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        shape circ = new shape();
        System.out.println("Enter the radius of a circle:");
        circ.a = sc.nextInt();
        shape rect= new shape();
        System.out.println("Enter the dimensions of a rectangle(l x b):");
        rect.a = sc.nextInt();
        rect.b = sc.nextInt();
        shape tri = new shape();
        System.out.println("Enter the dimensions of a triangle:");
        tri.a= sc.nextInt();
        tri.b = sc.nextInt();
        tri.c = sc.nextInt();

        System.out.println("Area of given circle:"+circ.calc(circ.a)+"\nArea of given rectangle:"+rect.calc(rect.a, rect.b)+"\nArea of given triangle:"+tri.calc(tri.a,tri.b,tri.c));
        }
}
