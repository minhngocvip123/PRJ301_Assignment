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
            String strSelect = "Select e.Word, p.PoS, d.[Definition], d.Example, d.DefID from English e \n"
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
                w.defID = rs.getInt("DefID");
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
            String strSelect = "Select j.Word, j.Romaaji, p.PoS, d.[Definition], d.Example, d.DefID from Japanese j \n"
                    + "join (DefinitionsJP d join PartOfSpeech p on d.PoSID = p.PoSID ) \n"
                    + "on j.WordID = d.WordID where j.Word = ? or j.Romaaji = ?";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, searchStr);
            stm.setString(2, searchStr);
            rs = stm.executeQuery();
            while (rs.next()) {
                Word w = new Word();
                w.word = rs.getString("Word");
                w.romaaji = rs.getString("Romaaji");
                w.PartOfSpeech = rs.getString("PoS");
                w.Definition = rs.getString("Definition");
                w.Example = rs.getString("Example");
                w.defID = rs.getInt("DefID");
                list.add(w);
            }
        } catch (Exception e) {
            System.out.println("getWordJP fail:" + e.getMessage());
        }
        return list;
    }

    public void addDefinitionJP(String word, int pos, String definition, String example) {
        try {
            String strupdate = "insert into DefinitionsJP(WordID, PoSID, [Definition], Example) \n"
                    + "values ((select WordID from Japanese where Word = ?), ?, ?, ?)";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, word);
            stm.setInt(2, pos);
            stm.setString(3, definition);
            stm.setString(4, example);
            stm.execute();
        } catch (Exception e) {
            System.out.println("addDefinitionJP fail:" + e.getMessage());
        }
    }

    public void addWordJP(String word, String romaaji, int pos, String definition, String example) {
        try {
            String strupdate = "insert into Japanese (Word, Romaaji) \n"
                    + "values (?, ?)\n"
                    + "\n"
                    + "insert into DefinitionsJP(WordID, PoSID, [Definition], Example) \n"
                    + "values ((select WordID from Japanese where Word = ?), ?, ?, ?)";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, word);
            stm.setString(2, romaaji);
            stm.setString(3, word);
            stm.setInt(4, pos);
            stm.setString(5, definition);
            stm.setString(6, example);
            stm.execute();
        } catch (Exception e) {
            System.out.println("addWordJP fail:" + e.getMessage());
        }
    }

    public boolean checkWordJP(String word) {
        try {
            String strSelect = "select * from Japanese where Word = ? or Romaaji = ?";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, word);
            stm.setString(2, word);
            rs = stm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("checkWordJP fail:" + e.getMessage());
        }
        return false;
    }

    //main method to test out all these different DAO methods.
    public static void main(String[] args) {
        String word = "あの";
        String romaaji = "moumou";
        int pos = 2;
        String definition = "Need, must, to want";
        String example = "Anh cần em trong cuộc đời này - I need you in my life";

        WordDAO w = new WordDAO();
//        if(w.checkWordJP(word)) System.out.println("exist");
//        else System.out.println("does not exist");
//        w.addWordJP(word, romaaji, pos, definition, example);
//        w.addDefinitionJP(word, pos, definition, example);
        ArrayList<Word> list = new ArrayList<Word>();
//        list = w.getWordJP("から");
        list = w.getWordVN(RemoveAccent.removeAccent("tốt"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getWord());
            System.out.println(list.get(i).getPartOfSpeech());
            System.out.println(list.get(i).getDefinition());
            System.out.println(list.get(i).getExample());
            System.out.println(list.get(i).getDefID()+ "\n");
        }
//        if(w.checkWordVN(word)) System.out.println("exist");
//        else System.out.println("does not exist");
//        w.addDefinitionVN(word, pos, definition, example);
//        w.deleteWordEN(word);
//        w.deleteDefJP("1");
//        w.deleteWordJP(word);
    }

    public ArrayList<Word> getWordVN(String searchStr) {
        ArrayList<Word> list = new ArrayList<Word>();
        try {
            String strSelect = "Select v.Word, p.PoS, d.[Definition], d.Example, d.DefID from Vietnamese v \n"
                    + "join (DefinitionsVN d join PartOfSpeech p on d.PoSID = p.PoSID ) \n"
                    + "on v.WordID = d.WordID where dbo.ufn_removeMark(v.Word) = ?";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, searchStr);
            rs = stm.executeQuery();
            while (rs.next()) {
                Word w = new Word();
                w.word = rs.getString("Word");
                w.PartOfSpeech = rs.getString("PoS");
                w.Definition = rs.getString("Definition");
                w.Example = rs.getString("Example");
                w.defID = rs.getInt("DefID");
                list.add(w);
            }
        } catch (Exception e) {
            System.out.println("getWordVN fail:" + e.getMessage());
        }
        return list;
    }

    public boolean checkWordVN(String word) {
        try {
            String strSelect = "select * from Vietnamese where Word = ?";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, word);
            rs = stm.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (Exception e) {
            System.out.println("checkWordVN fail:" + e.getMessage());
        }
        return false;
    }

    public void addDefinitionVN(String word, int pos, String definition, String example) {
        try {
            String strupdate = "insert into DefinitionsVN \n"
                    + "values ((select WordID from Vietnamese where Word = ?), ?, ?, ?)";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, word);
            stm.setInt(2, pos);
            stm.setString(3, definition);
            stm.setString(4, example);
            stm.execute();
        } catch (Exception e) {
            System.out.println("addDefinitionVN fail:" + e.getMessage());
        }
    }

    public void addWordVN(String word) {
        try {
            String strupdate = "insert into Vietnamese (Word) values (?) ";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, word);
            stm.execute();
        } catch (Exception e) {
            System.out.println("addWordVN fail:" + e.getMessage());
        }
    }

    //all editing queries (update, delete)
    public Word findDefEN(String defID) {
        try {
            String strSelect = "select [Definition], Example from Definitions where DefID = ?";
            stm = cnn.prepareStatement(strSelect);
            stm.setString(1, defID);
            rs = stm.executeQuery();
            while (rs.next()) {
                Word u = new Word();
                u.Definition = rs.getString(1);
                u.Example = rs.getString(2);
                return u;
            }
        } catch (Exception e) {
            System.out.println("findDefEN fail:" + e.getMessage());
        }
        return null;    
    }

    public Word findDefJP(String defID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public Word findDefVN(String defID) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void deleteWordEN(String word) {
        try {
            String strupdate = "delete from English where Word = ?";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, word);
            stm.execute();
        } catch (Exception e) {
            System.out.println("deleteWordEN fail:" + e.getMessage());
        }
    }

    public void deleteDefEN(String defID) {
        try {
            String strupdate = "delete from Definitions where DefID = ?";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, defID);
            stm.execute();
        } catch (Exception e) {
            System.out.println("deleteDefEN fail:" + e.getMessage());
        }
    }

    public void deleteWordJP(String word) {
        try {
            String strupdate = "delete from Japanese where Word = ?";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, word);
            stm.execute();
        } catch (Exception e) {
            System.out.println("deleteWordJP fail:" + e.getMessage());
        }
    }

    public void deleteDefJP(String defID) {
        try {
            String strupdate = "delete from DefinitionsJP where DefID = ?";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, defID);
            stm.execute();
        } catch (Exception e) {
            System.out.println("deleteDefJP fail:" + e.getMessage());
        }
    }

    public void deleteWordVN(String word) {
        try {
            String strupdate = "delete from Vietnamese where Word = ?";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, word);
            stm.execute();
        } catch (Exception e) {
            System.out.println("deleteWordVN fail:" + e.getMessage());
        }
    }

    public void deleteDefVN(String defID) {
        try {
            String strupdate = "delete from DefinitionsVN where DefID = ?";
            stm = cnn.prepareStatement(strupdate);
            stm.setString(1, defID);
            stm.execute();
        } catch (Exception e) {
            System.out.println("deleteDefVN fail:" + e.getMessage());
        }
    }

}
