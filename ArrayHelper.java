import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayHelper {
	public static void fillWithRand(int[] myLocalArr, int randRange){
		Random myRand = new Random();
		for (int i = 0;i < myLocalArr.length;i++) {
			int randInt = myRand.nextInt(randRange);
			myLocalArr[i]=randInt;
		}
	}
	public static String getSecretWord() { 
		Random myRand = new Random();
		String  myLongString = "De fleste mennesker har prøvet at måle puls i " + 
			"forbindelse med lægebesøg og sport, men hvilken betydning har den egentlig for vores helbred?\n" +
"Kan du ændre din puls permanent, hvis den har tendenser til at ligge for højt " + 
			"eller for lavt og er det farligt ikke at have en normal puls?\n" +
"Det og meget mere kan du finde svar på i denne artikel.";
		String[] myArr = myLongString.split(" ");
		System.out.println(Arrays.toString(myArr));
		return myArr[myRand.nextInt(myArr.length-1)];
	}
	public static char getUserChar() { 
		Scanner myScan = new Scanner(System.in);
		System.out.println("indtast bogstav");
		String res = myScan.next();
		char myRetChar = res.toCharArray()[0];
		return myRetChar;
	}
}
