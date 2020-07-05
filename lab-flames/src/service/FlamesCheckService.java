package service;

// Create a class called FlamesCheckService
// FlamesCheckService has a method findFlames to find the flames between two names
// char findFlames(String name1, String name2) takes two strings as arguments
// Your task is to calculate the flames value and return the corresponding character as output 
// You must return only the following values ['f','l','a','m','e','s']
// change the return value at the end of the method corresponding to your return value

public class FlamesCheckService{
	public char findFlames(String name1,String name2){
		name1=name1.toLowerCase();
		name2=name2.toLowerCase();
		StringBuffer s1 = new StringBuffer(name1);
		StringBuffer s2 = new StringBuffer(name2);
		char a,b;
		for(int i=0;i<s1.length();i++){
			a = s1.charAt(i);
			for(int j=0;j<s2.length();j++){
				b = s2.charAt(j);
				if(a==b){
					s1.deleteCharAt(i);
					s2.deleteCharAt(j);
					i--;
					j--;
					break;
				}
			}
		}
		
		s1=s1.append(s2);
		int num=0;
		int tl=s1.length();
		String s3 = "FLAMES";

		
		for(int s=6;s>=2;s--)
		{
			if(tl>s)
				num =tl-s;
			else
				num=tl;
			while(num>s)
			{
				num= num-s;
			}
			s3 = s3.substring(num,s3.length())+(s3.substring(0,num-1));
		}
		return s3.charAt(0);
//		switch(s3.charAt(0))
//		{
//		case 'F': System.out.println(" Your name is " + name1 + "Your partner name is "+name2+" You two are Friends");
//		break;
//		case 'L': System.out.println(" Your name is " + name1 + "Your partner name is "+name2+" You two are Lovers");
//		break;
//		case 'A': System.out.println(" Your name is " + name1 + "Your partner name is "+name2+" You two are Affectionate");
//		break;
//		case 'M': System.out.println(" Your name is " + name1 + "Your partner name is "+name2+" You two will get marry");
//		break;
//		case 'E': System.out.println(" Your name is " + name1 + "Your partner name is "+name2+" You two are Enemey");
//		break;
//		case 'S': System.out.println(" Your name is " + name1 + "Your partner name is "+name2+" You two are sisters");
//		break;
//		}
		
		
		}
	}