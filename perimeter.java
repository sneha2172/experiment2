import java.util.Scanner;
 
class shape{
    double p;
    shape(int i)
    {
        p= 2*3.14*i;
    }
    shape(int i, int j)
    {
      p= 2*(i+j);
    }
}
class perimeter {
    public static void main(String args[])
    {   
        int a,b;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius of a circle:");
        a=sc.nextInt();
        shape circ= new shape(a);
        System.out.println("Enter the dimensions of a rectangle (l x b):");
        a=sc.nextInt();
        b=sc.nextInt();
        shape rect= new shape(a,b);

        System.out.println("Perimeter of \n1. Circle:"+circ.p+"\n2. Rectangle:"+rect.p);
    }
}
