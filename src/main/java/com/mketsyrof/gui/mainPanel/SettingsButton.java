package com.mketsyrof.gui.mainPanel;

import com.mketsyrof.gui.settingsPanel.SettingsPanel;
import com.mketsyrof.gui.util.FontConfig;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SettingsButton extends JButton {
   public SettingsButton() {
      super();
      this.setText("Settings");
      this.setMargin(new Insets(0, 5, 0, 5));
      this.setFont(this.getFont().deriveFont(FontConfig.FONT_SIZE));
      this.setBackground(Color.BLACK);
      this.setForeground(Color.WHITE);
      this.setFocusable(false);

      JFrame settingsFrame = new JFrame();
      JPanel settingsPanel = new SettingsPanel(settingsFrame);

      settingsFrame.addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
            settingsFrame.setVisible(false);
         }
      });
      settingsFrame.setTitle("Earnings settings");
      settingsFrame.setContentPane(settingsPanel);
      settingsFrame.setSize(280, 230);
      settingsFrame.setResizable(false);

      this.addActionListener(e -> settingsFrame.setVisible(true));
   }
}
