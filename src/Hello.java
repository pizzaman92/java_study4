import java.util.Scanner;

/**
 * 자바 기초 학습용 클래스입니다.
 *
 * @author Hong
 * @email ~~~~@ ~~~ .com
 * @license MIT, Apache
 * @since 2021.07.27 ~
 */
public class Hello {

    static String y = "안녕";

    public static void main(String[] args) {
        for (int y = 0; y < 3; y++) {
            System.out.println("for-y = " + y);
        }
        System.out.println("global-y = " + y);
    }

}//end class