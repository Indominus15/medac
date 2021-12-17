package ficheros;

public class try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = new int[3];
		try{
			array[5]=34;
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e+" pringao te has equivocado");
		}
		
	}

}
