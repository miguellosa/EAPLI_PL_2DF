package Presentation;

import eapli.util.Console;

/**
 *
 * @author 1111425, 1111450, 1111506
 */
public class MainMenu {

    public void mainLoop() {
        int option;
        do {
            System.out.println("===================");
            System.out.println("  EXPENSE MANAGER  ");
            System.out.println("===================\n");

            System.out.println("(1) Register an expense");
            System.out.println("(2) Register Income");
            System.out.println("(3) Views");
            System.out.println("(4) Export data");
            System.out.println("(5) Configuration");
            System.out.println("(0) Exit\n\n");

            option = Console.readInteger("Please choose an option");
            switch (option) {
                case 0:
                    System.out.println("bye bye ...");
                    return;
                case 1:
                    ExpenseRegisterUI ui = new ExpenseRegisterUI();
                    ui.mainLoop();
                    break;
                case 2:
                    throw new UnsupportedOperationException("Not Implemented YET");
                case 3:
                    System.out.println("\t(1) Display Montlhy Expenses");
                    System.out.println("\t(0) Back");
                    int optionViews = Console.readInteger("Please choose an option");
                    switch(optionViews){
                        case 0:
                            break;
                        case 1:
                            throw new UnsupportedOperationException("Not Implemented YET");
                        default:
                            System.out.println("Invalid Option");
                    }
                case 4:
                    System.out.println("\t(1) to .CSV");
                    System.out.println("\t(0) Back");
                    int optionExport = Console.readInteger("Please choose an option");
                    switch(optionExport){
                        case 0:
                            break;
                        case 1:
                            throw new UnsupportedOperationException("Not Implemented YET");
                        default:
                            System.out.println("Invalid Option");
                    }
                case 5:
                    System.out.println("\t(1) Add Expense Type");
                    System.out.println("\t(2) Add Income Type");
                    System.out.println("\t(0) Back");
                    int optionConfiguration = Console.readInteger("Please choose an option");
                    switch (optionConfiguration) {
                        case 0:
                            break;
                        case 1:
                            throw new UnsupportedOperationException("Not Implemented YET");
                        case 2:
                            throw new UnsupportedOperationException("Not Implemented YET");
                        default:
                            System.out.println("Invalid Option");
                    }
                default:
                    System.out.println("Invalid Option");
            }
        }while(option != 0);

    }
}