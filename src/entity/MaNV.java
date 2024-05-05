package entity;

public class MaNV {
	private static String ma;
	
	
	public  MaNV(String ma) {
		super();
		MaNV.ma = ma;
	}

	public static String getMa() {
		
			return ma;
		
	}
	public void setMa(String ma) {
		MaNV.ma = ma;
	}
	
}
