//This coffee break i need to create unit tests
//for the following three functions
//
def increment(x: Int): Int = {
  x + 1
}

def add(a: Int, b: Int): Int = {
  a + b
}

def wordScore(word: String): Int = {
  word.replaceAll("a", "").length
}

def getTipPercentage(names: List[String]): Int = {
    if (names.size > 5) 20
    else if (names.size > 0) 10   
    else 0
}

def getFirstCharacter(s: String): Char = {
    if (s.length > 0) s.charAt(0)
    else ' '
}

//Still figuring out how scala works
//My tests:
//

def testIncrement() {
  assert(increment(1) == 2)
  assert(increment(6) == 7)
  assert(increment(-5) == -4)
}

def testAdd() {
  assert(add(2,  6) == 8)
  assert(add(1, -1) == 0)
  assert(add(10, 9) == 19)
}

def testWordScore() {
  assert(wordScore("cherry") == 6)
  assert(wordScore("kebab") == 4)
  assert(wordScore("aaaa") == 0)
}

def testGetTipPercentage() {
  assert(getTipPercentage(List.empty) == 0)
  assert(getTipPercentage(List("Bob", "Beth", "Robert")) == 10)
  assert(getTipPercentage(List("Bob", "Beth", "Robert", "Lauri", "Frank", "Otto")) == 20)
}

def testGetFirstCharacter() {
  assert(getFirstCharacter("") == " ")
  assert(getFirstCharacter("aaa") == "a")
  assert(getFirstCharacter("bbbbb") == "b")
}

def runTests() {
  testIncrement()
  testAdd()
  testWordScore()
  testGetTipPercentage()
  testGetFirstCharacter()
  println("All tests passed!")
}

runTests()


