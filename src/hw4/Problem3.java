package hw4;

public class Problem3 {
	public static void main(String[] args) {
//		 有個字串陣列如下 (八大行星)：
//		 {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		 請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
		String[] planets = {"mercury", "venus", "earth", "mars", 
							"jupiter", "saturn", "uranus", "neptune"};
		int sum = 0;
		for(int i = 0; i < planets.length; i++) {
			for(char aeiou : planets[i].toCharArray()) {
				if(aeiou == 'a' || aeiou == 'e' || aeiou == 'i' || aeiou == 'o' || aeiou == 'u') {
					sum++;
				}
			}
		}
		System.out.print("陣列裡面共有：" + sum + "個母音");
	}
}
