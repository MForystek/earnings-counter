package com.mketsyrof.gui.mainPanel;

import com.mketsyrof.gui.util.FontConfig;
import com.mketsyrof.logic.EarningsService;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.Insets;

public class ResetButton extends JButton {
   public ResetButton(EarningsService earningsService) {
      super();
      this.setText("Reset");
      this.setMargin(new Insets(0, 5, 0, 5));
      this.setFont(this.getFont().deriveFont(FontConfig.FONT_SIZE));
      this.setBackground(Color.BLACK);
      this.setForeground(Color.WHITE);
      this.setFocusable(false);
      this.addActionListener(e -> earningsService.reset());
   }
}
