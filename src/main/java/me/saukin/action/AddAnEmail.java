
package me.saukin.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import me.saukin.beans.UserData;
import me.saukin.calculations.UserProcessing;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author S_SAUKIN
 */
@WebServlet(name = "AddAnEmail", urlPatterns = {"/AddAnEmail"})
public class AddAnEmail extends HttpServlet {

    private final static Logger LOG = LoggerFactory.getLogger(AddAnEmail.class);
    
        
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/displayEmail.jsp";
        
        String email = request.getParameter("email");
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
                
        UserData userData = new UserData(email, firstName, lastName);
        
        ServletContext context = getServletContext();
        String fileName = context.getInitParameter("EmailFile");  
        
        UserProcessing userProcessing = new UserProcessing();
        userProcessing.addRecord(userData, fileName);
        
        HttpSession session = request.getSession();
        session.setAttribute("user", userData);
        
        
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
