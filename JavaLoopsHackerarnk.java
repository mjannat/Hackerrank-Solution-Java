
package hackerrank;


import java.util.*;

class  JavaLoopsHackerarnk{
    public static void main(String []argh){
       
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        int t = 1;
        while (t <= test) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            a = a + b;
            int i = 1 , temp = a, mul = b;
            while(i <= n) {
                System.out.print(temp + " ");
                mul *= 2;
                temp = temp + mul;
                i++;
            }
            System.out.print("\n");
            t++;
        }
    }
}
