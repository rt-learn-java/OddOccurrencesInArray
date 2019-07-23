import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void solution() {
        final Solution sut = new Solution();
        final int actual = sut.solution(null );
        assertEquals(-1, actual, "output is not as expected");
    }  
}