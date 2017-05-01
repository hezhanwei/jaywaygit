package com.yishao.annotation;

public class AnnotionTest {

	public static void main(String[] args) {

		if (Hument.class.isAnnotationPresent(Rulai.class)) {
			Rulai annotation = Hument.class.getAnnotation(Rulai.class);
			String skill = annotation.skill();
			System.out.println("Humen skill: " + skill);
		}

		if (Monkey.class.isAnnotationPresent(SunWuKong.class)) {
			SunWuKong annotation = Monkey.class.getAnnotation(SunWuKong.class);
			String skill = annotation.skill();
			System.out.println("Monkey skill: " + skill);
		}

	}

}

@Rulai
class Hument {
}

@SunWuKong
class Monkey {
}