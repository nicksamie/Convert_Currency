package com;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by sameer on 12/17/13.
 */
public class CurrencyConverter extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        methodConverter f1;
        f1 = new methodConverter();

         String fromCurrency = request.getParameter("fromCurrency");
        String toCurrency = request.getParameter("toCurrency");
        double amt = Double.parseDouble(request.getParameter("amount"));

        double result= f1.converter(fromCurrency, toCurrency , amt);
        request.setAttribute("obtvalue",amt);
        request.setAttribute("rvalue",result);
        request.setAttribute("tocurr",toCurrency);
        request.getRequestDispatcher("result.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
