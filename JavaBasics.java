import java.util.*;
/**
 * InnerJavaBasics
 */
public class JavaBasics {
        public static void main(String args[]){
                System.out.print("Hello Aman!");
        
// Print a pattern
        
                System.out.println("*@@*");
                System.out.println("***");
                System.out.print("**");
                System.out.println("*");


// Variables in Java(it's a type of containor whose value can be change in future)

                int a = 10;
                int b = 5;
                System.out.println(a);
                System.out.println(b);
                String name = "Tony Stark";
                System.out.println(name);

                a=50;
                System.out.println(a);

// Datatypes in java

// primitive(Byte,Short,char,Boolean,int,long,float,double) 
// & Non Primitive(String, Array, Class, Object, Interface)
 
                byte c = 5;
                System.out.println(b);
                char ch = 'a';
                System.out.println(ch);
                boolean var = false;
                int number = 25;
        
                float rate = (float) 1.2;
                double price = 1.2;
                short n = 125;
                //long
                //double

// sum of a & b

                int d = 10;
                int e = 5;
                int sum = d+e;
                System.out.println(sum);

// Comments

//  this symbol(//,/* */) is used for comments in java 

// input in java

                Scanner sc = new Scanner(System.in);
                
        //        String input = sc.next();                
        //        System.out.println(input);

                String name1 = sc.nextLine();
                System.out.println(name1);
                
        }
}

//boilerplate code