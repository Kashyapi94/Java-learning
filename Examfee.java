class Examfee
{
	public static void main(String[] args)
	{
		Examfee S= new Examfee();
		char student='Y';
		String year="3rd year";
		System.out.println("Are you a student ?");
		while(student=='Y')
		{
			System.out.println("Please enter your ID card number: ");
			System.out.println("62111");
		switch(year)
		{
		case "1st year":
			S.semester();
			break;
		case "2nd year":
			S.semester();
			break;
		case "3rd year":
			S.semester();
			break;
		case "4th year":
			S.semester();
			break;
		default:
			System.out.println("Please try with valid input");
			break;
		}
		System.out.println("Do you want to try again");
			student='N';	
		}
	}	
	public void semester()
	{
		int sem=1;

		if(sem==2)
		{
			System.out.println("The fee is 1000 rs");
			
		}
		else
		{
			System.out.println("The fee is 2000 rs");
		}

	}

}
	