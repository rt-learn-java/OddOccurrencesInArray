package roycetech;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class SolutionTest {
  @ParameterizedTest
  @MethodSource("data")
  void solution(final int[] input, final int expected) {
    final Solution sut = new Solution();
    final int actual = sut.solution(input);
    assertEquals(expected, actual, "output is not as expected");
  }

  @SuppressWarnings("PMD.UnusedPrivateMethod")
  /**
   * @return
   */
  private static Stream<Arguments> data() {
    final Object[][] expectedActual =
        new Object[][] {new Object[] {new int[] {9, 3, 9, 3, 9, 7, 9}, 7},
            new Object[] {new int[] {9, 3, 9, 3, 1}, 1}};

    final List<Arguments> allArguments = new ArrayList<>();
    for (final Object[] next : expectedActual) {
      allArguments.add(Arguments.of(next[0], next[1]));
    }

    return Stream.of(allArguments.toArray(new Arguments[0]));
  }
}
