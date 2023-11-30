package com.jbedu.abstracttest;

public class MusicPhone extends Phone {
	
	String music;
	
	public void music() {
		System.out.println("음악듣기");
	}

	@Override
	public void bell(String bellName) {
		// TODO Auto-generated method stub
		System.out.println("뮤직벨소리");
	}
	
	// 전원을 끌때 2초간 전원버튼을 눌러야 전원이 꺼짐
	// turnOff 메소드를 오버라이딩 하시오
	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		//super.turnOff();
		System.out.println("2초간버튼홀드로 전원 끄기");
	}
	
	

}
