package login;

import form.Codes;
import form.Home;
import javax.swing.JOptionPane;
import swing.EventLogin;

public class Login extends PanelCustom {

    private EventLogin event;
    Codes codes = new Codes();
    Home home = new Home();
    public Login() {
        initComponents();
        setAlpha(1);
    }

    public void setEventLogin(EventLogin event) {
        this.event = event;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        textField3 = new swing.TextField();
        password1 = new swing.Password();
        button1 = new swing.Button();

        setBackground(new java.awt.Color(247, 247, 247));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(76, 76, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Giriş");

        textField3.setForeground(new java.awt.Color(76, 76, 76));
        textField3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        textField3.setHint("No");

        password1.setForeground(new java.awt.Color(76, 76, 76));
        password1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        password1.setHint("Şifre");

        button1.setBackground(new java.awt.Color(86, 142, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Giriş");
        button1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(password1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed

        String tempNo = textField3.getText();
        String Password = new String(password1.getPassword());
        if(!(tempNo.isEmpty() || Password.isEmpty())){
            
            int No = Integer.valueOf(tempNo);
            
            home.getNo(No);
       
            boolean loginCheck = codes.LoginInstructors(No, Password);
            boolean loginCheck2 = codes.LoginStudents(No, Password);
            if(loginCheck)
            {
                if (getAlpha() == 0) {
                    textField3.setText("");
                    password1.setText("");
                    event.loginDone2();
                }
            }
            else
            {
                if(loginCheck2)
                {
                    if (getAlpha() == 0) {
                        textField3.setText("");
                        password1.setText("");
                        event.loginDone();
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(this, "Giriş Başarısız!");
                }
            }
        }else JOptionPane.showMessageDialog(this, "Hatalı giriş!!");
    }//GEN-LAST:event_button1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private swing.Password password1;
    private swing.TextField textField3;
    // End of variables declaration//GEN-END:variables
}
