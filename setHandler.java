/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import viewww.Viewww;

/**
 *
 * @author User
 */
public class setHandler extends JFrame implements ActionListener {

    public viewww.Viewww st;

    public setHandler(viewww.Viewww st) {
        this.st = st;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < st.set1.length; i++) {
            if (st.set1[0].isSelected()) {
                st.setState(Frame.ICONIFIED);
            } else if (st.set1[2].isSelected()) {
                st.setState(Frame.MAXIMIZED_BOTH);
            } else if (st.set1[1].isSelected()) {
                setState(Frame.NORMAL);
            }
        }

    }

}
