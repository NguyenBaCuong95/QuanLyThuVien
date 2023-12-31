/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package serverview;


import Model.DanhMucTaiLieu;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class SuaDanhMucTaiLieu extends javax.swing.JDialog implements ActionListener{
private TrangChuThuThu trangChuThuThu;
private DanhMucTaiLieu theLoaiSach;
    /**
     * Creates new form SuaTheLoaiSach
     */
    public SuaDanhMucTaiLieu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        addActionListener();
        trangChuThuThu = (TrangChuThuThu) parent;
        URL url = this.getClass().getResource("dmtl.png");
        Image img = Toolkit.getDefaultToolkit().createImage(url);
        this.setIconImage(img);
    }

    public SuaDanhMucTaiLieu(DanhMucTaiLieu theLoaiSach,java.awt.Frame parent , boolean modal) {
       this(parent, modal);
        this.theLoaiSach = theLoaiSach;
        showData();
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
        txtmatheloaisach = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txttentheloaisach = new javax.swing.JTextField();
        btncapnhat = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnhuybo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("CHỈNH SỬA THÔNG TIN THỂ LOẠI SÁCH");

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÔNG TIN THỂ LOẠI SÁCH");
        jLabel1.setOpaque(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 51));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Mã danh mục");

        txtmatheloaisach.setEditable(false);
        txtmatheloaisach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Tên danh mục");

        txttentheloaisach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btncapnhat.setBackground(new java.awt.Color(0, 102, 102));
        btncapnhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btncapnhat.setForeground(new java.awt.Color(255, 255, 255));
        btncapnhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/capnhat.png"))); // NOI18N
        btncapnhat.setText("Cập nhật");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtmatheloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncapnhat))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txttentheloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(btnxoa)
                                .addGap(29, 29, 29)
                                .addComponent(btnhuybo)))
                        .addGap(22, 22, 22))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtmatheloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttentheloaisach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 138, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnxoa)
                    .addComponent(btncapnhat)
                    .addComponent(btnhuybo))
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

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
            java.util.logging.Logger.getLogger(SuaDanhMucTaiLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SuaDanhMucTaiLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SuaDanhMucTaiLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SuaDanhMucTaiLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SuaDanhMucTaiLieu dialog = new SuaDanhMucTaiLieu(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btncapnhat;
    private javax.swing.JButton btnhuybo;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtmatheloaisach;
    private javax.swing.JTextField txttentheloaisach;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
         var obj = e.getSource();
        if (obj.equals(btncapnhat)) {
            capNhatTheLoaiSach();
        } else if (obj.equals(btnhuybo)) {
            this.dispose();
        } else if (obj.equals(btnxoa)) {
            clearInputData();
        }
    }

    private void addActionListener() {
        btncapnhat.addActionListener(this);
        btnhuybo.addActionListener(this);
        btnxoa.addActionListener(this);
    }

    private void showData() {
        txtmatheloaisach.setText(String.valueOf(theLoaiSach.getMadm()));
        txttentheloaisach.setText(theLoaiSach.getTendm());
    }

    private void capNhatTheLoaiSach() {
        var a = txtmatheloaisach.getText();
        var b= txttentheloaisach.getText();
         if (a.isEmpty() || b.isEmpty() ){
         JOptionPane.showMessageDialog(rootPane, "Các ô "
                    + "nhập liệu không được để trống");
        }
          else{ theLoaiSach.setTendm(b);
          trangChuThuThu.suathongtintheloaisach(theLoaiSach);
           JOptionPane.showMessageDialog(rootPane,
                        "Cập nhật thông tin  thành công");
                dispose();
             
         }
    }

    private void clearInputData() {
        //txtmatheloaisach.setText("");
        txttentheloaisach.setText("");
    }
}
