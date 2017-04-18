package oddaverage;

import java.util.ArrayList;
import java.util.List;

public class OddAvg {

  public static void main(String[] args) {
    List<Integer> originalListOfNumbers = new ArrayList<>();
    originalListOfNumbers.add(21);
    originalListOfNumbers.add(31);
    originalListOfNumbers.add(40);
    originalListOfNumbers.add(51);
    System.out.println(oddAverage(originalListOfNumbers));
  }

  public static double oddAverage(List<Integer> originalList) {
    List<Integer> temporalyListForOddNumbers = new ArrayList<>();
    double fullValueOfOddNumbers = 0;
    double averageValueOfOddNumbers;
    for (int i = 0; i < originalList.size(); i++) {
      if (originalList.get(i) % 2 == 1) {
        temporalyListForOddNumbers.add(originalList.get(i));
      }
    }
    for (int i = 0; i < temporalyListForOddNumbers.size(); i++) {
      fullValueOfOddNumbers += temporalyListForOddNumbers.get(i);
    }
    averageValueOfOddNumbers = fullValueOfOddNumbers / temporalyListForOddNumbers.size();
    return averageValueOfOddNumbers;
  }
}
