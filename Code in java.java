import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the gameOfThrones function below.
    static String gameOfThrones(String s) {
        int x[]=new int[s.length()];
        int c=0,d=0,l=0,k=0;
        for(int i=97;i<=122;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)==i)
                c++;
            }
            if(c>0)
            x[d++]=c;
            c=0;
        }
        int p=s.length();
            for(int j=0;j<x.length;j++)
            {
                if(x[j]%2==0)
                l++;
                else if(x[j]%2!=0)
                k++;
            }
            if(k==1 && p%2!=0)
            return ("YES");
            else if( k==0 && p%2==0)
            return ("YES");
            else 
            return ("NO");
    }



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = gameOfThrones(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}