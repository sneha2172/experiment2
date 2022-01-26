import java.util.Scanner;

class employee{
  int empno;
  String name;
  long phn;
  employee()
  { Scanner s1= new Scanner(System.in);
    Scanner s2= new Scanner(System.in);
    Scanner s3=new Scanner(System.in);
    System.out.println("Enter the employee number:");
    empno= s1.nextInt();
    System.out.println("Enter the employee name:");
    name=s2.nextLine();
    System.out.println("Enter the employee contact number:");
    phn=s3.nextLong();
  }
  void display(){
    System.out.println("Employee number: "+empno );
    System.out.println("Name: "+name );
    System.out.println("Phone number: "+phn );
  }
}

class details {
  public static void main(String[] args) {
   System.out.println("Enter details of employee 1");   
   employee e1 =new employee();
   System.out.println("Enter details of employee 2");
   employee e2 =new employee();
   System.out.println("Enter details of employee 3");
   employee e3 =new employee();
   System.out.println("Enter details of employee 4");
   employee e4 =new employee();
   System.out.println("Enter details of employee 5");
   employee e5 =new employee();
   System.out.println("\t\tEmployee details: " );
   e1.display();
   e2.display();
   e3.display();
   e4.display();  
   e5.display();
  }
}
