package viewww;

import Controler.ItemHandlerPopup;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import viewww.Viewww;

public class PopupTest extends JFrame {
    
    public JButton xx;
    public ItemHandlerPopup mt;
    public JRadioButtonMenuItem items[];
    public Color colorValues[] = {Color.blue, Color.yellow, Color.red};

    public PopupTest() {
        super("Demostrasi Penggunaan JPopupMenus");
        final JPopupMenu popupMenu = new JPopupMenu();
        mt = new ItemHandlerPopup(this);
        String colors[] = {"Biru", "Kuning", "Merah"};
        ButtonGroup colorGroup = new ButtonGroup();
        items = new JRadioButtonMenuItem[3];
        xx = new JButton("Save");
        JPanel a = new JPanel();
        Panel z = new Panel();
        z.add(xx);
        add(z, BorderLayout.SOUTH);
        
        xx.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        
                    }
                });

        for (int i = 0; i < items.length; i++) {
            items[i] = new JRadioButtonMenuItem(colors[i]);
            popupMenu.add(items[i]);
            colorGroup.add(items[i]);
            items[i].addActionListener(mt);
        }
        getContentPane().setBackground(Color.gray);
        addMouseListener(
                new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                checkForTriggerEvent(e);
            }

            public void mouseReleased(MouseEvent e) {
                checkForTriggerEvent(e);
            }

            public void checkForTriggerEvent(MouseEvent e) {
                if (e.isPopupTrigger()) {
                    popupMenu.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        }
        );
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        show();
    }


}
