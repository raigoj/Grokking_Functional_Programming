//This is the second coffee break task i solved
//
//Based on three questions are these functions pure or impure:
//
//1. Does it always return a single value?
//2. Does it compute its value based only on the data provided as arguments?
//3. Does it stay away from mutating any existing values?
//
//First comment under every code snippet is my educated guess
//Second comment is if the anwser is true or false
//and if false there is more lines to explain why was i wrong

static int increment(int x) {
  return x + 1;
}

//This is a pure function
//Correct

static double randomPart(double x) {
  return x * Math.random();
}

//This is an impure function because it isnt using only its arguments
//Correct

static int add(int a, int b) {
  return a + b;
}

//This is a pure function
//Correct

class ShoppingCart {
  private List<String> items = new ArrayList<>();

  public int addItem(String item) {
    items.add(item);
    return items.size() + 5;
  }
}

//This is a pure function
//False because it's an impure function
//because it doesn't compute based on only arguments it uses items state
//and it mutates existing value, it adds item to items state value

static char getFirstCharacter(String s) {
  return s.charAt(0);
}

//This is a pure function
//False because it doesn't always return a value
//because the String could be empty
