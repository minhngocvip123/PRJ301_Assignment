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
@WebServlet(urlPatterns = {"/search"})
public class Search extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String searchStr = req.getParameter("search");
        String language = req.getParameter("language");
        
        //English search processing
        if (language.equals("english")) {
            WordDAO w = new WordDAO();
            ArrayList<Word> list = new ArrayList<Word>();
            list = w.getWord(searchStr);
            if (list.isEmpty()) {//if returns nothing, send to handle page
                req.setAttribute("searchStr", searchStr);
                req.getRequestDispatcher("NotExist.jsp").forward(req, resp);
            } else {//return searched word. Might return all values if found multiples
                req.setAttribute("language", language);
                req.setAttribute("list", list);
                req.getRequestDispatcher("Definition.jsp").forward(req, resp);
            }
        } else if (language.equals("japanese")) { //Japanese
            WordDAO w = new WordDAO();
            ArrayList<Word> list = new ArrayList<Word>();
            list = w.getWordJP(searchStr);
            if (list.isEmpty()) {//if returns nothing, send to handle page
                req.setAttribute("searchStr", searchStr);
                req.getRequestDispatcher("NotExist.jsp").forward(req, resp);
            } else {//return searched word. Might return all values if found multiples
                req.setAttribute("language", language);
                req.setAttribute("list", list);
                req.getRequestDispatcher("Definition.jsp").forward(req, resp);
            }
        } else { //Vietnamese search processing
            WordDAO w = new WordDAO();
            ArrayList<Word> list = new ArrayList<Word>();
            String unsignedWord = RemoveAccent.removeAccent(searchStr);//remove accent from search string
            list = w.getWordVN(unsignedWord);
            if (list.isEmpty()) {//if returns nothing, send to handle page
                req.setAttribute("searchStr", searchStr);
                req.getRequestDispatcher("NotExist.jsp").forward(req, resp);
            } else {//return searched word. Might return all values if found multiples
                req.setAttribute("language", language);
                req.setAttribute("list", list);
                req.getRequestDispatcher("Definition.jsp").forward(req, resp);
            }
        }
    }

}
