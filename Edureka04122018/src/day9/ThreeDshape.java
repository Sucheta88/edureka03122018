package day9;

public abstract class ThreeDshape {
	public double calculateVolume(int len,int height) {
		double volume;
		volume =calculateArea(len) * height;
		return volume;
	}
	
	public abstract double calculateArea(int len);

}
