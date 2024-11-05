package PatternCommand;

import Appliance.ElectricalAppliance;
import java.util.ArrayList;

// Додавання нового електроприладу
class AddApplianceCommand implements Command {
    private ArrayList<ElectricalAppliance> appliances;

    public AddApplianceCommand(ArrayList<ElectricalAppliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public void execute() {
        // Реалізація додавання нового електроприладу
    }
}

// Видалення електроприладу
class RemoveApplianceCommand implements Command {
    private ArrayList<ElectricalAppliance> appliances;

    public RemoveApplianceCommand(ArrayList<ElectricalAppliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public void execute() {
        // Реалізація видалення електроприладу
    }
}

// Увімкнення електроприладу
class PowerOnCommand implements Command {
    private ArrayList<ElectricalAppliance> appliances;

    public PowerOnCommand(ArrayList<ElectricalAppliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public void execute() {
        // Реалізація увімкнення електроприладу
    }
}

// Вимкнення електроприладу
class PowerOffCommand implements Command {
    private ArrayList<ElectricalAppliance> appliances;

    public PowerOffCommand(ArrayList<ElectricalAppliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public void execute() {
        // Реалізація вимкнення електроприладу
    }
}

// Сортування електроприладів за потужністю
class SortByPowerCommand implements Command {
    private ArrayList<ElectricalAppliance> appliances;

    public SortByPowerCommand(ArrayList<ElectricalAppliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public void execute() {
        // Реалізація сортування за потужністю
    }
}

// Пошук електроприладів за параметрами
class FindByParametersCommand implements Command {
    private ArrayList<ElectricalAppliance> appliances;

    public FindByParametersCommand(ArrayList<ElectricalAppliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public void execute() {
        // Реалізація пошуку за параметрами
    }
}

// Підрахунок загального споживання потужності
class CalculatePowerUsageCommand implements Command {
    private ArrayList<ElectricalAppliance> appliances;

    public CalculatePowerUsageCommand(ArrayList<ElectricalAppliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public void execute() {
        // Реалізація підрахунку загального споживання потужності
    }
}

// Підрахунок вартості енергії
class CalculateEnergyCostCommand implements Command {
    private ArrayList<ElectricalAppliance> appliances;

    public CalculateEnergyCostCommand(ArrayList<ElectricalAppliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public void execute() {
        // Реалізація підрахунку вартості енергії
    }
}

// Відображення списку всіх електроприладів
class DisplayApplianceListCommand implements Command {
    private ArrayList<ElectricalAppliance> appliances;

    public DisplayApplianceListCommand(ArrayList<ElectricalAppliance> appliances) {
        this.appliances = appliances;
    }

    @Override
    public void execute() {
        // Реалізація відображення списку електроприладів
    }
}
