import java.util.Scanner;

class student{
    String name;
    int rno;
    int m1,m2,m3,m4,m5;
    
}
class marks{
    static void read(student s){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the name of the student:");
     s.name=sc.nextLine();
     System.out.println("Enter roll number:");
     s.rno=sc.nextInt();
     System.out.println("Enter the marks in 5 subjects:");
     s.m1=sc.nextInt();
     s.m2=sc.nextInt();
     s.m3=sc.nextInt();
     s.m4=sc.nextInt();
     s.m5=sc.nextInt();
    }
    static void display(student s){
        System.out.println("\t\tREPORT\n name:"+s.name+" \n roll no. :"+s.rno+"\nMarks:\n subject 1:"+s.m1+"\n subject 2:"+s.m2+"\n subject 3:"+s.m3+"\n subject 4:"+s.m4+"\n subject 5:"+s.m5);

    }
    public static void main(String args[]){
        student s1 = new student();
        read(s1);
        display(s1);

}
}
