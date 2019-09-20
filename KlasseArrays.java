import java.util.Arrays;
import java.util.Random;

public class KlasseArrays {
	public static void main(String[] args) {
		int searchItem = 12;
		int size = 100;
		int randRange = 100;
		int[] myArr = new int[size];
		System.out.println(Arrays.toString(myArr));
		doMod(myArr,randRange);
		System.out.println(Arrays.toString(myArr));
		int isInArr=searchInArr(myArr,searchItem);
		if (isInArr > 0) {
			System.out.println(searchItem + " is in array " + isInArr);
		} else {
			System.out.println(searchItem + " is not in array");
		}

		int[] myArr1 = new int[size];
		int[] myArr2 = new int[size];
		doMod(myArr1,randRange);
		doMod(myArr2,randRange);
		boolean isEqual = isEqualArrays(myArr1, myArr2);
		
	}
	public static int searchInArr(int[] myArr, int searchVal){
		//boolean retValBool=false;
		int retValCount=0;
		
		// lav en tæller
		for (int i = 0; i<myArr.length;i++){
			if(myArr[i] == searchVal) {
				// tæl én op hver gang
				///retValBool = true;
				retValCount++;
			}
		}
		// returner tæller
		//return retValBool;
		return retValCount;
	}

	public static boolean isEqualArrays(int[] myArr1, int[] myArr2){
		boolean retValBool = true;
		if (myArr1.length != myArr2.length)  {
			retValBool=false;
                        return retValBool;
		}
		for (int i = 0;i<myArr1.length;i++) {
			if (myArr1[i] != myArr2[i]) {
				retValBool = false;
				return retValBool;
			}

		}
		return retValBool;
	}
	
	public static void doMod(int[] myLocalArr, int randRange){
		Random myRand = new Random();
		for (int i = 0;i < myLocalArr.length;i++) {
			int randInt = myRand.nextInt(randRange)+1;
			myLocalArr[i]=randInt;
		}
	}
	public static void doMod2(int[] myLocalArr, int val){
		myLocalArr[10]=123;
		val = 21;
		System.out.println(val);
		
	}
	
}
