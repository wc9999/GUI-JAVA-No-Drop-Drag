/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controler;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import viewww.Viewww;

/**
 *
 * @author User
 */
public class saveHandler implements ActionListener {

    public viewww.Viewww sh,display;

    public saveHandler(viewww.Viewww sh) {
        this.sh = sh;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < sh.nyimpen.length; i++) {
            if (sh.nyimpen[2].isSelected()) {
                try {
                    BufferedWriter writer
                            = new BufferedWriter(new FileWriter("c:/Users/User/Desktop/Desktop.txt"));

                    writer.write(sh.display.getText());

                    writer.close();
                    
                } catch (IOException c) {
                    c.printStackTrace();
                }

            }
            if (sh.nyimpen[1].isSelected()) {
                try {
                    BufferedWriter writer
                            = new BufferedWriter(new FileWriter("c:/Users/User/Desktop/Desktop.pdf"));

                    writer.write(sh.display.getText());

                    writer.close();
                    
                } catch (IOException c) {
                    c.printStackTrace();
                }
            }
            if (sh.nyimpen[0].isSelected()) {
                try {
                    BufferedWriter writer
                            = new BufferedWriter(new FileWriter("c:/Users/User/Desktop/Desktop.docx"));

                    writer.write(sh.display.getText());

                    writer.close();
                    
                } catch (IOException c) {
                    c.printStackTrace();
                }
            }
        }

    }

}
