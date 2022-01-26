import java.util.Scanner;

class strng{
          String s;
          char ch;
          strng(String a,char c)
          {
              s = a;
              ch = c;
          }
          
          int freq(){
              int count=0;
              for(int i= 0;i<s.length();i++)
              { 
                if (s.charAt(i)==ch)
                count++;
              }
              return count;
          }

          String reverse(){
              String rev="";
              char c;
              int len=s.length();
              for(int i=0;i<len;i++)
              { 
               c= s.charAt(i);
               rev= c+rev;
              }
              return rev;
          }
}

class rev{
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string :");
        String term=sc.nextLine();
        System.out.println("Enter a character :");
        char el= sc.nextLine().charAt(0);
        strng ob=new strng(term,el);
        System.out.println(el+" is present "+ob.freq()+" times in string \""+term+"\"");
        System.out.println("Reverse of the entered string is:"+ob.reverse());
    }
}
