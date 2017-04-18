package oddaverage;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

class OddAvgTest {

  @Test
  void oddAverage() {
    List<Integer> testlist = new ArrayList<>();
    testlist.add(5);
    testlist.add(27);
    testlist.add(13);
    testlist.add(522);
    assertEquals(15, OddAvg.oddAverage(testlist));
  }

  @Test
  void oddAverageSecondTest() {
    List<Integer> testlist = new ArrayList<>();
    testlist.add(5);
    testlist.add(27);
    testlist.add(13);
    testlist.add(922);
    assertFalse(20 == OddAvg.oddAverage(testlist));
  }

  @Test
  void oddAverageThirdTest() {
    List<Integer> testlist = new ArrayList<>();
    testlist.add(5);
    testlist.add(27);
    testlist.add(13);
    testlist.add(52);
    assertTrue(15 == OddAvg.oddAverage(testlist));
  }
}
