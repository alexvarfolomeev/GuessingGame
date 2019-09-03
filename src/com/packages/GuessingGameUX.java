package com.packages;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.Flow;

public class GuessingGameUX extends JFrame {
  public JPanel panel;
  public JFrame myFrame;
  public JButton button;


  public GuessingGameUX () {
    myFrame = new JFrame("Alex`s GuessingGame");
    panel = new JPanel();
    button = new JButton("Click!");
    myFrame.setLayout(new FlowLayout());
    myFrame.setVisible(true);
    myFrame.add(button);
    panel.setVisible(true);
    myFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    myFrame.setSize(300,500);


  }


}