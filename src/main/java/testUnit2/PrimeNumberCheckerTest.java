package testUnit2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class PrimeNumberCheckerTest {
private PrimeNumberChecker primeNumberChecker;

@BeforeEach
    public void setup(){
    primeNumberChecker=new PrimeNumberChecker();
}

public static Collection<Object[]> numbers(){
    return Arrays.asList(new Object[][]{
            {2,true},
            {6,false},
            {19,true},
            {22,false},
            {23,true}
    });
}

@ParameterizedTest
@MethodSource("numbers")
public void test(int testingNumber,boolean expectedResult){
Assertions.assertEquals(expectedResult,primeNumberChecker.validate(testingNumber));
}
}
