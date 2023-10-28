//This is the second coffee break exercise in the book
//
class TipCalculator {
  public int getTipPercentage(List<String> names) {
    if(names.size() > 5) {
      tipPercentage = 20;
    } else if(names.size() > 0) {
      tipPercentage = 10;
    } else{
      tipPercentage = 0;
    }
  }
}
