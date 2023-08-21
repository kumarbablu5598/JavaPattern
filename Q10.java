Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P
* * * * * * * * * 
  * * * * * * *   
    * * * * *     
      * * *       
        *   
 I/P  N=7
  O/P 
* * * * * * * * * * * * * 
  * * * * * * * * * * *   
    * * * * * * * * *     
      * * * * * * *       
        * * * * *         
          * * *           
            *   
  // Java Code
  public class Main {
    public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<2*n-1;j++)
            {  
                if(j>=i && j<2*n-1-i)
                System.out.print("* ");
                else 
                System.out.print("  ");
            }
            System.out.println();
             
        }

    }
}
