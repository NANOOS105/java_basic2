package exception.basic.checked;
/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */
public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message); //Throwable의 Strng detailMessage에 보관
        //getmessage()를 통해 부르기 가능
    }
}