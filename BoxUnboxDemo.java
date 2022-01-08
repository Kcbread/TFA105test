package boxUnboxDemo;

import java.util.ArrayList;

public class BoxUnboxDemo {
	public static void main(String[] args) {
		// Java 5之前
		// Boxing
		Integer i1 = new Integer(1);
		// Unboxing / Boxing
		Integer i2 = new Integer(i1.intValue() + 1);
		System.out.println("i1: " + i1);
		System.out.println("i2: " + i2);
		
		// Autoboxing
		Integer i3 = 1;
		// Autounboxing / Autoboxing
		Integer i4 = i3 + 2;
		System.out.println("i3: " + i3);
		System.out.println("i4: " + i4);

		ArrayList<Integer> intNums = new ArrayList<>();
		// Autoboxing
		intNums.add(1);
		intNums.add(2);
		int sum = 0;
		// Autounboxing
		for (int intNum: intNums) {
			sum += intNum;
		}
		System.out.println("sum: " + sum);
		
		// 編譯失敗
		// Long l1 = 12;
		// 正確
		Long l2 = 12L;
		System.out.println("l2: " + l2);
	}
}
