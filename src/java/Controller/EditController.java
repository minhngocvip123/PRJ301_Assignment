/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.RemoveAccent;
import Model.Word;
import Model.WordDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
@WebServlet(urlPatterns = {"/edit"})
public class EditController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //define edit operations here
        int pos = Integer.parseInt(req.getParameter("pos"));
        String defID = req.getParameter("defID");
        String definition = req.getParameter("definition");
        String example = req.getParameter("example");
        String language = req.getParameter("language");
        String word = req.getParameter("word");
        WordDAO w = new WordDAO();
        ArrayList<Word> list = new ArrayList<Word>();
        if (language.equals("english")) {
            w.editDefinitionEN(defID, pos, definition, example);
            list = w.getWord(word);
        } else if (language.equals("japanese")) {
            w.editDefinitionJP(defID, pos, definition, example);
            list = w.getWordJP(word);
        } else {
            w.editDefinitionVN(defID, pos, definition, example);
            String unsignedWord = RemoveAccent.removeAccent(word);//remove accent from search string
            list = w.getWordVN(unsignedWord);
        }
        req.setAttribute("language", language);
        req.setAttribute("list", list);
        req.getRequestDispatcher("Definition.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String defID = req.getParameter("defID");
        String mod = req.getParameter("mod");
        String language = req.getParameter("language");
        String word = req.getParameter("word");
        WordDAO w = new WordDAO();
        ArrayList<Word> list = new ArrayList<Word>();
        if (mod.equals("0")) {
            //edit
            Word def = new Word();
            if (language.equals("english")) {
                def = w.findDefEN(defID);
            } else if (language.equals("japanese")) {
                def = w.findDefJP(defID);
            } else {
                def = w.findDefVN(defID);
            }
            req.setAttribute("language", language);
            req.setAttribute("defID", defID);
            req.setAttribute("def", def);
            req.getRequestDispatcher("EditWord.jsp").forward(req, resp);
        } else {
            //delete
            if (language.equals("english")) {
                ArrayList<Word> checkList = new ArrayList<Word>();
                checkList = w.getWord(word);
                if (checkList.size() == 1) {
                    w.deleteDefEN(defID);//delete both def and word
                    w.deleteWordEN(word);
                    req.setAttribute("searchStr", word);
                    req.getRequestDispatcher("NotExist.jsp").forward(req, resp);
                } else {
                    w.deleteDefEN(defID);
                    list = w.getWord(word);
                    req.setAttribute("language", language);
                    req.setAttribute("list", list);
                    req.getRequestDispatcher("Definition.jsp").forward(req, resp);
                }
            } else if (language.equals("japanese")) {
                ArrayList<Word> checkList = new ArrayList<Word>();
                checkList = w.getWordJP(word);
                if (checkList.size() == 1) {
                    w.deleteDefJP(defID);
                    w.deleteWordJP(word);
                    req.setAttribute("searchStr", word);
                    req.getRequestDispatcher("NotExist.jsp").forward(req, resp);
                } else {
                    w.deleteDefJP(defID);
                    list = w.getWordJP(word);
                    req.setAttribute("language", language);
                    req.setAttribute("list", list);
                    req.getRequestDispatcher("Definition.jsp").forward(req, resp);
                }
            } else {
                ArrayList<Word> checkList = new ArrayList<Word>();
                String unsignedWord = RemoveAccent.removeAccent(word);//remove accent from search string
                checkList = w.getWordVN(unsignedWord);
                if (checkList.size() == 1) {
                    w.deleteDefVN(defID);
                    w.deleteWordVN(word);
                    req.setAttribute("searchStr", word);
                    req.getRequestDispatcher("NotExist.jsp").forward(req, resp);
                } else {
                    w.deleteDefVN(defID);
                    list = w.getWordVN(unsignedWord);
                    req.setAttribute("language", language);
                    req.setAttribute("list", list);
                    req.getRequestDispatcher("Definition.jsp").forward(req, resp);
                }
            }

        }
    }

}
