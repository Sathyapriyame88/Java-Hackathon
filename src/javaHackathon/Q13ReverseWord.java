package javaHackathon;

public class Q13ReverseWord {

	public static void main(String[] args) {
		String sWord = "java code";
		String sRev = "";
		StringBuilder sb = new StringBuilder(sWord);
		sRev = sRev + sb.reverse();
		System.out.println(sRev);

	}

}
