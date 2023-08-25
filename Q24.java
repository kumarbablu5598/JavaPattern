Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P
          1         
        2 2 2       
      3 3 3 3 3     
    4 4 4 4 4 4 4   
  5 5 5 5 5 5 5 5 5 
    
  // java Code 
    public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=2*n-1;j++) 
            {   
                 if(j>n-i && j<n+i){
                      System.out.print(i+" ");
                    
                 }
               
                else 
                System.out.print("  ");
                
            }  
          System.out.println();   
        }
    }
}
