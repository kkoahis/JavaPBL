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
public class kehoach_thanhtra {

    private int id_kh_tt;
    private int id_user;
    private int id_ch;
    private String ngaythanhtra;
    private String mota;
    private String ketquathanhtra;

    public kehoach_thanhtra() {
    }

    public kehoach_thanhtra(int id_kh_tt, int id_user, int id_ch, String ngaythanhtra, String mota, String ketquathanhtra) {
        this.id_kh_tt = id_kh_tt;
        this.id_user = id_user;
        this.id_ch = id_ch;
        this.ngaythanhtra = ngaythanhtra;
        this.mota = mota;
        this.ketquathanhtra = ketquathanhtra;
    }

    public int getId_kh_tt() {
        return id_kh_tt;
    }

    public void setId_kh_tt(int id_kh_tt) {
        this.id_kh_tt = id_kh_tt;
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

    public String getNgaythanhtra() {
        return ngaythanhtra;
    }

    public void setNgaythanhtra(String ngaythanhtra) {
        this.ngaythanhtra = ngaythanhtra;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getKetquathanhtra() {
        return ketquathanhtra;
    }

    public void setKetquathanhtra(String ketquathanhtra) {
        this.ketquathanhtra = ketquathanhtra;
    }

    public void add_kehoach_thanhtra(int _id_user, int _id_CH, String _dayTT, String _moTa) throws SQLException {
        String insertQuery = "INSERT INTO `kehoach_thanhtra`(`ID_User`, `ID_CH`, `NgayThanhTra`, `MoTa`) VALUES ( ?, ?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setInt(1, _id_user);
            ps.setInt(2, _id_CH);
            ps.setString(3, _dayTT);
            ps.setString(4, _moTa);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "update dtb", "tao ke hoach thanh tra thanh cong", 1);
            } else {
                JOptionPane.showMessageDialog(null, "not update dtb", "tao ke hoach thanh tra khong thanh cong", 0);
            }
        } catch (SQLException e) {
            Logger.getLogger(kehoach_thanhtra.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
