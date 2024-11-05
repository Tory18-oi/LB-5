package PatternCommand;

// Клас MenuManager викликає виконання команд
public class MenuManager {
    public void runCommand(Command command) {
        command.execute();
    }
}
