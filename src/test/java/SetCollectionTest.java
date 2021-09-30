import static org.assertj.core.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

public class SetCollectionTest {

    private Set<Integer> numbers;

    @BeforeEach
    void setUp(){
        numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
    }

    @Test
    @DisplayName("Size가 4인지 테스트 한다")
    void setSizeTest(){
        assertThat(numbers.size()).isEqualTo(4);
    }


    @DisplayName("ParameterizedTest 적용해보기 + 1,2,3이 포함이 되어있는가?")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3})
    void contains(Integer number){
//        assertThat(numbers.contains(1)).isTrue();
//        assertThat(numbers.contains(2)).isTrue();
//        assertThat(numbers.contains(3)).isTrue();

        assertThat(numbers.contains(number)).isTrue();
    }

    //    위요구사항 는 contains 메소드 결과 값이 true인 경우만 테스트 가능하다. 입력 값에 따라 결과
    //    값이 다른 경우에 대한 테스트도 가능하도록 구현한다.
    @DisplayName("해당 셋에 1,2,3 이 들어있고 45가 포함이 되어 있지 않다")
    @ParameterizedTest
    @CsvSource(value = {"1,true","2,true","3,true","4,false","5,false"})
    void contains2(Integer number,boolean trueCk){

        if(trueCk){
            assertThat(numbers.contains(number)).isTrue();
            return;
        }
        assertThat(numbers.contains(number)).isFalse();


    }



}
