package MatrixCalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static MatrixCalc.Multiplication.mult;
import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    double [][] a = {{1,2,3}, {1,2,3}, {1,2,3}};
    double [][] b = {{1,2,3}, {1,2,3}, {1,2,3}};
    double [][] c = {{6,12,18},{6,12,18},{6,12,18}};
    @Test
    void multTest() {
        Assertions.assertArrayEquals(c, mult(a,b));
    }
}