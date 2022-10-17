package MatrixCalc;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static MatrixCalc.ScalMult.mult;

class ScalMultTest {
    double [][] a = {{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
    double b = 5;
    double [][] c = {{5,5,5,5},{5,5,5,5},{5,5,5,5},{5,5,5,5}};
    @Test
    void testmult() {
        Arrays.equals(c,mult(b,a));
    }
}