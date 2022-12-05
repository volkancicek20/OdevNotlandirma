package login;

import javax.swing.JOptionPane;
import swing.EventLogin;
import form.Codes;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Register extends PanelCustom {

    private EventLogin event;
    Codes codes = new Codes();
    public Register() {
        initComponents();
    }
    public void setEventLogin(EventLogin event) {
        this.event = event;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        noText = new swing.TextField();
        nameText = new swing.TextField();
        passwordText = new swing.Password();
        button1 = new swing.Button();
        surnameText = new swing.TextField();
        passwordCheckText = new swing.Password();
        bolumComboBox = new swing.Combobox();
        sinifComboBox = new swing.Combobox();

        setBackground(new java.awt.Color(58, 58, 58));

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(242, 242, 242));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Kayıt");

        noText.setForeground(new java.awt.Color(242, 242, 242));
        noText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        noText.setHint("No");
        noText.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                noTextMousePressed(evt);
            }
        });
        noText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                noTextKeyPressed(evt);
            }
        });

        nameText.setForeground(new java.awt.Color(242, 242, 242));
        nameText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        nameText.setHint("Ad");
        nameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTextKeyPressed(evt);
            }
        });

        passwordText.setForeground(new java.awt.Color(242, 242, 242));
        passwordText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        passwordText.setHint("Şifre");

        button1.setBackground(new java.awt.Color(86, 142, 255));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Kayıt Ol");
        button1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        surnameText.setForeground(new java.awt.Color(242, 242, 242));
        surnameText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        surnameText.setHint("Soyad");
        surnameText.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                surnameTextKeyPressed(evt);
            }
        });

        passwordCheckText.setForeground(new java.awt.Color(242, 242, 242));
        passwordCheckText.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        passwordCheckText.setHint("Şifre Onay");

        bolumComboBox.setBackground(new java.awt.Color(58, 58, 58));
        bolumComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bilgisayar Muhendisligi", "Yazilim Muhendisligi", "Elektrik Eloktronik Muhendisligi" }));
        bolumComboBox.setSelectedIndex(-1);
        bolumComboBox.setLabeText("Bölüm");
        bolumComboBox.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bolumComboBoxMouseMoved(evt);
            }
        });

        sinifComboBox.setBackground(new java.awt.Color(58, 58, 58));
        sinifComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4" }));
        sinifComboBox.setSelectedIndex(-1);
        sinifComboBox.setLabeText("Sınıf");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bolumComboBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(nameText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(surnameText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(passwordCheckText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sinifComboBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(noText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(surnameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordCheckText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bolumComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sinifComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        int dpIndex = bolumComboBox.getSelectedIndex();
        int levelIndex = sinifComboBox.getSelectedIndex();
        String No = noText.getText();
        //int No = Integer.valueOf(noText.getText());
        String name = nameText.getText();
        String surname = surnameText.getText();
        String password = new String(passwordText.getPassword());
        String dp = "";
        int level = 0;
        String passwordConfirm = new String(passwordCheckText.getPassword());
        switch(dpIndex){
            case 0:
                dp = "Bilgisayar Muhendisligi";
                break;
            case 1:
                dp = "Yazilim Muhendisligi";
                break;
            case 2:
                dp = "Elektrik Elektronik Muhendisligi";
                break;
            default:
                dp = "Bilgisayar Muhendisligi";    
        }
        level = levelIndex+1;
        if(No.isEmpty() || name.isEmpty() || surname.isEmpty() || password.isEmpty() || !password.equals(passwordConfirm) || dpIndex == -1 || levelIndex == -1){
            
            if(No.isEmpty()){
                JOptionPane.showMessageDialog(this, "Okul numaranızı giriniz.");
            }
            else if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Adınızı giriniz.");
            }
            else if(surname.isEmpty()){
                JOptionPane.showMessageDialog(this, "Soyadınızı giriniz.");
            }
            else if(password.isEmpty()){
                JOptionPane.showMessageDialog(this, "Bir şifre oluşturunuz.");
            }
            else if(!password.equals(passwordConfirm)){
                JOptionPane.showMessageDialog(this, "Şifreniz uyuşmuyor tekrar kontrol ediniz.");
            }
            else if(dpIndex == -1){
                JOptionPane.showMessageDialog(this, "Bölümünüzü giriniz.");
            }
            else if(levelIndex == -1){
                JOptionPane.showMessageDialog(this, "Sınıfınızı giriniz.");
            }
        }
        else{
            int studentNo = Integer.valueOf(No);
            int check = codes.Register(studentNo, name, surname, password,dp, level);
            System.out.println("sorun yok");
            switch (check) {
                case 1:
                    JOptionPane.showMessageDialog(this, "Kayıt Başarılı! Giriş Yapabilirsiniz");
                    noText.setText("");
                    nameText.setText("");
                    surnameText.setText("");
                    passwordText.setText("");
                    passwordCheckText.setText("");
                    bolumComboBox.setSelectedIndex(-1);
                    sinifComboBox.setSelectedIndex(-1);
                    break;
                case -2:
                    JOptionPane.showMessageDialog(this, "Ögrenci Numarası Yanlış!!");
                    noText.setText("");
                    passwordText.setText("");
                    passwordCheckText.setText("");
                    break;
                default:
                    JOptionPane.showMessageDialog(this, "Kayıt Başarısız!");
                    break;
            }
        }
    }//GEN-LAST:event_button1ActionPerformed
    private void noTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_noTextKeyPressed
        char c = evt.getKeyChar();
        if(Character.isLetter(c)){
            noText.setEditable(false);
        }
        else noText.setEditable(true);
    }//GEN-LAST:event_noTextKeyPressed
    private void nameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTextKeyPressed
        char c = evt.getKeyChar();
        int check = Character.getNumericValue(c); 
        if(Character.isLetter(c) || check == -1){
            nameText.setEditable(true);
        }
        else nameText.setEditable(false);
    }//GEN-LAST:event_nameTextKeyPressed

    private void surnameTextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_surnameTextKeyPressed
        char c = evt.getKeyChar();
        int check = Character.getNumericValue(c); 
        if(Character.isLetter(c) || check == -1){
            surnameText.setEditable(true);
            
        }
        else surnameText.setEditable(false);
    }//GEN-LAST:event_surnameTextKeyPressed

    private void noTextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noTextMousePressed
        noText.setEditable(true);
    }//GEN-LAST:event_noTextMousePressed

    private void bolumComboBoxMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bolumComboBoxMouseMoved

    }//GEN-LAST:event_bolumComboBoxMouseMoved


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Combobox bolumComboBox;
    private swing.Button button1;
    private javax.swing.JLabel jLabel1;
    private swing.TextField nameText;
    private swing.TextField noText;
    private swing.Password passwordCheckText;
    private swing.Password passwordText;
    private swing.Combobox sinifComboBox;
    private swing.TextField surnameText;
    // End of variables declaration//GEN-END:variables
}
