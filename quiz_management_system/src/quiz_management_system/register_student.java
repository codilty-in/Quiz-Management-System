/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz_management_system;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
import com.mysql.jdbc.Messages;
import java.awt.event.KeyEvent;
import java.util.regex.Pattern;
/**
 *
 * @author admin
 */
public class register_student extends javax.swing.JFrame {

    /**
     * Creates new form register_student
     */
    public register_student() {
        initComponents();
                this.setResizable(false);

        oldpanel.setBackground(new Color(0,0,0,64));
        newpanel.setBackground(new Color(0,0,0,64));
        namet.setBackground(new Color(0,0,0,64));
        namel.setBackground(new Color(0,0,0,64));
        passt.setBackground(new Color(0,0,0,64));
        passl.setBackground(new Color(0,0,0,64));
        yeart.setBackground(new Color(0,0,0,64));
        yearl.setBackground(new Color(0,0,0,64));
        departt.setBackground(new Color(0,0,0,64));
        departl.setBackground(new Color(0,0,0,64));
        mobiletext1.setBackground(new Color(0,0,0,64));
        mobilel.setBackground(new Color(0,0,0,64));
        emailt.setBackground(new Color(0,0,0,64));
        emaill.setBackground(new Color(0,0,0,64));
        usert.setBackground(new Color(0,0,0,64));
        userl.setBackground(new Color(0,0,0,64));
        signup.setBackground(new Color(0,0,0,64));
        login.setBackground(new Color(0,0,0,64));
        account.setBackground(new Color(0,0,0,64));
         home.setBackground(new Color(0,0,0,64));
         sign.setBackground(new Color(0,0,0,64));
         reset1.setBackground(new Color(0,0,0,64));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        oldpanel = new javax.swing.JPanel();
        newpanel = new javax.swing.JPanel();
        yearl = new javax.swing.JLabel();
        namel = new javax.swing.JLabel();
        departl = new javax.swing.JLabel();
        emaill = new javax.swing.JLabel();
        passl = new javax.swing.JLabel();
        mobilel = new javax.swing.JLabel();
        userl = new javax.swing.JLabel();
        emailt = new javax.swing.JTextField();
        departt = new javax.swing.JComboBox<>();
        yeart = new javax.swing.JComboBox<>();
        namet = new javax.swing.JTextField();
        mobiletext1 = new javax.swing.JTextField();
        usert = new javax.swing.JTextField();
        signup = new javax.swing.JButton();
        account = new javax.swing.JLabel();
        login = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        home = new javax.swing.JButton();
        passt = new javax.swing.JPasswordField();
        reset1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sign = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        oldpanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Create Account", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 36), new java.awt.Color(0, 102, 102))); // NOI18N

        newpanel.setForeground(new java.awt.Color(153, 255, 255));

        yearl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        yearl.setForeground(new java.awt.Color(255, 255, 255));
        yearl.setText("Year");

        namel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        namel.setForeground(new java.awt.Color(255, 255, 255));
        namel.setText("Name");

        departl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        departl.setForeground(new java.awt.Color(255, 255, 255));
        departl.setText("Department");

        emaill.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emaill.setForeground(new java.awt.Color(255, 255, 255));
        emaill.setText("Email ID");

        passl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passl.setForeground(new java.awt.Color(255, 255, 255));
        passl.setText("Password");

        mobilel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mobilel.setForeground(new java.awt.Color(255, 255, 255));
        mobilel.setText("Mobile no");

        userl.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userl.setForeground(new java.awt.Color(255, 255, 255));
        userl.setText("Username");

        emailt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        emailt.setForeground(new java.awt.Color(255, 255, 255));

        departt.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        departt.setForeground(new java.awt.Color(255, 255, 255));
        departt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Department>", "I.T" }));

        yeart.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        yeart.setForeground(new java.awt.Color(255, 255, 255));
        yeart.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Select Year>", "F.E", "S.E", "T.E", "B.E" }));

        namet.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        namet.setForeground(new java.awt.Color(255, 255, 255));

        mobiletext1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mobiletext1.setForeground(new java.awt.Color(255, 255, 255));
        mobiletext1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobiletext1KeyTyped(evt);
            }
        });

        usert.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        usert.setForeground(new java.awt.Color(255, 255, 255));

        signup.setBackground(new java.awt.Color(255, 255, 255));
        signup.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        signup.setForeground(new java.awt.Color(255, 255, 255));
        signup.setText("Signup");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });

        account.setBackground(new java.awt.Color(255, 255, 255));
        account.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        account.setForeground(new java.awt.Color(255, 255, 255));
        account.setText("Already have account ?");

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        home.setForeground(new java.awt.Color(255, 255, 255));
        home.setText("Back");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });

        passt.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        passt.setForeground(new java.awt.Color(255, 255, 255));

        reset1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        reset1.setForeground(new java.awt.Color(255, 255, 255));
        reset1.setText("Reset");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newpanelLayout = new javax.swing.GroupLayout(newpanel);
        newpanel.setLayout(newpanelLayout);
        newpanelLayout.setHorizontalGroup(
            newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newpanelLayout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(newpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(newpanelLayout.createSequentialGroup()
                        .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addComponent(passl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(passt, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addComponent(yearl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(yeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addComponent(mobilel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(mobiletext1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addComponent(departl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namet, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(departt, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(26, Short.MAX_VALUE))
                    .addGroup(newpanelLayout.createSequentialGroup()
                        .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(usert)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(newpanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(emailt, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(newpanelLayout.createSequentialGroup()
                        .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(home)
                            .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(newpanelLayout.createSequentialGroup()
                                    .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(login))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(newpanelLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(namel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(350, Short.MAX_VALUE)))
        );
        newpanelLayout.setVerticalGroup(
            newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(newpanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(namet, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(departl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mobilel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobiletext1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emaill, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usert, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(passl, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(newpanelLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(passt)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(signup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(account, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(login))
                .addGap(35, 35, 35)
                .addComponent(home)
                .addContainerGap())
            .addGroup(newpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(newpanelLayout.createSequentialGroup()
                    .addGap(47, 47, 47)
                    .addComponent(namel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(405, Short.MAX_VALUE)))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Accounts_main.png"))); // NOI18N

        sign.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        sign.setForeground(new java.awt.Color(255, 255, 255));
        sign.setText("Student Sign Up !");

        javax.swing.GroupLayout oldpanelLayout = new javax.swing.GroupLayout(oldpanel);
        oldpanel.setLayout(oldpanelLayout);
        oldpanelLayout.setHorizontalGroup(
            oldpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oldpanelLayout.createSequentialGroup()
                .addGroup(oldpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(oldpanelLayout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(oldpanelLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(newpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        oldpanelLayout.setVerticalGroup(
            oldpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, oldpanelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(newpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(oldpanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sign, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(oldpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 840, 590));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Mountains Sunset899445827.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 620));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
      dispose();
        new welcome().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
       dispose();
       new student_login().setVisible(true);
    }//GEN-LAST:event_loginActionPerformed

    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset1ActionPerformed
        namet.setText(null);
       
        passt.setText(null);

      
  
        mobiletext1.setText(null);

        emailt.setText(null);
  
        usert.setText(null);
    }//GEN-LAST:event_reset1ActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
       
       Pattern digitPattern = Pattern.compile("\\d{10}");
        String mob1=mobiletext1.getText();
        if(digitPattern.matcher(mob1).matches()){
             try {
            Connection con;
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root","");
            
            String str1="insert into stud_info(id,name,Department,Year,moblie,email,username,pass) values(0,?,?,?,?,?,?,?)";
            PreparedStatement pstmt = con.prepareStatement(str1);
            String name9=namet.getText();
            String department9=departt.getSelectedItem().toString();
            String year9=yeart.getSelectedItem().toString();
            //String mob=mobiletext1.getText();
            String email9=emailt.getText();
            String user9=usert.getText();
            String pass9=passt.getText();
            pstmt.setString(1,name9);
            pstmt.setString(2,department9);
            pstmt.setString(3,year9);
            pstmt.setString(4,mob1);
            pstmt.setString(5,email9);
            pstmt.setString(6,user9);
            pstmt.setString(7,pass9);
            
            int res = pstmt.executeUpdate();
            
             
            if(res!=0)
            {
                JOptionPane.showMessageDialog(null,"User created successfully");
                new student_login().setVisible(true);
                this.dispose();
                
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Failed to create user");
                pstmt.close();
               con.close();
               
            }
        } catch(Exception e){}

        }else{
            JOptionPane.showMessageDialog(null,"Enter Valid number");
        }
        
       
    }//GEN-LAST:event_signupActionPerformed

    private void mobiletext1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobiletext1KeyTyped
        char c= evt.getKeyChar();
        String p;
        p = Character.toString(c);
       if(!(Character.isDigit(c)) || (c==KeyEvent.VK_BACK_SPACE) || (c==KeyEvent.VK_DELETE) )
       {
           evt.consume();
         
           
       } 
    }//GEN-LAST:event_mobiletext1KeyTyped

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(register_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(register_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(register_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(register_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new register_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel account;
    private javax.swing.JLabel departl;
    private javax.swing.JComboBox<String> departt;
    private javax.swing.JLabel emaill;
    private javax.swing.JTextField emailt;
    private javax.swing.JButton home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton login;
    private javax.swing.JLabel mobilel;
    private javax.swing.JTextField mobiletext1;
    private javax.swing.JLabel namel;
    private javax.swing.JTextField namet;
    private javax.swing.JPanel newpanel;
    private javax.swing.JPanel oldpanel;
    private javax.swing.JLabel passl;
    private javax.swing.JPasswordField passt;
    private javax.swing.JButton reset1;
    private javax.swing.JLabel sign;
    private javax.swing.JButton signup;
    private javax.swing.JLabel userl;
    private javax.swing.JTextField usert;
    private javax.swing.JLabel yearl;
    private javax.swing.JComboBox<String> yeart;
    // End of variables declaration//GEN-END:variables
}
