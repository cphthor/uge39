import java.util.Random;

public class ArrayHelper {
  /*
   * FORMÅL:
   * lave en hjælperklasse og øve arrays
   *
   * OPGAVE:
   * lav en metode - fillWithRand med flg signatur som fylder et array med
   * tilfældig tal indenfor den medfølgende range.
   * :
	public static void fillWithRand(int[] myLocalArr, int randRange){

   */
	public static void fillWithRand(int[] myLocalArr, int randRange){
		Random myRand = new Random();
		for (int i = 0;i < myLocalArr.length;i++) {
			int randInt = myRand.nextInt(randRange);
			myLocalArr[i]=randInt;
		}
	}
}
