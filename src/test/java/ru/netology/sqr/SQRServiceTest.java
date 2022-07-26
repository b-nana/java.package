package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/java/resources/sqr.csv")
    public void isCountForSquaresOfRangeCorrect (int expected, int a, int b) {
        SQRService service = new SQRService ();
        int actual = service.countSquaresInRange(a, b);
        Assertions.assertEquals(expected, actual);


    }
}
