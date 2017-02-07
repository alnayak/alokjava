package com.om;

class Test3{
	public void show(){
		System.out.println("Weleome to Create Obj ...");
	}
}

public class ObjTest {

	public static void main(String[] args) {
		try {
			Class c=Class.forName("com.om.Test3");
			
				Test3 t=(Test3)c.newInstance();
				t.show();
			
		} catch (Exception e ) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
