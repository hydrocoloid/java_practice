package com.kh.prime;

import java.util.Scanner;

public class PrimeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + "은(는) 소수입니다! ✨");
        } else {
            System.out.println(num + "은(는) 소수가 아닙니다.");
        }
        sc.close();
    }

    // 소수 판별 로직
    public static boolean isPrime(int n) {
        if (n <= 1) return false; // 1 이하는 소수가 아님

        // 2부터 n-1까지 나눠보기
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // 하나라도 나눠떨어지면 소수가 아님
            }
        }
        return true; // 끝까지 안 나눠떨어지면 소수
        
    }
}

