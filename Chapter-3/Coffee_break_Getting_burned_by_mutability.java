//This coffee break i need to list problems
//and fix
//these functions:

static double totalTime(List<Double> lapTimes) {
  lapTimes.remove(0);
  double sum = 0;
  for (double x : lapTimes) {
    sum += x;
    }
  return sum;
}

//The issues totalTime are:
//it mutates the value of laptimes with remove
//

static double avgTime(List<Double> lapTimes) {
  double time = totalTime(lapTimes);
  int laps = lapTimes.size();
  return time / laps;
}

//The issues with avgTime are:
//

//The correct solutions:


static double totalTime(List<Double> lapTimes) {
  List<Double> withoutWarmUp = new ArrayList<>(lapTimes);
  withoutWarmUp.remove(0); // remove warm-up lap
  double sum = 0;
  for (double x : withoutWarmUp) {
    sum += x;
  }
  return sum; 
} 

static double avgTime(List<Double> lapTimes) {
  double time = totalTime(lapTimes);
  List<Double> withoutWarmUp = new ArrayList<>(lapTimes);
  withoutWarmUp.remove(0); // remove warm-up lap
  int laps = withoutWarmUp.size();
  return time / laps;
}
