
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * delete.java
 *
 * Created on Oct 21, 2010, 3:41:18 PM
 */

/**
 *
 * @author dell
 */
public class delete extends javax.swing.JFrame {

    /** Creates new form delete */
    public delete() {
        initComponents();
        fillcombo();
    }
void fillcombo()
{    try{
            Class.forName("java.sql.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
            Statement stmt = con.createStatement();
            String sql;
            sql = "Select distinct designation from staff";
            ResultSet rst = stmt.executeQuery(sql);
            DefaultComboBoxModel dsg = (DefaultComboBoxModel) cbdesignation.getModel();
            while (rst.next())
            { dsg.addElement(rst.getString(1));
            }
            cbdesignation.setModel(dsg);
            rst.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null, e.getMessage());
            }
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
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        residencephtf = new javax.swing.JTextField();
        mobilephtf = new javax.swing.JTextField();
        rbmale = new javax.swing.JRadioButton();
        rbfemale = new javax.swing.JRadioButton();
        staffidtf = new javax.swing.JTextField();
        nametf = new javax.swing.JTextField();
        agetf = new javax.swing.JTextField();
        qualificationtf = new javax.swing.JTextField();
        addresstf = new javax.swing.JTextField();
        cbdesignation = new javax.swing.JComboBox();
        cbspecialisation = new javax.swing.JComboBox();
        showdatabutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        clearbutton = new javax.swing.JButton();
        exitbutton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel1.setText("Staff Id");

        jLabel2.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel3.setText("Age");

        jLabel4.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel4.setText("Designation");

        jLabel5.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel5.setText("Specialisation");

        jLabel6.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel6.setText("Qualification");

        jLabel7.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel7.setText("Address");

        jLabel8.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel8.setText("Phone:");

        jLabel9.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel9.setText("Residence");

        jLabel10.setFont(new java.awt.Font("Gabriola", 1, 18));
        jLabel10.setText("Mobile");

        buttonGroup1.add(rbmale);
        rbmale.setFont(new java.awt.Font("Gabriola", 1, 18));
        rbmale.setText("Male");

        buttonGroup1.add(rbfemale);
        rbfemale.setFont(new java.awt.Font("Gabriola", 1, 18));
        rbfemale.setText("Female");

        staffidtf.setEditable(false);

        nametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametfActionPerformed(evt);
            }
        });

        cbspecialisation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General", "Ear", "Eye", "Skin", "Heart", "Brian", "Stomach" }));

        showdatabutton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        showdatabutton.setText("Show Data");
        showdatabutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showdatabuttonActionPerformed(evt);
            }
        });

        deletebutton.setFont(new java.awt.Font("Times New Roman", 1, 18));
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
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

        jLabel11.setFont(new java.awt.Font("Monotype Corsiva", 1, 24)); // NOI18N
        jLabel11.setText("Staff  Retirement/Leaving Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(residencephtf, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(29, 29, 29)
                                        .addComponent(mobilephtf))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbspecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nametf)
                                    .addComponent(addresstf)
                                    .addComponent(agetf)
                                    .addComponent(qualificationtf, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addComponent(staffidtf))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbmale)
                                    .addComponent(rbfemale)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(showdatabutton)
                        .addGap(24, 24, 24)
                        .addComponent(deletebutton)
                        .addGap(23, 23, 23)
                        .addComponent(clearbutton)
                        .addGap(18, 18, 18)
                        .addComponent(exitbutton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(staffidtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbmale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbfemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(agetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbdesignation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbspecialisation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(qualificationtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(residencephtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(mobilephtf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showdatabutton)
                    .addComponent(deletebutton)
                    .addComponent(clearbutton)
                    .addComponent(exitbutton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametfActionPerformed

    private void showdatabuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showdatabuttonActionPerformed
        // TODO add your handling code here:
        try{Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
        Statement stmt=con.createStatement();
        String sql,staffid,gender;
        staffid=JOptionPane.showInputDialog(this,"Enter Staff id to Delete");
        sql = "select * from staff where staff_id="+staffid;
        ResultSet rst = stmt.executeQuery(sql);
        if(rst.next()==false)
            JOptionPane.showMessageDialog(null,"Invalid staff id,Please Try Again");
        else
            staffidtf.setText(rst.getString("staff_id"));
            nametf.setText(rst.getString("name"));
            agetf.setText(rst.getString("age"));
            qualificationtf.setText(rst.getString("qualification"));
            addresstf.setText(rst.getString("address"));
            residencephtf.setText(rst.getString("residence_phone"));
            mobilephtf.setText(rst.getString("mobile_phone"));
            gender=rst.getString("gender");
            if(gender.equalsIgnoreCase("male"))
                rbmale.setSelected(true);
            else if(gender.equalsIgnoreCase("female"))
                rbfemale.setSelected(true);
        rst.close();
        stmt.close();
        con.close();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}
    }//GEN-LAST:event_showdatabuttonActionPerformed

    private void exitbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbuttonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_exitbuttonActionPerformed

    private void clearbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbuttonActionPerformed
        // TODO add your handling code here:
        staffidtf.setText("");
        nametf.setText("");
        agetf.setText("");
        qualificationtf.setText("");
        addresstf.setText("");
        residencephtf.setText("");
        mobilephtf.setText("");
    }//GEN-LAST:event_clearbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        try{Class.forName("java.sql.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
        Statement stmt=con.createStatement();
        String sql,staffid;
        staffid = staffidtf.getText();
        if(staffid.equals(""))
            JOptionPane.showMessageDialog(null,"Staff id is empty,Kindly click Show Data");
        else
        {sql = "delete from staff where staff_id="+staffid;
         stmt.executeUpdate(sql);
         JOptionPane.showMessageDialog(null,"Record Deleted Successfully");
         staffidtf.setText("");
         nametf.setText("");
         agetf.setText("");
         qualificationtf.setText("");
         addresstf.setText("");
         residencephtf.setText("");
         mobilephtf.setText("");
        }
        stmt.close();
        con.close();
        }
        catch(Exception e)
        {JOptionPane.showMessageDialog(null,e.getMessage());}
    }//GEN-LAST:event_deletebuttonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addresstf;
    private javax.swing.JTextField agetf;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cbdesignation;
    private javax.swing.JComboBox cbspecialisation;
    private javax.swing.JButton clearbutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JButton exitbutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField mobilephtf;
    private javax.swing.JTextField nametf;
    private javax.swing.JTextField qualificationtf;
    private javax.swing.JRadioButton rbfemale;
    private javax.swing.JRadioButton rbmale;
    private javax.swing.JTextField residencephtf;
    private javax.swing.JButton showdatabutton;
    private javax.swing.JTextField staffidtf;
    // End of variables declaration//GEN-END:variables

}
