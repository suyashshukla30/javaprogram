import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hourglass {

    static int max = Integer.MIN_VALUE ;
    
    public static void find(int[][] a)
        {
        
        for(int i=0; i<6; i++)
            {
            for(int j=0; j<6; j++)
                {
                
                if(i+2 <6 && j+2 < 6)
                    {
                    compute(i, j, a);
                }
            }
        }
        
    }
    
    
    public static void compute(int i, int j, int[][]a)
        {
        
        //if(a[i][j]  != 0 && a[i+2][j] != 0)
          //  {
            int sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
            max = Math.max(max, sum);
      //  }
        
    }
    
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan = new Scanner(System.in);
        
        int[][]a = new int[6][6];
        
        for(int i=0; i<6; i++)
            {
            for(int j=0; j<6; j++)
                {
                a[i][j] = scan.nextInt();
            }
        }
        
        find(a);
        
        System.out.println(max);
        
    }
}