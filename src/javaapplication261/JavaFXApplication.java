/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication261;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.scene.AccessibleRole.MENU;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static com.sun.glass.ui.Cursor.setVisible;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;
import javafx.scene.effect.BlendMode;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.StageStyle;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.net.*;
import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import javafx.scene.image.ImageView;



/**
 *
 * @author JOHN
 */
public class JavaFXApplication extends Application {

    public static void main(String[] args) {

        Application.launch(args);
    }

    public void start(Stage primaryStage) throws Exception  {
        BackgroundIma i=new BackgroundIma();
        
         UCD.main(null);
        primaryStage.setTitle("PrimaryStage");

        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 1400, 670);

       
       
       
        Text text = new Text(25, 28, "       ...........DHAKA STOCK EXCHANGE...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        Text text1 = new Text(5, 130, "                           MENU SELECTION DEMO                                        |");
        text1.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text1.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

        Text text2 = new Text(5, 148, "                                        ==============================                                    ");
        text2.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text2.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 20));

        Text text3 = new Text(5, 179, "                                       Options:                                             |");
        text3.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text3.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));

        Button b = new Button("  1...  ");
        b.setLayoutX(200);
        b.setLayoutY(205);
     
     
       
      

        Text text4 = new Text(235, 223, "   Know About Today's Top 10s.....................................................         |");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(20));
       

        Button b1 = new Button("  2...  ");
        b1.setLayoutX(200);
        b1.setLayoutY(260);

        Text text5 = new Text(235, 280, "   Know About Any Specific Stock..................................................         |");
        text5.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text5.setFont(new Font(20));
        Button b2 = new Button("  3...  ");

        b2.setLayoutX(200);
        b2.setLayoutY(321);
        Text text6 = new Text(235, 339, "   Monitor All  Stock's  GRAPH of Today Based on different Topics.................         |");
        text6.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text6.setFont(new Font(20));
        Button b3 = new Button("  4...  ");

        b3.setLayoutX(200);
        b3.setLayoutY(376);
        Text text7 = new Text(235, 397, "   Monitor Any Specific Stock's GRAPH of one month Based on Different Topics.......        |");
        text7.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text7.setFont(new Font(20));

        
          Button b4 = new Button("  5...  ");

        b4.setLayoutX(200);
        b4.setLayoutY(436);
        Text text8 = new Text(235, 455, "   Comparing TWO Stock's  Tread GRAPH of one month................................         |");
        text8.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text8.setFont(new Font(20));
        
        
Button b5 = new Button("     EXIT     ");

        b5.setLayoutX(650);
        b5.setLayoutY(515);
        b5.setMaxHeight(50);
        b5.setMinHeight(50);

        //reflection = new Reflection();
        //reflection.setFraction(1.0);
         ImageView img=new ImageView(new Image(getClass().getResourceAsStream("image.jpg"),1400,670,true,true));
        img.setFitHeight(670);
        img.setFitWidth(1400);
        pane.getChildren().add(img);
       
        b.setOnAction(even -> {
            new page1();
          
        });
        
          b1.setOnAction(even -> {
            try {
                new page2();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
          
           
            
        });
        b2.setOnAction(even -> {
            System.out.println("dgfhjklh");
            new page3();
          
           
            
        });
       b3.setOnAction(even -> {
            System.out.println("dgfhjklh");
            try {
                new page4();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
          
           
            
        });
      
          
        //pane.getChildren().add(b);
        primaryStage.setScene(scene);
        primaryStage.show();
        pane.getChildren().addAll(b,b1,b2,b3,b4,text, text1, text2, text3,text4, text5, text6,text7,text8);

        //reflection = new Reflection();
        //reflection.setFraction(1.0);
        
    }
    // pane.getStylesheets().add("hello.css");

}

class page1{
    page1()
    {
        Stage subStage = new Stage();
        subStage.setTitle("New Stage");

                subStage.setTitle("PrimaryStage");

        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 1400, 670);

       
       
       
        Text text = new Text(25, 28, "       ...........LIST OF TOP TENS...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        Text text1 = new Text(5, 130, "                           MENU SELECTION DEMO                                        |");
        text1.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text1.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

        Text text2 = new Text(5, 148, "                                        ==============================                                    ");
        text2.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text2.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 20));

        Text text3 = new Text(5, 179, "                                       Options:                                             |");
        text3.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text3.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));

        Button b = new Button("  1...  ");
        b.setLayoutX(200);
        b.setLayoutY(205);
     
     
       
      

        Text text4 = new Text(235, 223, "   TOP 10 GAINERS (Based on Open Price and Last Trade Price).....................................................         |");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(20));
       

        Button b1 = new Button("  2...  ");
        b1.setLayoutX(200);
        b1.setLayoutY(260);

        Text text5 = new Text(235, 280, "   TOP 10 LOSERS (Based on Open Price and Last Trade Price)..................................................         |");
        text5.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text5.setFont(new Font(20));
        Button b2 = new Button("  3...  ");

        b2.setLayoutX(200);
        b2.setLayoutY(321);
        Text text6 = new Text(235, 339, "   TOP 10 GAINERS (Based on YCP and Close Price)..............................         |");
        text6.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text6.setFont(new Font(20));
        Button b3 = new Button("  4...  ");

        b3.setLayoutX(200);
        b3.setLayoutY(376);
        Text text7 = new Text(235, 397, "   TOP 10 LOSERS (Based on YCP and Close Price)................................        |");
        text7.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text7.setFont(new Font(20));

        
        
Button b5 = new Button("     EXIT     ");

        b5.setLayoutX(650);
        b5.setLayoutY(515);
        b5.setMaxHeight(50);
        b5.setMinHeight(50);

        //reflection = new Reflection();
        //reflection.setFraction(1.0);
         ImageView img=new ImageView(new Image(getClass().getResourceAsStream("stock-market-graph-icons-with-arrows-Download-Royalty-free-Vector-File-EPS-193683.jpg"),1400,670,true,true));
        img.setFitHeight(670);
        img.setFitWidth(1400);
        pane.getChildren().add(img);
       
        b.setOnAction(even -> {
            try {
                new BackgroundImageJFr();
            } catch (InterruptedException ex) {
                Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                new gainer1();
            } catch (IOException ex) {
                Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        
        b1.setOnAction(even -> {
            try {
                new looser1();
            } catch (IOException ex) {
                Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        b2.setOnAction(even -> {
            try {
                new gainer2();
            } catch (IOException ex) {
                Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        
        b3.setOnAction(even -> {
            try {
                new looser2();
            } catch (IOException ex) {
                Logger.getLogger(page1.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        
        
        //pane.getChildren().add(b);
        subStage.setScene(scene);
        subStage.show();
        pane.getChildren().addAll(b,b1,b2,b3,text, text1, text2, text3,text4, text5, text6,text7);

        //reflection = new Reflection();
        //reflection.setFraction(1.0);
        
    }
    // pane.getStylesheets().add("hello.css");
class gainer1
{
    gainer1() throws IOException
    {
         Stage subStage = new Stage();
        subStage.setTitle("New Stage");

        FlowPane root = new FlowPane();
        //root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 1400, 670);
        
        //imazxcvbnges.jpg

        //    root.getChildren().add(new Button("New Stage"));
        subStage.setScene(scene);
        subStage.show();
       FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("image\\efile.txt");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(StageApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine = null;



//Read File Line By Line
 //if(strLine.contains("TOP 10 GAINERS (Based on Open Price"))

while ((strLine = br.readLine()) != null)   {
  // Print the content on the console
   if(strLine.contains("TOP 10 GAINERS (Based on Open Price"))
   {
                
Text text6=new Text(25,225,"                TOP 10 GAINERS (Based on Open Price)\n");
root.getChildren().addAll(text6);
text6.setFill(Color.PURPLE);
                //text6.setBlendMode(BlendMode.COLOR_BURN);
                text6.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));
                

       while ((strLine = br.readLine()) != null) 
       {
            if(strLine.contains("TOP 10 GAINERS (Based on YCP and Close Price)"))
            return;
           Text text7 = new Text(25, 225, strLine);
                text7.setFill(Color.INDIGO);
                //text7.setBlendMode(BlendMode.COLOR_BURN);
                text7.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));
                
       root.getChildren().addAll(text7);
       }
      // root.getChildren().add(text6);
   }
   
    }
  /* ImageView img=new ImageView(new Image(getClass().getResourceAsStream("imazxcvbnges.jpg"),1400,670,true,true));
        img.setFitHeight(670);
        img.setFitWidth(1400);
        root.getChildren().add(img);*/
       
    }


    }
}
class gainer2
{
    gainer2() throws IOException
    {
         Stage subStage = new Stage();
        subStage.setTitle("New Stage");

        FlowPane root = new FlowPane();
        //root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 1400, 670);
        
        //imazxcvbnges.jpg

        //    root.getChildren().add(new Button("New Stage"));
        subStage.setScene(scene);
        subStage.show();
       FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("image\\efile.txt");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(StageApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine = null;



//Read File Line By Line
 //if(strLine.contains("TOP 10 GAINERS (Based on Open Price"))

while ((strLine = br.readLine()) != null)   {
  // Print the content on the console
   if(strLine.contains("TOP 10 GAINERS (Based on YCP and Close Price)"))
   {
                
Text text6=new Text(25,225,"                 TOP 10 GAINERS (Based on YCP and Close Price)\n");
root.getChildren().addAll(text6);
text6.setFill(Color.PURPLE);
                //text6.setBlendMode(BlendMode.COLOR_BURN);
                text6.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));
                

       while ((strLine = br.readLine()) != null) 
       {
            if(strLine.contains("TOP 10 LOSERS (Based on Open Price and Last Trade Price)"))
            return;
           Text text7 = new Text(25, 225, strLine);
                text7.setFill(Color.INDIGO);
                //text7.setBlendMode(BlendMode.COLOR_BURN);
                text7.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));
                
       root.getChildren().addAll(text7);
       }
      // root.getChildren().add(text6);
   }
   
    }
       
    }


    }
class looser2
{
    looser2() throws IOException
    {
         Stage subStage = new Stage();
        subStage.setTitle("New Stage");

        FlowPane root = new FlowPane();
        //root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 1400, 670);
        
        //imazxcvbnges.jpg

        //    root.getChildren().add(new Button("New Stage"));
        subStage.setScene(scene);
        subStage.show();
       FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("image\\efile.txt");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(StageApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine = null;



//Read File Line By Line
 //if(strLine.contains("TOP 10 GAINERS (Based on Open Price"))

while ((strLine = br.readLine()) != null)   {
  // Print the content on the console
   if(strLine.contains("TOP 10 LOSERS (Based on YCP and Close Price)"))
   {
                
Text text6=new Text(25,225,"            TOP 10 LOSERS (Based on YCP and Close Price)\n");
root.getChildren().addAll(text6);
text6.setFill(Color.PURPLE);
                //text6.setBlendMode(BlendMode.COLOR_BURN);
                text6.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));
                

       while ((strLine = br.readLine()) != null) 
       {
            if(strLine.contains("Note:"))
            return;
           Text text7 = new Text(25, 225, strLine);
                text7.setFill(Color.INDIGO);
                //text7.setBlendMode(BlendMode.COLOR_BURN);
                text7.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));
                
       root.getChildren().addAll(text7);
       }
      // root.getChildren().add(text6);
   }
   
    }
       
    }


    }


class looser1
{
    looser1() throws IOException
    {
         Stage subStage = new Stage();
        subStage.setTitle("New Stage");

        FlowPane root = new FlowPane();
        //root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 1400, 670);
        
        //imazxcvbnges.jpg

        //    root.getChildren().add(new Button("New Stage"));
        subStage.setScene(scene);
        subStage.show();
       FileInputStream fstream = null;
        try {
            fstream = new FileInputStream("image\\efile.txt");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(StageApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(fstream));

        String strLine = null;



//Read File Line By Line
 //if(strLine.contains("TOP 10 GAINERS (Based on Open Price"))

while ((strLine = br.readLine()) != null)   {
  // Print the content on the console
   if(strLine.contains("TOP 10 LOSERS (Based on Open Price and Last Trade Price)"))
   {
                
Text text6=new Text(25,225,"        TOP 10 LOSERS (Based on Open Price and Last Trade Price)\n");
root.getChildren().addAll(text6);
text6.setFill(Color.PURPLE);
                //text6.setBlendMode(BlendMode.COLOR_BURN);
                text6.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));
                

       while ((strLine = br.readLine()) != null) 
       {
            if(strLine.contains("TOP 10 LOSERS (Based on YCP and Close Price)"))
            return;
           Text text7 = new Text(25, 225, strLine);
                text7.setFill(Color.INDIGO);
                //text7.setBlendMode(BlendMode.COLOR_BURN);
                text7.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));
                
       root.getChildren().addAll(text7);
       }
      // root.getChildren().add(text6);
   }
   
    }
       
    }


    }

class page2{
      page2() throws IOException
    {
         Stage subStage = new Stage();
        subStage.setTitle("New Stage");

        AnchorPane pane = new AnchorPane();
        //root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1400, 670);
        
        //imazxcvbnges.jpg

        //    root.getChildren().add(new Button("New Stage"));
        subStage.setScene(scene);
        subStage.show();
        
          Text text = new Text(25, 28, "  ...........Know About Any Specific Stock...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        TextField tex=new TextField();
       tex.setMaxSize(250,40);
       tex.setMinSize(250,40);
       tex.setLayoutX(900);
       tex.setLayoutY(120);
     
        Text text4 = new Text(5, 150, "    Enter The Name of Any Specific Stock(IN CAPITAL LETTER)........");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(30));
      
       

        Button b1 = new Button("  Enter ");
        b1.setLayoutX(1155);
        b1.setLayoutY(120);
        b1.setPrefHeight(40);
        b1.setPrefWidth(100);

        pane.getChildren().addAll(text,text4,b1,tex);
           b1.setOnAction((event) -> {
           Stock sto=new Stock(tex.getText());
            try {
               new BackgroundImageJFra();
                sto.stockfunc();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                 Logger.getLogger(page2.class.getName()).log(Level.SEVERE, null, ex);
             }
       });
     
         
       
  
    }}
class page4{
      page4() throws IOException
    {
         Stage subStage = new Stage();
        subStage.setTitle("New Stage");

        AnchorPane pane = new AnchorPane();
        //root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(pane, 1400, 670);
        
        //imazxcvbnges.jpg

        //    root.getChildren().add(new Button("New Stage"));
        subStage.setScene(scene);
        subStage.show();
        
          Text text = new Text(25, 28, "  ...........Graph of Any Specific Stock Based on Tread OF One Month...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        TextField tex=new TextField();
       tex.setMaxSize(250,40);
       tex.setMinSize(250,40);
       tex.setLayoutX(900);
       tex.setLayoutY(120);
     
        Text text4 = new Text(5, 150, "       Enter The Name of Any Specific Stock(IN CAPITAL LETTER)........");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(30));
      
       

        Button b1 = new Button("  Enter ");
        b1.setLayoutX(1155);
        b1.setLayoutY(120);
        b1.setPrefHeight(40);
        b1.setPrefWidth(100);

        pane.getChildren().addAll(text,text4,b1,tex);
            b1.setOnAction((event) -> {
            try {
                Graph2 r=new Graph2(tex.getText());
               r.Graph("image//1file.txt");
       r.Graph("image//2file.txt");
        r.Graph("image//3file.txt");
        r.Graph("image//4file.txt");
        r.Graph("image//5file.txt");
        r.Graph("image//6file.txt");
         r.Graph("image//7file.txt");
        
                graph f=new graph(tex.getText());
                f.ss();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
     
    }}
class page
{   public String s;
        page(String st)
    {   s=st;
        Stage subStage = new Stage();
        subStage.setTitle("New Stage");

                subStage.setTitle("PrimaryStage");

        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 1400, 670);

       subStage.setScene(scene);
        subStage.show();

       
       
        Text text = new Text(25, 28, " ...........Graph  Based on Tread Of a Stock Of A Month...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        Text text1 = new Text(5, 130, "                           MENU SELECTION DEMO                                        |");
        text1.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text1.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

        Text text2 = new Text(5, 148, "                                        ==============================                                    ");
        text2.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text2.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 20));

        Text text3 = new Text(5, 179, "                                       Options:                                             |");
        text3.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text3.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));

        Button b = new Button("  1...  ");
        b.setLayoutX(200);
        b.setLayoutY(205);
     
     
       
      

        Text text4 = new Text(235, 223, "   Graph of One  Month in basis of OPENING PRIZE)....................................................         |");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(20));
       

        Button b1 = new Button("  2...  ");
        b1.setLayoutX(200);
        b1.setLayoutY(260);

        Text text5 = new Text(235, 280, "  Graph of One  Month in basis of CLOSING PRIZE)..................................................         |");
        text5.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text5.setFont(new Font(20));
        Button b2 = new Button("  3...  ");

        b2.setLayoutX(200);
        b2.setLayoutY(321);
        Text text6 = new Text(235, 339, " Graph of One Month in basis of TREAD ).............................         |");
        text6.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text6.setFont(new Font(20));
        Button b3 = new Button("  4...  ");

        b3.setLayoutX(200);
        b3.setLayoutY(376);
        Text text7 = new Text(235, 397, " Graph of One Month in basis of Value(Mn) )................................        |");
        text7.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text7.setFont(new Font(20));
        
        
         Button b4 = new Button("  4...  ");
        b4.setLayoutX(200);
        b4.setLayoutY(431);
        Text text8 = new Text(235, 455, " Graph of one Month in basis of HIGH prize )................................        |");
        text8.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text8.setFont(new Font(20));

        
           Button b5 = new Button("  5...  ");
        b5.setLayoutX(200);
        b5.setLayoutY(489);
        Text text9 = new Text(235, 513, " Graph of One Month in basis of LOW prize )................................        |");
        text9.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text9.setFont(new Font(20));

      
/*Button b5 = new Button("     EXIT     ");

        b5.setLayoutX(650);
        b5.setLayoutY(515);
        b5.setMaxHeight(50);
        b5.setMinHeight(50);
*/
        //reflection = new Reflection();
        //reflection.setFraction(1.0);
       /*  ImageView img=new ImageView(new Image(getClass().getResourceAsStream("stock-market-graph-icons-with-arrows-Download-Royalty-free-Vector-File-EPS-193683.jpg"),1400,670,true,true));
        img.setFitHeight(670);
        img.setFitWidth(1400);
        pane.getChildren().add(img);
       */
        
         
       
       b.setOnAction((event) -> {
            try {
                System.out.println(s+"drftgyhjnkm,dxfcgvhbjnkm");
                Graph2 f=new Graph2(s);
                 f.Graph("image//1file.txt");
       f.Graph("image//2file.txt");
        f.Graph("image//3file.txt");
        f.Graph("image//4file.txt");
        f.Graph("image//5file.txt");
        f.Graph("image//6file.txt");
         f.Graph("image//7file.txt");
         f.Graph("image//8file.txt");
         f.Graph("image//9file.txt");
         f.Graph("image//10file.txt");
         f.Graph("image//11file.txt");
         f.Graph("image//12file.txt");
          f.Graph("image//13file.txt");
           f.Graph("image//14file.txt");
           f.Graph("image//15file.txt");
         f.Graph("image//16file.txt");
            f.Graph("image//17file.txt");
        f.Graph("image//18file.txt");
        f.Graph("image//19file.txt");
        f.Graph("image//20file.txt");
        f.Graph("image//21file.txt");
     
                graph r=new graph(s);
                r.ss();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
      
            
/*          b1.setOnAction((event) -> {
            try {
                Graph2 f=new Graph2(s);
                 f.Graph("image//1file.txt");
       f.Graph("image//2file.txt");
        f.Graph("image//3file.txt");
        f.Graph("image//4file.txt");
        f.Graph("image//5file.txt");
        f.Graph("image//6file.txt");
         f.Graph("image//7file.txt");
         f.Graph("image//8file.txt");
         f.Graph("image//9file.txt");
         f.Graph("image//10file.txt");
         f.Graph("image//11file.txt");
         f.Graph("image//12file.txt");
          f.Graph("image//13file.txt");
           f.Graph("image//14file.txt");
           f.Graph("image//15file.txt");
         f.Graph("image//16file.txt");
            f.Graph("image//17file.txt");
        f.Graph("image//18file.txt");
        f.Graph("image//19file.txt");
        f.Graph("image//20file.txt");
        f.Graph("image//21file.txt");
     
                graph2 r=new graph2(s);
                r.ss();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
      
            
       b2.setOnAction((event) -> {
            try {
                Graph2 f=new Graph2(s);
                 f.Graph("image//1file.txt");
       f.Graph("image//2file.txt");
        f.Graph("image//3file.txt");
        f.Graph("image//4file.txt");
        f.Graph("image//5file.txt");
        f.Graph("image//6file.txt");
         f.Graph("image//7file.txt");
         f.Graph("image//8file.txt");
         f.Graph("image//9file.txt");
         f.Graph("image//10file.txt");
         f.Graph("image//11file.txt");
         f.Graph("image//12file.txt");
          f.Graph("image//13file.txt");
           f.Graph("image//14file.txt");
           f.Graph("image//15file.txt");
         f.Graph("image//16file.txt");
            f.Graph("image//17file.txt");
        f.Graph("image//18file.txt");
        f.Graph("image//19file.txt");
        f.Graph("image//20file.txt");
        f.Graph("image//21file.txt");
     
                graph3 r=new graph3(s);
                r.ss();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
      
              b3.setOnAction((event) -> {
            try {
                Graph2 f=new Graph2(s);
                 f.Graph("image//1file.txt");
       f.Graph("image//2file.txt");
        f.Graph("image//3file.txt");
        f.Graph("image//4file.txt");
        f.Graph("image//5file.txt");
        f.Graph("image//6file.txt");
         f.Graph("image//7file.txt");
         f.Graph("image//8file.txt");
         f.Graph("image//9file.txt");
         f.Graph("image//10file.txt");
         f.Graph("image//11file.txt");
         f.Graph("image//12file.txt");
          f.Graph("image//13file.txt");
           f.Graph("image//14file.txt");
           f.Graph("image//15file.txt");
         f.Graph("image//16file.txt");
            f.Graph("image//17file.txt");
        f.Graph("image//18file.txt");
        f.Graph("image//19file.txt");
        f.Graph("image//20file.txt");
        f.Graph("image//21file.txt");
     
                graph4 r=new graph4(s);
                r.ss();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
        b4.setOnAction((event) -> {
            try {
                Graph2 f=new Graph2(s);
                 f.Graph("image//1file.txt");
       f.Graph("image//2file.txt");
        f.Graph("image//3file.txt");
        f.Graph("image//4file.txt");
        f.Graph("image//5file.txt");
        f.Graph("image//6file.txt");
         f.Graph("image//7file.txt");
         f.Graph("image//8file.txt");
         f.Graph("image//9file.txt");
         f.Graph("image//10file.txt");
         f.Graph("image//11file.txt");
         f.Graph("image//12file.txt");
          f.Graph("image//13file.txt");
           f.Graph("image//14file.txt");
           f.Graph("image//15file.txt");
         f.Graph("image//16file.txt");
            f.Graph("image//17file.txt");
        f.Graph("image//18file.txt");
        f.Graph("image//19file.txt");
        f.Graph("image//20file.txt");
        f.Graph("image//21file.txt");
     
                graph5 r=new graph5(s);
                r.ss();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
          b5.setOnAction((event) -> {
            try {
                Graph2 f=new Graph2(s);
                 f.Graph("image//1file.txt");
       f.Graph("image//2file.txt");
        f.Graph("image//3file.txt");
        f.Graph("image//4file.txt");
        f.Graph("image//5file.txt");
        f.Graph("image//6file.txt");
         f.Graph("image//7file.txt");
         f.Graph("image//8file.txt");
         f.Graph("image//9file.txt");
         f.Graph("image//10file.txt");
         f.Graph("image//11file.txt");
         f.Graph("image//12file.txt");
          f.Graph("image//13file.txt");
           f.Graph("image//14file.txt");
           f.Graph("image//15file.txt");
         f.Graph("image//16file.txt");
            f.Graph("image//17file.txt");
        f.Graph("image//18file.txt");
        f.Graph("image//19file.txt");
        f.Graph("image//20file.txt");
        f.Graph("image//21file.txt");
     
                graph6 r=new graph6(s);
                r.ss();
            } catch (IOException ex) {
                Logger.getLogger(JavaFXApplication.class.getName()).log(Level.SEVERE, null, ex);
            }
                });
      
            
     
      
            */
     
            
     
     
        
        //pane.getChildren().add(b);
        subStage.setScene(scene);
        subStage.show();
      
        pane.getChildren().addAll(b,text, text1, text2, text3,text4);

    }
        
    
}


class graph extends Application {
    String StockName;
    
    graph(String s) 
    {
        StockName=s;
        System.out.println(StockName);
    }
   String graph()
    {
         return StockName;
        
    }
    public String dd()
    {
        return StockName;
    }
     public void ss() throws FileNotFoundException, IOException{
        //  String str[] = new String[225];
        Graph2 p=new Graph2();
        
        // p.main(null);
        //  System.out.println("please ensure STOCK name:\n");
          //Scanner Scanner = new Scanner (System.in);
//String StockName = Scanner.nextLine();
         // System.out.println(StockName);
        double d[];
        int j = 0;
        int a[] = null;
        double ab[] = null;
        
              BufferedReader br1 = null;
        String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!
        String sCurrentLine;
        br1 = new BufferedReader(new FileReader("image\\"+StockName+".txt"));
        int i = 0;
        double[] db = new double[250];
        while ((sCurrentLine = br1.readLine()) != null) {
             String[] arr = sCurrentLine.split("\\s+");
            //if (i > 0) {
                db[i] = Double.parseDouble(arr[1]);
          //      str[i] = arr[0];
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
      

        stagenew.setTitle("DHAKA STOCK EXCHANGE");
        //defining the axes
        final NumberAxis x = new NumberAxis();
        final NumberAxis y = new NumberAxis();
        x.setLabel("Opening prize  monitoring of December of "+StockName);
        //creating the chart
        final LineChart<Number,Number> Chart = 
                new LineChart<Number,Number>(x,y);
                
        Chart.setTitle("Stock Monitoring, 2016");
        //defining a series
        XYChart.Series seriesnew = new XYChart.Series();
        seriesnew.setName(StockName);
        //populating the series with data
        for(int k=0;k<i;k++){
            
        
        seriesnew.getData().add(new XYChart.Data(k+1, mat[k]));
        }
        
        Scene scenenew  = new Scene(Chart,1300,1000);
        Chart.getData().add(seriesnew);
       
        stagenew.setScene(scenenew);
        stagenew.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}


class graph1 extends Application {
    String StockName;
    
    graph1(String s) 
    {
        StockName=s;
        System.out.println(StockName);
    }
   String graph()
    {
         return StockName;
        
    }
    public String dd()
    {
        return StockName;
    }
     public void ss() throws FileNotFoundException, IOException{
        //  String str[] = new String[225];
        Graph2 p=new Graph2();
        
        // p.main(null);
        //  System.out.println("please ensure STOCK name:\n");
          //Scanner Scanner = new Scanner (System.in);
//String StockName = Scanner.nextLine();
         // System.out.println(StockName);
        double d[];
        int j = 0;
        int a[] = null;
        double ab[] = null;
        
              BufferedReader br1 = null;
        String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!
        String sCurrentLine;
        br1 = new BufferedReader(new FileReader("image\\"+StockName+".txt"));
        int i = 0;
        double[] db = new double[250];
        while ((sCurrentLine = br1.readLine()) != null) {
             String[] arr = sCurrentLine.split("\\s+");
            //if (i > 0) {
                db[i] = Double.parseDouble(arr[6]);
          //      str[i] = arr[0];
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
      

        stagenew.setTitle("DHAKA STOCK EXCHANGE");
        //defining the axes
        final NumberAxis x = new NumberAxis();
        final NumberAxis y = new NumberAxis();
        x.setLabel("Opening prize  monitoring of December of "+StockName);
        //creating the chart
        final LineChart<Number,Number> Chart = 
                new LineChart<Number,Number>(x,y);
                
        Chart.setTitle("Stock Monitoring, 2016");
        //defining a series
        XYChart.Series seriesnew = new XYChart.Series();
        seriesnew.setName(StockName);
        //populating the series with data
        for(int k=0;k<i;k++){
            
        
        seriesnew.getData().add(new XYChart.Data(k+1, mat[k]));
        }
        
        Scene scenenew  = new Scene(Chart,1300,1000);
        Chart.getData().add(seriesnew);
       
        stagenew.setScene(scenenew);
        stagenew.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
class graph2 extends Application {
    String StockName;
    
    graph2(String s) 
    {
        StockName=s;
        System.out.println(StockName);
    }
   String graph()
    {
         return StockName;
        
    }
    public String dd()
    {
        return StockName;
    }
     public void ss() throws FileNotFoundException, IOException{
        //  String str[] = new String[225];
        Graph2 p=new Graph2();
        
        // p.main(null);
        //  System.out.println("please ensure STOCK name:\n");
          //Scanner Scanner = new Scanner (System.in);
//String StockName = Scanner.nextLine();
         // System.out.println(StockName);
        double d[];
        int j = 0;
        int a[] = null;
        double ab[] = null;
        
              BufferedReader br1 = null;
        String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!
        String sCurrentLine;
        br1 = new BufferedReader(new FileReader("image\\"+StockName+".txt"));
        int i = 0;
        double[] db = new double[250];
        while ((sCurrentLine = br1.readLine()) != null) {
             String[] arr = sCurrentLine.split("\\s+");
            //if (i > 0) {
                db[i] = Double.parseDouble(arr[4]);
          //      str[i] = arr[0];
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
      

        stagenew.setTitle("DHAKA STOCK EXCHANGE");
        //defining the axes
        final NumberAxis x = new NumberAxis();
        final NumberAxis y = new NumberAxis();
        x.setLabel("Closing prize  monitoring of December of "+StockName);
        //creating the chart
        final LineChart<Number,Number> Chart = 
                new LineChart<Number,Number>(x,y);
                
        Chart.setTitle("Stock Monitoring, 2016");
        //defining a series
        XYChart.Series seriesnew = new XYChart.Series();
        seriesnew.setName(StockName);
        //populating the series with data
        for(int k=0;k<i;k++){
            
        
        seriesnew.getData().add(new XYChart.Data(k+1, mat[k]));
        }
        
        Scene scenenew  = new Scene(Chart,1300,1000);
        Chart.getData().add(seriesnew);
       
        stagenew.setScene(scenenew);
        stagenew.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
class graph3 extends Application {
    String StockName;
    
    graph3(String s) 
    {
        StockName=s;
        System.out.println(StockName);
    }
   String graph()
    {
         return StockName;
        
    }
    public String dd()
    {
        return StockName;
    }
     public void ss() throws FileNotFoundException, IOException{
        //  String str[] = new String[225];
        Graph2 p=new Graph2();
        
        // p.main(null);
        //  System.out.println("please ensure STOCK name:\n");
          //Scanner Scanner = new Scanner (System.in);
//String StockName = Scanner.nextLine();
         // System.out.println(StockName);
        double d[];
        int j = 0;
        int a[] = null;
        double ab[] = null;
        
              BufferedReader br1 = null;
        String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!
        String sCurrentLine;
        br1 = new BufferedReader(new FileReader("image\\"+StockName+".txt"));
        int i = 0;
        double[] db = new double[250];
        while ((sCurrentLine = br1.readLine()) != null) {
             String[] arr = sCurrentLine.split("\\s+");
            //if (i > 0) {
                db[i] = Double.parseDouble(arr[6]);
          //      str[i] = arr[0];
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
      

        stagenew.setTitle("DHAKA STOCK EXCHANGE");
        //defining the axes
        final NumberAxis x = new NumberAxis();
        final NumberAxis y = new NumberAxis();
        x.setLabel("Tread  monitoring of December of "+StockName);
        //creating the chart
        final LineChart<Number,Number> Chart = 
                new LineChart<Number,Number>(x,y);
                
        Chart.setTitle("Stock Monitoring, 2016");
        //defining a series
        XYChart.Series seriesnew = new XYChart.Series();
        seriesnew.setName(StockName);
        //populating the series with data
        for(int k=0;k<i;k++){
            
        
        seriesnew.getData().add(new XYChart.Data(k+1, mat[k]));
        }
        
        Scene scenenew  = new Scene(Chart,1300,1000);
        Chart.getData().add(seriesnew);
       
        stagenew.setScene(scenenew);
        stagenew.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

class graph4 extends Application {
    String StockName;
    
    graph4(String s) 
    {
        StockName=s;
        System.out.println(StockName);
    }
   String graph()
    {
         return StockName;
        
    }
    public String dd()
    {
        return StockName;
    }
     public void ss() throws FileNotFoundException, IOException{
        //  String str[] = new String[225];
        Graph2 p=new Graph2();
        
        // p.main(null);
        //  System.out.println("please ensure STOCK name:\n");
          //Scanner Scanner = new Scanner (System.in);
//String StockName = Scanner.nextLine();
         // System.out.println(StockName);
        double d[];
        int j = 0;
        int a[] = null;
        double ab[] = null;
        
              BufferedReader br1 = null;
        String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!
        String sCurrentLine;
        br1 = new BufferedReader(new FileReader("image\\"+StockName+".txt"));
        int i = 0;
        double[] db = new double[250];
        while ((sCurrentLine = br1.readLine()) != null) {
             String[] arr = sCurrentLine.split("\\s+");
            //if (i > 0) {
                db[i] = Double.parseDouble(arr[8]);
          //      str[i] = arr[0];
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
      

        stagenew.setTitle("DHAKA STOCK EXCHANGE");
        //defining the axes
        final NumberAxis x = new NumberAxis();
        final NumberAxis y = new NumberAxis();
        x.setLabel("Value(Mn) monitoring of December of "+StockName);
        //creating the chart
        final LineChart<Number,Number> Chart = 
                new LineChart<Number,Number>(x,y);
                
        Chart.setTitle("Stock Monitoring, 2016");
        //defining a series
        XYChart.Series seriesnew = new XYChart.Series();
        seriesnew.setName(StockName);
        //populating the series with data
        for(int k=0;k<i;k++){
            
        
        seriesnew.getData().add(new XYChart.Data(k+1, mat[k]));
        }
        
        Scene scenenew  = new Scene(Chart,1300,1000);
        Chart.getData().add(seriesnew);
       
        stagenew.setScene(scenenew);
        stagenew.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
class graph5 extends Application {
    String StockName;
    
    graph5(String s) 
    {
        StockName=s;
        System.out.println(StockName);
    }
   String graph()
    {
         return StockName;
        
    }
    public String dd()
    {
        return StockName;
    }
     public void ss() throws FileNotFoundException, IOException{
        //  String str[] = new String[225];
        Graph2 p=new Graph2();
        
        // p.main(null);
        //  System.out.println("please ensure STOCK name:\n");
          //Scanner Scanner = new Scanner (System.in);
//String StockName = Scanner.nextLine();
         // System.out.println(StockName);
        double d[];
        int j = 0;
        int a[] = null;
        double ab[] = null;
        
              BufferedReader br1 = null;
        String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!
        String sCurrentLine;
        br1 = new BufferedReader(new FileReader("image\\"+StockName+".txt"));
        int i = 0;
        double[] db = new double[250];
        while ((sCurrentLine = br1.readLine()) != null) {
             String[] arr = sCurrentLine.split("\\s+");
            //if (i > 0) {
                db[i] = Double.parseDouble(arr[2]);
          //      str[i] = arr[0];
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
      

        stagenew.setTitle("DHAKA STOCK EXCHANGE");
        //defining the axes
        final NumberAxis x = new NumberAxis();
        final NumberAxis y = new NumberAxis();
        x.setLabel("HIGH prize  monitoring of December of "+StockName);
        //creating the chart
        final LineChart<Number,Number> Chart = 
                new LineChart<Number,Number>(x,y);
                
        Chart.setTitle("Stock Monitoring, 2016");
        //defining a series
        XYChart.Series seriesnew = new XYChart.Series();
        seriesnew.setName(StockName);
        //populating the series with data
        for(int k=0;k<i;k++){
            
        
        seriesnew.getData().add(new XYChart.Data(k+1, mat[k]));
        }
        
        Scene scenenew  = new Scene(Chart,1300,1000);
        Chart.getData().add(seriesnew);
       
        stagenew.setScene(scenenew);
        stagenew.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
class graph6 extends Application {
    String StockName;
    
    graph6(String s) 
    {
        StockName=s;
        System.out.println(StockName);
    }
   String graph()
    {
         return StockName;
        
    }
    public String dd()
    {
        return StockName;
    }
     public void ss() throws FileNotFoundException, IOException{
        //  String str[] = new String[225];
        Graph2 p=new Graph2();
        
        // p.main(null);
        //  System.out.println("please ensure STOCK name:\n");
          //Scanner Scanner = new Scanner (System.in);
//String StockName = Scanner.nextLine();
         // System.out.println(StockName);
        double d[];
        int j = 0;
        int a[] = null;
        double ab[] = null;
        
              BufferedReader br1 = null;
        String[] characters = new String[1024];//just an example - you have to initialize it to be big enough to hold all the lines!
        String sCurrentLine;
        br1 = new BufferedReader(new FileReader("image\\"+StockName+".txt"));
        int i = 0;
        double[] db = new double[250];
        while ((sCurrentLine = br1.readLine()) != null) {
             String[] arr = sCurrentLine.split("\\s+");
            //if (i > 0) {
                db[i] = Double.parseDouble(arr[3]);
          //      str[i] = arr[0];
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
      

        stagenew.setTitle("DHAKA STOCK EXCHANGE");
        //defining the axes
        final NumberAxis x = new NumberAxis();
        final NumberAxis y = new NumberAxis();
        x.setLabel("LOW prize  monitoring of December of "+StockName);
        //creating the chart
        final LineChart<Number,Number> Chart = 
                new LineChart<Number,Number>(x,y);
                
        Chart.setTitle("Stock Monitoring, 2016");
        //defining a series
        XYChart.Series seriesnew = new XYChart.Series();
        seriesnew.setName(StockName);
        //populating the series with data
        for(int k=0;k<i;k++){
            
        
        seriesnew.getData().add(new XYChart.Data(k+1, mat[k]));
        }
        
        Scene scenenew  = new Scene(Chart,1300,1000);
        Chart.getData().add(seriesnew);
       
        stagenew.setScene(scenenew);
        stagenew.show();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}



class Stock {
    String s;
    Stock(String s){
        this.s=s;
    }
    public void stockfunc() throws FileNotFoundException, IOException
    {
         Stage subStage = new Stage();
        subStage.setTitle("New Stage");

        FlowPane root = new FlowPane();
        //root.setAlignment(Pos.CENTER);
        Scene scene = new Scene(root, 1500, 600);

      
        subStage.setScene(scene);
        subStage.show();
       
        int c = 0,f=0,h=0;
   
    
    BufferedReader br = new BufferedReader(new FileReader("image\\efile.txt"));
    String strLine;
    int g=0;
    //Read File Line By Line
    while ((strLine = br.readLine()) != null)   {
      // Print the content on the console
      if(g==0&&strLine.contains("Instr Code"))
      {
      
          g=1;
      }
      if(strLine.contains(s))
          
      { 
          
 Text text3 = new Text(15, 25, "Instr Code     Open     High      Low    Close   %Chg  Trade       Volume    Value(Mn)");
                    text3.setFill(Color.DARKBLUE);
                    text3.setBlendMode(BlendMode.COLOR_BURN);
                    text3.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));
 root.getChildren().add(text3);
     
                    Text text7 = new Text(15, 25, strLine);
                    text7.setFill(Color.DARKBLUE);
                    text7.setBlendMode(BlendMode.COLOR_BURN);
                    text7.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

                   
                    root.getChildren().add(text7);

       
          h = 1;
      }
           //br.close();
    }
    if(h==0)
    {
       
         Text text4 = new Text(15, 25,"Stock not found" );
                    text4.setFill(Color.DARKBLUE);
                    text4.setBlendMode(BlendMode.COLOR_BURN);
                    text4.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

                    root.getChildren().add(text4);

       
    }


    }
    
}
class page3{
    
     page3()
    {
        Stage subStage = new Stage();
        subStage.setTitle("New Stage");

                subStage.setTitle("PrimaryStage");

        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 1400, 670);

       
       subStage.setScene(scene);
        subStage.show();

       
        Text text = new Text(25, 28, " ...........Monitor All  Stock's   GRAPH of Today Based on different Topics...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        Text text1 = new Text(5, 130, "                           MENU SELECTION DEMO                                        |");
        text1.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text1.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

        Text text2 = new Text(5, 148, "                                        ==============================                                    ");
        text2.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text2.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 20));

        Text text3 = new Text(5, 179, "                                       Options:                                             |");
        text3.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text3.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));

        Button b = new Button("  1...  ");
        b.setLayoutX(200);
        b.setLayoutY(205);
     
     
       
      

        Text text4 = new Text(235, 223, "   Graph of Group A Based on Different Topics.....................................................         |");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(20));
       

        Button b1 = new Button("  2...  ");
        b1.setLayoutX(200);
        b1.setLayoutY(260);

        Text text5 = new Text(235, 280, "   Graph of Group B Based on Different Topics..................................................         |");
        text5.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text5.setFont(new Font(20));
        Button b2 = new Button("  3...  ");

        b2.setLayoutX(200);
        b2.setLayoutY(321);
        Text text6 = new Text(235, 339, "   Graph of Group N Based on Different Topics.............................         |");
        text6.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text6.setFont(new Font(20));
        Button b3 = new Button("  4...  ");

        b3.setLayoutX(200);
        b3.setLayoutY(376);
        Text text7 = new Text(235, 397, "   Graph of Group z Based on Different Topics................................        |");
        text7.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text7.setFont(new Font(20));

        
        
Button b5 = new Button("     EXIT     ");

        b5.setLayoutX(650);
        b5.setLayoutY(515);
        b5.setMaxHeight(50);
        b5.setMinHeight(50);

        //reflection = new Reflection();
        //reflection.setFraction(1.0);
         ImageView img=new ImageView(new Image(getClass().getResourceAsStream("stock-market-graph-icons-with-arrows-Download-Royalty-free-Vector-File-EPS-193683.jpg"),1400,670,true,true));
        img.setFitHeight(670);
        img.setFitWidth(1400);
        pane.getChildren().add(img);
       
        b.setOnAction(even -> {
            new groupA();
            });
        
       b1.setOnAction(even -> {
           new groupB();
            });
        b2.setOnAction(even -> {
            new groupN();
            });
        
        b3.setOnAction(even -> {
            new groupZ();
            });
        
        
        //pane.getChildren().add(b);
        subStage.setScene(scene);
        subStage.show();
   
        pane.getChildren().addAll(b,b1,b2,b3,text, text1, text2, text3,text4, text5, text6,text7);

    }
        
    
}
class groupA
{
        groupA()
    {
        Stage subStage = new Stage();
        subStage.setTitle("New Stage");

                subStage.setTitle("PrimaryStage");

        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 1400, 670);

       subStage.setScene(scene);
        subStage.show();

       
       
        Text text = new Text(25, 28, "       ...........Graph of Group A Based on Different Topics...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        Text text1 = new Text(5, 130, "                           MENU SELECTION DEMO                                        |");
        text1.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text1.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

        Text text2 = new Text(5, 148, "                                        ==============================                                    ");
        text2.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text2.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 20));

        Text text3 = new Text(5, 179, "                                       Options:                                             |");
        text3.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text3.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));

        Button b = new Button("  1...  ");
        b.setLayoutX(200);
        b.setLayoutY(205);
     
     
       
      

        Text text4 = new Text(235, 223, "   Line Chart(1) of first one third stocks of Group 'A'(in basis of OPENING PRIZE)....................................................         |");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(20));
       

        Button b1 = new Button("  2...  ");
        b1.setLayoutX(200);
        b1.setLayoutY(260);

        Text text5 = new Text(235, 280, "   Line Chart(1) of first one third stocks of Group 'A'(in basis of CLOSING PRIZE)..................................................         |");
        text5.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text5.setFont(new Font(20));
        Button b2 = new Button("  3...  ");

        b2.setLayoutX(200);
        b2.setLayoutY(321);
        Text text6 = new Text(235, 339, "   Line Chart(1) of first one third stocks of Group 'A'(in basis of TREAD ).............................         |");
        text6.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text6.setFont(new Font(20));
        Button b3 = new Button("  4...  ");

        b3.setLayoutX(200);
        b3.setLayoutY(376);
        Text text7 = new Text(235, 397, "   Line Chart(1) of first one third stocks of Group 'A'(in basis of Value(Mn) )................................        |");
        text7.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text7.setFont(new Font(20));
        
        
         Button b4 = new Button("  4...  ");
        b4.setLayoutX(200);
        b4.setLayoutY(431);
        Text text8 = new Text(235, 455, "   Line Chart(1) of first one third stocks of Group 'A'(in basis of HIGH prize )................................        |");
        text8.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text8.setFont(new Font(20));

        
           Button b5 = new Button("  5...  ");
        b5.setLayoutX(200);
        b5.setLayoutY(489);
        Text text9 = new Text(235, 513, "   Line Chart(1) of first one third stocks of Group 'A'(in basis of LOW prize )................................        |");
        text9.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text9.setFont(new Font(20));

      
/*Button b5 = new Button("     EXIT     ");

        b5.setLayoutX(650);
        b5.setLayoutY(515);
        b5.setMaxHeight(50);
        b5.setMinHeight(50);
*/
        //reflection = new Reflection();
        //reflection.setFraction(1.0);
       /*  ImageView img=new ImageView(new Image(getClass().getResourceAsStream("stock-market-graph-icons-with-arrows-Download-Royalty-free-Vector-File-EPS-193683.jpg"),1400,670,true,true));
        img.setFitHeight(670);
        img.setFitWidth(1400);
        pane.getChildren().add(img);
       */
        
         
       
       b.setOnAction(even -> {
            try {
                new Linechart01();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        b1.setOnAction(even -> {
            try {
                new Linechart02();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
         b2.setOnAction(even -> {
            try {
                new Linechart03();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
         
          b3.setOnAction(even -> {
            try {
                new Linechart04();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
        b4.setOnAction(even -> {
            try {
                new Linechart05();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
         b5.setOnAction(even -> {
            try {
                new Linechart06();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
        
        //pane.getChildren().add(b);
        subStage.setScene(scene);
        subStage.show();
      
        pane.getChildren().addAll(b,b1,b2,b3,text, text1, text2, text3,text4, text5, text6,text7,text8,text9,b4,b5);

    }
        
    
}
   class groupB
{
        groupB()
    {
        Stage subStage = new Stage();
        subStage.setTitle("New Stage");

                subStage.setTitle("PrimaryStage");

        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 1400, 670);

       subStage.setScene(scene);
        subStage.show();

       
       
        Text text = new Text(25, 28, "       ...........Graph of Group B Based on Different Topics...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        Text text1 = new Text(5, 130, "                           MENU SELECTION DEMO                                        |");
        text1.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text1.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

        Text text2 = new Text(5, 148, "                                        ==============================                                    ");
        text2.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text2.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 20));

        Text text3 = new Text(5, 179, "                                       Options:                                             |");
        text3.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text3.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));

        Button b = new Button("  1...  ");
        b.setLayoutX(200);
        b.setLayoutY(205);
     
     
       
      

        Text text4 = new Text(235, 223, "   Line Chart of first one third stocks of Group 'B'(in basis of OPENING PRIZE)....................................................         |");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(20));
       

        Button b1 = new Button("  2...  ");
        b1.setLayoutX(200);
        b1.setLayoutY(260);

        Text text5 = new Text(235, 280, "   Line Chart of first one third stocks of Group 'B'(in basis of CLOSING PRIZE)..................................................         |");
        text5.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text5.setFont(new Font(20));
        Button b2 = new Button("  3...  ");

        b2.setLayoutX(200);
        b2.setLayoutY(321);
        Text text6 = new Text(235, 339, "   Line Chart of first one third stocks of Group 'B'(in basis of TREAD ).............................         |");
        text6.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text6.setFont(new Font(20));
        Button b3 = new Button("  4...  ");

        b3.setLayoutX(200);
        b3.setLayoutY(376);
        Text text7 = new Text(235, 397, "   Line Chart of first one third stocks of Group 'B'(in basis of Value(Mn) )................................        |");
        text7.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text7.setFont(new Font(20));
        
        
         Button b4 = new Button("  4...  ");
        b4.setLayoutX(200);
        b4.setLayoutY(431);
        Text text8 = new Text(235, 455, "   Line Chart of first one third stocks of Group 'B'(in basis of HIGH prize )................................        |");
        text8.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text8.setFont(new Font(20));

        
           Button b5 = new Button("  5...  ");
        b5.setLayoutX(200);
        b5.setLayoutY(489);
        Text text9 = new Text(235, 513, "   Line Chart of first one third stocks of Group 'B'(in basis of LOW prize )................................        |");
        text9.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text9.setFont(new Font(20));

      
/*Button b5 = new Button("     EXIT     ");

        b5.setLayoutX(650);
        b5.setLayoutY(515);
        b5.setMaxHeight(50);
        b5.setMinHeight(50);
*/
        //reflection = new Reflection();
        //reflection.setFraction(1.0);
       /*  ImageView img=new ImageView(new Image(getClass().getResourceAsStream("stock-market-graph-icons-with-arrows-Download-Royalty-free-Vector-File-EPS-193683.jpg"),1400,670,true,true));
        img.setFitHeight(670);
        img.setFitWidth(1400);
        pane.getChildren().add(img);
       */
        
         
       
       b.setOnAction(even -> {
            try {
                new chart01();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        b1.setOnAction(even -> {
            try {
                new chart02();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
         b2.setOnAction(even -> {
            try {
                new chart03();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
         
          b3.setOnAction(even -> {
            try {
                new chart04();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
        b4.setOnAction(even -> {
            try {
                new chart05();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
         b5.setOnAction(even -> {
            try {
                new chart06();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
        
        //pane.getChildren().add(b);
        subStage.setScene(scene);
        subStage.show();
      
        pane.getChildren().addAll(b,b1,b2,b3,text, text1, text2, text3,text4, text5, text6,text7,text8,text9,b4,b5);

    }
        
    
}
   
 class groupN
{
        groupN()
    {
        Stage subStage = new Stage();
        subStage.setTitle("New Stage");

                subStage.setTitle("PrimaryStage");

        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 1400, 670);

       subStage.setScene(scene);
        subStage.show();

       
       
        Text text = new Text(25, 28, "       ...........Graph of Group N Based on Different Topics...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        Text text1 = new Text(5, 130, "                           MENU SELECTION DEMO                                        |");
        text1.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text1.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

        Text text2 = new Text(5, 148, "                                        ==============================                                    ");
        text2.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text2.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 20));

        Text text3 = new Text(5, 179, "                                       Options:                                             |");
        text3.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text3.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));

        Button b = new Button("  1...  ");
        b.setLayoutX(200);
        b.setLayoutY(205);
     
     
       
      

        Text text4 = new Text(235, 223, "   Line Chart of first one third stocks of Group 'N'(in basis of OPENING PRIZE)....................................................         |");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(20));
       

        Button b1 = new Button("  2...  ");
        b1.setLayoutX(200);
        b1.setLayoutY(260);

        Text text5 = new Text(235, 280, "   Line Chart of first one third stocks of Group 'N'(in basis of CLOSING PRIZE)..................................................         |");
        text5.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text5.setFont(new Font(20));
        Button b2 = new Button("  3...  ");

        b2.setLayoutX(200);
        b2.setLayoutY(321);
        Text text6 = new Text(235, 339, "   Line Chart of first one third stocks of Group 'N'(in basis of TREAD ).............................         |");
        text6.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text6.setFont(new Font(20));
        Button b3 = new Button("  4...  ");

        b3.setLayoutX(200);
        b3.setLayoutY(376);
        Text text7 = new Text(235, 397, "   Line Chart of first one third stocks of Group 'N'(in basis of Value(Mn) )................................        |");
        text7.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text7.setFont(new Font(20));
        
        
         Button b4 = new Button("  4...  ");
        b4.setLayoutX(200);
        b4.setLayoutY(431);
        Text text8 = new Text(235, 455, "   Line Chart of first one third stocks of Group 'N'(in basis of HIGH prize )................................        |");
        text8.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text8.setFont(new Font(20));

        
           Button b5 = new Button("  5...  ");
        b5.setLayoutX(200);
        b5.setLayoutY(489);
        Text text9 = new Text(235, 513, "   Line Chart of first one third stocks of Group 'N'(in basis of LOW prize )................................        |");
        text9.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text9.setFont(new Font(20));

      
/*Button b5 = new Button("     EXIT     ");

        b5.setLayoutX(650);
        b5.setLayoutY(515);
        b5.setMaxHeight(50);
        b5.setMinHeight(50);
*/
        //reflection = new Reflection();
        //reflection.setFraction(1.0);
       /*  ImageView img=new ImageView(new Image(getClass().getResourceAsStream("stock-market-graph-icons-with-arrows-Download-Royalty-free-Vector-File-EPS-193683.jpg"),1400,670,true,true));
        img.setFitHeight(670);
        img.setFitWidth(1400);
        pane.getChildren().add(img);
       */
        
         
       
       b.setOnAction(even -> {
            try {
                new char01();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        b1.setOnAction(even -> {
            try {
                new char02();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
         b2.setOnAction(even -> {
            try {
                new char03();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
         
          b3.setOnAction(even -> {
            try {
                new char04();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
        b4.setOnAction(even -> {
            try {
                new char05();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
         b5.setOnAction(even -> {
            try {
                new char06();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
        
        //pane.getChildren().add(b);
        subStage.setScene(scene);
        subStage.show();
      
        pane.getChildren().addAll(b,b1,b2,b3,text, text1, text2, text3,text4, text5, text6,text7,text8,text9,b4,b5);

    }
        
    
}
   

class groupZ
{
        groupZ()
    {
        Stage subStage = new Stage();
        subStage.setTitle("New Stage");

                subStage.setTitle("PrimaryStage");

        AnchorPane pane = new AnchorPane();
        Scene scene = new Scene(pane, 1400, 670);

       subStage.setScene(scene);
        subStage.show();

       
       
        Text text = new Text(25, 28, " ...........Graph of Group Z Based on Different Topics...........");
        text.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 40));
        Reflection reflection = new Reflection();
        reflection.setFraction(2.0);
        text.setEffect(reflection);

        Text text1 = new Text(5, 130, "                           MENU SELECTION DEMO                                        |");
        text1.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text1.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 30));

        Text text2 = new Text(5, 148, "                                        ==============================                                    ");
        text2.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text2.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 20));

        Text text3 = new Text(5, 179, "                                       Options:                                             |");
        text3.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text3.setFont(Font.font(java.awt.Font.DIALOG_INPUT, FontWeight.THIN, 25));

        Button b = new Button("  1...  ");
        b.setLayoutX(200);
        b.setLayoutY(205);
     
     
       
      

        Text text4 = new Text(235, 223, "   Line Chart of first one third stocks of Group 'Z'(in basis of OPENING PRIZE)....................................................         |");
        text4.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text4.setFont(new Font(20));
       

        Button b1 = new Button("  2...  ");
        b1.setLayoutX(200);
        b1.setLayoutY(260);

        Text text5 = new Text(235, 280, "   Line Chart of first one third stocks of Group 'Z'(in basis of CLOSING PRIZE)..................................................         |");
        text5.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text5.setFont(new Font(20));
        Button b2 = new Button("  3...  ");

        b2.setLayoutX(200);
        b2.setLayoutY(321);
        Text text6 = new Text(235, 339, "   Line Chart of first one third stocks of Group 'Z'(in basis of TREAD ).............................         |");
        text6.setFill(Color.DARKGREEN);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text6.setFont(new Font(20));
        Button b3 = new Button("  4...  ");

        b3.setLayoutX(200);
        b3.setLayoutY(376);
        Text text7 = new Text(235, 397, "   Line Chart of first one third stocks of Group 'Z'(in basis of Value(Mn) )................................        |");
        text7.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text7.setFont(new Font(20));
        
        
         Button b4 = new Button("  4...  ");
        b4.setLayoutX(200);
        b4.setLayoutY(431);
        Text text8 = new Text(235, 455, "   Line Chart of first one third stocks of Group 'Z'(in basis of HIGH prize )................................        |");
        text8.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text8.setFont(new Font(20));

        
           Button b5 = new Button("  5...  ");
        b5.setLayoutX(200);
        b5.setLayoutY(489);
        Text text9 = new Text(235, 513, "   Line Chart of first one third stocks of Group 'Z'(in basis of LOW prize )................................        |");
        text9.setFill(Color.DARKRED);
        // text7.setBlendMode(BlendMode.COLOR_BURN);
        text9.setFont(new Font(20));

      
/*Button b5 = new Button("     EXIT     ");

        b5.setLayoutX(650);
        b5.setLayoutY(515);
        b5.setMaxHeight(50);
        b5.setMinHeight(50);
*/
        //reflection = new Reflection();
        //reflection.setFraction(1.0);
       /*  ImageView img=new ImageView(new Image(getClass().getResourceAsStream("stock-market-graph-icons-with-arrows-Download-Royalty-free-Vector-File-EPS-193683.jpg"),1400,670,true,true));
        img.setFitHeight(670);
        img.setFitWidth(1400);
        pane.getChildren().add(img);
       */
        
         
       
       b.setOnAction(even -> {
            try {
                new cha01();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
        b1.setOnAction(even -> {
            try {
                new cha02();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
         b2.setOnAction(even -> {
            try {
                new cha03();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
         
          b3.setOnAction(even -> {
            try {
                new cha04();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
        b4.setOnAction(even -> {
            try {
                new cha05();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
         b5.setOnAction(even -> {
            try {
                new cha06();
            } catch (IOException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(groupA.class.getName()).log(Level.SEVERE, null, ex);
            }
            });
       
        
        //pane.getChildren().add(b);
        subStage.setScene(scene);
        subStage.show();
      
        pane.getChildren().addAll(b,b1,b2,b3,text, text1, text2, text3,text4, text5, text6,text7,text8,text9,b4,b5);

    }
        
    
}
   

