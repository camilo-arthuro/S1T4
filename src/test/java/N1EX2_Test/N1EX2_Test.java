package N1EX2_Test;

import java.util.ArrayList;
import java.util.stream.Stream;

import N1EX2.N1EX2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import static N1EX2.N1EX2.calculoDni;
import static N1EX2.N1EX2.dniList;

public class N1EX2_Test {
    private N1EX2 list = new N1EX2();

    @BeforeEach
    void createListForTests() {
        //ArrayList<Integer> numList= list.dniList();
    }

    @Test
    public void testCalculo(){
        ArrayList<Integer> dniList = dniList();
        String letterDni = "";

        // Expected result
        String[] vectorLetter = {"Z", "X", "L", "M", "X", "G", "M", "H", "B", "N"};

        for (int i = 0; i < dniList.size(); i++) {
            letterDni = calculoDni(dniList.get(i));
            Assert.assertEquals(vectorLetter[i],letterDni);
        }
    }
    @ParameterizedTest
    @ValueSource(ints = {12345678,87654321, 12348765, 87651234, 12783456, 87126534,
            98765432, 12093487, 90785634, 21436587})
    public void testCalculo2(int dni){
        // Expected result
        String letterDni = list.calculoDni(dni);
        String[] vectorLetter = letras();

        Assert.assertEquals(vectorLetter,letterDni);
    }

    public String[] letras(){
        String[] vectorLetter = {"Z", "X", "L", "M", "X", "G", "M", "H", "B", "N"};

        return vectorLetter;
    }
}
