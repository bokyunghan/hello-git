package com.sh.app;

import com.sh.app.animal.Bird;
import com.sh.app.animal.Capibara;
import com.sh.app.animal.Cat;
import com.sh.app.animal.Dog;

public class Main {

	public static void main(String[] args) {
		System.out.println("HELLO WORLD");
		System.out.println("HELLO GIT");
	
		System.out.println("동물 기능 시작~");
		new Bird().fly();
		new Capibara().cry();
		new Cat().jump();
		new Dog().bark();
	}

}
