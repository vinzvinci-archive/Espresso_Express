
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
        
        btnChange.setEnabled(false);
        
        btnSales.setEnabled(false);
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
        cbDiscount = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtCustomerMoney = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPayable = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnCompute = new javax.swing.JButton();
        txtSubTotal = new javax.swing.JTextField();
        btnChange = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        btnSales = new javax.swing.JButton();

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
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel2.setText("ITEM");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 9, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 10, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 160, 280));

        jPanel4.setBackground(new java.awt.Color(102, 51, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(204, 204, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel4.setText("PRICE");
        jPanel7.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 9, -1, -1));

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 128, 30));

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
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel5.setText("QUANTITY");
        jPanel9.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 7, 86, 20));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 108, 30));

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
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel12.setText("TOTAL");
        jPanel11.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 8, -1, -1));

        jPanel10.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 12, 118, 30));
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
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 14)); // NOI18N
        jLabel17.setText("OVERALL");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 9, -1, -1));

        jPanel6.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 7, 152, 30));
        jPanel6.add(txtDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 155, 70, -1));
        jPanel6.add(txtChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 226, 77, -1));

        cbDiscount.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Senior", "PWD", "Regular" }));
        cbDiscount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbDiscountActionPerformed(evt);
            }
        });
        jPanel6.add(cbDiscount, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 155, 70, -1));

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

        btnCompute.setText("Compute");
        btnCompute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComputeActionPerformed(evt);
            }
        });
        jPanel6.add(btnCompute, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));
        jPanel6.add(txtSubTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 53, 75, -1));

        btnChange.setText("Change");
        btnChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangeActionPerformed(evt);
            }
        });
        jPanel6.add(btnChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 0));
        jLabel21.setText("Change:");
        jPanel6.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 228, -1, -1));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 150, 170, 320));

        jPanel15.setBackground(new java.awt.Color(102, 51, 0));
        jPanel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnSales.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSales.setText("VIEW SALES");
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });
        jPanel15.add(btnSales, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 200, 40));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 380, 60));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 550));

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

    private void cbDiscountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbDiscountActionPerformed
        btnChange.setEnabled(true);
        
        double c = 0;
        double sum = Double.parseDouble(txtSubTotal.getText());
        String discount = cbDiscount.getSelectedItem().toString();
        if (discount.contains("Senior")) {
            c = Double.parseDouble(txtSubTotal.getText())*0.10;
            sum -= c;
        }
        else if (discount.contains("PWD")) {
            c = Double.parseDouble(txtSubTotal.getText())*0.20;
            sum -= c;
        }
        else {
            c=0;
        }
        String total = String.format("%.2f", c);
        txtDiscount.setText(total);
        
        String total1 = String.format("%.2f", sum);
        txtPayable.setText(total1);
    }//GEN-LAST:event_cbDiscountActionPerformed

    private void btnComputeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComputeActionPerformed
        Double product1, product2, product3, product4, product5, product6, product7, product8;
        Double sum;
        
        product1 = Double.parseDouble(txtMocha.getText());
        product2 = Double.parseDouble(txtEspresso.getText());
        product3 = Double.parseDouble(txtCaramel.getText());
        product4 = Double.parseDouble(txtCaffe.getText());
        product5 = Double.parseDouble(txtLatte.getText());
        product6 = Double.parseDouble(txtChocolate.getText());
        product7 = Double.parseDouble(txtWhite.getText());
        product8 = Double.parseDouble(txtGreenTea.getText());

        sum = product1 + product2 + product3 + product4 + product5 + product6 + product7 + product8;
        String total = String.format("%.2f", sum);
        txtSubTotal.setText(total);
    }//GEN-LAST:event_btnComputeActionPerformed

    private void btnChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangeActionPerformed
        double total2 = Double.parseDouble(txtPayable.getText());
        double money = Double.parseDouble(txtCustomerMoney.getText());

        double amount = money-total2;
        String change=String.format("%.2f", amount);
        txtChange.setText(change);
        
        btnSales.setEnabled(true);
    }//GEN-LAST:event_btnChangeActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        Sales run = new Sales();
        run.setVisible(true);
        this.dispose();
        
        String mochaQty = cbMocha.getSelectedItem().toString();
        String espressoQty = cbEspresso.getSelectedItem().toString();
        String caramelQty = cbCaramel.getSelectedItem().toString();
        String caffeQty = cbCaffe.getSelectedItem().toString();
        String latteQty = cbLatte.getSelectedItem().toString();
        String chocolateQty = cbChocolate.getSelectedItem().toString();
        String whiteQty = cbWhite.getSelectedItem().toString();
        String greenQty = cbGreenTea.getSelectedItem().toString();
         
        String product1Amount = txtMocha.getText();
        String product2Amount = txtEspresso.getText();
        String product3Amount = txtCaramel.getText();
        String product4Amount = txtCaffe.getText();
        String product5Amount = txtLatte.getText();
        String product6Amount = txtChocolate.getText();
        String product7Amount = txtWhite.getText();
        String product8Amount = txtGreenTea.getText();
       
        String totalSale = txtPayable.getText();
        String discount = txtDiscount.getText();
        
        Sales.txtResults.setText("\n  # |    Description                             |     Price     |     Qty     |      Amount       \n"
                               + "--------------------------------------------------------------------------------------------\n"
                               + "  1 |    Mocha Frappuccino                  PHP 60 " + "         " + mochaQty + "                 " + product1Amount + "\n"
                               + "  2 |    Espresso Macchiato                PHP 80  " + "        " + espressoQty + "                 " + product2Amount + "\n"
                               + "  3 |    Caramel Macchiato                  PHP 100 " + "       " + caramelQty + "                 " + product3Amount + "\n"
                               + "  4 |    Caffe Americano                       PHP 120 " + "       " + caffeQty + "                 " + product4Amount +"\n"
                               + "  5 |    Latte Macchiato                         PHP 140 " + "       " + latteQty + "                 " + product5Amount + "\n"
                               + "  6 |    Chocolate Mocha                      PHP 160 " + "       " + chocolateQty + "                 " + product6Amount + "\n"
                               + "  7 |    White Chocolate                       PHP 180 " + "       " + whiteQty + "                 " + product7Amount + "\n"
                               + "  8 |    Green Tea Latte                        PHP 200 " + "       " + greenQty + "                 " + product8Amount + "\n"
                               + "--------------------------------------------------------------------------------------------\n"
                               + "\n                        Sales Total: " + totalSale + "   |    " + "Discount: " + discount);
    }//GEN-LAST:event_btnSalesActionPerformed

    public static void main(String args[]) {
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
    private javax.swing.JButton btnChange;
    private javax.swing.JButton btnCompute;
    private javax.swing.JButton btnSales;
    private javax.swing.JComboBox cbCaffe;
    private javax.swing.JComboBox cbCaramel;
    private javax.swing.JComboBox cbChocolate;
    private javax.swing.JComboBox cbDiscount;
    private javax.swing.JComboBox cbEspresso;
    private javax.swing.JComboBox cbGreenTea;
    private javax.swing.JComboBox cbLatte;
    private javax.swing.JComboBox cbMocha;
    private javax.swing.JComboBox cbWhite;
    private javax.swing.JCheckBox checkCaffe;
    private javax.swing.JCheckBox checkCaramel;
    private javax.swing.JCheckBox checkChocolate;
    private javax.swing.JCheckBox checkGreenTea;
    private javax.swing.JCheckBox checkLatte;
    private javax.swing.JCheckBox checkMocha;
    private javax.swing.JCheckBox checkWhite;
    private javax.swing.JCheckBox checkboxEspresso;
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
