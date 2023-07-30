package register.mahi.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // get PrintWriter
        PrintWriter pw = res.getWriter();
        // set res type
        res.setContentType("text/html");
        // read the form data
        String name = req.getParameter("name");
        String dob = req.getParameter("dob");
        // gender
        String gender = req.getParameter("gender");
        // qlfy
        String qlfy = req.getParameter("qlfy");
        // hobbies
        String[] hobbies = req.getParameterValues("hb");
        //created list
        List al = Arrays.asList(hobbies);
        
        //chnaged some details
        // add bootstrap
        pw.println(
                "<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n"
                        + "\r\n" + "<!-- jQuery library -->\r\n"
                        + "<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n"
                        + "\r\n" + "<!-- Popper JS -->\r\n"
                        + "<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n"
                        + "\r\n" + "<!-- Latest compiled JavaScript -->\r\n"
                        + "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>");
        // print data
        pw.println("<div style='width:600px;margin:auto;margin-top:50px;'>");
        pw.println("<table class='table table-hover table-striped'>");
        pw.println("<tr>");
        pw.println("<td>Name</td>");
        pw.println("<td>" + name + "</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td>DOB</td>");
        pw.println("<td>" + dob + "</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td>Gender</td>");
        pw.println("<td>" + gender + "</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td>Qualification</td>");
        pw.println("<td>" + qlfy + "</td>");
        pw.println("</tr>");
        pw.println("<tr>");
        pw.println("<td>Hobbies</td>");
        pw.println("<td>" + al + "</td>");
        pw.println("</tr>");
        pw.println("</table>");
        pw.println("</div>");
        // close the stream
        pw.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        doGet(req, res);
    }
}
