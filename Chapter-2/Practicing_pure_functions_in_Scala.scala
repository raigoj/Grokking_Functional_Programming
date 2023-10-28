//This is the first scala exercise i need to convert This
//java code to scala code:
//
// class TipCalculator {   
//    public static int getTipPercentage(List<String> names) {
//        if(names.size() > 5) {
//            return 20;     
//        } else if(names.size() > 0) {
//            return 10;     
//        } else return 0;   
// }
//
// My solution:

object TipCalculator {
  def getTipPercentage(names: List[String]): Int = {
    if (names.size() > 5) {
      20
    } else if (names.size() > 0) {
      10
    } else {
      0
    }
  }
}

//Book solution:

object TipCalculator {
    def getTipPercentage(names: List[String]): Int = {
        if (names.size > 5) 20
        else if (names.size > 0) 10
        else 0
    }
}
