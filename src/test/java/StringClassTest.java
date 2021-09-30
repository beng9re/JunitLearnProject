import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringClassTest {

	@Test
	@DisplayName("split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.")
	void splitTest(){
		String value = "1,2";

		String[] splitValue = value.split(",");
		// containsExactly 순서 까지 정확한 값일치
		// containsOnly  순서 중복여부 관계없이 정확히 값 만일치
		// contains  값만 일치

		assertThat(splitValue).contains("1")
			.containsOnly("1","2")
			.containsExactly("1","2")
			.doesNotContain("3");


	}

	@Test
	@DisplayName("1을 , 로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.")
	void oneTextSplitTest(){
		String value = "1,2";
		String [] splitValue = value.split(",");
		//순서를 포함해서 정확히 일치
		assertThat(splitValue).containsExactly("1");

	}




}
