/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package serverview;

import Exception.InvalidGiaException;
import Exception.InvalidNamSanXuatException;
import Exception.InvalidSoLuongException;
import Model.TaiLieu;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import connectsql.KetNoiSql;


/**
 *
 * @author Admin
 */
public class ThemTaiLieu extends javax.swing.JDialog implements ActionListener {

    private TrangChuThuThu trangChuThuThu;
    private TaiLieu sach;
    private List<TaiLieu> sachs;

    /**
     * Creates new form ThemSach
     */
    public ThemTaiLieu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        showcombotl();
        showcombonxb();
        addActionListener();
        trangChuThuThu = (TrangChuThuThu) parent;
        URL url = this.getClass().getResource("dmtl.png");
        Image img = Toolkit.getDefaultToolkit().createImage(url);
        this.setIconImage(img);
    }

    public ThemTaiLieu(java.awt.Frame parent, boolean modal, List<TaiLieu> sachs) {
        this(parent, modal);
        this.sachs = sachs;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtmasach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttensach = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtnamxb = new javax.swing.JTextField();
        txttacgia = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtsoluongcon = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        combodanhmuc = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtnoidung = new javax.swing.JTextArea();
        btnthemmoi = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnhuybo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtgiasach = new javax.swing.JTextField();
        combonxb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("THÊM MỚI TÀI LIỆU");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÊM TÀI LIỆU");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 547, 39));

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã tài liệu");

        txtmasach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tên tài liệu");

        txttensach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Số lượng ");

        txtnamxb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txttacgia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nhà xuất bản");

        txtsoluongcon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Năm xuất bản");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Tác giả");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Danh mục");

        combodanhmuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Tóm tắt nội dung");

        txtnoidung.setColumns(20);
        txtnoidung.setLineWrap(true);
        txtnoidung.setRows(5);
        txtnoidung.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtnoidung);

        btnthemmoi.setBackground(new java.awt.Color(0, 102, 102));
        btnthemmoi.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnthemmoi.setForeground(new java.awt.Color(255, 255, 255));
        btnthemmoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/themsach.png"))); // NOI18N
        btnthemmoi.setText("Thêm mới ");

        btnxoa.setBackground(new java.awt.Color(0, 102, 102));
        btnxoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnxoa.setForeground(new java.awt.Color(255, 255, 255));
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/xoa.png"))); // NOI18N
        btnxoa.setText("Xoá dữ liệu");

        btnhuybo.setBackground(new java.awt.Color(0, 102, 102));
        btnhuybo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnhuybo.setForeground(new java.awt.Color(255, 255, 255));
        btnhuybo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/huybo.png"))); // NOI18N
        btnhuybo.setText("Huỷ bỏ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Giá ");

        txtgiasach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        combonxb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(btnthemmoi)
                .addGap(57, 57, 57)
                .addComponent(btnxoa)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtnamxb, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(combodanhmuc, 0, 309, Short.MAX_VALUE)
                                        .addComponent(txttacgia)
                                        .addComponent(combonxb, 0, 309, Short.MAX_VALUE))
                                    .addComponent(txtsoluongcon, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(49, 49, 49))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnhuybo)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtmasach, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                        .addComponent(txttensach, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                                        .addComponent(txtgiasach)))
                                .addGap(64, 64, 64))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtmasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txttensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combodanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txttacgia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(combonxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnamxb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtsoluongcon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtgiasach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnthemmoi)
                    .addComponent(btnxoa)
                    .addComponent(btnhuybo))
                .addGap(14, 14, 14))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 45, -1, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(ThemTaiLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemTaiLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemTaiLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemTaiLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemTaiLieu dialog = new ThemTaiLieu(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnhuybo;
    private javax.swing.JButton btnthemmoi;
    private javax.swing.JButton btnxoa;
    private javax.swing.JComboBox<String> combodanhmuc;
    private javax.swing.JComboBox<String> combonxb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtgiasach;
    private javax.swing.JTextField txtmasach;
    private javax.swing.JTextField txtnamxb;
    private javax.swing.JTextArea txtnoidung;
    private javax.swing.JTextField txtsoluongcon;
    private javax.swing.JTextField txttacgia;
    private javax.swing.JTextField txttensach;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        var obj = e.getSource();
        if (obj.equals(btnthemmoi)) {
            themSach();
        } else if (obj.equals(btnhuybo)) {
            this.dispose();
        } else if (obj.equals(btnxoa)) {
            clearInputData();
        }
    }

    private void addActionListener() {
        btnhuybo.addActionListener(this);
        btnthemmoi.addActionListener(this);
        btnxoa.addActionListener(this);
    }

    private void clearInputData() {
        var str = "";
        txtmasach.setText(str);
        txtnamxb.setText(str);
       
        txtnoidung.setText(str);
        txtsoluongcon.setText(str);
        txttacgia.setText(str);
        txttensach.setText(str);
        txtgiasach.setText(str);
        combodanhmuc.setSelectedIndex(0);
        combonxb.setSelectedIndex(0);
    }

    private void themSach() {
        var tensach = txttensach.getText();
        var ma = txtmasach.getText();
        var nd = txtnoidung.getText();
       var gia = txtgiasach.getText();
        var tl = combodanhmuc.getSelectedItem().toString();
        var tacgia = txttacgia.getText();
        var nxb = combonxb.getSelectedItem().toString();
        var namxb = txtnamxb.getText();
        var soluong = txtsoluongcon.getText();
        if (tensach.isEmpty() || ma.isEmpty() || nd.isEmpty() || tacgia.isEmpty()
                || nxb.isEmpty() || namxb.isEmpty() || soluong.isEmpty()|| gia.isEmpty() ) {
            JOptionPane.showMessageDialog(rootPane, "Các ô "
                    + "nhập liệu không được để trống");
        }else{
//            if(Integer.parseInt(soluong)<0||Integer.parseInt(namxb)<0||Integer.parseInt(gia)<0){
//            JOptionPane.showMessageDialog(rootPane, "Vui lòng kiểm tra lại số lượng, giá tài liệu và năm xuất bản ");
//                    
//            }
           
                try {                               
                    sach = new TaiLieu(ma,tensach, KetNoiSql.laymadanhmucduavaoten(tl), tacgia,KetNoiSql.laymanxbduavaoten(nxb)
                            , namxb, soluong,
                            nd, gia);
                  if(sachs.contains(sach)){
                JOptionPane.showMessageDialog(rootPane,
                        "Tài liệu có mã "+ ma +" đã tồn tại");
                }
                  else{
                trangChuThuThu.themSachCallBack(sach);
                JOptionPane.showMessageDialog(rootPane,
                        "Thêm tài liệu thành công");}
                } catch (InvalidSoLuongException ex) {
                   JOptionPane.showMessageDialog(rootPane,
                        ex.getMessage());
                } catch (InvalidGiaException ex) {
                    JOptionPane.showMessageDialog(rootPane,
                        ex.getMessage());
                } catch (InvalidNamSanXuatException ex) {
                    JOptionPane.showMessageDialog(rootPane,
                        ex.getMessage());
                }
            
        
        
//        if(Integer.parseInt(sach.getSoLuongCon())<0){
//        JOptionPane.showMessageDialog(rootPane, "Số lượng tài liệu phải lớn hơn 0");
//        }
//         if(Integer.parseInt(sach.getNamXuatBan())<0){
//        JOptionPane.showMessageDialog(rootPane, "Năm xuất bản phải lớn hơn 0");
//        }
//          if(Integer.parseInt(sach.getGiasach())<0){
//        JOptionPane.showMessageDialog(rootPane, "Giá của tài liệu phải >=0");
//        }
        
        }
    }

    private void showcombotl() {
        var theloais = KetNoiSql.layTenTheLoaiSachSql();
        for (String str : theloais) {
            combodanhmuc.addItem(str);
        }
    }

    private void showcombonxb() {
         var theloais = KetNoiSql.layTennxbSql();
        for (String str : theloais) {
            combonxb.addItem(str);
        }
    }
}
