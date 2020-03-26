/*
Author:Govind_213
Problem link:https://www.codechef.com/problems/TRISQ

*/
import java.io.*;
import java.io.IOException;

class Trisq
{
     
     public static void main(String[]args) throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcs=Integer.parseInt(br.readLine());
        for(int j=0;j<tcs;j++)
         {           
            int B=Integer.parseInt(br.readLine());
            if(B%2!=0)
            {
                B--;
            }
            int res=((B*B)-2*B)/8;
            System.out.println(res);
          
        }

     }
}