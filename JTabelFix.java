/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viewww;

import java.awt.BorderLayout;
import java.awt.Color;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import viewww.Viewww;

/**
 *
 * @author User
 */
public class JTabelFix extends JFrame{
    public viewww.Viewww us;
    private JTable tabel;
    private JLabel label;
    private JPanel panel1,panel2;
    private String columnName[] = {"Tanggal","User", "Waktu"}; 
    Tanggal tt = new Tanggal();
    String ll="achmad";
    private Object teams[][] ={{tt.getTanggal(),ll , tt.getWaktu()},{tt.getTanggal(),ll , tt.getWaktu()},{tt.getTanggal(),ll , tt.getWaktu()}};
                        

    public JTabelFix(){
        super("Tabel History");
     
       
       
      panel2 = new JPanel();
      tabel = new JTable(teams, columnName); 
      panel2.setBackground(Color.GRAY);

      
       getContentPane().add(new JScrollPane(tabel), BorderLayout.CENTER);

      getContentPane().add(panel2, BorderLayout.SOUTH);

      setTitle("Tabel History");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(270, 180);
      setVisible(true);
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
}
