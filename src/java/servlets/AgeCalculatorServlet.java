package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author JohnC. <john.crudo@edu.sait.ca>
 */
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String inputage = request.getParameter("inputage");
        request.setAttribute("inputage", inputage);

        if (inputage == null || inputage.equals("")) {
            request.setAttribute("popmsg", "You must give your current age.");
            getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
            return;
        }

        try {
            int nextAge = Integer.parseInt(inputage);
            nextAge++;
            request.setAttribute("popmsg", "Your age next birthday will be " + nextAge);
        } catch (NumberFormatException e) {
            
            request.setAttribute("popmsg", "You must give a number.");
            return;
        }

        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp")
                .forward(request, response);
    }

}
