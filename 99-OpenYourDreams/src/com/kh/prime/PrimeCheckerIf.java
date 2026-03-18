package com.kh.prime;

import java.util.Scanner;

public class PrimeCheckerIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;

        while (true) {
            System.out.print("숫자(정수)를 입력하세요: ");

            // 입력값이 정수인지 확인
            if (sc.hasNextInt()) {
                num = sc.nextInt();
                break; // 정수면 루프 탈출
            } else {
                // 정수가 아니면 에러 메시지 출력 후 잘못된 입력 비우기
                System.out.println("⚠️ 잘못된 입력입니다. '정수'를 입력하세요!");
                sc.next(); // 중요: 버퍼에 남아있는 잘못된 입력을 비워줘야 합니다.
            }
        }

        if (isPrime(num)) {
            System.out.println(num + "은(는) 소수입니다! ✨");
        } else {
            System.out.println(num + "은(는) 소수가 아닙니다.");
        }
        sc.close();
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        // 성능 향상을 위해 제곱근까지만 검사하도록 살짝 수정했어요!
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}