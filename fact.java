import java.util.Scanner;
 
 class number{
      int num;
      long factl;
      int sum;
 }
 
 
 class fact {
     static long factorial(int num){
         if (num==0||num==1)
         return 1;
         else 
         return(num*factorial(num-1));
     }
     static int sumofDigits(int num){
         int temp;
         int sum =0;
         while(num!=0){
             temp=num%10;
             sum+=temp;
             num= num/10;
         }   
         return sum;  
     }
    public static void main(String args[]){
       System.out.println("Enter a number:");
        number n= new number();
        Scanner sc= new Scanner(System.in);
        n.num=sc.nextInt();
        n.factl=factorial(n.num);
        n.sum=sumofDigits(n.num);
        System.out.println("Factorial of the entered number:"+n.num+" is "+n.factl+" and the sum of it's digits is "+n.sum);
    }
}
