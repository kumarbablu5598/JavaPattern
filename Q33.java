Take Integer N as input and print the following pattern.
    
I/p  N=10

O/P
                  0                   
                9 0 9                 
              8 9 0 9 8               
            7 8 9 0 9 8 7             
          6 7 8 9 0 9 8 7 6           
        5 6 7 8 9 0 9 8 7 6 5         
      4 5 6 7 8 9 0 9 8 7 6 5 4       
    3 4 5 6 7 8 9 0 9 8 7 6 5 4 3     
  2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2   
1 2 3 4 5 6 7 8 9 0 9 8 7 6 5 4 3 2 1 

  // java Code 
  public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=1;i<=n;i++) {    
            for(int j=1;j<2*n;j++) {   
                 
                 if(j>n-i && j<n+i)
                 {    
                     if(j==10)System.out.print(0 + " ");
                     else if(j>10)  System.out.print(2*n-j + " ");
                     else   System.out.print(j + " ");
                    
                  }  
                else  System.out.print("  ");
        
            }  
          System.out.println();   
        }
    }
}
