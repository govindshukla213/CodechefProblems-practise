/*
Author:Govind_213
Problem link:https://www.codechef.com/problems/DECINC

*/
import java.io.*;
import java.io.IOException;
class Decinc
{
     public static void main(String[]args) throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());

         if(n%4==0)
         {
            System.out.println(++n);
         }
         else
         {
            System.out.println(--n);
         }
        
     }
}