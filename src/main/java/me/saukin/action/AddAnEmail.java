
package me.saukin.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import me.saukin.beans.UserData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author S_SAUKIN
 */
@WebServlet(name = "AddAnEmail", urlPatterns = {"/AddAnEmail"})
public class AddAnEmail extends HttpServlet {

    private final static Logger LOG = LoggerFactory.getLogger(AddAnEmail.class);
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/display_email.jsp";
        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String email = request.getParameter("email");
        
        UserData userData = new UserData(firstName, lastName, email);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
