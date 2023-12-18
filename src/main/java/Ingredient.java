public class Ingredient {
  private String name;
  private int quantity;

  public Ingredient(String name, int quantity) {
    this.name = name;
    this.quantity = quantity;
  }

  public int getQuantity() {
    return quantity;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "{" + "name='" + name + '\'' + ", quantity=" + quantity + '}' + '\'';
  }
}
