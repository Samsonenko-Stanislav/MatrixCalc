package MatrixCalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

import static MatrixCalc.Transposition.t;
import static org.junit.jupiter.api.Assertions.*;

class TranspositionTest {
    double [][] a = {{1,2,3}, {1,2,3}, {1,2,3}};
    double [][] T = {{1,1,1}, {2,2,2}, {3,3,3}};
    @Test
    void testT() {
        Assertions.assertArrayEquals(T, t(a));
    }
}