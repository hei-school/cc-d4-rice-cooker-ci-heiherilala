public class Validator {
  public static boolean isNonNegativeInteger(String input) {
    try {
      int value = Integer.parseInt(input);
      return value >= 0;
    } catch (NumberFormatException e) {
      return false;
    }
  }
}
