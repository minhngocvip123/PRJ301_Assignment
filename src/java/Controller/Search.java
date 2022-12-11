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
@WebServlet(urlPatterns = {"/search"})
public class Search extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String searchStr = req.getParameter("search");
        String language = "";
        
        if(req.getParameter("language").equals("english")){
            //return searched word. Might return all values if found multiples
            WordDAO w = new WordDAO();
            ArrayList<Word> list = new ArrayList<Word>();
            list = w.getWord(searchStr);
            req.setAttribute("list", list);
            req.getRequestDispatcher("Definition_En.jsp").forward(req, resp);
        }else if(req.getParameter("language").equals("japanese")){
            language = "Japanese";
        }else if(req.getParameter("language").equals("vietnamese")){
            language = "Vietnamese";
        }else{
            language = "English"; //default language is English
        }
        
//        PrintWriter pr = resp.getWriter();
//        pr.println("Search term is: " + searchStr);
//        pr.println("Selected language is: " + language);
    }
    
}
