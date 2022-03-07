package a;
//*
class MySingleton{
	private static MySingleton mySingleton=new MySingleton();
	
	private MySingleton() {
		System.out.println("dare to call..");
	}
	// can i call staitc method without creating the object outside :Yes   :)
	public  static MySingleton getMySingleton() {
		return mySingleton;
	}
}

public class F_BasicSingleton {

	public static void main(String[] args) {
			
		MySingleton mySingleton=MySingleton.getMySingleton();
		System.out.println(mySingleton.hashCode());
		
		MySingleton mySingleton2=MySingleton.getMySingleton();
		System.out.println(mySingleton2.hashCode());
		
		
		
		
		
	}
}


//java reflection* even u can call private method
// java ref break the encapsulation rule, use it very carefully
//*great power comes with great resp*

//U CAN CALL STATIC METHOD WITHOUT CREATING OBJECT OF THAT CLASS
