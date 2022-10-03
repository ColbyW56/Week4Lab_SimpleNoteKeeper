/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.Note;
/**
 *
 * @author colby
 */

public class NoteServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse respones) throws ServletException, IOException {
            String edit = request.getParameter("edit");
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));

            String title = br.readLine();
            String content = br.readLine();

            Note note = new Note(title, content);
            request.setAttribute("note", note);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        if (edit == null) {
            getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                    .forward(request, respones);
        } else {
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, respones);
        }
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Note newNote = null;
        
        String title = request.getParameter("title");
        String content = request.getParameter("content");
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        
        if (title.equals("") || content.equals("")) {
            request.setAttribute("inputResponse", "Please provide both a title and body text");
            getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp")
                    .forward(request, response);
        } else {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, true)));

            pw.write(title);
            pw.write(content);

            newNote = new Note(title, content);
            request.setAttribute("note", newNote);

            pw.close();
        }
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp")
                .forward(request, response);
    }
}

// This does not work