package MatrixCalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static MatrixCalc.Determinant.det;
import static org.junit.jupiter.api.Assertions.*;

class DeterminantTest {
    double [][] a = {{1}};
    double det1 = 1;
    double [][] b = {{1,1}, {1,1}};
    double det2 = 0;
    double [][] c = {{1,2,3},{1,2,3},{1,2,3}};
    double det3 = 0;
    @Test
    void detTest1() {
        Assertions.assertEquals(det1, det(a));
    }
    @Test
    void detTest2(){
        Assertions.assertEquals(det2, det(b));
    }
    @Test
    void detTest3(){
        Assertions.assertEquals(det3,det(c));
    }
}