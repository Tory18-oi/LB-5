package PatternCommand;

import Appliance.ElectricalAppliance;
import java.util.ArrayList;
import java.util.Scanner;

public class Home {

    public Home() {
        menu();
    }

    public void menu() {
        ArrayList<ElectricalAppliance> appliances = new ArrayList<>();

        Command addAppliance = new AddApplianceCommand(appliances);
        Command deleteAppliance = new RemoveApplianceCommand(appliances);
        Command turnOnAppliance = new PowerOnCommand(appliances);
        Command turnOffAppliance = new PowerOffCommand(appliances);
        Command sort = new SortByPowerCommand(appliances);
        Command find = new FindByParametersCommand(appliances);
        Command calculateConsumption = new CalculatePowerUsageCommand(appliances);
        Command calculatePrice = new CalculateEnergyCostCommand(appliances);
        Command showList = new DisplayApplianceListCommand(appliances);

        MenuManager manager = new MenuManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n\t\t----- Electrical Appliance Management Menu -----");
            System.out.println("1. Add a new electrical appliance.");
            System.out.println("2. Remove an electrical appliance.");
            System.out.println("3. Power on an appliance.");
            System.out.println("4. Power off an appliance.");
            System.out.println("5. Sort appliances by power consumption.");
            System.out.println("6. Find appliance by parameters.");
            System.out.println("7. Calculate total power usage of appliances.");
            System.out.println("8. Calculate energy cost of appliances.");
            System.out.println("9. Display list of all appliances.");
            System.out.println("10. Exit.");

            System.out.print("Enter an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manager.runCommand(addAppliance);
                    break;
                case 2:
                    manager.runCommand(deleteAppliance);
                    break;
                case 3:
                    manager.runCommand(turnOnAppliance);
                    break;
                case 4:
                    manager.runCommand(turnOffAppliance);
                    break;
                case 5:
                    manager.runCommand(sort);
                    break;
                case 6:
                    manager.runCommand(find);
                    break;
                case 7:
                    manager.runCommand(calculateConsumption);
                    break;
                case 8:
                    manager.runCommand(calculatePrice);
                    break;
                case 9:
                    manager.runCommand(showList);
                    break;
                case 10:
                    System.out.println("Exit from the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
