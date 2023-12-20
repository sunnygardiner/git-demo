package com.sgtech.app.git_demo;


public class App 
{
	public void addData(String data) {
			if(data.equals(Constant.DATA_TYPE)) {
			System.out.println(StringInput.FINAL_STR);
		}
	}
	public void addMethod(){
		 System.out.println( "new method" );
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
