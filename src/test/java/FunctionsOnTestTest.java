import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionsOnTestTest {
    @Test
    public void lessThree(){
        assertThat(FunctionsOnTest.LessThree(1,2,3)).isEqualTo(1);
        assertThat(FunctionsOnTest.LessThree(1,1,3)).isEqualTo(1);
        assertThat(FunctionsOnTest.LessThree(1,0,3)).isEqualTo(0);
        assertThat(FunctionsOnTest.LessThree(1,-1,3)).isEqualTo(-1);
        assertThat(FunctionsOnTest.LessThree(-1,-1,-3)).isEqualTo(-3);
        assertThat(FunctionsOnTest.LessThree(1,1,1)).isEqualTo(1);
        assertThat(FunctionsOnTest.LessThree(3,1,1)).isEqualTo(1);
        assertThat(FunctionsOnTest.LessThree(3,Integer.parseInt("dasc"),1)).isEqualTo(1);

    }

    @Test
    public void abbTest(){
        assertThat(FunctionsOnTest.Abb("Тестовое задание")).isEqualTo("ТЗ");
        assertThat(FunctionsOnTest.Abb("тестовое задание")).isEqualTo("ТЗ");
        assertThat(FunctionsOnTest.Abb("тестовое")).isEqualTo("Т");
        assertThat(FunctionsOnTest.Abb("Тестовое задание 123")).isEqualTo("ТЗ1");
        assertThat(FunctionsOnTest.Abb("12315")).isEqualTo("1");
        assertThat(FunctionsOnTest.Abb("тест 123 Задание")).isEqualTo("Т1З");
        assertThat(FunctionsOnTest.Abb(" ")).isEqualTo("");
        assertThat(FunctionsOnTest.Abb("!%^%")).isEqualTo("!");
        assertThat(FunctionsOnTest.Abb(" тестовое задание")).isEqualTo("ТЗ");
    }

}
