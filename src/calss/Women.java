package calss;
/**
 *@author 姚义祥
 *@2014-9-14
 *@desperation: 
 *
 */
public class Women extends Human{

	public Women(int h) {
		super(h);
	}

	public Human giveBirth() {
		System.out.println("Give birth");
		return (new Human(20));
	}	
}
