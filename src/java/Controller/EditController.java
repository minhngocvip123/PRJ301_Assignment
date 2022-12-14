/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

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
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
            req.setAttribute("def", def);
            req.getRequestDispatcher("edit.jsp").forward(req, resp);
        } else {
            //delete
            if (language.equals("english")) {
                w.deleteWordEN(defID);
                list = w.getWord(word);
            } else if (language.equals("japanese")) {
                w.deleteWordJP(defID);
                list = w.getWordJP(word);
            } else {
                w.deleteWordVN(defID);
                list = w.getWordVN(word);
            }
            req.setAttribute("language", language);
            req.setAttribute("list", list);
            req.getRequestDispatcher("Definition.jsp").forward(req, resp);
        }
    }

}
