/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication261;

import java.net.*;
import java.io.*;
import java.util.Date;
import java.util.Scanner;
public class UCD
{
public static void main(String args[]) throws Exception {
int c = 0,f=0,h=0;
URL hp = new URL("http://www.dsebd.org/market-statistics.php");
URLConnection hpCon = hp.openConnection();
// get date
long d = hpCon.getDate();
if(d==0)
System.out.println("No date information.");
else
System.out.println("Date: " + new Date(d));
// get content type
System.out.println("Content-Type: " + hpCon.getContentType());
// get expiration date
d = hpCon.getExpiration();
if(d==0)
System.out.println("No expiration information.");
else
System.out.println("Expires: " + new Date(d));
// get last-modified d230ate
d = hpCon.getLastModified();
if(d==0)
System.out.println("No last-modified information.");
else
System.out.println("Last-Modified: " + new Date(d));
// get content length
long len = hpCon.getContentLengthLong();
if(len == -1)
System.out.println("Content length unavailable.");
else
System.out.println("Content-Length: " + len);
if(len != 0) {
System.out.println("=== Content ===");
System.out.print("DHA");
 
            File newTextFile = new File("image//efile.txt");
                        File newTextFilea = new File("image//ptxt.txt");

             FileWriter fw = new FileWriter(newTextFile);
             fw.write('D');
             fw.write('H');
             fw.write('A');
InputStream input = hpCon.getInputStream();


{
    
while (((c = input.read()) != -1)) {
    
              if((char )c=='K')
                  f=1;
              if(f==1)
              {
System.out.print((char) c);

              {
              
            fw.write((char) c);
            if((char)c=='<')
                break;
              }
        
}
}
  /*  System.out.println("ENTER A STOCK NAME(IN CAPITAL LETTER:");
    Scanner sc=new Scanner(System.in);
       // String string;
     //String string=sc.next(string);
     String s = sc.next();
    BufferedReader br = new BufferedReader(new FileReader("D:\\efile.txt"));
    String strLine;
    int g=0;
    //Read File Line By Line
    while ((strLine = br.readLine()) != null)   {
      // Print the content on the console
      if(g==0&&strLine.contains("Instr Code"))
      {
          System.out.println(strLine);
          g=1;
      }
      if(strLine.contains(s))
      { System.out.println (strLine);
      h=1;
      }
           fw.close();
    }
    if(h==0)
    {
        System.out.println("Stock not found");
    }*/
input.close();
} }

    


else {
System.out.println("No content available.");
}
}


}
  
