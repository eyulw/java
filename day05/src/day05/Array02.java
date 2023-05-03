package day05;

public class Array02 {
	public static void main(String[] args) {
		int nums[] = { 1, 3, 5, 7, 9, 10, 12, 19, 900, 40 };
		System.out.println(nums.length);
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		System.out.println(sum);
		System.out.println((double) sum / nums.length);

		// for-each
		int sum02 = 0;
		for (int j : nums) {
			sum02 += j;
		}
		System.out.println(sum02);

		// String 배열
//		String fruits1[]=new String[5];
//		fruits1[0]="포도";
		String fruits[] = { "딸기", "사과", "복숭아", "키위" };
		for (String f : fruits) {
			System.out.print(f + " ");
		}

		System.out.println();

		// 2차원 배열
		int intArray[][] = new int[2][3];
		intArray[0][0] = 1;
		intArray[0][1] = 2;
		intArray[0][2] = 3;

		intArray[1][0] = 100;
		intArray[1][1] = 200;
		intArray[1][2] = 300;

		System.out.println(intArray[0][2]);

		for (int[] item : intArray) {
			for (int i : item) {
				System.out.print(i + "\t");
			}
			System.out.println();
		}

		// 동물배열
		String animals[] = { "강아지", "고양이", "사자", "호랑이" };
		System.out.println(animals[1]);
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}

		System.out.println();

		for (String animal : animals) {
			System.out.print(animal + " ");
		}

		System.out.println();

		// 3의 배수 뽑기
		int nums02[] = { 23, 45, 67, 78, 56, 3, 9, 12, 85, 889889, 898, 909, 784387 };

		for (int i = 0; i < nums02.length; i++) {
			if (nums02[i] % 3 == 0) {
				System.out.print(nums02[i] + " ");
			}
		}

		System.out.println();

		for (int num : nums02) {
			if (num % 3 == 0) {
				System.out.print(num + " ");
			}
		}

	}
}
