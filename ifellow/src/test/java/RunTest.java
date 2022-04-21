import org.junit.*;

import static org.junit.Assert.*;

public class RunTest {

    private int number1 = 0;
    private int number2 = 0;

    @Before
    public void setValues(){
        System.out.println("Установка значений");
        number1 = 5;
        number2 = 6;
    }

    @After
    public void zeroingVariables(){
        System.out.println("Обнуление значений");
        number1 = 0;
        number2 = 0;
    }

    @Test
    public void testNotSameNumbers(){
        System.out.println("Тест отличны ли значения");
        assertNotSame("Переданы одинаковые значения!", number1, number2);
    }

    @Test
    public void testValueEquality(){
        System.out.println("Тест равности значений");
        assertTrue("Переданные значения не равны!", number1 == number2);
    }
}
