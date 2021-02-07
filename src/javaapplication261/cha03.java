/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication261;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
 
 
public class cha03 extends Application {
 
    cha03() throws FileNotFoundException, IOException, InterruptedException {
          String str[] = new String[225];
        double d[];
        int j = 0;
        int a[] = null;
        double ab[] = null;
        // ab={9.00,8.00,8.00};
        
       
//        String sourceFileName;
     BufferedReader br = null;
      PrintWriter pw = null; 
 String sourceFileName = "image\\efile.txt";
	  String destinationFileName = "image\\zOpeb.txt";
         
      
          br = new BufferedReader(new FileReader( sourceFileName ));
    	  pw =  new PrintWriter(new FileWriter( destinationFileName ));

          String line;
          while ((line = br.readLine()) != null) {
              if(line.contains("ALLTEX")){
                  br.readLine();
                  pw.println(line);
                  
              while ((line = br.readLine()) != null){
                  pw.println(line);
                   if(line.contains("ZEALBANGLA"))
          
              break;
          
             // pw.println(line);
              
              
        
              }
          }
          }
          br.close();
          pw.close();
     
        BufferedReader br1 = null;
        String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!
        String sCurrentLine;
        br1 = new BufferedReader(new FileReader("image\\zOpeb.txt"));
        int i = 0;
        double[] db = new double[250];
        while ((sCurrentLine = br1.readLine()) != null) {
             String[] arr = sCurrentLine.split("\\s+");
            //if (i > 0) {
                db[i] = Double.parseDouble(arr[6]);
                str[i] = arr[0];
          //  }
            i++;

        }
        int mat[]=new int[i];
        for(int k=0;k<i;k++)
        {
            mat[k]=(int)db[k];
        }
Stage stagenew = new Stage();
        //stage.setTitle("New Stage");

        FlowPane root = new FlowPane();
  
    
        stagenew.setTitle("Line Chart of  stocks of Group 'Z'(in basis of Tread)");
        final CategoryAxis x = new CategoryAxis();
        final NumberAxis y = new NumberAxis();
        x.setLabel("Name of the stocks");       
        
        final LineChart<String,Number> Chart = 
                new LineChart<String,Number>(x,y);
                
        Chart.setTitle("Stock Monitoring(Tread), 2016");
                                
        XYChart.Series seriesnew = new XYChart.Series();
        seriesnew.setName("Compare...Think...Invest...Gain");
        for(int l=0;l<i;l++){
        seriesnew.getData().add(new XYChart.Data(str[l], mat[l]));
       }
        Scene scenenew  = new Scene(Chart,2300,650);
        Chart.getData().add(seriesnew);
       
        stagenew.setScene(scenenew);
        stagenew.show();
        
        
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}

