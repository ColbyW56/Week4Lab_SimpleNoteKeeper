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
        try {
            String path = getServletContext().getRealPath("/WEB-INF/note.txt");
            BufferedReader br = new BufferedReader(new FileReader(new File(path)));

            String title = br.readLine();
            String content = br.readLine();

            Note note = new Note(title, content);
            request.setAttribute("note", note);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
