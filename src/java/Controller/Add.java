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
@WebServlet(urlPatterns = {"/add"})
public class Add extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String language = req.getParameter("language");
        String word = req.getParameter("word");
        String romaaji = req.getParameter("romaaji");
        int pos = Integer.parseInt(req.getParameter("pos"));
        String definition = req.getParameter("definition");
        String example = req.getParameter("example");
        ArrayList<Word> list = new ArrayList<Word>();
        WordDAO w = new WordDAO();
        
        if (language.equals("english")) {
            if (w.checkWord(word)) {//if word already exists, let user add definition only
                w.addDefinition(word, pos, definition, example);
                list = w.getWord(word);
            } else {//if the word doesn't exist, add new word and provide definition
                w.addWord(word, pos, definition, example);
                list = w.getWord(word);
            }
        } else if (language.equals("japanese")) {
            if (w.checkWordJP(word)) {//if word already exists, let user add definition only
                w.addDefinitionJP(word, pos, definition, example);
                list = w.getWordJP(word);
            } else {//if the word doesn't exist, add new word and provide definition
                w.addWordJP(word, romaaji, pos, definition, example);
                list = w.getWordJP(word);
            }
        } else {
            String unsignedWord = RemoveAccent.removeAccent(word);//remove accent from search string
            if (w.checkWordVN(word)) {//if word already exists, let user add definition only
                w.addDefinitionVN(word, pos, definition, example);
                list = w.getWordVN(unsignedWord);
            } else {//if the word doesn't exist, add new word and provide definition
                w.addWordVN(word);
                w.addDefinitionVN(word, pos, definition, example);
                list = w.getWordVN(unsignedWord);
            }
        }
        req.setAttribute("language", language);
        req.setAttribute("list", list);
        req.getRequestDispatcher("Definition.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("AddWord.jsp").forward(req, resp);
    }

}
