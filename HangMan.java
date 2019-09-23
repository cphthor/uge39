package numberguess;
public class HangMan {
	public static void main(String[] args) {
		String secretWord = ArrayHelper.getSecretWord();
		System.out.println(secretWord);
		System.out.println(secretWord.length());
		int counter = 0;
		char[] myWord= new char[secretWord.length()];
		while (counter < 8) {
			char userChar = ArrayHelper.getUserChar();
			int idx =secretWord.indexOf(userChar); 
			if (idx >= 0) {
				System.out.println("is found at " + idx);
			} else {
				printFigure(counter);
				counter++;
			}
		}
	}
	public static void printFigure(int step) {
		String format = "";
		String myEmpty = " ";
		/*
		for(int i=0;i<6;i++){
			format = "|%4s%n";
			if (i==step){
				format = myformat;
			}
				System.out.printf(format, myEmpty);
		}
		*/
		if (step==1){
		format = "______%n";
		System.out.printf(format, myEmpty);
		format = "|%4s|%n";
		System.out.printf(format, myEmpty);
		for(int i=0;i<3;i++) {
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
		}
		} else if (step == 2) {
		format = "______%n";
		System.out.printf(format, myEmpty);
		format = "|%4s|%n";
		System.out.printf(format, myEmpty);
		format = "|%4sO%n";
		System.out.printf(format, myEmpty);
		for(int i=0;i<2;i++) {
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
		}
		} else if (step==3) {
		format = "______%n";
		System.out.printf(format, myEmpty);
		format = "|%4s|%n";
		System.out.printf(format, myEmpty);
		format = "|%4sO%n";
		System.out.printf(format, myEmpty);
		format = "|%4s|%n";
		System.out.printf(format, myEmpty);
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
		} else if (step==4) {
		format = "______%n";
		System.out.printf(format, myEmpty);
		format = "|%4s|%n";
		System.out.printf(format, myEmpty);
		format = "|%4sO%n";
		System.out.printf(format, myEmpty);
		format = "|%3s/|%n";
		System.out.printf(format, myEmpty);
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
		} else if (step==5) {
		format = "______%n";
		System.out.printf(format, myEmpty);
		format = "|%4s|%n";
		System.out.printf(format, myEmpty);
		format = "|%4sO%n";
		System.out.printf(format, myEmpty);
		format = "|%3s/|\\%n";
		System.out.printf(format, myEmpty);
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
		} else if (step==6) {
		format = "______%n";
		System.out.printf(format, myEmpty);
		format = "|%4s|%n";
		System.out.printf(format, myEmpty);
		format = "|%4sO%n";
		System.out.printf(format, myEmpty);
		format = "|%3s/|\\%n";
		System.out.printf(format, myEmpty);
		format = "|%3s/%n";
		System.out.printf(format, myEmpty);
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
		} else if (step==7) {
		format = "______%n";
		System.out.printf(format, myEmpty);
		format = "|%4s|%n";
		System.out.printf(format, myEmpty);
		format = "|%4sO%n";
		System.out.printf(format, myEmpty);
		format = "|%3s/|\\%n";
		System.out.printf(format, myEmpty);
		format = "|%3s/ \\%n";
		System.out.printf(format, myEmpty);
		format = "|%4s%n";
		System.out.printf(format, myEmpty);
	}
	}
}
