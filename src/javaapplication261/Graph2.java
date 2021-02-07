/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication261;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Graph2{
   
    String StockName;
    String filename;
    
    Graph2(String st)
    {
       StockName=st;
        System.out.println(StockName+"fgcvhbjnmnb");
        filename="image\\"+StockName+".txt";
    }
    Graph2()
    {
    }
    
    
            PrintWriter out = null;
  BufferedWriter bw = null;
  FileWriter fw = null;
  String f;
   String sourceFileName ;
  //String StockName;
 void Graph(String s) throws FileNotFoundException, IOException
  {
      String stock;
     // stock  = graph();
       
        //stock=gp.dd();
       // System.out.println(stock+"====ghhjkljkhgf=====");
     // StockName=stockname;
      sourceFileName =s;
      
     
     f=filename;
                
                    fw = new FileWriter(filename, true); // File writing/opening failed at some stage.
             
  bw = new BufferedWriter(fw);
   BufferedReader br = null;
  
  out = new PrintWriter(bw);
    br = new BufferedReader(new FileReader( sourceFileName ));
       String line;
          while ((line = br.readLine()) != null) {
              if(line.contains(StockName)){
                  br.readLine();
         out.println(line);
  if (out != null) {
      out.close(); // Will close bw and fw too
  } else if( bw != null ){
      try {
          bw.close(); // Will close fw too
      } catch (IOException ex) {
          Logger.getLogger(Graph2.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  else if( fw != null ){
      try {
          fw.close();
      } catch (IOException ex) {
          Logger.getLogger(Graph2.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
  else{
      
  } 
              }
          }
  }

          
  
    public static void main(String[] args) throws IOException {
            Scanner Scanner = new Scanner (System.in);

    System.out.println("Enter The Stock name ");
    //String stock = Scanner.nextLine();
    String stock;
        //String filename="image\\"+stock+".txt";
        Graph2 f=new Graph2();
        //graph g=new graph();
       
        //stock=g.dd();
        //System.out.println(stock+"=========");
        //String filename="image\\"+stock+".txt";
        
//        launch(args);
        f.Graph("image//1file.txt");
       f.Graph("image//2file.txt");
        f.Graph("image//3file.txt");
        f.Graph("image//4file.txt");
        f.Graph("image//5file.txt");
        f.Graph("image//6file.txt");
         f.Graph("image//7file.txt");
        /* f.Graph(filename, stock,"image//8file.txt");
         f.Graph(filename, stock,"image//9file.txt");
         f.Graph(filename, stock,"image//10file.txt");
         f.Graph(filename, stock,"image//11file.txt");
         f.Graph(filename, stock,"image//12file.txt");
          f.Graph(filename, stock,"image//13file.txt");
           f.Graph(filename, stock,"image//14file.txt");
           f.Graph(filename, stock,"image//15file.txt");
         f.Graph(filename, stock,"image//16file.txt");
           // f.Graph(filename, stock,"image//17file.txt");*/
        
    }

    //To change body of generated methods, choose Tools | Templates.
    }

