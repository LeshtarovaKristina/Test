package class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		int day=5;
		String dayName=null;
		
		//default value of all non primative types is-->null
		if(day==1) {
			dayName="Monday";
			
		}else if(day==2) {
			dayName="Tuesday";
			
		}else if(day==3) {
			dayName="Wednesday";
		}else if(day==4) {
			dayName="Thursday";
		}else if(day==5) {
			dayName="Friday";
		}else if(day==6) {
			dayName="Saturday";
		}else if(day==7) {
			dayName="Sunday";
		}else {
			dayName="Invalid";//eather else to finish the statements or you go back to the string and =null!!!
		}
		System.out.println(dayName);
		
		System.out.println("------------------------------------------------");
		
		switch(day) {//switch can not fully replace if,if else...It has a lot of limitations
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
		default:
				dayName="Invalid";
				break;
		}
		
		System.out.println(dayName);
		
		
		
		
		
		
		
		
		
	}

}
