import java.util.Scanner;

public class Menu {
  private Scanner scanner;
  private CookOperation currentOperation;

  public Menu() {
    this.scanner = new Scanner(System.in);
    this.currentOperation = null;
  }

  public void start() {
    int choice;
    do {
      displayMainMenu();
      choice = getIntegerInput("Choose your action: ");
      performAction(choice);
    } while (choice != 0);
  }

  private void displayMainMenu() {
    System.out.println("Main Menu:");
    System.out.println("1. Rice");
    System.out.println("2. Hot Water");
    System.out.println("3. Soup");
    System.out.println("0. Exit");
  }

  private void performAction(int choice) {
    switch (choice) {
      case 1, 2, 3 -> {
        currentOperation = new CookOperation(choice);
        currentOperation.start();
      }
      case 0 -> System.out.println("Exiting application.");
      default -> System.out.println("Invalid choice. Please try again.");
    }
  }

  public Scanner getScanner() {
    return scanner;
  }

  public CookOperation getCurrentOperation() {
    return currentOperation;
  }

  public void setCurrentOperation(CookOperation currentOperation) {
    this.currentOperation = currentOperation;
  }

  public int getIntegerInput(String prompt) {
    int input;
    do {
      System.out.print(prompt);
      while (!scanner.hasNextInt()) {
        System.out.println("Invalid input. Please enter a valid integer.");
        System.out.print(prompt);
        scanner.next(); // consume the invalid input
      }
      input = scanner.nextInt();
    } while (input < 0);

    return input;
  }
}
