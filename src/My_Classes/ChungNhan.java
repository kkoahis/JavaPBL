package My_Classes;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.HashMap;

/**
 *
 * @author Nguyễn Văn Khoa
 */
public class ChungNhan {

    private int id;
    private String name;
    private byte[] anhchungnhan;

    public byte[] getAnhchungnhan() {
        return anhchungnhan;
    }

    public void setAnhchungnhan(byte[] anhchungnhan) {
        this.anhchungnhan = anhchungnhan;
    }

    public ChungNhan() {
    }

    public ChungNhan(int id, String name, byte[] anhchungnhan) {
        this.id = id;
        this.name = name;
        this.anhchungnhan = anhchungnhan;
    }

    public ChungNhan(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addChungNhan(String _name, byte [] _anhchungnhan) throws SQLException {
        String insertQuery = "INSERT INTO `chungnhan_atvstp`(`TenChungNhan`, `AnhChungNhan`, `tontai_khongtontai`) VALUES (?, ?, true)";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(insertQuery);

            ps.setString(1, _name);
            ps.setBytes(2, _anhchungnhan);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Chứng nhận đã được thêm", "Thêm Chứng Nhận", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Chứng nhận đã được thêm", "Thêm Chứng Nhận", 0);
            }

        } catch (SQLException e) {
            Logger.getLogger(ChungNhan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //edit genres by id
    public void editChungNhan(int _id, String _name, byte[] _anhchungnhan) throws SQLException {
        
        String updateQuery = "";
        PreparedStatement ps;
        
         try {
            if (_anhchungnhan != null) {   //if you want to update the image
                updateQuery = "UPDATE `chungnhan_atvstp` SET `TenChungNhan`= ?, `AnhChungNhan` = ? WHERE `ID_CN` = ?";
                ps = DB.getConnection().prepareStatement(updateQuery);

                ps.setString(1, _name);
                ps.setBytes(2, _anhchungnhan);
                ps.setInt(3, _id);
            } else {        //else not update
                updateQuery = "UPDATE `chungnhan_atvstp` SET `TenChungNhan`= ? WHERE `ID_CN` = ?";
                ps = DB.getConnection().prepareStatement(updateQuery);

                ps.setString(1, _name);
                ps.setInt(2, _id);
            }

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Chứng nhân đã được chỉnh sửa", "Chỉnh sửa chứng nhận", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Chứng nhận chưa được chỉnh sửa", "Lỗi", 0);
            }
        } catch (SQLException e) {
            Logger.getLogger(ChungNhan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    //delete genres
    public void deleteChungNhan(int _id) throws SQLException {
        
        String editQuery = "UPDATE `chungnhan_atvstp` SET `tontai_khongtontai` = false WHERE `ID_CN` = ?";
        try {
            PreparedStatement ps = DB.getConnection().prepareStatement(editQuery);

            ps.setInt(1, _id);

            if (ps.executeUpdate() == 1) {
                JOptionPane.showMessageDialog(null, "Chứng nhận đã được xóa", "Xóa Chứng Nhận", 1);
            } else {
                JOptionPane.showMessageDialog(null, "Chứng nhận chưa được xóa", "Xóa Chứng Nhận", 0);
            }

        } catch (SQLException e) {
            Logger.getLogger(ChungNhan.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public ArrayList<ChungNhan> genreList() {
        ArrayList<ChungNhan> gLists = new ArrayList<>();
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        try {
            ResultSet rs = func.getData("SELECT * FROM `chungnhan_atvstp` WHERE `tontai_khongtontai` = true");
            ChungNhan genres;
            while (rs.next()) {
                genres = new ChungNhan(rs.getInt("ID_CN"), rs.getString("TenChungNhan"), rs.getBytes("AnhChungNhan"));
                gLists.add(genres);
            }
//                System.out.println("glist"+ gLists);
        } catch (SQLException sQLException) {
            Logger.getLogger(ChungNhan.class.getName()).log(Level.SEVERE, null, sQLException);
        }
        return gLists;
    }

    //creat func to return a hashmap
    //String is the key 
    //Integer is the value
    public HashMap<String, Integer> getChungNhanMap() {
        HashMap<String, Integer> map = new HashMap<>();
        My_Classes.Func_Class func = new My_Classes.Func_Class();
        try {
            ResultSet rs = func.getData("SELECT * FROM `chungnhan_atvstp` WHERE `tontai_khongtontai` = true");

            ChungNhan genres;

            while (rs.next()) {
                genres = new ChungNhan(rs.getInt("ID_CN"), rs.getString("TenChungNhan"), rs.getBytes("AnhChungNhan"));
                map.put(genres.getName(), genres.getId());
            }

        } catch (SQLException sQLException) {
            Logger.getLogger(ChungNhan.class.getName()).log(Level.SEVERE, null, sQLException);
        }
        return map;
    }
    
     public ChungNhan getCNById(Integer _id) throws SQLException {
        Func_Class func = new Func_Class();
        String Query = "SELECT * FROM `chungnhan_atvstp` WHERE`tontai_khongtontai` = true AND `ID_CN` = " + _id;
        ResultSet rs = func.getData(Query);

        if (rs.next()) {
            return new ChungNhan(rs.getInt(1), rs.getString(2));
        } else {
            return null;
        }
    }
}
