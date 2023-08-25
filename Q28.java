Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P
          1         
        2 3 2       
      3 4 5 4 3     
    4 5 6 7 6 5 4   
  5 6 7 8 9 8 7 6 5 


    // Java Code 
    public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {    int k= i;
            for(int j=0;j<=2*n-1;j++) 
            {   
                 if(j>n-i && j<n+i){
                      System.out.print(k+" ");
                     if(j<n) k++;
                     else k--;
                 }
               else 
                System.out.print("  ");
                
            }  
          System.out.println();   
        }
    }
}
