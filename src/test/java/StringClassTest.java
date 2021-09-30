import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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

	@Test
	@DisplayName("\"(1,2)\" 값이 주어졌을 때 String의 substring() 메소드를 활용해 () 을 제거하고 \"1,2\"를 반환\n" +
			"하도록 구현한다.")
	void braketRemoveTest(){
		 String value = "(1,2)";
		 String braketValue = value.substring(1,value.length()-1);

		 assertThat(braketValue).isEqualTo("1,2");
	}

	@Test
	@DisplayName("StringIndexOutOfBoundsException이 발생하면 message를 Index: Size를 리턴해준다")
	void stringIndexOutOfBoundsExceptionMessage(){
		var value = "abc";
		assertThatThrownBy(()-> {
			value.charAt(3);
		}).isInstanceOf(IndexOutOfBoundsException.class).hasMessageContaining("String index out of range: 3");

		// hasMessageContaining : 해당 메시지가 포함되어 있는지를 알려준다

		assertThatExceptionOfType(IndexOutOfBoundsException.class)
			.isThrownBy(()->{
				value.charAt(3);
			}).withMessageMatching("String index out of range: \\d");

		/*		아래의 클래스들은 자주 사용되어 나오고 있음
		assertThatNullPointerException
		assertThatIllegalArgumentException
		assertThatIllegalStateException
		assertThatIOException

		//에외를 던지지 않을때
		assertThatCode(()-> 코드 작성 ).doesNotThrowAnyException();
		*/





	}




}
