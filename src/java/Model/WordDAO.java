/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

/**
 *
 * @author Admin
 */
public class WordDAO extends DBContext {

    //Khai báo các thành phần xử lý DB
    Connection cnn; //Kết nối
    PreparedStatement stm;//Thực hiện các câu lệnh SQL
    ResultSet rs; //Lưu trữ và xử lý dữ liệu

    public WordDAO() {
        connect();
    }

    private void connect() {
        try {
            cnn = super.connection;
            System.out.println("Connect success");
        } catch (Exception e) {
            System.out.println("Connect fail:" + e.getMessage());
        }
    }

    public String[] getWord(String searchStr) {
        String[] result = null;
        try {
            String strSelect = "Select e.Word, d.PartOfSpeech, d.[Definition], d.Example from English e "
                    + "Inner join Definitions d on e.WordID = d.WordID where e.Word like ?";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, "%" + searchStr + "%");
            rs = stm.executeQuery();
            while (rs.next()) {
                result[0] = rs.getString("Word");
                result[1] = "" + rs.getInt("PartOfSpeech");
                result[2] = rs.getString("Definition");
                result[3] = rs.getString("Example");
                return result;
            }
        } catch (Exception e) {
            System.out.println("getWord fail:" + e.getMessage());
        }
        return result;
    }
    
    public static void main(String[] args) {
        WordDAO w = new WordDAO();
        String[] str = w.getWord("reb");
        
        System.out.println(Arrays.toString(str));
    }

}
