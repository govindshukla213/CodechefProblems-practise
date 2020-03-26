/*
Author:Govind_213
Problem link:https://www.codechef.com/problems/FSQRT

*/
import java.io.*;
import java.io.IOException;

class FSQRT
{
     
     public static void main(String[]args) throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcs=Integer.parseInt(br.readLine());
        for(int j=0;j<tcs;j++)
         {           
            int n=Integer.parseInt(br.readLine()); 
            System.out.println((int)Math.sqrt((double)n));
          
        }

     }
}