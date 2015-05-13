package calss;
/**
 *@author 姚义祥
 *@2014-9-14
 *@desperation: 
 *
 */
public class Human {
	private int height;

	public Human(int h) {
		this.height = h;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void growHeight(int h) {
		this.height = this.height + h;
	}
	
	public void breath() {
		System.out.println("hu...hu...");
	}
}
