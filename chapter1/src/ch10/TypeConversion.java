package ch10;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte bNum = 125;
//		int iNum = bNum;
//		System.out.println(iNum);

//		int iNum = 255;
//		byte bNum = (byte)iNum;
//		System.out.println(bNum);

//		double dNum = 3.14;
//		int iNum = (int)dNum;	
//		System.out.println(iNum);
		
		
		double dNum = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum + (int)fNum;
		int iNum2 = (int)(dNum + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
	}
}
