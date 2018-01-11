package icehs.science.chapter08;

public class ArrayDataEx {
	public static void main(String[] args) {
		int[] lottoNumbers = new int[6];
		String[] names = {"홍길동", "홍길순", "전우치"};
		
		lottoNumbers[0] = 23;
		lottoNumbers[1] = 31;
		lottoNumbers[2] = 6;
		lottoNumbers[3] = 11;
		lottoNumbers[4] = 27;
		lottoNumbers[5] = 3;
		//lottoNumbers[6] = 19;
		
		System.out.println("배열의 길이 : " + lottoNumbers.length);
		
		System.out.println(lottoNumbers[3]);
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
	}
}
