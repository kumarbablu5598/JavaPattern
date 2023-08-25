
Take Integer N as input and print the following pattern.
    
I/p  N=7

O/P

* * *   * * * 
* *       * * 
*           * 
              
*           * 
* *       * * 
* * *   * * * 
// java code 
    public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {  
                
               
              if(i<n/2)
              {        
                if(j>= (n/2)-i && j<=(n/2)+i)
                     System.out.print("  ");
                 else 
                     System.out.print("* ");
              }  
             else 
             {
                 int p=n-1-i;
                 if(j>=(n/2)-p && j<=(n/2)+p)
                     System.out.print("  ");
                 else 
                     System.out.print("* ");
             }   
                    
            }
            System.out.println();
             
        }
    }
}
