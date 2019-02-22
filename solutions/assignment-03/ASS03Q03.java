import java.util.*;

class Validate{
	String[] errlog=new String[4];
	
	public boolean validate_name(String name){
		int i,flag=0;
		char ch;
		for(i=0;i<name.length();i++){
			ch=name.charAt(i);
			if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')){}
			else{
				flag=1;
				break;
			}
		}
		if(flag==0){
			return true;
		}else{
			return false;
		} 	 	
		
	}
	
	public boolean validate_date(String date){
		if(date.length()!=10){
			return false;
		}else{
			int day = Integer.parseInt(date.substring(0,2));
			int month = Integer.parseInt(date.substring(3,5));
			int year = Integer.parseInt(date.substring(6,10));
			
			if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
				if(day>=1 && day<=31)
					return true;
				else
					return false;
			}else if(month==6 || month==7 || month==9 || month==11){
				if(day>=1 && day<=30)
					return true;
				else
					return false;
			}else if(month==2){
				if(day>=1 && day<=28)
					return true;
				else
					return false;
			}
		}
		return false;
	}
	
	public boolean validate_email(String email){
		if(email.indexOf('@')==-1 || email.indexOf('.')==-1	){
			return false;
		}else{
			return true;
		}
	}
	public static void main(String[] args){
		String first=args[0];
		String last=args[1];
		String date=args[2];
		String email=args[3];
		
		Validate val=new Validate();
		
		if(val.validate_name(first)){
			val.errlog[0] = first;
		}else{
			val.errlog[0]="Please enter a valid name";
		}
		
		if(val.validate_name(last)){
			val.errlog[1]=last;
		}else{
			val.errlog[1]="Please enter a valid name";
		}
		
		if(val.validate_date(date)){
			val.errlog[2]=date;
		}else{
			val.errlog[2]="Please enter a valid date";
		}
		
		if(val.validate_email(email)){
			val.errlog[3]=email;
		}else{
			val.errlog[3]="Please enter a valid email id";
		}
		
		System.out.println("First name: "+val.errlog[0]);
		System.out.println("Last name: "+val.errlog[1]);
		System.out.println("Date: "+val.errlog[2]);
		System.out.println("Domain name: "+val.errlog[3]);
		
	}
}
