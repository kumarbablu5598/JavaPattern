Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P
           1             
         2 3 4          
      5 6 7 8 9       
   10 11 12 13 14 15 16    
17 18 19 20 21 22 23 24 25 





    // java Code 
    public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2*n-1;j++) 
            {   
                 if(j>=n-1-i && j<=n-1+i){
                      System.out.print(k+" ");
                     k++;
                 }
               
                else 
                System.out.print("   ");
                
            }  
          System.out.println();   
        }
    }
}
