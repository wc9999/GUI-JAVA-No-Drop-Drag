/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewww;

import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.jgoodies.looks.plastic.theme.LightGray;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import static java.time.Clock.system;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/**
 *
 * @author User
 */
public class internal extends JInternalFrame {

    private JTextArea t1;

    public internal() {
        super("Ngetik", true, true, true, true);
        Box b = Box.createHorizontalBox();
        Box c = Box.createHorizontalBox();
        Box x = Box.createHorizontalBox();

        t1 = new JTextArea("", 40, 80);
        b.add(new JScrollPane(t1));
//        copy = new JButton("copy >>>");

//        copy.addActionListener(new ActionListener() {
//
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                t2.setText(t1.getSelectedText());
//
//            }
//
//        });
//        b.add(copy);
//        t2 = new JTextArea(10, 15);
//        t2.setEnabled(false);
//        b.add(new JScrollPane(t2));
//        getContentPane().add(b);
        JPanel q = new JPanel();
        Panel q1 = new Panel();
        JLabel ft = new JLabel("Font");
        String[] ftx = {"Times New Roman", "Courier New", "Helvetica"};
        JComboBox ft1 = new JComboBox(ftx);
        ft1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (ft1.getSelectedIndex() == 0) {
                            Font myFont = new Font("Times New Roman", Font.PLAIN, 12);
                            t1.setFont(myFont);
                        }
                        if (ft1.getSelectedIndex() == 1) {
                            Font myFont = new Font("Courier New", Font.PLAIN, 12);
                            t1.setFont(myFont);
                        }
                        if (ft1.getSelectedIndex() == 2) {
                            Font myFont = new Font("Helvetica", Font.PLAIN, 12);
                            t1.setFont(myFont);
                        }
                    }
                });
        JLabel val = new JLabel("Size");
        String[] valx = {"12", "15", "20"};
        JComboBox val1 = new JComboBox(valx);
        val1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (val1.getSelectedIndex() == 0) {
                            Font myFont = new Font("", Font.PLAIN, 12);
                            t1.setFont(myFont);
                        }
                        if (val1.getSelectedIndex() == 1) {
                            Font myFont = new Font("", Font.PLAIN, 15);
                            t1.setFont(myFont);
                        }
                        if (val1.getSelectedIndex() == 2) {
                            Font myFont = new Font("", Font.PLAIN, 20);
                            t1.setFont(myFont);
                        }
                    }
                });
        JLabel co = new JLabel("Color");
        String[] cox = {"Red", "Black", "Blue"};
        JComboBox co1 = new JComboBox(cox);
        co1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (co1.getSelectedIndex() == 0) {
                            t1.setForeground(Color.red);
                        }
                        if (co1.getSelectedIndex() == 1) {
                            t1.setForeground(Color.black);
                        }
                        if (co1.getSelectedIndex() == 2) {
                            t1.setForeground(Color.blue);
                        }
                    }
                });
        JButton kiri = new JButton("Align Text Left");
        kiri.setBackground(Color.MAGENTA);
        kiri.setForeground(Color.MAGENTA);
        kiri.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        t1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
                    }
                });

        JButton Kanan = new JButton("Align Text Right");
        Kanan.setBackground(Color.MAGENTA);
        Kanan.setForeground(Color.MAGENTA);
        Kanan.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {

                        t1.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
                    }
                });

        JButton Bol = new JButton("Bold");
        Bol.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Font myFont = new Font("", Font.BOLD, 12);
                        t1.setFont(myFont);

                    }
                });

        Bol.setBackground(Color.blue);
        Bol.setForeground(Color.blue);
        JButton ita = new JButton("Italic");
        ita.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Font myFont = new Font("", Font.ITALIC, 12);
                        t1.setFont(myFont);

                    }
                });

        ita.setBackground(Color.blue);
        ita.setForeground(Color.blue);
        JButton un = new JButton("Center BSLN");
        un.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Font myFont = new Font("", Font.CENTER_BASELINE, 12);
                        t1.setFont(myFont);

                    }
                });
        un.setBackground(Color.blue);
        un.setForeground(Color.blue);
        c.add(new JScrollPane(ft));
        c.add(new JScrollPane(ft1));
        c.add(new JScrollPane(val));
        c.add(new JScrollPane(val1));
        c.add(new JScrollPane(co));
        c.add(new JScrollPane(co1));
        c.add(new JScrollPane(kiri));

        c.add(new JScrollPane(Kanan));

        c.add(new JScrollPane(Bol));
        c.add(new JScrollPane(ita));
        c.add(new JScrollPane(un));
        q.add(c);

        String[] sv = {"txt", "pdf", "docx"};
        JList ls = new JList(sv);
        JLabel ls2 = new JLabel("Save as..");
        ls.setVisibleRowCount(3);
        ls.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        ls.addListSelectionListener(
                new ListSelectionListener() {
                    
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (ls.getSelectedIndex()==0) {
                             try {
                            BufferedWriter writer
                            = new BufferedWriter(new FileWriter("c:/Users/User/Desktop/Documen.txt"));

                            writer.write(t1.getText());

                            writer.close();

                        } catch (IOException c) {
                            c.printStackTrace();
                        }
                        }
                        if (ls.getSelectedIndex()==1) {
                             try {
                            BufferedWriter writer
                            = new BufferedWriter(new FileWriter("c:/Users/User/Desktop/Documen.pdf"));

                            writer.write(t1.getText());

                            writer.close();

                        } catch (IOException c) {
                            c.printStackTrace();
                        }
                        }
                       if (ls.getSelectedIndex()==2) {
                             try {
                            BufferedWriter writer
                            = new BufferedWriter(new FileWriter("c:/Users/User/Desktop/Documen.docx"));

                            writer.write(t1.getText());

                            writer.close();

                        } catch (IOException c) {
                            c.printStackTrace();
                        }
                        }
                    }
                }
        );

        JPanel aw = new JPanel();

        aw.add(ls2);
        aw.add(ls);
        x.add(aw);

        JPanel o = new JPanel();
//         Panel p = new Panel();
//        p.add(ss);
        o.add(b);

        add(o, BorderLayout.CENTER);
        add(c, BorderLayout.NORTH);
        add(x, BorderLayout.EAST);
        this.setSize(1010, 657);
        try {
            Plastic3DLookAndFeel.setPlasticTheme(new LightGray());

            UIManager.setLookAndFeel("com.jgoodies.looks.windows.WindowsLookAndFeel");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Viewww.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Viewww.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Viewww.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Viewww.class.getName()).log(Level.SEVERE, null, ex);
        }
        show();

    }

}
