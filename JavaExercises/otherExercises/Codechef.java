/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner in = new Scanner(System.in);
        
        int t = in.nextInt();
        
        while(t-->0) {
            int n = in.nextInt();
            
            String[] a = new String[n*3];
            Arrays.fill(a, "");
            int[] b = new int[n*3];
            
            for (int i = 0; i < n*3; i++) {
                a[i] += in.next();
                b[i] = in.nextInt();
            }
            
            //logic for sorting   
            for(int i = 0; i<a.length-1; i++)   
            {  
            for (int j = i+1; j<a.length; j++)   
            {  
            //compares each elements of the array to all the remaining elements  
            if(a[i].compareTo(a[j])>0)   
            {  
            //swapping array elements  
            String temp = a[i];  
            a[i] = a[j];  
            a[j] = temp;  
            }  
            }  
            }  
          
            int cInd = 0;
            int cY = 0;
            int [][] ind = new int [n*3][n*3];
            for (int[] row: ind)
                Arrays.fill(row, -1);
            
            ind[0][0] = 0;
            
            for (int i = 1; i < (n * 3); i++) {
                if (a[i].equals(a[i-1]) ) { 
                    cY++;
                } else {
                    cY = 0;
                    cInd ++;
                }
                
                ind[cInd][cY] = i;
                
            }
            
            ArrayList<Integer> output = new ArrayList<Integer>();
           
            for (int i = 0; i <= cInd; i++) {
            	
            	int sum = 0;
            	for (int j = 0; j < n*3; j++) {
            		if (ind[i][j] != -1) {
                		sum += b[ ind[i][j] ];
            		} else {
            			break;
            		}
            	}
                output.add(sum);
            }
            
            Object[] m = output.toArray();
            Arrays.sort(m);
            
            for (Object obj : m)
                System.out.print(obj + " ");

            System.out.println();
        }
        
        
	}
}