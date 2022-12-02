package Controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Models.CalculatedSavingsAcc;
import Services.SaverCalculator;
import Services.SavingsCalculator;
import Services.SpenderCalculator;

@WebServlet("/calculate")
public class CalculatorController extends HttpServlet{
    

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        int salary = Integer.parseInt(req.getParameter("salary"));
        
        if(req.getParameter("savedMoney") != "" && 
            req.getParameter("yearsToSave") != "" &&
            req.getParameter("fixedMoney") != ""){

            // do with additional
            CalculatedSavingsAcc customAcc = new CalculatedSavingsAcc(salary
                ,Integer.parseInt(req.getParameter("savedMoney"))
                ,Integer.parseInt(req.getParameter("yearsToSave"))
                ,Integer.parseInt(req.getParameter("fixedMoney"))
            );

            SavingsCalculator.completeCalculation(customAcc);

            req.setAttribute("custom", true);
            req.setAttribute("saverAcc", customAcc);
            req.getRequestDispatcher("views/budget-page.jsp").forward(req, res);
            
            customAcc.deleteAddedYearToCount();

        }else{

            //do without additional
            CalculatedSavingsAcc spenderAccount = new CalculatedSavingsAcc(salary);
            SpenderCalculator.spender(spenderAccount);
            SavingsCalculator.completeCalculation(spenderAccount);

            CalculatedSavingsAcc saverAccount = new CalculatedSavingsAcc(salary);
            SaverCalculator.saver(saverAccount);
            SavingsCalculator.completeCalculation(saverAccount);

            req.setAttribute("spenderAcc", spenderAccount);
            req.setAttribute("saverAcc", saverAccount);
            req.getRequestDispatcher("views/budget-page.jsp").forward(req, res);
        }
  
    }
}
