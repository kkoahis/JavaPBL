package My_Classes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class cap_chungnhan_cuahang {

    private int id_user;
    private int id_CH;
    private String issue_date;
    private String return_date;
    private String mota;
    private String trangthaichungnhan;  //da cap,bi thu hoi, het han

    public cap_chungnhan_cuahang() {
    }

    public cap_chungnhan_cuahang(int id_user, int id_CH, String issue_date, String return_date, String mota, String trangthaichungnhan) {
        this.id_user = id_user;
        this.id_CH = id_CH;
        this.issue_date = issue_date;
        this.return_date = return_date;
        this.mota = mota;
        this.trangthaichungnhan = trangthaichungnhan;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public int getId_CH() {
        return id_CH;
    }

    public void setId_CH(int id_CH) {
        this.id_CH = id_CH;
    }

    public String getTrangthaichungnhan() {
        return trangthaichungnhan;
    }

    public void setTrangthaichungnhan(String trangthaichungnhan) {
        this.trangthaichungnhan = trangthaichungnhan;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getIssue_date() {
        return issue_date;
    }

    public void setIssue_date(String issue_date) {
        this.issue_date = issue_date;
    }

    public String getReturn_date() {
        return return_date;
    }

    public void setReturn_date(String return_date) {
        this.return_date = return_date;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    My_Classes.Book book = new My_Classes.Book();

    public void add_chungnhan_cuahang(int _idCuaHang, int _idChungNhan, String _ngayCap, String _ngayHuy, String _moTa) throws SQLException {
        String insertQuery = "INSERT INTO `cap_chungnhan`(`ID_CH`, `ID_CN`, `NgayCapCN`, `NgayThuHoiCN`, `MoTa`) VALUES ( ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setInt(1, _idCuaHang);
            ps.setInt(2, _idChungNhan);
            ps.setString(3, _ngayCap);
            ps.setString(4, _ngayHuy);
            ps.setString(5, _moTa);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Chứng Nhận Đã Được Cấp", "Cấp chứng nhận", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Chứng nhận chưa được cấp , đã có lỗi gì đó xảy ra", "Cấp chứng nhận", 0);
            }
        } catch (SQLException e) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //check if this book is available
//    public boolean checkCNAvailable(int id_chungnhan) {
//
//        boolean check = false;
//
//        try {
//            ChungNhan selectedCN = book.getBookById(_book_id);
//            int quanlity = selectedBook.getQuanlity();
//
//            get the number of books issue (the same book)
//            int issue_book_count = countData(_book_id);
//
//            if (quanlity > issue_book_count) {
//                availaility = true;
//            } else {
//                availaility = false;
//            }
//
//        } catch (SQLException ex) {
//            Logger.getLogger(cap_chungnhan_cuahang.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//        return availaility;
//    return false;
//    }
    //creat a func to count the number of data
    public int countData(int _book_id) {
        int total = 0;
        ResultSet rs;
        PreparedStatement ps;

        try {
            ps = DB.getConnection().prepareStatement("SELECT COUNT(*) as total FROM `cap_chungnhan` WHERE book_id = ? AND `status` = 'issue'");
            ps.setInt(1, _book_id);
            rs = ps.executeQuery();

            if (rs.next()) {
                total = rs.getInt("total");
            }
        } catch (SQLException ex) {
            Logger.getLogger(cap_chungnhan_cuahang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }

    //func to populate an arraylist with issued/ retruned/ losted book
    public ArrayList<cap_chungnhan_cuahang> chungnhan_cuahang_List(String _status) {

        ArrayList<cap_chungnhan_cuahang> chungnhan_cuahang = new ArrayList<>();
        Func_Class func = new Func_Class();
        String query;

        if (_status.equals("")) {    //if the status emmty then show all data
            query = "SELECT * FROM `cap_chungnhan`";
        } else {                    //show data depending on the selected status
            query = "SELECT * FROM `cap_chungnhan` WHERE `TrangThaiChungNhan` = '" + _status + "'";
        }

        try {
            ResultSet rs = func.getData(query);

            cap_chungnhan_cuahang capCN;

            while (rs.next()) {
                capCN = new cap_chungnhan_cuahang(rs.getInt(1), rs.getInt(2), rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getString(6));
                chungnhan_cuahang.add(capCN);
            }

        } catch (SQLException sQLException) {
            Logger.getLogger(cap_chungnhan_cuahang.class.getName()).log(Level.SEVERE, null, sQLException);
        }
        return chungnhan_cuahang;
    }

    public void update_TrangThaiChungNhan(int _id_CH, int _ID_CN, String _trangthaiCN, String _date_issue, String _date_return, String _mota) throws SQLException {
        String updateQuery = "UPDATE `cap_chungnhan` SET `TranThaiChungNhan`= ?, `NgayThuHoiCN`= ?, `MoTa`=? WHERE `ID_CH` = ? AND `ID_CN` = ? AND `NgayCapCN` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(updateQuery);

            ps.setString(1, _trangthaiCN);
            ps.setString(2, _date_return);
            ps.setString(3, _mota);
            ps.setInt(4, _id_CH);
            ps.setInt(5, _ID_CN);
            ps.setString(6, _date_issue);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Status update", "Cap Chung Nhan Cho Cua Hang", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Status update is not update", "Cap Chung Nhan Cho Cua Hang", 0);
            }
        } catch (SQLException e) {
            Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //remove issue book using the book id - member id and issue date
    //you can add a collum id (make it as the key) into the table and delete using it
    public void deleteChungNhan_CuaHang_Table(int _ID_CH, int _ID_CN, String _date_issue) {
        String removeQuery = "DELETE FROM `cap_chungnhan` WHERE `ID_CH` = ? AND `ID_Cn` = ? AND `ngayCapCN` = ? ";

        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(removeQuery);

            ps.setInt(1, _ID_CH);
            ps.setInt(2, _ID_CN);
            ps.setString(3, _date_issue);

            if (ps.executeUpdate() != 0) {
                JOptionPane.showMessageDialog(null, "Deleted Successfully", "delete book", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Not Deleted", "delete book", 0);
            }
        } catch (SQLException e) {
            Logger.getLogger(cap_chungnhan_cuahang.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
