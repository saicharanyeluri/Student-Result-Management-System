/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Sai Charan
 */
public class student_Home extends javax.swing.JFrame {

    /**
     * Creates new form student_Home
     */
    public student_Home() {
        initComponents();
    }

   public student_Home(String rollNo) {
       initComponents();
       jTextField4.setText(rollNo);

   }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText(" STUDENT RESULT MANAGEMENT");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 610, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel1.setText("Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 109, 61, -1));

        jTextField1.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 106, 152, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel3.setText("Course");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 155, 61, -1));

        jTextField2.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 152, 152, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel4.setText("Branch");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 202, -1, -1));

        jTextField3.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 199, 152, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel5.setText("Register Number");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 109, -1, -1));

        jTextField5.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 152, 160, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel6.setText("Gender");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 155, -1, -1));

        jTextField6.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(643, 199, 160, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel7.setText("Father name");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(471, 202, -1, -1));

        jTextField7.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 276, 140, -1));

        jTextField8.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 331, 140, -1));

        jTextField9.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 379, 140, -1));

        jTextField10.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 430, 140, -1));

        jTextField11.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 276, 114, -1));

        jTextField12.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 331, 114, -1));

        jTextField13.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 379, 114, -1));

        jTextField14.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 430, 114, -1));

        jTextField15.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 160, -1));

        jTextField16.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jTextField16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField16ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 280, 84, -1));

        jTextField17.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 331, 160, -1));

        jTextField18.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField18, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 84, -1));

        jTextField19.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField19, new org.netbeans.lib.awtextra.AbsoluteConstraints(483, 379, 160, -1));

        jTextField20.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField20, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 380, 84, -1));

        jTextField21.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField21, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 160, -1));

        jTextField22.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField22, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 430, 84, -1));

        jTextField23.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField23, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 486, 98, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel8.setText("Total");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 489, 39, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel9.setText("Percentage");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(289, 489, -1, -1));

        jTextField24.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField24, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 486, 74, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel10.setText("Result");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 489, -1, -1));

        jTextField25.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N
        jPanel1.add(jTextField25, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 486, 103, -1));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BACK");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 0, 0), null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 580, 110, 30));

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));

        jTextField4.setFont(new java.awt.Font("Cambria Math", 0, 16)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(641, Short.MAX_VALUE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 880, 170));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel12.setText("Subject Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 90, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel13.setText("Marks");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 80, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel14.setText("Subject Name");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 90, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 3, 15)); // NOI18N
        jLabel15.setText("Marks");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 60, -1));

        jTextField26.setBackground(new java.awt.Color(0, 255, 255));
        jTextField26.setFont(new java.awt.Font("Cambria", 1, 16)); // NOI18N
        jTextField26.setBorder(null);
        jPanel1.add(jTextField26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 540, 230, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollNo=jTextField4.getText();
        try
{
Class.forName ("com.mysql.cj.jdbc.Driver");

Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","sai");

Statement st;
st = con.createStatement();

ResultSet rs=st.executeQuery(" select * from student_details inner join marks_details inner join subject_details where student_details.rollNo='"+rollNo+"' and subject_details.rollNo='"+rollNo+"' and marks_details.rollNo='"+rollNo+"'");
if(rs.next())
{
    String name=rs.getString(4);
    jTextField1.setText(name);
    
    jTextField2.setText (rs.getString (2));
    
    jTextField3.setText(rs.getString (3));
    jTextField5.setText (rs.getString (5));
    jTextField6.setText(rs.getString(6));
    
    jTextField7.setText (rs.getString(17));
    
    jTextField8.setText(rs.getString(18));
    jTextField9.setText (rs.getString(19));
    jTextField10.setText (rs.getString(20));
   
    jTextField15.setText(rs.getString(21));
    
    jTextField17.setText(rs.getString(22));
    
   
    
    jTextField19.setText(rs.getString(23));
   
    jTextField21.setText (rs.getString(24));
    
    jTextField23.setText(rs.getString(12));
    
     String h1=rs.getString(8);
    h1=h1.replaceAll("\\s", "");
      String h2=rs.getString(9);
    h2=h2.replaceAll("\\s", "");
    
       String h3=rs.getString(10);
    h3=h3.replaceAll("\\s", "");
    
       String h4=rs.getString(11);
    h4=h4.replaceAll("\\s", "");
    
       String h5=rs.getString(12);
    h5=h5.replaceAll("\\s", "");
    
       String h6=rs.getString (13);
    h6=h6.replaceAll("\\s", "");
       String h7=rs.getString(14);
    h7=h7.replaceAll("\\s", "");
    
    String h8=rs.getString(15);
    h8=h8.replaceAll("\\s", "");
    
    
    jTextField11.setText(h1);
    jTextField12.setText(h2);
    jTextField13.setText(h3);
    jTextField14.setText(h4);
    jTextField16.setText(h5);
    jTextField18.setText(h6);
    jTextField20.setText(h7);
    jTextField22.setText(h8);
    
     /*jTextField25.setText("Pass");
    jTextField23.setText("513");
    jTextField24.setText("85.5%");
    */
    try{
    int result = 0,count=0;
    String g="PASS";
    if( jTextField11.getText().length()!=0){
    int s1=Integer.valueOf( jTextField11.getText());
    result=result+s1;
    count++;
    if(s1<50){
        g="Fail";
    }
        }
    if( jTextField12.getText().length()!=0){
    int s2=Integer.valueOf(jTextField12.getText());
    result=result+s2;
    count++;
      if(s2<50){
        g="Fail";
    }}
    if( jTextField13.getText().length()!=0){
    int s3=Integer.valueOf(jTextField13.getText());
    result=result+s3;
    count++;
      if(s3<50){
        g="Fail";
    }}
    if( jTextField14.getText().length()!=0){
    int s4=Integer.valueOf(jTextField14.getText());
    result=result+s4;
    count++;
      if(s4<50){
        g="Fail";
    }}
    if( jTextField16.getText().length()!=0){
    int s5=Integer.valueOf(jTextField16.getText());
    result=result+s5;
    count++;
      if(s5<50){
        g="Fail";
    }}
    if( jTextField18.getText().length()!=0){
    int s6=Integer.valueOf(jTextField18.getText());
    result=result+s6;
    count++;
      if(s6<50){
        g="Fail";
    }}
    if( jTextField20.getText().length()!=0){
    int s7=Integer.valueOf(jTextField20.getText());
    result=result+s7;
    count++;
      if(s7<50){
        g="Fail";
    }}
    if( jTextField22.getText().length()!=0){
    int s8=Integer.valueOf(jTextField22.getText());
    result=result+s8;
    count++;
      if(s8<50){
        g="Fail";
    }}
    if(g=="PASS"){
    jTextField26.setText("Congratulations,You Passed!!!");
    }
    else{
        jTextField26.setText("Better Luck Next Time!!");
    }
    int percent=(result/count);
    String pe=Integer.toString(percent);
    
    String s=Integer.toString(result);
    jTextField24.setText(pe+"%");
    jTextField23.setText(s);

    jTextField25.setText(g);
    
    }
    catch (NumberFormatException e) {
    // Handle the exception, e.g., display an error message or log the error.
}
    
    
    
    jTextField1.setEditable (false);
    
    jTextField2.setEditable (false);
    
    jTextField3.setEditable (false);
    
    jTextField4.setEditable (false);
    
    jTextField5.setEditable (false);
    
    jTextField6.setEditable (false);
    
    jTextField7.setEditable (false);
    
    jTextField8.setEditable (false);
    
    jTextField9.setEditable (false);
    
    jTextField10.setEditable (false);
    
    jTextField11.setEditable (false);
    
    jTextField12.setEditable (false);
    
    jTextField13. setEditable (false);
        
    jTextField14.setEditable (false);
    
    jTextField15.setEditable (false);
    
    jTextField16.setEditable (false);
    
    jTextField17.setEditable (false);
    
    jTextField18.setEditable (false);
    
    jTextField19.setEditable (false);
    
    jTextField20.setEditable (false);
    
    jTextField21.setEditable (false);
    
    jTextField22.setEditable (false);
    
    jTextField23.setEditable (false);
    
    jTextField24.setEditable (false);
    
    jTextField25.setEditable (false);
    
    rs.close();} 
else {
}

   }
     catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(student_Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentIndex().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new student_Home().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
