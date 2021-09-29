package co.taejoon.prj;

import java.util.Arrays;
import java.util.Scanner;

public class LottoApp {
	Scanner scn = new Scanner(System.in);
	int lotto[] = new int[6];
	int pay = 0;

	public void lottoMain() {
		System.out.println("===�ζ� ���� ����Դϴ�.===");
		System.out.println("������ �ݾ��� �Է����ּ���.");
		System.out.println("===========================");

		int pay = scn.nextInt();
		int amount = pay / 1000;

		System.out.println(pay + " ���� �����ϼ̽��ϴ�.");
		System.out.print("�ζ� " + amount + "��");
		if (pay % 1000 == 0) {
			System.out.println("�� �帳�ϴ�.");
		} else {
			System.out.println("�� �Ž����� " + pay % 1000 + "���� �帳�ϴ�.");
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
