package tubes_pbo;

public class Login extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Login.class.getName());
    
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Jasa Jahit fmsknknsfg");

        jLabel2.setText("Nama");

        jLabel3.setText("No Telpon");

        jLabel4.setText("Pilih");

        jButton1.setText("Register");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Alamat");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelanggan", "Penjahit", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 157, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField1)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                                    .addComponent(jPasswordField1))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           
    
    //R
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String nama     = jTextField2.getText().trim();   
        String noHp     = jTextField1.getText().trim();   
        String alamat   = jTextField4.getText().trim(); 
        String role     = jComboBox1.getSelectedItem().toString();

        String password = new String(jPasswordField1.getPassword()).trim();
        
        if (nama.isEmpty() || noHp.isEmpty() || alamat.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                    "Semua field harus diisi untuk Register!", 
                    "Peringatan", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (role.equals("Pelanggan")) {
            boolean dataSudahAda = false;
            for (ModelPelanggan p : DataStore.listPelanggan) {
                if (p.getNama().equalsIgnoreCase(nama) && p.getNoHp().equals(noHp)) {
                    dataSudahAda = true;
                    break;
                }
            }

            if (dataSudahAda) {
                javax.swing.JOptionPane.showMessageDialog(this, "Gagal Register! Pelanggan sudah terdaftar.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                DataStore.listPelanggan.add(new ModelPelanggan(nama, noHp, alamat, password));
                javax.swing.JOptionPane.showMessageDialog(this, "Register Pelanggan Berhasil!", "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                jTextField1.setText(""); jTextField2.setText(""); jTextField4.setText(""); jPasswordField1.setText("");
            }
            
        } else if (role.equals("Penjahit")) {
            boolean dataSudahAda = false;
            for (ModelPenjahit p : DataStore.listPenjahit) {
                if (p.getNama().equalsIgnoreCase(nama) && p.getNoHp().equals(noHp)) {
                    dataSudahAda = true;
                    break;
                }
            }

            if (dataSudahAda) {
                javax.swing.JOptionPane.showMessageDialog(this, "Gagal Register! Penjahit sudah terdaftar.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            } else {
                DataStore.listPenjahit.add(new ModelPenjahit(nama, noHp, alamat, password));
                javax.swing.JOptionPane.showMessageDialog(this, "Register Penjahit Berhasil!", "Sukses", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                jTextField1.setText(""); jTextField2.setText(""); jTextField4.setText(""); jPasswordField1.setText("");
            }
        }
    }                                        
    
    //L
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String nama     = jTextField2.getText().trim();   
        String noHp     = jTextField1.getText().trim();   
        String role     = jComboBox1.getSelectedItem().toString();
        
        String password = new String(jPasswordField1.getPassword()).trim();
        
        if (nama.isEmpty() || password.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, 
                    "Nama dan Password harus diisi untuk Login!", 
                    "Peringatan", 
                    javax.swing.JOptionPane.WARNING_MESSAGE);
            return;
        }

        if (role.equals("Pelanggan")) {
            ModelPelanggan ditemukan = null;

            for (ModelPelanggan p : DataStore.listPelanggan) {
                if (p.getNama().equalsIgnoreCase(nama) && p.getPassword().equals(password)) {
                    ditemukan = p;
                    break;
                }
            }

            if (ditemukan != null) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                        "Login Berhasil! Selamat datang, " + ditemukan.getNama(), 
                        "Login Sukses", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
               
                new Pelanggan(ditemukan).setVisible(true); 
                this.dispose(); 
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, 
                        "Login Gagal! Data tidak ditemukan. Silakan Register terlebih dahulu.", 
                        "Error Login", 
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
        } else if (role.equals("Penjahit")) {
            ModelPenjahit ditemukan = null;

            for (ModelPenjahit p : DataStore.listPenjahit) {
                if (p.getNama().equalsIgnoreCase(nama) && p.getPassword().equals(password)) {
                    ditemukan = p;
                    break;
                }
            }

            if (ditemukan != null) {
                javax.swing.JOptionPane.showMessageDialog(this, 
                        "Login Berhasil! Selamat datang Penjahit: " + ditemukan.getNama(), 
                        "Login Sukses", 
                        javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
                new Penjahit().setVisible(true); 
                this.dispose();
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, 
                        "Login Gagal! Data Penjahit tidak ditemukan. Silakan Register terlebih dahulu.", 
                        "Error Login", 
                        javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }                                        

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration                   
}
