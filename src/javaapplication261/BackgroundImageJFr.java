/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication261;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Thread.sleep;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class BackgroundImageJFr extends JFrame 
{

    private JTextField display;
JLabel l1;
    public BackgroundImageJFr() throws InterruptedException
    {
   setTitle("...........Dhaka Stock Exchange........");
    setSize(1500,1500);
   setLocationRelativeTo(null);
   setDefaultCloseOperation(EXIT_ON_CLOSE);
    setVisible(true);
    setContentPane(new JLabel(new ImageIcon("image\\arrow_6.jpg")));
    setLayout(new FlowLayout());
     JLabel l1 = new JLabel("WELCOME TO DHAKA STOCK EXCHANGE");
        add(l1);
        setVisible(true);
        sleep(1500);
         setVisible(false);
    }

    
    public static void main(String args[]) throws InterruptedException
    {
    new BackgroundImageJFr();
    }
}