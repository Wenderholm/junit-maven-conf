package pl.zajavka;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;
// jezeli wpiszemy w terminalu "mvn verify -DskipTests" wykonamy porgram bez testów

    //  @BeforeAll - wykonuje kod przed uruchomieniem testów. musi byc static
//    @BeforeAll
//    static void beforeAll() {
//        System.out.println("beforeAll");
//    }


    // @BeforeEach - bedzie wykonywany pomiedzy każdym testem
//    realne użycie: do dodania obiektu calculator do każdego testu. w każdym teście jest inny obiekt
//    widać to na wydruku po hashCodzie
    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
        System.out.printf("beforeEach: %s%n", calculator);
    }

    //  @AfterAll - wykonuje kod po przejściu testów. musi byc static
//    @AfterAll
//    static void afterAll() {
//        System.out.println("afterAll");
//    }
//
    @Test
    void assertionTest() {
//        w asercji mamy 3 parametr któy jest albo wiadomościa Sting albo supplierem

//        w 1 przypadku mamy string i ten string powinien wyswietlac sie wtedy kiedy jest błąd
//        ale w tym przypadku on wyswietli sie jak będzie błąd i jak go nie będzie
//        Assertions.assertEquals(1,1, message(1));

//        w 2 przypadku mamy supplier który wyswietli sie tylko jak będzie błąd sprwadzenia
//        to jest tak samo jak z Optional
//        Optional.empty().orElse(); // orElse wykonywany nawet jak nie jest potrzebny
//        Optional.empty().orElseGet(); // orElseGet wykonywany wtedy kiedy jest potrzebny bo optional nie działa
//        Assertions.assertEquals(1,2, ()->message(2));

//        Assertions.assertEquals(1,2);
//        trzecia assercja sie nie wywoła ponieawż druga wyrzuci błąd
//        Assertions.assertEquals(1,3);

//         WYSWIETLANE ASSERCJI POMIMO BŁĘDU W POPRZEDNIEJ - wyswietla nam wszystkie błędne sprawdzenia
//        Assertions.assertAll(
//                () -> Assertions.assertEquals("test1", "test2", () -> "my custom message"),
//                () -> Assertions.assertEquals("test1", "test3", () -> "my custom message"),
//                () -> Assertions.assertEquals("test1", "test1", () -> "my custom message")
//        );

    }

//    @ParameterizedTest
//    @MethodSource(value = "testData")
//    void testCalculator(int[] testData) {
////        TESTOWANIE KILKU PARAMETRÓW ##################################################################
//        Assertions.assertEquals(testData[0], calculator.add(testData[1],testData[2]));
//
//    }

//    public static int[][] testData() {
//        return new int[][]{
//            {5,2,2},
//            {8,3,5},
//            {9,3,6}
//        };
//    }

//    private String message(int param) {
//        System.out.println("Message creation: " + param);
//        return "Failur message: " + param;
//    }

    @Test
    @DisplayName("Testing method which tests adding")
    void add() {
        System.out.println("add()");
//    given
        int left = 5;
        int right = 7;
        Integer expected = 12;
//    when
        Integer result = Calculator.add(left, right);
//    then
        Assertions.assertEquals(expected, result);

//       TESTOWANIE / ŁAPANIE WYJĄTKKÓW ###################################################################################
//    String left = "4";
//    String right = "zajavka";
// oczekiwane jest ze asercja rzuci wyjątek NumberFormatException jezeli rzuca wyjatek to test przechodzi dla wartości
//        left = "4" i right="4" nie przejdzie a dla left = "4" i right="zajavka" przejdzie
//        NumberFormatException trowable = assertThrows(NumberFormatException.class, () -> Calculator.add(left, right));
//        Assertions.assertEquals("For input string: \"" + right +"\"", trowable.getMessage());


    }

    @Test
    void subtract() {
        System.out.println("subtract()");
//    given
        int left = 5;
        int right = 7;
        Integer expected = -2;
//    when
        Integer result = Calculator.subtract(left, right);
//    thenv
        Assertions.assertEquals(expected, result);
    }

    @Test
    void multiple() {
        System.out.println("multiple()");
//    given
        int left = 5;
        int right = 7;
        Integer expected = 35;
//    when
        Integer result = Calculator.multiple(left, right);
//    then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void divide() {
        System.out.println("divide()");
//    given
        int left = 5;
        int right = 7;
        Integer expected = 0;
//    when
        Integer result = Calculator.divide(left, right);
//    then
        Assertions.assertEquals(expected, result);
    }

}