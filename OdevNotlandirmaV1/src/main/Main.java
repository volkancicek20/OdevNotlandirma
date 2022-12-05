package main;

import form.Home;
import form.InstructorHome;
import swing.EventLogin;


public class Main extends javax.swing.JFrame {
    
    private Home home;
    private InstructorHome ihome;
    public Main() {
        initComponents();
        home = new Home();
        ihome = new InstructorHome();
        EventLogin event = new EventLogin() {
            @Override
            public void loginDone() {
                main.removeAll();
                main.add(home);
                main.revalidate();
                main.repaint();
            }
            @Override
            public void loginDone2() {
                main.removeAll();
                main.add(ihome);
                main.revalidate();
                main.repaint();
            }
            @Override
            public void logOut() {
                main.removeAll();
                main.add(loginAndRegister1);
                main.revalidate();
                main.repaint();
            }
            /*public void uptadeHomePanel() {
                main.removeAll();
                main.add(home);
                main.revalidate();
                main.repaint();
            }
            public void uptadeInstructorHomePanel() {
                main.removeAll();
                main.add(ihome);
                main.revalidate();
                main.repaint();
            }*/
        };
        loginAndRegister1.setEventLogin(event);
        home.setEventLogin(event);
        ihome.setEventLogin(event);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        loginAndRegister1 = new login.LoginAndRegister();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1080, 770));

        main.setLayout(new java.awt.BorderLayout());
        main.add(loginAndRegister1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 1309, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private login.LoginAndRegister loginAndRegister1;
    private javax.swing.JPanel main;
    // End of variables declaration//GEN-END:variables
}
