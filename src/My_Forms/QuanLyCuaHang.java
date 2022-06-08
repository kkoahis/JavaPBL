package My_Forms;

import java.awt.Color;
import java.awt.Font;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class QuanLyCuaHang extends javax.swing.JFrame {

    /**
     * Creates new form ManageGenresForm
     */
    My_Classes.CuaHang authors = new My_Classes.CuaHang();

    public QuanLyCuaHang() {
        initComponents();
        this.setLocationRelativeTo(null);

        Border panelHeaderBorder = BorderFactory.createMatteBorder(2, 2, 2, 2, new Color(1, 50, 67));
        jPanel1.setBorder(panelHeaderBorder);

        //display image
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        func.displayImage(60, 60, null, "/My_Images/icons8_user_typing_using_typewriter_80px.png", jLabel_Form_Title);

        //custon the table
        func.customTable(jTable_Author);

        //custom the headertable
        func.customTableHeader(jTable_Author, new Color(199, 21, 133), 15);

        //hide the jlable "empty name message"
        jLabel_EmptyTenCH_.setVisible(false);
        jLabel_EmptyTenChuCH_.setVisible(false);

        //show all genres from sql
        populateJtableWithAuthor();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel_Form_Title = new javax.swing.JLabel();
        jLabel_Close = new javax.swing.JLabel();
        jLabel_ID = new javax.swing.JLabel();
        jLabel2_TenCH = new javax.swing.JLabel();
        jTextField_ID = new javax.swing.JTextField();
        jTextField_TenCH = new javax.swing.JTextField();
        jButton_Reset_ = new javax.swing.JButton();
        jButton_Delete_ = new javax.swing.JButton();
        jButton_Edit_ = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Author = new javax.swing.JTable();
        jLabel_EmptyTenCH_ = new javax.swing.JLabel();
        jLabel_DiaChi = new javax.swing.JLabel();
        jTextField_DiaChi = new javax.swing.JTextField();
        jLabel_EmptyTenChuCH_ = new javax.swing.JLabel();
        jLabel4_TenChuCH = new javax.swing.JLabel();
        jTextField_TenChuCH = new javax.swing.JTextField();
        jLabel_Hotline = new javax.swing.JLabel();
        jTextField_Hotline = new javax.swing.JTextField();
        jLabel_SLCN = new javax.swing.JLabel();
        jTextField_SLCN = new javax.swing.JTextField();
        jLabel_EmptyDiaChi_ = new javax.swing.JLabel();
        jLabel_EmptyHotline_ = new javax.swing.JLabel();
        jLabel_EmptySLCN_ = new javax.swing.JLabel();
        jButton_Add_1 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel_Form_Title.setBackground(new java.awt.Color(102, 69, 142));
        jLabel_Form_Title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel_Form_Title.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Form_Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Form_Title.setText("QUẢN LÝ CỬA HÀNG");
        jLabel_Form_Title.setOpaque(true);

        jLabel_Close.setBackground(new java.awt.Color(102, 69, 142));
        jLabel_Close.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Close.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_Close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Close.setText("X");
        jLabel_Close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel_Close.setOpaque(true);
        jLabel_Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_CloseMouseClicked(evt);
            }
        });

        jLabel_ID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_ID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_ID.setText("ID:");

        jLabel2_TenCH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2_TenCH.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2_TenCH.setText("Tên CH:");

        jTextField_ID.setEditable(false);
        jTextField_ID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jTextField_TenCH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton_Reset_.setBackground(new java.awt.Color(153, 153, 153));
        jButton_Reset_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Reset_.setText("RESET");
        jButton_Reset_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Reset_ActionPerformed(evt);
            }
        });

        jButton_Delete_.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Delete_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Delete_.setText("XÓA");
        jButton_Delete_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Delete_ActionPerformed(evt);
            }
        });

        jButton_Edit_.setBackground(new java.awt.Color(255, 255, 153));
        jButton_Edit_.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Edit_.setText("SỬA");
        jButton_Edit_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Edit_ActionPerformed(evt);
            }
        });

        jTable_Author.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable_Author.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable_Author.setAutoscrolls(false);
        jTable_Author.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jTable_Author.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AuthorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Author);

        jLabel_EmptyTenCH_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyTenCH_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyTenCH_.setText("* Nhập Tên CH");
        jLabel_EmptyTenCH_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyTenCH_MouseClicked(evt);
            }
        });

        jLabel_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_DiaChi.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_DiaChi.setText("Địa Chỉ:");

        jTextField_DiaChi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_EmptyTenChuCH_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyTenChuCH_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyTenChuCH_.setText("* Nhập tên chủ cửa hàng");
        jLabel_EmptyTenChuCH_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyTenChuCH_MouseClicked(evt);
            }
        });

        jLabel4_TenChuCH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4_TenChuCH.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4_TenChuCH.setText("Tên Chủ CH");

        jTextField_TenChuCH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_TenChuCH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_TenChuCHActionPerformed(evt);
            }
        });

        jLabel_Hotline.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_Hotline.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_Hotline.setText("Hotline:");

        jTextField_Hotline.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel_SLCN.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel_SLCN.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel_SLCN.setText("SLCN :");

        jTextField_SLCN.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField_SLCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SLCNActionPerformed(evt);
            }
        });

        jLabel_EmptyDiaChi_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyDiaChi_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyDiaChi_.setText("* Nhập địa chỉ");
        jLabel_EmptyDiaChi_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyDiaChi_MouseClicked(evt);
            }
        });

        jLabel_EmptyHotline_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptyHotline_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptyHotline_.setText("* Nhập Hotline");
        jLabel_EmptyHotline_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptyHotline_MouseClicked(evt);
            }
        });

        jLabel_EmptySLCN_.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel_EmptySLCN_.setForeground(new java.awt.Color(255, 102, 102));
        jLabel_EmptySLCN_.setText("* Nhập SL Chứng Nhận");
        jLabel_EmptySLCN_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_EmptySLCN_MouseClicked(evt);
            }
        });

        jButton_Add_1.setBackground(new java.awt.Color(153, 255, 153));
        jButton_Add_1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton_Add_1.setText("THÊM");
        jButton_Add_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Add_1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_Close, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2_TenCH, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel_EmptyTenCH_)
                                .addGap(172, 172, 172))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_ID)
                                    .addComponent(jTextField_TenCH))
                                .addGap(1023, 1023, 1023))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel_SLCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4_TenChuCH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                    .addComponent(jLabel_Hotline, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(jLabel_DiaChi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton_Add_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField_Hotline)
                                            .addComponent(jTextField_SLCN)
                                            .addComponent(jTextField_DiaChi)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel_EmptyDiaChi_)
                                                    .addComponent(jLabel_EmptyHotline_)
                                                    .addComponent(jLabel_EmptyTenChuCH_)
                                                    .addComponent(jLabel_EmptySLCN_))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addComponent(jTextField_TenChuCH)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addComponent(jButton_Delete_, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton_Edit_, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addComponent(jButton_Reset_, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(23, 23, 23)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_Delete_, jButton_Edit_, jButton_Reset_});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_Close, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                    .addComponent(jLabel_Form_Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_ID)
                            .addComponent(jTextField_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2_TenCH)
                            .addComponent(jTextField_TenCH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_EmptyTenCH_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4_TenChuCH)
                            .addComponent(jTextField_TenChuCH, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_EmptyTenChuCH_)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_DiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_DiaChi))
                        .addGap(8, 8, 8)
                        .addComponent(jLabel_EmptyDiaChi_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Hotline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_Hotline))
                        .addGap(17, 17, 17)
                        .addComponent(jLabel_EmptyHotline_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_SLCN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_SLCN))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_EmptySLCN_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Reset_)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Delete_)
                            .addComponent(jButton_Edit_)
                            .addComponent(jButton_Add_1))
                        .addGap(24, 24, 24))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton_Delete_, jButton_Edit_});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_CloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel_CloseMouseClicked

    private void jButton_Reset_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Reset_ActionPerformed
         jTextField_ID.setText("");
            jTextField_TenCH.setText("");
            jTextField_TenChuCH.setText("");
            jTextField_DiaChi.setText("");
            jTextField_Hotline.setText("");
            jTextField_SLCN.setText("");
    }//GEN-LAST:event_jButton_Reset_ActionPerformed

    private void jButton_Edit_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Edit_ActionPerformed

        String TenCH = jTextField_TenCH.getText();
        String TenChuCH = jTextField_TenChuCH.getText();
        String DiaChi = jTextField_DiaChi.getText();
        String Hotline = jTextField_Hotline.getText();
        String SLCN = jTextField_SLCN.getText();
        
         if (TenCH.isEmpty()) {
            jLabel_EmptyTenCH_.setVisible(true);

        } else if (TenChuCH.isEmpty()) {
            jLabel_EmptyTenChuCH_.setVisible(true);
        }
        else if (DiaChi.isEmpty()) {
            jLabel_EmptyDiaChi_.setVisible(true);
        }
        else if (Hotline.isEmpty()) {
            jLabel_EmptyHotline_.setVisible(true);
        }
        else if (SLCN.isEmpty()) {
            jLabel_EmptySLCN_.setVisible(true);
        }else {
            try {
                try {
                    int id = Integer.parseInt(jTextField_ID.getText());
                    authors.editAuthor(id, TenCH, TenChuCH, DiaChi, Hotline, Integer.parseInt(SLCN));
                    //refresh the jtable after we edit
                    populateJtableWithAuthor();

                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyCuaHang.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "Error", 0);
            }
        }
    }//GEN-LAST:event_jButton_Edit_ActionPerformed

    private void jButton_Delete_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Delete_ActionPerformed
        try {
            int id = Integer.parseInt(jTextField_ID.getText());
            authors.deleteAuthor(id);
            //refresh the jtable after we delete
            populateJtableWithAuthor();
            jTextField_ID.setText("");
            jTextField_TenCH.setText("");
            jTextField_TenChuCH.setText("");
            jTextField_DiaChi.setText("");
            jTextField_Hotline.setText("");
            jTextField_SLCN.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(QuanLyCuaHang.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Invalid Genre ID" + e.getMessage(), "Error", 0);
        }
    }//GEN-LAST:event_jButton_Delete_ActionPerformed

    private void jTable_AuthorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AuthorMouseClicked
        //display the selected genres
        //get the selected row index
        int index = jTable_Author.getSelectedRow();

        //get values;
        String id = jTable_Author.getValueAt(index, 0).toString();
        String firstName = jTable_Author.getValueAt(index, 1).toString();
        String TenChuCH = jTable_Author.getValueAt(index, 2).toString();
        String DiaChi = jTable_Author.getValueAt(index, 3).toString();
        String Hotline = jTable_Author.getValueAt(index, 4).toString();

        //show data in textfield
        jTextField_ID.setText(id);
        jTextField_TenCH.setText(firstName);
        jTextField_TenChuCH.setText(TenChuCH);
        jTextField_DiaChi.setText(DiaChi);
        jTextField_Hotline.setText(Hotline);

    }//GEN-LAST:event_jTable_AuthorMouseClicked

    public void populateJtableWithAuthor() {
        ArrayList<My_Classes.CuaHang> authorsList = authors.authorsList();

        //jtable collums
        String[] colNames = {"ID", "TÊN CỬA HÀNG", "CHỦ SỠ HỮU", "ĐỊA CHỈ", "HOTLINE", "SL CHỨNG NHẬN"};
        //jtable row
        Object[][] rows = new Object[authorsList.size()][colNames.length];

        for (int i = 0; i < authorsList.size(); i++) {
            rows[i][0] = authorsList.get(i).getId();
            rows[i][1] = authorsList.get(i).getCuaHang();
            rows[i][2] = authorsList.get(i).getTenChuCuaHang();
            rows[i][3] = authorsList.get(i).getDiaChi();
            rows[i][4] = authorsList.get(i).getHotline();
            rows[i][5] = authorsList.get(i).getSLCN();
        }

        DefaultTableModel model = new DefaultTableModel(rows, colNames);
        jTable_Author.setModel(model);
    }

    private void jLabel_EmptyTenCH_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyTenCH_MouseClicked
        //hide this jlable on click 
        jLabel_EmptyTenCH_.setVisible(false);
        jLabel_EmptyTenChuCH_.setVisible(false);
    }//GEN-LAST:event_jLabel_EmptyTenCH_MouseClicked

    private void jLabel_EmptyTenChuCH_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyTenChuCH_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyTenChuCH_MouseClicked

    private void jTextField_TenChuCHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_TenChuCHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_TenChuCHActionPerformed

    private void jLabel_EmptyDiaChi_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyDiaChi_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyDiaChi_MouseClicked

    private void jLabel_EmptyHotline_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptyHotline_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptyHotline_MouseClicked

    private void jLabel_EmptySLCN_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_EmptySLCN_MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel_EmptySLCN_MouseClicked

    private void jTextField_SLCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SLCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SLCNActionPerformed

    private void jButton_Add_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Add_1ActionPerformed
        String TenCH = jTextField_TenCH.getText();
        String TenChuCH = jTextField_TenChuCH.getText();
        String DiaChi = jTextField_DiaChi.getText();
        String Hotline = jTextField_Hotline.getText();
        String SLCN = jTextField_SLCN.getText();
        
         if (TenCH.isEmpty()) {
            jLabel_EmptyTenCH_.setVisible(true);

        } else if (TenChuCH.isEmpty()) {
            jLabel_EmptyTenChuCH_.setVisible(true);
        }
        else if (DiaChi.isEmpty()) {
            jLabel_EmptyDiaChi_.setVisible(true);
        }
        else if (Hotline.isEmpty()) {
            jLabel_EmptyHotline_.setVisible(true);
        }
        else if (SLCN.isEmpty()) {
            jLabel_EmptySLCN_.setVisible(true);
        }else {
            try {
                try {
                    
                    authors.addAuthor( TenCH, TenChuCH, DiaChi, Hotline, Integer.parseInt(SLCN));
                    //refresh the jtable after we edit
                    populateJtableWithAuthor();

                } catch (SQLException ex) {
                    Logger.getLogger(QuanLyCuaHang.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid Author ID - " + ex.getMessage(), "Error", 0);
            }
        }
    }//GEN-LAST:event_jButton_Add_1ActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyCuaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyCuaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyCuaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyCuaHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyCuaHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Add_1;
    private javax.swing.JButton jButton_Delete_;
    private javax.swing.JButton jButton_Edit_;
    private javax.swing.JButton jButton_Reset_;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2_TenCH;
    private javax.swing.JLabel jLabel4_TenChuCH;
    private javax.swing.JLabel jLabel_Close;
    private javax.swing.JLabel jLabel_DiaChi;
    private javax.swing.JLabel jLabel_EmptyDiaChi_;
    private javax.swing.JLabel jLabel_EmptyHotline_;
    private javax.swing.JLabel jLabel_EmptySLCN_;
    private javax.swing.JLabel jLabel_EmptyTenCH_;
    private javax.swing.JLabel jLabel_EmptyTenChuCH_;
    private javax.swing.JLabel jLabel_Form_Title;
    private javax.swing.JLabel jLabel_Hotline;
    private javax.swing.JLabel jLabel_ID;
    private javax.swing.JLabel jLabel_SLCN;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Author;
    private javax.swing.JTextField jTextField_DiaChi;
    private javax.swing.JTextField jTextField_Hotline;
    private javax.swing.JTextField jTextField_ID;
    private javax.swing.JTextField jTextField_SLCN;
    private javax.swing.JTextField jTextField_TenCH;
    private javax.swing.JTextField jTextField_TenChuCH;
    // End of variables declaration//GEN-END:variables
}