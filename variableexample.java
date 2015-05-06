import javax.xml.bind.ValidationEvent;


public class variableexample {
	int data=50;//instance variable  
	
	static int num1=100;//static variable  
	
	void method()
	
	{  
		
	int num2 =90;//local variable  
	int num3=100;
	int num4=num2+num3;
	System.out.println("variable addition"+""+num4);
	} 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		variableexample var=new variableexample();
		System.out.println("java variable example");
		var.method();
		
		
		
	}

}
