package com.jbedu.abstracttest;

public class CameraPhone extends Phone{
	
	String carmera;
	
	public void photo() {
		System.out.println("사진찍기");
	}

	@Override
	public void bell(String bellName) {
		// TODO Auto-generated method stub
		System.out.println("8비트벨소리");
	}
	
	
	

}
