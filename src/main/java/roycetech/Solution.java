package roycetech;

import java.util.HashSet;
import java.util.Set;

/**
 * Find value that occurs in odd number of elements.
 *
 * @author royce
 */
public class Solution {

  /**
   * Given an array consisting of N integers fulfilling the above conditions.
   *
   * @param array test input
   * @return the value of the unpaired element.
   */
  public int solution(final int[] array) {
    final Set<Integer> unique = new HashSet<>();

    for (final int number : array) {
      if (!unique.add(number)) {
        unique.remove(number);
      }
    }
    return unique.iterator().next();
  }
}
