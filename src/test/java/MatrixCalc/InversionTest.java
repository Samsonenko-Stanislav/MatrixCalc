package MatrixCalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static MatrixCalc.Inversion.inverse;
import static org.junit.jupiter.api.Assertions.*;

class InversionTest {
    double [][] a = {{1,0,3}, {0,2,1}, {1,1,0}};
    double [][] b = {{1,-3,6}, {-1,3,1}, {2,1,-2}};
    @Test
    void inverseTest() {
        Assertions.assertArrayEquals(b, inverse(a));
    }
}