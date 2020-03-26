/*
Author:Govind_213
Problem link:https://www.codechef.com/problems/CUTBOARD

*/
import java.io.*;
import java.io.IOException;

class Cutboard
{
     public static void main(String[]args) throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcs=Integer.parseInt(br.readLine());
        for(int i=0;i<tcs;i++)
         {
            String tokens[]=br.readLine().split(" ");
            int  N=Integer.parseInt(tokens[0]);
            int  M=Integer.parseInt(tokens[1]);
            System.out.println((N-1)*(M-1));

         }
        
     }
}