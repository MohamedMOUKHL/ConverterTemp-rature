package com.example.convertisseurversion6;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/convert")
public class Controlleur extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String celsiusStr = request.getParameter("celsius");

        try {
            if (celsiusStr != null && !celsiusStr.isEmpty()) {
                double celsius = Double.parseDouble(celsiusStr);
                double fahrenheit = Model.convertCelsiusToFahrenheit(celsius);
                request.setAttribute("fahrenheit", fahrenheit);
                request.getRequestDispatcher("/resultt.jsp").forward(request, response);
            } else {
                response.sendRedirect(request.getContextPath() + "/index.jsp");
            }
        } catch (NumberFormatException e) {
            // Handle the case when the input is not a numeric value
            request.setAttribute("error", "Please enter a numeric value for Celsius.");
            request.getRequestDispatcher("/error.jsp").forward(request, response);
        }
    }
}
