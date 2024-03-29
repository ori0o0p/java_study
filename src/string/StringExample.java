package string;

public class StringExample {

    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "World!";

        String str3 = str + " " + str2; // 비효율적인 코드


        StringBuffer sb = new StringBuffer(12);
        sb.append("Hello");
        sb.append(" ");
        sb.append("World!");

        String str4 = sb.toString(); // 효율적인 코드

        /**
         * String은 불변 클래스이다.(immutable)
         * subString(), toUpperCase(), toLowerCase() 등 이런 메서드를 보았을 때 변경가능한 것 같지만
         * 사실 그 메서드들은 새로운 String 객체를 생성해 반환한다. 그럼?
         * 히히 객체가 두 개당
         * StringBuffer는 변경가능한 클래스이다! (mutable)
         * 새 객체를 생성하지 않고 기존의 객체를 변경함.
         * 그렇다고 StringBuilder가 매번 효율적이라는 것은 아니다.
         * StringBuilder 객체를 생성할 때, toString으로 String 객체를 생성하는 것이 반드시 필요한 작업이지만,
         * 메모리 사용 측면에서 비효율적이다.
         * String 클레스는 인스턴스화할 때 효율적이고,
         * StringBuffer 클래스는 문자열 추가가 여러번 발생할 때 효율적이다.
         */
    }

}
