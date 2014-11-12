
public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Test");
		doNothing();	
		doAny("GET UPa!!!");
	}
	
	public static void doNothing(){
		System.out.println("nothing 2 3");
	}
	
	public static void doAny(String text){
	    Integer c;
	    for(c=1;c<=4;c++)
	    {	
	    	System.out.println(c);
	    	
	    }
		System.out.println(text);
	}

}
