import java.io.*;
import java.util.Scanner;

public class Methods {
	public static double[] getAndParse(Scanner scn) {
		System.out.println("Please insert string: ");
		String str1 = scn.nextLine();
		String[] hlpstr;
		hlpstr = str1.split(" ");
		int i = 0;
		int j = 0;
		int licznik=0;
		double[] helparray = new double[hlpstr.length];
		while (i<hlpstr.length){
			try {
			helparray[j++] = Double.parseDouble(hlpstr[i++]);
			licznik++;
		} catch (NumberFormatException nfe) {
		}
		}
		i=0;
		j=0;
		double[] array = new double[licznik];
		while (i < hlpstr.length) {
			try {
				array[j] = Double.parseDouble(hlpstr[i]);
				j++;
				i++;
			} catch (NumberFormatException nfe) {
				i++;
			}
		}
		return array;
	}

	public static void saveToFile(double[] array) {
		File file1 = new File("e:/newfilezad5.txt");
		BufferedWriter outputWriter = null;
		try {
			outputWriter = new BufferedWriter(new FileWriter(file1));
			for (int i = 0; i < array.length; i++) {
				outputWriter.write(array[i] + " ");
			}
			outputWriter.flush();
			outputWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
