package co.taejoon.prj;

import java.util.Arrays;
import java.util.Scanner;

public class LottoApp {
	Scanner scn = new Scanner(System.in);
	int lotto[] = new int[6];
	int pay = 0;

	public void lottoMain() {
		System.out.println("===로또 구매 기계입니다.===");
		System.out.println("지불할 금액을 입력해주세요.");
		System.out.println("===========================");

		int pay = scn.nextInt();
		int amount = pay / 1000;

		System.out.println(pay + " 원을 지불하셨습니다.");
		System.out.print("로또 " + amount + "장");
		if (pay % 1000 == 0) {
			System.out.println("을 드립니다.");
		} else {
			System.out.println("과 거스름돈 " + pay % 1000 + "원을 드립니다.");
		}
		for (int k = 0; k < amount; k++) {
			for (int i = 0; i < lotto.length; i++) {
				lotto[i] = (int) ((Math.random() * 45) + 1);
				for (int j = 0; j < i; j++) {
					if (lotto[j] == lotto[i]) {
						i = i--;
						break;
					}
				}
			}
			Arrays.sort(lotto);
			for (int i = 0; i < lotto.length; i++) {
				System.out.print(lotto[i] + " ");
			}
			System.out.println();
		}
	}

	public void run() {
		lottoMain();
	}
}
