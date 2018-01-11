package icehs.science.chapter08;

public class IdolArrayTest {
	public static void main(String[] args) {
		Idol[] idols = {new Idol("¼Ò³à½Ã´ë", "ÅÂ¿¬"),
						new Idol("¾¾½ºÅ¸", "º¸¶ó"),
						new Idol("ºò¹ð", "Áöµå·¡°ï"),
						new Idol("ºñ½ºÆ®", "¾ç¿ä¼·")};
		
//		System.out.println(idols[0].getGroup() + " : " + idols[0].getName());
//		System.out.println(idols[1].getGroup() + " : " + idols[1].getName());
//		System.out.println(idols[2].getGroup() + " : " + idols[2].getName());
//		System.out.println(idols[3].getGroup() + " : " + idols[3].getName());
		for (int i = 0; i < idols.length; i++) {
			System.out.println(idols[i].getGroup() + " : " + idols[i].getName());
		}
	}
}
