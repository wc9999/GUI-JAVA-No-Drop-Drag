/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewww;

import Controler.ItemHandler;
import Controler.ItemHandlerPopup;
import Controler.StyleHandler;
import Controler.saveHandler;
import Controler.setHandler;
import com.jgoodies.looks.plastic.Plastic3DLookAndFeel;
import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.DesertGreen;
import com.jgoodies.looks.plastic.theme.LightGray;
import com.jgoodies.looks.plastic.theme.SkyPink;
import com.jgoodies.looks.plastic.theme.SkyYellow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class Viewww extends JFrame {

    private DefaultTableModel table;

    private JButton login;
    private JLabel username, password, kk;
    public JTextField us;
    private JPasswordField pas;
    private Container c;
    private JPanel p1, p2, p3;

    public Controler.setHandler st;
    public Controler.saveHandler sh;
    public Controler.ItemHandler mt;
    public Controler.StyleHandler mn;
    public Color warna[] = {Color.black, Color.blue, Color.red, Color.green};
    public JRadioButtonMenuItem colorItems[], fonts[], nyimpen[], set1[];
    public JCheckBoxMenuItem styleItems[];
    public JLabel display, user;
    public ButtonGroup fontGroup, colorGroup, penyimpan, set2;
    public int style;

    public Viewww() {
        super("Aplikasi Type");
        JMenuBar bar = new JMenuBar();
        setJMenuBar(bar);
        JMenu fileMenu = new JMenu("File");
        fileMenu.setMnemonic('F');
        JMenuItem aboutItem = new JMenuItem("About..");
        aboutItem.setMnemonic('A');
        JMenuItem add = new JMenuItem("New");
        add.setMnemonic('d');
        final JDesktopPane dd = new JDesktopPane();

        setTitle("Aplikasi Bebasan");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(350, 180);
        setVisible(true);

        kk = new JLabel("");

        Panel c = new Panel();
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3, 1));
        username = new JLabel("username");
        p1.add(username);
        us = new JTextField(15);

        p1.add(us);

        password = new JLabel("password");
        p1.add(password);
        pas = new JPasswordField(8);
        p1.add(pas);
        p1.setBackground(Color.LIGHT_GRAY);

        p2 = new JPanel();
        p2.setLayout(new GridLayout(1, 1));
        login = new JButton("login");
        login.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        Icon icon = new ImageIcon("./image/logo.png");
                        display = new JLabel("WELCOME " + "\n" + us.getText(), SwingConstants.CENTER);

                        display.setIcon(icon);
                        display.setHorizontalTextPosition(SwingConstants.CENTER);
                        display.setVerticalTextPosition(SwingConstants.BOTTOM);
                        display.setForeground(warna[0]);
                        display.setFont(new Font("Times New Roman", Font.PLAIN, 50));

                        getContentPane().setBackground(Color.white);
                        getContentPane().add(display, BorderLayout.CENTER);
                        
                        
                        setSize(1400, 800);
                        show();

                        us.setText("");
                        pas.setText("");

                    }
                });

        p2.add(login);
//        p2.add(panel2);

        p2.setBackground(Color.LIGHT_GRAY);
        p1.add(p2);
//        p1.add(kk);
//        p1.add(tabel);
        c.add(p1);
//        c.add(tabel);
        c.setBackground(Color.darkGray);
        c.setEnabled(true);
        JButton openButton = new JButton("PopUp");
        JButton macButton = new JButton("History");
        JButton javaButton = new JButton("Metal");
        JButton motifButton = new JButton("Motif");
        JButton winButton = new JButton("Windows");
        JRadioButton jb1 = new JRadioButton("Blue");
        JRadioButton jb2 = new JRadioButton("Green");
        JRadioButton jb3 = new JRadioButton("White");
        JCheckBox cb1 = new JCheckBox("Desert");
        JCheckBox cb2 = new JCheckBox("Sky");
        String[] key = {"100%", "50%"};
        JComboBox cx = new JComboBox(key);
        JLabel nm = new JLabel("Zoom");
        nm.setForeground(Color.MAGENTA);
        JLabel b1 = new JLabel("|");
        JLabel b2 = new JLabel("|");
        JLabel b3 = new JLabel("|");
        JLabel b4 = new JLabel("");
        JLabel b6 = new JLabel("");
        JLabel th = new JLabel("Theme");
        th.setForeground(Color.magenta);
        JLabel cc = new JLabel("Color Set");
        cc.setForeground(Color.magenta);
        JLabel ss = new JLabel("Menu");
        ss.setForeground(Color.magenta);

        cx.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        if (cx.getSelectedIndex() == 1) {
                            display.setFont(new Font("Times New Roman", Font.PLAIN, 30));
                        }
                        if (cx.getSelectedIndex() == 0) {
                            display.setFont(new Font("Times New Roman", Font.PLAIN, 100));
                        }
                    }
                });

        Panel p = new Panel();
        p.add(ss);
        p.add(openButton);
        p.add(macButton);
//        p.add(javaButton);
//        p.add(motifButton);
//        p.add(winButton);
        p.add(b4);
        p.add(b2);
        p.add(cc);
        p.add(jb1);
        p.add(jb2);
        p.add(jb3);
        p.add(b6);
        p.add(b3);
        p.add(th);
        p.add(cb1);
        p.add(cb2);
        p.add(b1);
        p.add(nm);
        p.add(cx);

        cb1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Plastic3DLookAndFeel.setPlasticTheme(new DesertGreen());

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
                    }
                });

        cb2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        try {
                            Plastic3DLookAndFeel.setPlasticTheme(new SkyYellow());

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
                    }
                });

        jb1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        getContentPane().setBackground(Color.blue);
                    }
                });
        jb2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        getContentPane().setBackground(Color.green);
                    }
                });
        jb3.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        getContentPane().setBackground(Color.WHITE);
                    }
                });

        JPanel x = new JPanel();

    

        add(p, BorderLayout.SOUTH);
        add(c, BorderLayout.WEST);
    

        getContentPane().add(dd);
        openButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new PopupTest();
                    }
                });
        macButton.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        new JTabelFix();
                    }
                });
        add.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        internal in = new internal();

                        dd.add(in);

                        add(dd, BorderLayout.CENTER);
                        dd.setSize(1000, 800);
                        dd.setBackground(Color.WHITE);
            
                        dd.setDragMode(JDesktopPane.LIVE_DRAG_MODE);
                        

                        show();
                    }
                });

        String simpan[] = {"docx", "pdf", "txt"};
        JMenu save = new JMenu("Save As");
        save.setMnemonic('C');
        nyimpen = new JRadioButtonMenuItem[simpan.length];
        penyimpan = new ButtonGroup();
        sh = new saveHandler(this);

        for (int i = 0; i < simpan.length; i++) {
            nyimpen[i] = new JRadioButtonMenuItem(simpan[i]);
            save.add(nyimpen[i]);
            penyimpan.add(nyimpen[i]);
            nyimpen[i].addActionListener((ActionListener) sh);
        }

        nyimpen[0].setSelected(true);

        aboutItem.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        JOptionPane.showMessageDialog(Viewww.this,
                                "Aplikasi Berbasis Text @achmadakbar", "About",
                                JOptionPane.PLAIN_MESSAGE);
                    }
                });

        fileMenu.add(aboutItem);
        JMenuItem exitItem = new JMenuItem("Exit");
        exitItem.setMnemonic('x');
        exitItem.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        System.exit(0);
                    }
                });

        fileMenu.add(add);
        fileMenu.add(save);
        fileMenu.add(exitItem);

        bar.add(fileMenu);
        JMenu formatMenu = new JMenu("Format");
        formatMenu.setMnemonic('r');
        String colors[] = {"Hitam", "Biru", "Merah", "Hijau"};
        JMenu colorMenu = new JMenu("Color");
        colorMenu.setMnemonic('C');
        colorItems = new JRadioButtonMenuItem[colors.length];
        colorGroup = new ButtonGroup();
        mt = new ItemHandler(this);

        for (int i = 0; i < colors.length; i++) {
            colorItems[i] = new JRadioButtonMenuItem(colors[i]);
            colorMenu.add(colorItems[i]);
            colorGroup.add(colorItems[i]);
            colorItems[i].addActionListener((ActionListener) mt);
        }

        colorItems[0].setSelected(true);
        formatMenu.add(colorMenu);
        formatMenu.addSeparator();
        String fontNames[] = {"Times New Roman", "Courier New", "Helvetica"};
        JMenu fontMenu = new JMenu("Font");
        fontMenu.setMnemonic('n');
        fonts = new JRadioButtonMenuItem[fontNames.length];
        fontGroup = new ButtonGroup();
        mt = new ItemHandler(this);

        for (int i = 0; i < fonts.length; i++) {
            fonts[i] = new JRadioButtonMenuItem(fontNames[i]);
            fontMenu.add(fonts[i]);
            fontGroup.add(fonts[i]);
            fonts[i].addActionListener((ActionListener) mt);
        }

        fonts[0].setSelected(true);
        fontMenu.addSeparator();
        String styleNames[] = {"Bold", "Italic"};
        styleItems = new JCheckBoxMenuItem[styleNames.length];
        mn = new StyleHandler(this);

        for (int i = 0; i < styleNames.length; i++) {
            styleItems[i] = new JCheckBoxMenuItem(styleNames[i]);
            fontMenu.add(styleItems[i]);
            styleItems[i].addItemListener(mn);
        }

        JMenu set = new JMenu("Setting");
        set.setMnemonic('g');
        String set3[] = {"Minimize", "Normal", "Maximize"};
        JMenu windows = new JMenu("Windows");
        windows.setMnemonic('W');
        set1 = new JRadioButtonMenuItem[set3.length];
        set2 = new ButtonGroup();
        st = new setHandler(this);

        for (int i = 0; i < set3.length; i++) {
            set1[i] = new JRadioButtonMenuItem(set3[i]);

            windows.add(set1[i]);
            set2.add(set1[i]);
            set1[i].addActionListener((ActionListener) st);

        }

        set1[0].setSelected(true);
        set.add(windows);
        formatMenu.add(fontMenu);
        bar.add(formatMenu);
        bar.add(set);
        Icon icon = new ImageIcon("./image/logo.png");
        display = new JLabel("", SwingConstants.CENTER);

        display.setIcon(icon);
        display.setHorizontalTextPosition(SwingConstants.CENTER);
        display.setVerticalTextPosition(SwingConstants.BOTTOM);
        display.setForeground(warna[0]);
        display.setFont(new Font("Times New Roman", Font.PLAIN, 50));

        getContentPane().setBackground(Color.white);
        getContentPane().add(display, BorderLayout.CENTER);

        setSize(1400, 800);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        show();
    }

    public class Tanggal {

        private String getTanggal() {
            DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date = new Date();
            return dateFormat.format(date);
        }

        private String getWaktu() {
            DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
            Date date = new Date();
            return dateFormat.format(date);
        }
    }

    public void Tampil() {
        String[] judul = {"USER", "DATE", "TIME"};

        Tanggal t = new Tanggal();
        String[] dat2 = {username.getText(), t.getTanggal(), t.getWaktu()};
        table = new DefaultTableModel(judul, 0);
        Panel q = new Panel();
        table.addRow(dat2);
        q.add(new JScrollPane(), BorderLayout.LINE_START);
        q.setSize(222, 222);

    }

    public static void main(String[] args) {
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
        Viewww app = new Viewww();

    }

}
