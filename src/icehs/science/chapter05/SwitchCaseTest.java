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
        
        System.out.println("�� ���� : "+result);
        switch((int)result / 10) {
        case 10 :
        case 9 : System.out.println("Special Class �Դϴ�."); break;
        case 8 : System.out.println("Gold Class �Դϴ�."); break;
        case 7 : System.out.println("Silver Class �Դϴ�."); break;
        case 6 : System.out.println("Bronze Class �Դϴ�."); break;
        default : System.out.println("Member");
        }
    }
}
