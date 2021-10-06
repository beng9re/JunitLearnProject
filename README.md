# AssertJ + Junit을 익히는 저장소

### Junit 이란?
* 자바의 테스트 프레임워크 

### AssertJ 이란 
* 자바 JUnit의 테스트코드에 사용되어, 테스트코드의 가독성과 편의성을 높여 주는 라이브러리.
* 메서드 체이닝을 지원해, 더 직관적이고 읽기 쉬운 테스트코드 작성 가능
* 테스트에 필요한 풍부한 메소드들을 제공함

**AssertJ 의 주요 메소드**

* assertThat("테스트 오브젝트") : 테스트할 오브젝트를 정의

* contains : 해당 데이터가 포함이 되어 있는가?
* containsOnly: 순서 중복여부와 관계없이 정확히 값만 일치하는 경우
* containsExactly : 순서 까지 정확한 값일치
* isEqualTo : 값 비교  
* isTrue() : 참인가?



* 익셉션 테스트 
  * assertThatThrownBy(()-> 행위).isInstanceOf(익셉션 클래스)
  * assertThatExceptionOfType(익셉션 타입).isThrownBy(행)
  * assertThatNullPointerException : 널포인트
  * assertThatIllegalArgumentException :데이터 이상
  * assertThatIllegalStateException : 데이터 상태 이상
  * assertThatIOException : IO 익셉션 


* 반복 테스트를 위한 ParameterizedTest 
  * 의존성 필요 
    ```groovy
        testImplementation "org.junit.jupiter:junit-jupiter-params:5.7.0"
    ```

  * @ParameterizedTest : 파라미터 기반의 테스트 반복 자로도 수행 @Test 어노테이션 중복 사용 불가
  * @ValueSource({}) : value로 순회
  * @CsvSource({}) : Csv 기반으로 순회 
  
