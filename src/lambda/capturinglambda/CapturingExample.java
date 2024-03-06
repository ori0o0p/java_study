package lambda.capturinglambda;

public class CapturingExample {

    public static void main(String[] args) {
        int age = 1234;
        Runnable runnable = () -> System.out.println(age);
        age = 4321; // 재할당 금지!
        /*
            위의 코드에서는 age라는 지역 변수를 지정후 람다에서 변수를 캡쳐 후 age 변수에 값을 재할당하고 있다.

            여기서 캡쳐한다는 동작은 파라미터가 아닌 람다식 외부의 정의된 변수를 람다 내부에서 사용하 것이다.
            : 람다 캡쳐링

            이 코드에서는 에러가 발생하는데 이유는 람다에서 사용되는 지역 변수는 final로 선언되거나
            재할당을 할 수 없다.
        */
    }

}
