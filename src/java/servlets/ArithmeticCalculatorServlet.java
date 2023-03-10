/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JohnC. <john.crudo@edu.sait.ca>
 */
@WebServlet(name = "ArithmeticCalculatorServlet", urlPatterns = {"/arithmetic"})
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstnum = request.getParameter("firstnum");
        String secondnum = request.getParameter("secondnum");
        request.setAttribute("result", "---");
        request.setAttribute("firstnum", firstnum);
        request.setAttribute("secondnum", secondnum);

        try {
            if (firstnum == null || firstnum.equals("")
                    || secondnum == null || secondnum.equals("")) {
                request.setAttribute("result", "invalid");

            } else {
                int parsedfirstnum = Integer.parseInt(firstnum);
                int parsedsecondnum = Integer.parseInt(secondnum);
                int result = 0;
                switch (request.getParameter("submit")) {
                    case "+":
                        result = parsedfirstnum + parsedsecondnum;
                        break;
                    case "-":
                        result = parsedfirstnum - parsedsecondnum;
                        break;
                    case "*":
                        result = parsedfirstnum * parsedsecondnum;
                        break;
                    case "%":
                        result = parsedfirstnum % parsedsecondnum;
                        break;
                }

                request.setAttribute("result", result);

            }
        } catch (NumberFormatException e) {
            request.setAttribute("result", "invalid");

            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                    .forward(request, response);

           return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp")
                .forward(request, response);
    }

}
