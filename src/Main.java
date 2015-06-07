import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws WRDEx {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double[] str1, str2, result;
		do {
			str1 = Methods.getAndParse(scn);
			str2 = Methods.getAndParse(scn);
			for(int i=0;i<str1.length;i++)
			System.out.println(str1[i]);
			for(int i=0;i<str2.length;i++)
			System.out.println(str2[i]);
			
			result = new double[str1.length];
			try {
				if (str1.length != str2.length)
					throw new WRDEx("Wrong dimensions (" + str1.length
							+ " and " + str2.length + ").");
				for (int i = 0; i < str1.length; i++) {
					result[i] = str1[i] + str2[i];
					System.out.println(result[i]);
				}
			} catch (WRDEx wrde) {
				System.out.println(wrde.getMessage());
			}
			System.out.println("dlugosc: "+result.length);
		} while (str1.length != str2.length);
		Methods.saveToFile(result);
		scn.close();
		System.out.println("Saved to file.\nProgram ended.");
	}

}