package Controler;

import viewww.Viewww;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ItemHandler implements ActionListener{
    
    public viewww.Viewww mt;
    
    public ItemHandler(viewww.Viewww mt){
        this.mt = mt;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < mt.colorItems.length; i++) {
                if (mt.colorItems[i].isSelected()) {
                    mt.display.setForeground((mt.warna[i]));
                }
            }

            for (int i = 0; i < mt.fonts.length; i++) {
                if (e.getSource() == mt.fonts[i]) {
                    mt.display.setFont(new Font(mt.fonts[i].getText(), mt.style, 50));
                }
            }
        }
    
}