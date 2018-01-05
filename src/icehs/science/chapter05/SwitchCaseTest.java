package icehs.science.chapter05;

public class SwitchCaseTest {
	public static void main(String[] args) {
		int firstNo = 10;
        int secondNo = 20;
        int thirdNo = 40;
        int forthNo = 50;
        int fifthNo = 80;
        
        double result = 0;
        result += firstNo * secondNo / 2 * 0.6;
        result += (thirdNo + forthNo) / 2 * 0.13;
        result += fifthNo * 0.27;
        
        System.out.println("평가 점수 : "+result);
        switch((int)result / 10) {
        case 10 :
        case 9 : System.out.println("Special Class 입니다."); break;
        case 8 : System.out.println("Gold Class 입니다."); break;
        case 7 : System.out.println("Silver Class 입니다."); break;
        case 6 : System.out.println("Bronze Class 입니다."); break;
        default : System.out.println("Member");
        }
    }
}
