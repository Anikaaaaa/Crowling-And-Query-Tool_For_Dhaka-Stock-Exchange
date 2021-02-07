package javaapplication261;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Thread.sleep;
import java.util.Scanner;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
 
 
public class chart03 extends Application {
 
    chart03() throws FileNotFoundException, IOException, InterruptedException {
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
	  String destinationFileName = "image\\bOpeb.txt";
         
      
          br = new BufferedReader(new FileReader( sourceFileName ));
    	  pw =  new PrintWriter(new FileWriter( destinationFileName ));

          String line;
          while ((line = br.readLine()) != null) {
              if(line.contains("ANWARGALV")){
                  br.readLine();
                  pw.println(line);
                  
              while ((line = br.readLine()) != null){
                  pw.println(line);
                   if(line.contains("PREMIERLEA"))
          
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
        br1 = new BufferedReader(new FileReader("image\\bOpeb.txt"));
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
       
        stagenew.setTitle("Line Chart(1) of  stocks of Group 'B'(in basis of Tread ");
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

    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
 
   
}

