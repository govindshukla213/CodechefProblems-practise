/*
Author:Govind_213
Problem link:https://www.codechef.com/problems/CHOPRT

*/
import java.io.*;
import java.io.IOException;

class ChefOP
{
     
     public static void main(String[]args) throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcs=Integer.parseInt(br.readLine());
        for(int j=0;j<tcs;j++)
         {
            String tokens[]=br.readLine().split(" ");
            long A=Long.parseLong(tokens[0]);
            long  B=Long.parseLong(tokens[1]);

            if(A>B)
            {
                System.out.println(">");
            }
            else if(A==B)
                {
                    System.out.println("=");
                }
                else
                {
                    System.out.println("<");
                }



            
        }

     }
}