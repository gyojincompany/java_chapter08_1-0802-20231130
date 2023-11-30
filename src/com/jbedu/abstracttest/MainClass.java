package com.jbedu.abstracttest;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CameraPhone cameraPhone = new CameraPhone();
		
		cameraPhone.turnOn();
		
		cameraPhone.modelName = "갤럭시카메라폰";
		cameraPhone.modelColor = "피아노블랙";
		
		MusicPhone musicPhone = new MusicPhone();
		
		musicPhone.modelName = "갤럭시뮤직폰";
		musicPhone.modelColor = "인디언핑크";
		
		musicPhone.turnOn();
		
		//Phone phone = new Phone();//추상 클래스는 객체를 선언할 수 없다(만들 수 없다).
		// 추상클래스는 상속받은 클래스의 객체로만 사용가능하다->상속 전용 클래스.

	}

}
