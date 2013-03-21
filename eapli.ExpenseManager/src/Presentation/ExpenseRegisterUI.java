/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentation;

import Controllers.ExpenseRegisterController;

import Model.PayMethod;
import Model.PayMethod_Money;
import eapli.util.Console;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Paulo Gandra Sousa
 */
class ExpenseRegisterUI {
    public void mainLoop() {
        PayMethod payMethod;
        
        System.out.println("* * *  REGISTER AN EXPENSE  * * *\n");
        
        String what = Console.readLine("Description:");
        Date date = Console.readDate("When:");
        double value = Console.readDouble("Amount:");
        int payType;
        do{
            payType = Console.readInteger("How:\n-- 1: Money");
            
            switch(payType) {
                case 1:
                    payMethod = new PayMethod_Money();
                    break;
                default:
                    payMethod = new PayMethod_Money();
            }
            // CHANGE SECOND CONDITION FOR EACH OPTION ADDED
        } while(payType < 1 || payType > 1); 
        BigDecimal amount = new BigDecimal(value);
        
        ExpenseRegisterController controller = new ExpenseRegisterController();
        controller.registerExpense(what, date, amount, payMethod);
        
        System.out.println("expense recorded.");
    }
}