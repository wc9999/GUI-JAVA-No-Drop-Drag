package Controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import viewww.Viewww;
        
public class ItemHandlerPopup implements ActionListener {

    public viewww.PopupTest mz;
    
    public ItemHandlerPopup (viewww.PopupTest mz){
        this.mz = mz;
    }
    
    @Override
        public void actionPerformed(ActionEvent e) {

            for (int i = 0; i < mz.items.length; i++) {
                if (e.getSource() == mz.items[i]) {
                    mz.getContentPane().setBackground(mz.colorValues[i]);
                    mz.repaint();
                }
            }
        }
    }