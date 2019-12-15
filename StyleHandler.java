package Controler;

import viewww.Viewww;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class StyleHandler implements ItemListener{
    
    public viewww.Viewww mt;
    
    public StyleHandler(viewww.Viewww mt){
        this.mt = mt;
    }

    @Override
        public void itemStateChanged(ItemEvent e) {
            mt.style = 0;
            if (mt.styleItems[0].isSelected()) {
                mt.style += Font.BOLD;
            }
            if (mt.styleItems[1].isSelected()) {
                mt.style += Font.ITALIC;
            }
            mt.display.setFont(new Font(mt.display.getFont().getName(),
                    mt.style, 75));
            mt.repaint();
        }
}