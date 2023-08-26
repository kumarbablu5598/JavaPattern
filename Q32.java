Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P
    
1        
2 * 2      
3 * 3 * 3    
4 * 4 * 4 * 4  
5 * 5 * 5 * 5 * 5
4 * 4 * 4 * 4  
3 * 3 * 3    
2 * 2      
1      
// java Code 
    public class Main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        for(int i=0;i<2*n-1;i++)
        {
            for(int j=0;j<n;j++)
            {  
                if(i<n)
                {
                     if(j<i) System.out.print(i+1+" * ");
                     else if(j==i) System.out.print(i+1);
                     else System.out.print("  ");
                }
                else
                {
                    int p= 2*n-2-i;
                     if(j<p) System.out.print(p+1+" * ");
                     else if(j==p) System.out.print(p+1);
                     else System.out.print("  ");
                }
            }
          System.out.println();
        }
    }
}
