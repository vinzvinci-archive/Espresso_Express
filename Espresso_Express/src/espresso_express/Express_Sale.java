
package espresso_express;

import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Express_Sale extends javax.swing.JFrame {

    public Express_Sale() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        cbMocha.setEnabled(false);
        cbEspresso.setEnabled(false);
        cbCaramel.setEnabled(false);
        cbCaffe.setEnabled(false);
        cbLatte.setEnabled(false);
        cbChocolate.setEnabled(false);
        cbWhite.setEnabled(false);
        cbGreenTea.setEnabled(false);
        
        txtMocha.setEditable(false);
        txtEspresso.setEditable(false);
        txtCaramel.setEditable(false);
        txtCaffe.setEditable(false);
        txtLatte.setEditable(false);
        txtChocolate.setEditable(false);
        txtWhite.setEditable(false);
        txtGreenTea.setEditable(false);
        
        txtSubTotal.setEditable(false);
        txtDiscount.setEditable(false);
        txtChange.setEditable(false);
        txtPayable.setEditable(false);
        
        txtSubTotal.setText("0.00");
        txtMocha.setText("0");
        txtEspresso.setText("0");
        txtCaramel.setText("0");
        txtCaffe.setText("0");
        txtLatte.setText("0");
        txtChocolate.setText("0");
        txtWhite.setText("0");
        txtGreenTea.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        checkGreenTea = new javax.swing.JCheckBox();
        checkChocolate = new javax.swing.JCheckBox();
        checkMocha = new javax.swing.JCheckBox();
        checkWhite = new javax.swing.JCheckBox();
        checkboxEspresso = new javax.swing.JCheckBox();
        checkLatte = new javax.swing.JCheckBox();
        checkCaramel = new javax.swing.JCheckBox();
        checkCaffe = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbMocha = new javax.swing.JComboBox();
        cbCaramel = new javax.swing.JComboBox();
        cbEspresso = new javax.swing.JComboBox();
        cbCaffe = new javax.swing.JComboBox();
        cbLatte = new javax.swing.JComboBox();
        cbChocolate = new javax.swing.JComboBox();
        cbWhite = new javax.swing.JComboBox();
        cbGreenTea = new javax.swing.JComboBox();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtMocha = new javax.swing.JTextField();
        txtEspresso = new javax.swing.JTextField();
        txtCaramel = new javax.swing.JTextField();
        txtCaffe = new javax.swing.JTextField();
        txtLatte = new javax.swing.JTextField();
        txtChocolate = new javax.swing.JTextField();
        txtWhite = new javax.swing.JTextField();
        txtGreenTea = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtDiscount = new javax.swing.JTextField();
        txtChange = new javax.swing.JTextField();
        cbodisc = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerMoney = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPayable = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btncompute = new javax.swing.JButton();
        txtSubTotal = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 102, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 51, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("ESPRESSO EXPRESS");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 14, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 650, 70));

        jPanel3.setBackground(new java.awt.Color(102, 51, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkGreenTea.setBackground(new java.awt.Color(51, 0, 153));
        checkGreenTea.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkGreenTea.setForeground(new java.awt.Color(255, 255, 255));
        checkGreenTea.setText("Green Tea Latte");
        checkGreenTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkGreenTeaActionPerformed(evt);
            }
        });
        jPanel3.add(checkGreenTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 238, -1, -1));

        checkChocolate.setBackground(new java.awt.Color(51, 0, 153));
        checkChocolate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkChocolate.setForeground(new java.awt.Color(255, 255, 255));
        checkChocolate.setText("Chocolate Mocha");
        checkChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkChocolateActionPerformed(evt);
            }
        });
        jPanel3.add(checkChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 186, -1, -1));

        checkMocha.setBackground(new java.awt.Color(51, 0, 153));
        checkMocha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkMocha.setForeground(new java.awt.Color(255, 255, 255));
        checkMocha.setText("Mocha Frappuccino");
        checkMocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkMochaActionPerformed(evt);
            }
        });
        jPanel3.add(checkMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 56, -1, -1));

        checkWhite.setBackground(new java.awt.Color(51, 0, 153));
        checkWhite.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkWhite.setForeground(new java.awt.Color(255, 255, 255));
        checkWhite.setText("White Chocolate");
        checkWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkWhiteActionPerformed(evt);
            }
        });
        jPanel3.add(checkWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 212, -1, -1));

        checkboxEspresso.setBackground(new java.awt.Color(51, 0, 153));
        checkboxEspresso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkboxEspresso.setForeground(new java.awt.Color(255, 255, 255));
        checkboxEspresso.setText("Espresso Macchiato");
        checkboxEspresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkboxEspressoActionPerformed(evt);
            }
        });
        jPanel3.add(checkboxEspresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 82, -1, -1));

        checkLatte.setBackground(new java.awt.Color(51, 0, 153));
        checkLatte.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkLatte.setForeground(new java.awt.Color(255, 255, 255));
        checkLatte.setText("Latte Macchiato");
        checkLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkLatteActionPerformed(evt);
            }
        });
        jPanel3.add(checkLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 160, -1, -1));

        checkCaramel.setBackground(new java.awt.Color(51, 0, 153));
        checkCaramel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkCaramel.setForeground(new java.awt.Color(255, 255, 255));
        checkCaramel.setText("Caramel Macchiato");
        checkCaramel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCaramelActionPerformed(evt);
            }
        });
        jPanel3.add(checkCaramel, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 108, -1, -1));

        checkCaffe.setBackground(new java.awt.Color(51, 0, 153));
        checkCaffe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        checkCaffe.setForeground(new java.awt.Color(255, 255, 255));
        checkCaffe.setText("Caffe Americano");
        checkCaffe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkCaffeActionPerformed(evt);
            }
        });
        jPanel3.add(checkCaffe, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 134, -1, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel2.setText("ITEM");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(49, 49, 49))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 160, 280));

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel4.setText("PRICE");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(39, 39, 39))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel4))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 128, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("PHP 60");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 57, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 0));
        jLabel8.setText("PHP 80");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 83, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("PHP 100");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 111, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("PHP 120");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 137, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("PHP 140");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 163, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("PHP 160");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 189, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 0));
        jLabel14.setText("PHP 180");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 215, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 0));
        jLabel15.setText("PHP 200");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 241, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 150, 280));

        jPanel8.setBackground(new java.awt.Color(102, 51, 0));
        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(204, 204, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel5.setText("Quantity");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 108, -1));

        cbMocha.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbMocha.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbMocha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMochaActionPerformed(evt);
            }
        });
        jPanel8.add(cbMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 51, -1, -1));

        cbCaramel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbCaramel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbCaramel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCaramelActionPerformed(evt);
            }
        });
        jPanel8.add(cbCaramel, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 103, -1, -1));

        cbEspresso.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbEspresso.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbEspresso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbEspressoActionPerformed(evt);
            }
        });
        jPanel8.add(cbEspresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 77, -1, -1));

        cbCaffe.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbCaffe.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbCaffe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCaffeActionPerformed(evt);
            }
        });
        jPanel8.add(cbCaffe, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 129, -1, -1));

        cbLatte.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbLatte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbLatte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLatteActionPerformed(evt);
            }
        });
        jPanel8.add(cbLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 155, -1, -1));

        cbChocolate.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbChocolate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbChocolate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbChocolateActionPerformed(evt);
            }
        });
        jPanel8.add(cbChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 181, -1, -1));

        cbWhite.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbWhite.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbWhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbWhiteActionPerformed(evt);
            }
        });
        jPanel8.add(cbWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 207, -1, -1));

        cbGreenTea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cbGreenTea.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        cbGreenTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGreenTeaActionPerformed(evt);
            }
        });
        jPanel8.add(cbGreenTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 233, -1, -1));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 130, 280));

        jPanel10.setBackground(new java.awt.Color(102, 51, 0));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel11.setBackground(new java.awt.Color(204, 204, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel12.setText("Total");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12))
        );

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 118, -1));
        jPanel10.add(txtMocha, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 58, 72, -1));
        jPanel10.add(txtEspresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 84, 72, -1));
        jPanel10.add(txtCaramel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 110, 72, -1));
        jPanel10.add(txtCaffe, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 136, 72, -1));
        jPanel10.add(txtLatte, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 162, 72, -1));
        jPanel10.add(txtChocolate, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 188, 72, -1));
        jPanel10.add(txtWhite, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 214, 72, -1));
        jPanel10.add(txtGreenTea, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 240, 72, -1));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 140, 280));

        jPanel6.setBackground(new java.awt.Color(102, 51, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(204, 204, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 12)); // NOI18N
        jLabel17.setText("Overall");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 7, 152, -1));
        jPanel6.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 155, 70, -1));
        jPanel6.add(txtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 226, 77, -1));

        cbodisc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Senior", "PWD", "Regular" }));
        cbodisc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbodiscActionPerformed(evt);
            }
        });
        jPanel6.add(cbodisc, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 155, 70, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("Enter Customer's Money");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 79, -1, -1));
        jPanel6.add(txtCustomerMoney, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 100, 146, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("Sub-total:");
        jPanel6.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 55, -1, -1));
        jPanel6.add(txtPayable, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 200, 77, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("Discount");
        jPanel6.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 131, -1, 18));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 0));
        jLabel20.setText("Payable:");
        jPanel6.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 202, -1, -1));

        btncompute.setText("Compute");
        btncompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncomputeActionPerformed(evt);
            }
        });
        jPanel6.add(btncompute, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));
        jPanel6.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 53, 75, -1));

        jButton1.setText("Change");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setText("Change:");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 228, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 170, 320));

        jPanel15.setBackground(new java.awt.Color(102, 51, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Next Order");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel15.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("SALES");
        jPanel15.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 92, 40));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 380, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkGreenTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkGreenTeaActionPerformed
        if (evt.getSource()== checkGreenTea) {
            cbGreenTea.setEnabled(checkGreenTea.isSelected());
        }
    }//GEN-LAST:event_checkGreenTeaActionPerformed

    private void checkChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkChocolateActionPerformed
        if (evt.getSource()== checkChocolate) {
            cbChocolate.setEnabled(checkChocolate.isSelected());
        }
    }//GEN-LAST:event_checkChocolateActionPerformed

    private void checkMochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkMochaActionPerformed
        if (evt.getSource()== checkMocha) {
            cbMocha.setEnabled(checkMocha.isSelected());
        }
    }//GEN-LAST:event_checkMochaActionPerformed

    private void checkWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkWhiteActionPerformed
        if (evt.getSource()== checkWhite) {
            cbWhite.setEnabled(checkWhite.isSelected());
        }
    }//GEN-LAST:event_checkWhiteActionPerformed

    private void checkboxEspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkboxEspressoActionPerformed
        if (evt.getSource()== checkboxEspresso) {
            cbEspresso.setEnabled(checkboxEspresso.isSelected());
        }
    }//GEN-LAST:event_checkboxEspressoActionPerformed

    private void checkLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkLatteActionPerformed
        if (evt.getSource()== checkLatte) {
            cbLatte.setEnabled(checkLatte.isSelected());
        }
    }//GEN-LAST:event_checkLatteActionPerformed

    private void checkCaramelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCaramelActionPerformed
        if (evt.getSource()== checkCaramel) {
            cbCaramel.setEnabled(checkCaramel.isSelected());
        }
    }//GEN-LAST:event_checkCaramelActionPerformed

    private void checkCaffeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkCaffeActionPerformed
        if (evt.getSource()== checkCaffe) {
            cbCaffe.setEnabled(checkCaffe.isSelected());
        }
    }//GEN-LAST:event_checkCaffeActionPerformed

    private void cbMochaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMochaActionPerformed
        String mynum = cbMocha.getSelectedItem().toString();
        int num = Integer.parseInt(mynum);
        int add2 = num * 60;
        txtMocha.setText(Integer.toString(add2));
    }//GEN-LAST:event_cbMochaActionPerformed

    private void cbCaramelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCaramelActionPerformed
        String mynum = cbCaramel.getSelectedItem().toString();
        int num = Integer.parseInt(mynum);
        int add2 = num * 100;
        txtCaramel.setText(Integer.toString(add2));
    }//GEN-LAST:event_cbCaramelActionPerformed

    private void cbEspressoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbEspressoActionPerformed
        String mynum = cbEspresso.getSelectedItem().toString();
        int num = Integer.parseInt(mynum);
        int add2 = num * 80;
        txtEspresso.setText(Integer.toString(add2));

    }//GEN-LAST:event_cbEspressoActionPerformed

    private void cbCaffeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCaffeActionPerformed
        String mynum = cbCaffe.getSelectedItem().toString();
        int num = Integer.parseInt(mynum);
        int add2 = num * 120;
        txtCaffe.setText(Integer.toString(add2));
    }//GEN-LAST:event_cbCaffeActionPerformed

    private void cbLatteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLatteActionPerformed
        String mynum = cbLatte.getSelectedItem().toString();
        int num = Integer.parseInt(mynum);
        int add2 = num * 140;
        txtLatte.setText(Integer.toString(add2));
    }//GEN-LAST:event_cbLatteActionPerformed

    private void cbChocolateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbChocolateActionPerformed
        String mynum = cbChocolate.getSelectedItem().toString();
        int num = Integer.parseInt(mynum);
        int add2 = num * 160;
        txtChocolate.setText(Integer.toString(add2));
    }//GEN-LAST:event_cbChocolateActionPerformed

    private void cbWhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbWhiteActionPerformed
        String mynum = cbWhite.getSelectedItem().toString();
        int num = Integer.parseInt(mynum);
        int add2 = num * 180;
        txtWhite.setText(Integer.toString(add2));
    }//GEN-LAST:event_cbWhiteActionPerformed

    private void cbGreenTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGreenTeaActionPerformed
        String mynum = cbGreenTea.getSelectedItem().toString();
        int num = Integer.parseInt(mynum);
        int add2 = num * 200;
        txtGreenTea.setText(Integer.toString(add2));
    }//GEN-LAST:event_cbGreenTeaActionPerformed

    private void cbodiscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbodiscActionPerformed
        double c=0;
        double sum = Double.parseDouble(txtSubTotal.getText());
        String v = cbodisc.getSelectedItem().toString();
        if (v.contains("Senior")) {
            c = Double.parseDouble(txtSubTotal.getText())*0.10;
            sum -=c;
        }
        else if (v.contains("PWD")) {
            c = Double.parseDouble(txtSubTotal.getText())*0.20;
            sum -=c;
        }
        else {
            c=0;
        }
        String total = String.format("%.2f", c);
        txtDiscount.setText(total);
        //txtDiscount.setText(Double.toString("%.2f", c));

        double tot = Double.parseDouble(txtSubTotal.getText());
        double dis = Double.parseDouble(txtDiscount.getText());
        double sumt=tot-dis;
        String total1 = String.format("%.2f", sum);
        txtPayable.setText(total1);
    }//GEN-LAST:event_cbodiscActionPerformed

    private void btncomputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncomputeActionPerformed
        Double p1, p2, p3, p4, p5, p6, p7, p8;
        Double sum;
        
        p1=Double.parseDouble(txtMocha.getText());
        p2=Double.parseDouble(txtEspresso.getText());
        p3=Double.parseDouble(txtCaramel.getText());
        p4=Double.parseDouble(txtCaffe.getText());
        p5=Double.parseDouble(txtLatte.getText());
        p6=Double.parseDouble(txtChocolate.getText());
        p7=Double.parseDouble(txtWhite.getText());
        p8=Double.parseDouble(txtGreenTea.getText());

        sum=p1+p2+p3+p4+p5+p6+p7+p8;
        String total = String.format("%.2f", sum);
        txtSubTotal.setText(total);
    }//GEN-LAST:event_btncomputeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        double total2 = Double.parseDouble(txtPayable.getText());
        double money = Double.parseDouble(txtCustomerMoney.getText());

        double amount = money-total2;
        String change=String.format("%.2f", amount);
        txtChange.setText(change);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Express_Sale me = new Express_Sale();
        Component frame = null;
        if (JOptionPane.showConfirmDialog(frame, "Do you really want to next order?", "", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            me.setVisible(true);
            me.pack();
            me.setLocationRelativeTo(null);
            me.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Express_Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Express_Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Express_Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Express_Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Express_Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncompute;
    private javax.swing.JComboBox cbCaffe;
    private javax.swing.JComboBox cbCaramel;
    private javax.swing.JComboBox cbChocolate;
    private javax.swing.JComboBox cbEspresso;
    private javax.swing.JComboBox cbGreenTea;
    private javax.swing.JComboBox cbLatte;
    private javax.swing.JComboBox cbMocha;
    private javax.swing.JComboBox cbWhite;
    private javax.swing.JComboBox cbodisc;
    private javax.swing.JCheckBox checkCaffe;
    private javax.swing.JCheckBox checkCaramel;
    private javax.swing.JCheckBox checkChocolate;
    private javax.swing.JCheckBox checkGreenTea;
    private javax.swing.JCheckBox checkLatte;
    private javax.swing.JCheckBox checkMocha;
    private javax.swing.JCheckBox checkWhite;
    private javax.swing.JCheckBox checkboxEspresso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField txtCaffe;
    private javax.swing.JTextField txtCaramel;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtChocolate;
    private javax.swing.JTextField txtCustomerMoney;
    private javax.swing.JTextField txtDiscount;
    private javax.swing.JTextField txtEspresso;
    private javax.swing.JTextField txtGreenTea;
    private javax.swing.JTextField txtLatte;
    private javax.swing.JTextField txtMocha;
    private javax.swing.JTextField txtPayable;
    private javax.swing.JTextField txtSubTotal;
    private javax.swing.JTextField txtWhite;
    // End of variables declaration//GEN-END:variables
}
