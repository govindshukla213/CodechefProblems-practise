/*
Author:Govind_213
Problem link:https://www.codechef.com/problems/CHEFSTLT
*/
import java.io.*;
import java.io.IOException;

class Chefslt
{
     
     public static void main(String[]args) throws IOException
     {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tcs=Integer.parseInt(br.readLine());
        for(int j=0;j<tcs;j++)
         {           
            String A=br.readLine();
            String B=br.readLine();
            int min=0,max=A.length();

            for(int i=0;i<A.length();i++)
            {
                if(A.charAt(i)==B.charAt(i))
                {
                    if(A.charAt(i)!='?')
                    {
                        max--;
                    }
                   
                }
                else
                {
                   if(A.charAt(i)!='?'&&B.charAt(i)!='?') 
                   {
                       min++;
                   }

                }

            }
            System.out.println(min+" "+max);




          
        }

     }
}