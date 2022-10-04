package com.mketsyrof;

import com.mketsyrof.gui.mainPanel.MainPanel;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Main {
   private static final String TITLE = "Earnings counter";

   private static JFrame mainFrame;

   public static void main(String[] args) throws UnsupportedLookAndFeelException, ClassNotFoundException, InstantiationException, IllegalAccessException {
      //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

      JPanel mainPanel = new MainPanel();
      mainFrame = new JFrame();

      mainFrame.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            System.exit(0);
         }
      });
      setFrameSizeWithRatio(240, 12, 10);
      mainFrame.setTitle(TITLE);
      mainFrame.setContentPane(mainPanel);
      mainFrame.setResizable(false);
      mainFrame.setVisible(true);
   }

   private static void setFrameSizeWithRatio(int heightValue, int widthRatio, int heightRatio) {
      int widthValue = heightValue * widthRatio / heightRatio;
      mainFrame.setSize(widthValue, heightValue);
   }
}