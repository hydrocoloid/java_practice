package com.kh.birthdayProblem;

import java.util.Scanner;

public class BirthdayProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*문장 뜯어 보기
         * Scanner: 참조 자료형. (상자의 종류, 어떤 기계를 담을지 결정)
         * scanner: 변수 이름. (우리가 부를 이름표)
         * =: 대입 연산자.
         * new: 객체 생성 예약어. (새로운 기계를 조립하겠다는 신호)
         * Scanner (오른쪽): 생성자 이름. (어떤 기계를 조립할지 알려주는 설계도 이름)
         * (System.in): 매개변수 리스트와 인자. (조립할 때 넣는 필수 부품)
         */

        System.out.println("=== 생일 문제(Birthday Problem) 확률 계산기 ===");
        System.out.println("(종료하시려면 'exit'를 입력하세요)");
        
        // 유효성 검사를 위한 무한 루프
        while (true) {
            System.out.print("\n인원 수(n)를 입력하세요 (2명 이상의 정수): ");
            String input = scanner.nextLine();
            
         // 종료 조건 체크
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            
            try {
                // 실수 입력 방지 (점이 포함되어 있으면 예외 처리)
                if (input.contains(".")) {
                	System.out.println("오류: 실수는 입력할 수 없습니다. 정수를 입력해주세요.");
                    continue; // while문 시작점으로 돌아감
                }
                
                int n = Integer.parseInt(input);
                /*문장 뜯어 보기
                 * int: 자료형 (Primitive Type). '정수'라는 기본 데이터의 종류를 말합니다.
                 * n: 변수. 이름값을 담을 상자의 이름입니다.
                 * =: 대입 연산자. 오른쪽의 결과물을 왼쪽 상자에 넣으라는 기호입니다.
                 * Integer: 클래스 이름 (Class). '정수'와 관련된 도구들을 모아놓은 상위 집합입니다.
                 * .: 참조 연산자. "~안에 있는"이라는 뜻으로 클래스 내부의 도구에 접근할 때 씁니다.
                 * parseInt: 메서드 이름. 실제 일을 하는 기능입니다. (매개변수가 아니라 기술 그 자체!)
                 * input: 인자(Argument). 기술(parseInt)을 쓸 때 던져주는 '실제 재료'입니다.
                 * (): 매개변수 리스트. 인자가 들어가는 통로(괄호) 전체를 아우르는 형태입니다.
                 */
                
                // 유효 범위 체크
                if (n < 2) {
                    System.out.println("최소 2명 이상이어야 생일이 겹칠 수 있습니다.");
                } else if (n > 365) {
                    System.out.println("366명 이상이면 비둘기집 원리에 따라 확률은 100%입니다.");
                    continue;
                } 
                
             // 확률 계산 및 출력
                double probability = calculateBirthdayProbability(n);
                System.out.printf("결과: %d명이 있을 때 생일이 겹칠 확률은 약 %.2f%%입니다.\n", n, probability * 100);

            } catch (NumberFormatException e) {
                System.out.println("오류: 정수 숫자만 입력해주세요. (문자열/실수 불가)");
            }
        }
        scanner.close();
    }

     // 생일이 일치할 확률을 계산하는 메서드
    public static double calculateBirthdayProbability(int n) {
        double pDifferent = 1.0;
        
        for (int i = 1; i < n; i++) {
            // 모든 사람의 생일이 다를 확률을 누적으로 곱함
            pDifferent *= (365.0 - i) / 365.0;
        }
        
        // 1 - (모두 다를 확률) = (적어도 한 쌍이 같을 확률)
        return 1.0 - pDifferent;
    }
}