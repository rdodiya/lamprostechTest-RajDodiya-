// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class SingleInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int m=sc.nextInt();
        int[] a=new int[m];//assume a= 2 5 1 3 4 7 and n=3
    
            for(int i=0;i<m;i++){
                a[i]=sc.nextInt();
            }
            int sum=a[0];
            //here we find xor of all elements
            // xor of two same digit is 1 
            //so same digit will nullify each other
            
            for(int i=0;i<m-1;i++){
              sum=sum^a[i+1];
            }
                System.out.println(sum);
        
    
        
    }
}