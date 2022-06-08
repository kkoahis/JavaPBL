package My_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class quanly_cuahang {

    private int id_qlch;
    private int id_user;
    private int id_ch;
    private String dayadd;
    private String daydel;

    public quanly_cuahang() {
    }

    public quanly_cuahang(int id_qlch, int id_user, int id_ch, String dayadd, String daydel) {
        this.id_qlch = id_qlch;
        this.id_user = id_user;
        this.id_ch = id_ch;
        this.dayadd = dayadd;
        this.daydel = daydel;
    }

    public int getId_qlch() {
        return id_qlch;
    }

    public void setId_qlch(int id_qlch) {
        this.id_qlch = id_qlch;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_ch() {
        return id_ch;
    }

    public void setId_ch(int id_ch) {
        this.id_ch = id_ch;
    }

    public String getDayadd() {
        return dayadd;
    }

    public void setDayadd(String dayadd) {
        this.dayadd = dayadd;
    }

    public String getDaydel() {
        return daydel;
    }

    public void setDaydel(String daydel) {
        this.daydel = daydel;
    }

    public void add_cuahang(int _id_user, int _id_ch, String _dayadd) throws SQLException {
        String insertQuery = "INSERT INTO `quanly_cuahang`(`ID_User`, `ID_CH`, `NgayThemCuaHang`) VALUES ( ?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setInt(1, _id_user);
            ps.setInt(2, _id_ch);
            ps.setString(3, _dayadd);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "update dtb", "them cua hang thanh cong", 1);
            } else {
                JOptionPane.showMessageDialog(null, "not update dtb", "them cua hang khong thanh cong", 0);
            }
        } catch (SQLException e) {
            Logger.getLogger(quanly_cuahang.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
