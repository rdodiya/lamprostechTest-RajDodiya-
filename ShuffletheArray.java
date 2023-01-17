// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class ShuffletheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int m=sc.nextInt();
        int[] a=new int[m];
        if(m%2!=0){
              System.out.println("invalid");
        }else{
            for(int i=0;i<m;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter n");
            int n=sc.nextInt();
            int[] a1=new int[n];//here we will save first n digit in a array
            int[] a2=new int[m-n];//here we will save another m-n remaining digit 
            int[] ans=new int[m];
            int count=0;
            
            for(int i=0;i<n;i++){
                a1[i]=a[i];
            }
            
            for(int i=0;i<m-n;i++){
                a2[i]=a[i+n];
            }
    
    //now alternatively we will add in ans array from a1 and a2
            for(int i=0,h=0,k=0;i<m;i++){
                if(i%2==0){
                    ans[i]=a1[h];
                    h++;
                }else{
                    ans[i]=a2[k];
                    k++;
                }
                
            }
               for(int i=0;i<m;i++){
                System.out.print(ans[i]+",");
            }
            
        }
        
    }
}