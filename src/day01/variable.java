package day01;

public class variable {

    public static void main(String[] args) {

        //변수의 선언
        int score;

        //변수의 초기화(이니셜라이징)
        score = 3;

        //출력
        System.out.println(score);

        int life = 50;
        life = 100;

        int triple = score * 3;
        System.out.println("triple = " + triple);

        //정수: int, 실수: double, 문자열: string
        String nickName = "짹짹이";

        //파일에 맞지 않는 값은 저장 불가
        //변수 이름은 중복 선언 불가능
        //선언이나 초기화되지 않은 변수는 사용 불가
        int result;
    }
}
