/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view.customer;

import controller.CustomerController;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.Customer;
import view.Home;

/**
 *
 * @author Sachii
 */
public class CusReg extends javax.swing.JFrame {

    /**
     * Creates new form CusSignUp
     */
    
    Home h = new Home();
    public CusReg() {
        initComponents();
        clearFields();
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
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        signUp = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        mail = new javax.swing.JTextField();
        contact = new javax.swing.JTextField();
        uname = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        backToHome = new javax.swing.JButton();
        errName = new javax.swing.JLabel();
        errEmail = new javax.swing.JLabel();
        errCon = new javax.swing.JLabel();
        errUname = new javax.swing.JLabel();
        errPass = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 18, 16));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer Registration");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name         :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 89, 134, -1));

        name.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 86, 263, -1));

        signUp.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        signUp.setText("Signup");
        signUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpActionPerformed(evt);
            }
        });
        jPanel1.add(signUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email         :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 145, 134, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Contact     :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 201, 134, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("UserName :");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 257, 134, -1));

        pass.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                passKeyReleased(evt);
            }
        });
        jPanel1.add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 263, -1));

        mail.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailKeyReleased(evt);
            }
        });
        jPanel1.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 142, 263, -1));

        contact.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactKeyPressed(evt);
            }
        });
        jPanel1.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 198, 263, -1));

        uname.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        uname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unameActionPerformed(evt);
            }
        });
        uname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                unameKeyReleased(evt);
            }
        });
        jPanel1.add(uname, new org.netbeans.lib.awtextra.AbsoluteConstraints(166, 254, 263, -1));

        jLabel11.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Password :");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 310, 134, -1));

        backToHome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        backToHome.setText("Back");
        backToHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToHomeActionPerformed(evt);
            }
        });
        jPanel1.add(backToHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        errName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        errName.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(errName, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 260, -1));

        errEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        errEmail.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(errEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 260, 30));

        errCon.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        errCon.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(errCon, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 260, 20));

        errUname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        errUname.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(errUname, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 260, 30));

        errPass.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        errPass.setForeground(new java.awt.Color(204, 0, 0));
        jPanel1.add(errPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 360, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 490, 460));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/signup.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1366, 768));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void unameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_unameActionPerformed

    private void signUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpActionPerformed
        String name = this.name.getText();
        String mail = this.mail.getText();
        String cont = this.contact.getText();
        String uname = this.uname.getText();
        char[] passwordChars = pass.getPassword();
        String pass = new String(passwordChars);

        
        Customer cus = new Customer(name, mail, cont, uname, pass);
        
        
        if(!(errName.getText().isBlank()&&errEmail.getText().isBlank()&&errCon.getText().isBlank()&&errPass.getText().isBlank()&&errUname.getText().isBlank()))
            JOptionPane.showMessageDialog(null, "Fields have errors.");
        else{
            if(name.isBlank()||mail.isBlank()||cont.isBlank()||uname.isBlank()||pass.isBlank())
                JOptionPane.showMessageDialog(null, "All fields are required.");
            else{
                if(CustomerController.addCustomer(cus)){
                    this.name.setText("");
                    this.mail.setText("");
                    this.contact.setText("");
                    this.uname.setText("");
                    this.pass.setText("");
                    dispose();
                    h.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "SignUp is failed.");
                } 
            }
        }
        
       
    }//GEN-LAST:event_signUpActionPerformed

    private void backToHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToHomeActionPerformed
        h.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backToHomeActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        String text = name.getText();
        if (text.startsWith(" ")) {
            errName.setText("Cannot enter spaces first.");
        }else
            errName.setText("");
        
    }//GEN-LAST:event_nameKeyReleased

    private void mailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyReleased
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
        String text = mail.getText();
        Matcher matcher = emailPattern.matcher(text);
        if (!matcher.matches()) {
            errEmail.setText("Invalid email address.");
        }else
            errEmail.setText("");
    }//GEN-LAST:event_mailKeyReleased

    private void contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyPressed
        Pattern numberp = Pattern.compile("^0\\d{8}$");
        String text = contact.getText();
        Matcher matcher = numberp.matcher(text);
        if (!matcher.matches()) {
            errCon.setText("Invalid number.");
        }else
            errCon.setText("");
    }//GEN-LAST:event_contactKeyPressed

    private void unameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_unameKeyReleased
        String text = uname.getText();
        if (text.startsWith(" ")) {
            errUname.setText("Cannot enter spaces first.");
        }else
            errUname.setText("");
    }//GEN-LAST:event_unameKeyReleased

    private void passKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyReleased
        Pattern numberp = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$_%^&+=!]).{6,10}$");
        char[] passwordChars = pass.getPassword();
        String text = new String(passwordChars);
        
        Matcher matcher = numberp.matcher(text);
        if (!matcher.matches()) {
            errPass.setText("Password must be 6-10 chars with upper, lower, digit, and special char.");
        }else
            errPass.setText("");
    }//GEN-LAST:event_passKeyReleased
    private void clearFields(){
        this.name.setText("");
        this.mail.setText("");
        this.contact.setText("");
        this.uname.setText("");
        this.pass.setText("");
        
        this.errName.setText("");
        this.errEmail.setText("");
        this.errCon.setText("");
        this.errUname.setText("");
        this.errPass.setText("");
        
    }
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
            java.util.logging.Logger.getLogger(CusReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CusReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CusReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CusReg.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CusReg().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToHome;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel errCon;
    private javax.swing.JLabel errEmail;
    private javax.swing.JLabel errName;
    private javax.swing.JLabel errPass;
    private javax.swing.JLabel errUname;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField pass;
    private javax.swing.JButton signUp;
    private javax.swing.JTextField uname;
    // End of variables declaration//GEN-END:variables
}
