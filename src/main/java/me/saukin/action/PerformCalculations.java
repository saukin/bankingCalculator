/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.saukin.action;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import me.saukin.beans.CalculationData;
import me.saukin.calculations.Calculations;

/**
 *
 * @author admin
 */
@WebServlet(name = "PerformCalculations", urlPatterns = {"/PerformCalculations"})
public class PerformCalculations extends HttpServlet {

   
    private double currency;
    private double interest;
    private double term;
    private double answer;
    private String option = "";
            
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String url = "/result.jsp";
        
        // get parameters from the request
        
        String submitButton = request.getParameter("submit");
        
        switch (submitButton) {
            
            case "Calculate loan":
                currency = Double.parseDouble(request.getParameter("pv"));
                interest = Double.parseDouble(request.getParameter("rate"));
                term = Double.parseDouble(request.getParameter("n"));
                answer = 0.0;
                option = "loan";
            break;
            
            case  "Calculate future savings":
                currency = Double.parseDouble(request.getParameter("pmt"));
                interest = Double.parseDouble(request.getParameter("rate"));
                term = Double.parseDouble(request.getParameter("n"));
                answer = 0.0;
                option = "future";
            break;
            
            case "Calculate saving goal":
                currency = Double.parseDouble(request.getParameter("fv"));
                interest = Double.parseDouble(request.getParameter("rate"));
                term = Double.parseDouble(request.getParameter("n"));
                answer = 0.0;
                option = "goal";
            break;
        }
                
        
        CalculationData calculationData = new CalculationData(currency, interest, term, answer, option);
        
        Calculations calculations = new Calculations();
        
        
        
        switch (calculationData.getOption()) {
            case "loan" : calculations.loanCalculation(calculationData);
                          request.setAttribute("answer" ,Math.round(calculationData.getAnswer()*100)/100.0 + "$");
                          request.setAttribute("option" ,calculationData);
            break;
            
            case "future": calculations.futureValueCalculation(calculationData);
                           request.setAttribute("answer" ,Math.round(calculationData.getAnswer()*100)/100.0 + "$");
                           request.setAttribute("option" ,calculationData);
            break;
            
            case "goal": calculations.savingGoalCalculation(calculationData);
                         request.setAttribute("answer" ,Math.round((calculationData.getAnswer())*100)/100.0 + "$");
                         request.setAttribute("option" ,calculationData);
            break;
        }
            
        
        
        RequestDispatcher dispatcher
                = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
    }

    

}
