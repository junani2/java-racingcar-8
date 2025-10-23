# java-racingcar-precourse

## 기능 요구 사항

#### 아이디어

1. 문자열과 횟수를 입력받는다.
2. 입력받은 문자열을 기준으로 객체를 생성한다.
3. 객체에는 move과 stop 메소드가 포함되어 있다.
4. 각 객체는 무작위 값을 받아 move 와 stop을 결정한다.
5. 이동 횟수를 비교하여 max 값을 구한다.
6. max값을 가진 객체를 출력한다.

#### 필요한 함수 및 클래스

* RacingMember 클래스를 만들어 맴버별로 객체를 생성한다.
* RacingMember의 매소드로는 move와 stop을 가진다.
* 함수 정의 : InputView, OutputView,MovingCarName,RandomNumberPicking, NameSplit
    - InputView : 입력(자동차 이름, 횟수 입력 받기)
    - OutputView :  출력(최종 우승자 출력하기)
    - MovingCarName : 출력(전진하는 자동차 이름, '-' )
    - RandomNumberPicking :  무작위 값 뽑기(전진하는 조건 x>=4)
    - NameSplit : InputView에서 받은 문자열 ,을 기준으로 분리하기
* RacingGame 클래스를 통해 게임을 구현한다.

#### 발생할 수 있는 에러의 처리(IllegalArgumentException)

- 자동차 이름의 length가 5를 초과하는 경우
- 우승자가 한 명도 없는 경우
 