package testUnit2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class divisionTest {

    private division Division;

    @BeforeEach
    public void init(){
        Division=new division();
    }

    @Test
    public void testDivision(){
        Assertions.assertThrows(ArithmeticException.class,()->Division.divide(12,1));
    }

}
