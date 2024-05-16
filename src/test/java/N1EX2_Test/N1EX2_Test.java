package N1EX2_Test;

import java.util.stream.Stream;
import N1EX2.N1EX2;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class N1EX2_Test {
    private N1EX2 list = new N1EX2();

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testCalculo(int dni, String letter){
        // Expected result
        String letterDni = list.calculoDni(dni);

        Assert.assertEquals(letter,letterDni);
    }

    private static Stream<Arguments> provideParameters() {
        return Stream.of(
                Arguments.of(12345678,"Z"),
                Arguments.of(87654321,"X"),
                Arguments.of(12348765,"L"),
                Arguments.of(87651234,"M"),
                Arguments.of(12783456,"X"),
                Arguments.of(87126534,"G"),
                Arguments.of(98765432,"M"),
                Arguments.of(12093487,"H"),
                Arguments.of(90785634,"B"),
                Arguments.of(21436587,"N")
        );
    }
}
