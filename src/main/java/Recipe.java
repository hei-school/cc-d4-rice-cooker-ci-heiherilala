import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recipe {
  private List<Ingredient> ingredients;
  private int recipeType;

  public Recipe(int recipeType) {
    this.ingredients = new ArrayList<>();
    this.recipeType = recipeType;
  }

  public int getRecipeType() {
    return recipeType;
  }

  public List<Ingredient> getIngredients() {
    return ingredients;
  }

  public void prepareIngredients() {
    System.out.println("Preparing ingredients for recipe " + recipeType + "...");
    Scanner scanner = new Scanner(System.in);

    do {
      System.out.print("Enter ingredient name: ");
      String ingredientName = scanner.nextLine();

      int quantity = -1;
      while (quantity < 0) {
        String stringToNumber = "";
        boolean isInt = true;
        while (isInt) {
          System.out.println("Enter quantity in grams: ");
          stringToNumber = scanner.next();
          isInt = !Validator.isNonNegativeInteger(stringToNumber);
        }
        quantity = Integer.parseInt(stringToNumber);

        if (quantity < 0) {
          System.out.println("Quantity must be a non-negative number.");
        }
      }

      ingredients.add(new Ingredient(ingredientName, quantity));
      String stringToNumber = "";
      boolean isInt = true;
      while (isInt) {
        System.out.println("1. Add another ingredient\n2. Finish adding ingredients\nChoose: ");
        stringToNumber = scanner.next();
        isInt = !Validator.isNonNegativeInteger(stringToNumber);
      }

      int choice = Integer.parseInt(stringToNumber);

      if (choice != 1) {
        break;
      }
    } while (true);
  }

  public void displayRecipeSummary() {
    System.out.println("Recipe Summary:");
    System.out.println("Ingredients:");
    for (Ingredient ingredient : ingredients) {
      System.out.println(ingredient.toString());
    }
  }

  public void reset() {
    ingredients.clear();
  }
}
