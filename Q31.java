Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P

5 4 3 2 * 
5 4 3 * 1 
5 4 * 2 1 
5 * 3 2 1 
* 4 3 2 1 

    // java code
    public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=0;i<n;i++)
        { 
            int k=n;
            for(int j=0;j<n;j++) 
            {
                if(i+j==n-1){
                    System.out.print("* ");
                    k--;
                }
                else
               System.out.print(k--  +" ") ;
            }  
          System.out.println();   
        }
    }
}
