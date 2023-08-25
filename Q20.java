Take Integer N as input and print the following pattern.
    
I/p  N=7

O/P

      *       
    *   *     
  *       *   
*           * 
  *       *   
    *   *     
      *   
// java Code 
    public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {  
                int T= n/2 ;
             if(i< T)
              {        
                if(j==T-i ||j==T+i)
                     System.out.print("* ");
                 else 
                     System.out.print("  ");
              }  
             else 
             {
                 int p=n-1-i;
                 if(j== T-p || j== T+p )
                     System.out.print("* ");
                 else 
                     System.out.print("  ");
             }   
                    
            }
            System.out.println();
             
        }
    }
}
