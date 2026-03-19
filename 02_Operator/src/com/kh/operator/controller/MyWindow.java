package com.kh.operator.controller;

import javax.swing.*;

public class MyWindow {
    public static void main(String[] args) {
        // 1. 창(JFrame) 생성
        JFrame frame = new JFrame("짝수 판별기");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // 2. 입력창 및 버튼 배치
        JTextField textField = new JTextField();
        textField.setBounds(50, 30, 200, 30);
        frame.add(textField);

        JButton button = new JButton("판별하기");
        button.setBounds(85, 70, 120, 30);
        frame.add(button);

        // 3. 버튼 클릭 이벤트 (논리 연산 로직)
        button.addActionListener(e -> {
            try {
                int num = Integer.parseInt(textField.getText());
                boolean result = (num > 0) && (num % 2 == 0);
                JOptionPane.showMessageDialog(frame, "결과: " + result);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame, "숫자만 입력하세요!");
            }
        });

        // 4. 화면 중앙 정렬 (핵심!)
        frame.setLocationRelativeTo(null); 
        
        frame.setVisible(true);
    }
}