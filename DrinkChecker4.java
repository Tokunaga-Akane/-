public class DrinkChecker4{
	public static void main(String[] args){
		int a = 20; 
		if(a>=20){
			System.out.println("You can drink alcohol!");
		}else if(a>=18){
			System.out.println("You must not drink alcohol until 20 years old!");
		}else{
			System.out.println("Do you want a cup of coffee?");
		}
	}
}
