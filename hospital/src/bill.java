
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * bill.java
 *
 * Created on Oct 21, 2010, 4:31:34 PM
 */

/**
 *
 * @author dell
 */
public class bill extends javax.swing.JFrame {

    /** Creates new form bill */
    public bill() {
        initComponents();
        fillcombo();
    }
    void fillcombo()
    {try{Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
        Statement stmt=con.createStatement();
        String sql;
        sql= "select * from patient";
        ResultSet rst=stmt.executeQuery(sql);
        DefaultComboBoxModel admno = (DefaultComboBoxModel) jComboBox1.getModel();
        while(rst.next())
        { admno.addElement(rst.getString("admit_no"));
        }
        rst.close();
        stmt.close();
        con.close();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rbdeluxe = new javax.swing.JRadioButton();
        rbsemideluxe = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        billnotf = new javax.swing.JTextField();
        billdatetf = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        roomtf = new javax.swing.JTextField();
        noofdaystf = new javax.swing.JTextField();
        foodtf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totaltf = new javax.swing.JTextField();
        savebutton = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        xraytf = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        bloodtesttf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sugartesttf = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        ecgtf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        otherchargestf = new javax.swing.JTextField();
        calculatebutton = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel1.setText("Bill No.");

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel2.setText("Bill Date");

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel3.setText("Admit No.");

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel4.setText("Room/Ward Charges");

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel5.setText("No. of Days");

        buttonGroup1.add(rbdeluxe);
        rbdeluxe.setFont(new java.awt.Font("Gabriola", 1, 18));
        rbdeluxe.setText("Deluxe");
        rbdeluxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbdeluxeActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbsemideluxe);
        rbsemideluxe.setFont(new java.awt.Font("Gabriola", 1, 18));
        rbsemideluxe.setSelected(true);
        rbsemideluxe.setText("Semi-Deluxe");
        rbsemideluxe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbsemideluxeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel6.setText("Food");

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel7.setText("Charges:");

        roomtf.setEditable(false);

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel8.setText("Total");

        totaltf.setEditable(false);

        savebutton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        clearbutton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        clearbutton.setText("Clear");
        clearbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbuttonActionPerformed(evt);
            }
        });

        exitbutton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        exitbutton.setText("Exit");
        exitbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbuttonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel9.setText("X-Ray");

        xraytf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xraytfActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel10.setText("Blood Test");

        jLabel11.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel11.setText("Sugar Test");

        jLabel12.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel12.setText("ECG");

        jLabel13.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel13.setText("Other Charges");

        calculatebutton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        calculatebutton.setText("Calculate");
        calculatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatebuttonActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel14.setText("Patient Bill");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(calculatebutton)
                        .addGap(34, 34, 34)
                        .addComponent(savebutton)
                        .addGap(31, 31, 31)
                        .addComponent(clearbutton)
                        .addGap(31, 31, 31)
                        .addComponent(exitbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(billnotf, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(57, 57, 57)
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(billdatetf, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(foodtf)
                                    .addComponent(xraytf)
                                    .addComponent(bloodtesttf)
                                    .addComponent(sugartesttf)
                                    .addComponent(ecgtf)
                                    .addComponent(otherchargestf)
                                    .addComponent(totaltf, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
                                    .addComponent(roomtf)
                                    .addComponent(noofdaystf, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)))
                            .addComponent(jLabel7))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbdeluxe)
                            .addComponent(rbsemideluxe))))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(billdatetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(billnotf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(noofdaystf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rbdeluxe)
                        .addGap(15, 15, 15)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(roomtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbsemideluxe))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(foodtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(xraytf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(bloodtesttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sugartesttf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(ecgtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(otherchargestf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(totaltf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(calculatebutton)
                    .addComponent(savebutton)
                    .addComponent(clearbutton)
                    .addComponent(exitbutton))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbsemideluxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbsemideluxeActionPerformed
    }//GEN-LAST:event_rbsemideluxeActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        // TODO add your handling code here:
        billnotf.setText("");
        billdatetf.setText("");
        noofdaystf.setText("");
        roomtf.setText("");
        foodtf.setText("");
        xraytf.setText("");
        bloodtesttf.setText("");
        sugartesttf.setText("");
        ecgtf.setText("");
        otherchargestf.setText("");
        totaltf.setText("");
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void xraytfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xraytfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_xraytfActionPerformed

    private void calculatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calculatebuttonActionPerformed
        // TODO add your handling code here:
        int nodays=Integer.parseInt(noofdaystf.getText());
        int food=Integer.parseInt(foodtf.getText());
        int xray=Integer.parseInt(xraytf.getText());
        int blood=Integer.parseInt(bloodtesttf.getText());
        int sugar=Integer.parseInt(sugartesttf.getText());
        int ecg=Integer.parseInt(ecgtf.getText());
        int other=Integer.parseInt(otherchargestf.getText());
        int room=0;
        if (rbdeluxe.isSelected()==true)
           {room=800;
           }
        else if (rbsemideluxe.isSelected()==true)
        {room=500;
         }
        int roomcharge= nodays*room;
        roomtf.setText(roomcharge+"");
        int total=roomcharge+food+xray+blood+sugar+ecg+other;
        totaltf.setText(total+"");
    }//GEN-LAST:event_calculatebuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // TODO add your handling code here:
    try{Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
        Statement stmt=con.createStatement();
        int billno = Integer.parseInt(billnotf.getText());
        String billdate = billdatetf.getText();
        Object admno=jComboBox1.getSelectedItem();
        int days = Integer.parseInt(noofdaystf.getText());
        String room =roomtf.getText();
        int food = Integer.parseInt(foodtf.getText());
        int xray = Integer.parseInt(xraytf.getText());
        int bloodtst = Integer.parseInt(bloodtesttf.getText());
        int sugartst = Integer.parseInt(sugartesttf.getText());
        int ecg = Integer.parseInt(ecgtf.getText());
        int othrcharge = Integer.parseInt(otherchargestf.getText());
        int total =Integer.parseInt(totaltf.getText());
        String typroom="";
        if(rbdeluxe.isSelected()==true)
            typroom="deluxe";
        else if(rbsemideluxe.isSelected()==true)
            typroom="semi-deluxe";
        String sql = "insert into bill values("+billno+",'"+billdate+"',"+admno+","+days+",'"+typroom+"',"+room+","+food+","+xray+","+bloodtst+","+sugartst+","+ecg+","+othrcharge+","+total+")";
        stmt.executeUpdate(sql);
        JOptionPane.showMessageDialog(null,"Record Saved");
        stmt.close();
        con.close();
        }
    catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}
    }//GEN-LAST:event_savebuttonActionPerformed

    private void rbdeluxeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbdeluxeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbdeluxeActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField billdatetf;
    private javax.swing.JTextField billnotf;
    private javax.swing.JTextField bloodtesttf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton calculatebutton;
    private javax.swing.JButton clearbutton;
    private javax.swing.JTextField ecgtf;
    private javax.swing.JButton exitbutton;
    private javax.swing.JTextField foodtf;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField noofdaystf;
    private javax.swing.JTextField otherchargestf;
    private javax.swing.JRadioButton rbdeluxe;
    private javax.swing.JRadioButton rbsemideluxe;
    private javax.swing.JTextField roomtf;
    private javax.swing.JButton savebutton;
    private javax.swing.JTextField sugartesttf;
    private javax.swing.JTextField totaltf;
    private javax.swing.JTextField xraytf;
    // End of variables declaration//GEN-END:variables

}
