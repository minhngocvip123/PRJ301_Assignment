/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import dal.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

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

    public ArrayList<Word> getWord(String searchStr) {
        ArrayList<Word> list = new ArrayList<Word>();
        try {
            String strSelect = "Select e.Word, p.PoS, d.[Definition], d.Example from English e \n"
                    + "join (Definitions d join PartOfSpeech p on d.PoSID = p.PoSID )\n"
                    + "on e.WordID = d.WordID where e.Word = ?";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, searchStr);
            rs = stm.executeQuery();
            while (rs.next()) {
                Word w = new Word();
                w.word = rs.getString("Word");
                w.PartOfSpeech = rs.getString("PoS");
                w.Definition = rs.getString("Definition");
                w.Example = rs.getString("Example");
                list.add(w);
            }
        } catch (Exception e) {
            System.out.println("getWord fail:" + e.getMessage());
        }
        return list;
    }

//    public ArrayList<Word> getPoS() {
//        ArrayList<Word> list = new ArrayList<Word>();
//        try {
//            String strSelect = "select PoS from PartOfSpeech";
//            stm = cnn.prepareStatement(strSelect);
//            rs = stm.executeQuery();
//            while (rs.next()) {
//                Word w = new Word();
//                w.PartOfSpeech = rs.getString("PoS");
//                list.add(w);
//            }
//        } catch (Exception e) {
//            System.out.println("getPoS fail:" + e.getMessage());
//        }
//        return list;
//    }
    public void addWord(String word, int pos, String definition, String example) {
        try {
            String strupdate = "insert into English (Word) \n"
                    + "values (?) \n"
                    + "\n"
                    + "insert into Definitions (WordID, PoSID, [Definition], Example) \n"
                    + "values ((select WordID from English where Word = ?), ?, ?, ?)";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, word);
            stm.setString(2, word);
            stm.setInt(3, pos);
            stm.setString(4, definition);
            stm.setString(5, example);
            stm.execute();
        } catch (Exception e) {
            System.out.println("addWord fail:" + e.getMessage());
        }
    }

    public boolean checkWord(String word) {
        try {
            String strSelect = "select * from English where Word = ?";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, word);
            rs = stm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("checkWord fail:" + e.getMessage());
        }
        return false;
    }

    public void addDefinition(String word, int pos, String definition, String example) {
        try {
            String strupdate = "insert into Definitions (WordID, PoSID, [Definition], Example) \n"
                    + "values ((select WordID from English where Word = ?), ?, ?, ?)";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, word);
            stm.setInt(2, pos);
            stm.setString(3, definition);
            stm.setString(4, example);
            stm.execute();
        } catch (Exception e) {
            System.out.println("addDefinition fail:" + e.getMessage());
        }
    }

    public ArrayList<Word> getWordJP(String searchStr) {
        ArrayList<Word> list = new ArrayList<Word>();
        try {
            String strSelect = "Select j.Word, j.Romaaji, p.PoS, d.[Definition], d.Example from Japanese j \n"
                    + "join (DefinitionsJP d join PartOfSpeech p on d.PoSID = p.PoSID ) \n"
                    + "on j.WordID = d.WordID where j.Word = ? or j.Romaaji = ?";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, "N" + searchStr);
            stm.setString(2, searchStr);
            rs = stm.executeQuery();
            while (rs.next()) {
                Word w = new Word();
                w.word = rs.getString("Word");
                w.romaaji = rs.getString("Romaaji");
                w.PartOfSpeech = rs.getString("PoS");
                w.Definition = rs.getString("Definition");
                w.Example = rs.getString("Example");
                list.add(w);
            }
        } catch (Exception e) {
            System.out.println("getWordJP fail:" + e.getMessage());
        }
        return list;
    }

}
