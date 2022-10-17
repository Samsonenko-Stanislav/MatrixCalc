package MatrixCalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static MatrixCalc.Addition.add;

class AdditionTest {

    double[][] a = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
    double[][] b = {{9, 8, 7, 6}, {9, 8, 7, 6}, {9, 8, 7, 6}};
    double[][] c = {{10, 10, 10, 10}, {10, 10, 10, 10}, {10, 10, 10, 10}};

    @Test
    void testadd() {
        Assertions.assertArrayEquals(c, add(a,b));
    }
}