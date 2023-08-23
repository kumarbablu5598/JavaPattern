Take Integer N as input and print the following pattern.
    
I/p  N=5

O/P  

                             
 	 	 	 	*
 	 	 	*	!	*
 	 	*	!	*	!	*
 	*	!	*	!	*	!	*
*	!	*	!	*	!	*	!	*
 // java Code 

    public class Main {
    public static void main(String[] args) {
      
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for(int i=1;i<=n;i++){
             for(int j=0;j<=n-i-1;j++){
                 System.out.print(" \t");
             }
             for(int j=0;j<i-1;j++){
                 System.out.print("*\t!\t");
             }
             
              System.out.println("*");
         }
    }
}
