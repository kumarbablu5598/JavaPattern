Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P
          1         
        1 2 3       
      1 2 3 4 5     
    1 2 3 4 5 6 7   
  1 2 3 4 5 6 7 8 9 


    // java Code 
    public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {    int k=1;
            for(int j=0;j<=2*n-1;j++) 
            {   
                 if(j>n-i && j<n+i){
                      System.out.print(k+" ");
                     k++;
                 }
               else 
                System.out.print("  ");
                
            }  
          System.out.println();   
        }
    }
}
