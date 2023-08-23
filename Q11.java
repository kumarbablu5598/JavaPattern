
Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P 

                        
 	 	 	 	*		
 	 	 	*		*		
 	 	*		*		*		
 	*		*		*		*		
*		*		*		*		*

    
I/p N =7 
O/p                            
       
                                     *		
 	 	 	 	 	 	 	*		*		
 	 	 	 	 	 	*		*		*		
 	 	 	 	 	*		*		*		*		
 	 	 	 	*		*		*		*		*		
 	 	 	*		*		*		*		*		*		
 	 	*		*		*		*		*		*		*    


    // java Code 
import java.io.*; 
import java.util.*; 
public class Main {
    public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i=0;i<n;i++){
             for(int j=0;j<=n-i;j++){
                 System.out.print(" \t");
             }
             for(int j=0;j<=i;j++){
                 System.out.print("*\t\t");
             }
              System.out.println();
         }
    }
}
