import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {
		
		Scanner inputSource = new Scanner(System.in);
		double result = 0;

		System.out.print("Please enter two numbers of your exalted choosing: ");
		
		String [] input = {"", ""};
		input[0] = inputSource.next();
		input[1] = inputSource.next();
		
		int [] arrInt = {0, 0};
		double [] arrDouble = {0.0, 0.0};
		
		for (int i = 0; i < 2; i++)
		{
			if(isStringInt(input[i]))
			{
				arrInt[i] = Integer.parseInt(input[i]);
				result += arrInt[i];
			}
			else if(isStringDouble(input[i]))
			{
				arrDouble[i] = Double.parseDouble(input[i]);
				result = result + arrDouble[i];
			}
			else
			{
				System.out.println("I can only add numbers. " + input[i] + " is not a number, you can not fool me!");
			}
		}

		System.out.println(result);
		
		inputSource.close();
		
}
	
public static boolean isStringInt(String s)
{
    try
    {
        Integer.parseInt(s);
        return true;
    } catch (NumberFormatException ex)
    {
        return false;
    }
}

public static boolean isStringDouble(String str) {
    try {
        Double.parseDouble(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}


}

