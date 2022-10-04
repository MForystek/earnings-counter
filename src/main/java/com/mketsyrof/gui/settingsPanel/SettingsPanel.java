package com.mketsyrof.gui.settingsPanel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

public class SettingsPanel extends JPanel {
   private final JButton saveButton;
   private final JButton backButton;

   public SettingsPanel(JFrame settingsFrame) {
      saveButton = new SaveButton();
      saveButton.addActionListener(e -> {

      });
      backButton = new BackButton(settingsFrame);

      GridBagLayout gridBagLayout = new GridBagLayout();
      this.setLayout(gridBagLayout);
      this.setBackground(Color.BLACK);
      populateSettingsPanel();
   }

   private void populateSettingsPanel() {
      GridBagConstraints gbc = new GridBagConstraints();
      gbc.fill = GridBagConstraints.VERTICAL;

      gbc.gridx = 0;
      gbc.gridy = 0;
      this.add(saveButton, gbc);

      gbc.gridx = 2;
      this.add(backButton, gbc);
   }


}
