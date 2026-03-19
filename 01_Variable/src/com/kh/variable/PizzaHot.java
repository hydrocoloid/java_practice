package com.kh.variable;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class PizzaHot extends JFrame {
    
    private CardLayout cardLayout = new CardLayout();
    private JPanel mainPanel = new JPanel(cardLayout);

    public void Test() {
        setTitle("피자핫 주문 시스템");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 700); // 이미지 때문에 높이를 조금 더 키웠습니다.
        setLocationRelativeTo(null);

        // --- 1. 메인 화면 (홈) ---
        JPanel homePanel = new JPanel(new GridLayout(3, 1));
        homePanel.add(new JLabel("피자핫에 오신 것을 환영합니다~!", JLabel.CENTER));
        JButton btnGoMenu = new JButton("메뉴판 보기");
        homePanel.add(btnGoMenu);
        
        // --- 2. 메뉴판 & 수량 입력 화면 ---
        JPanel menuPanel = new JPanel(new BorderLayout(10, 10)); // 구조를 위해 BorderLayout 사용
        JLabel menuTitle = new JLabel("--- 핏자핫 메뉴판 ---", JLabel.CENTER);
        menuTitle.setFont(new Font("맑은 고딕", Font.BOLD, 20));
        menuPanel.add(menuTitle, BorderLayout.NORTH);

        // 중앙 메뉴 영역 (그리드 레이아웃)
        JPanel centerPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        
        // 피자 데이터 및 이미지 불러오기 (무료 이미지 URL 예시)
        String p1Name = "이재모 핏자"; int p1Price = 25000;
        String p2Name = "안재모 핏자"; int p2Price = 4800;

        // 이미지 아이콘 생성 (실제 파일 대신 샘플 URL 사용)
        ImageIcon p1Icon = getResizedIcon("https://cdn-icons-png.flaticon.com/512/3595/3595455.png");
        ImageIcon p2Icon = getResizedIcon("https://cdn-icons-png.flaticon.com/512/3132/3132693.png");

        // 메뉴 1 레이블 (텍스트+이미지)
        JLabel p1Label = new JLabel(p1Name + " (" + p1Price + "원)", p1Icon, JLabel.CENTER);
        p1Label.setVerticalTextPosition(JLabel.BOTTOM);
        p1Label.setHorizontalTextPosition(JLabel.CENTER);
        
        // 메뉴 2 레이블
        JLabel p2Label = new JLabel(p2Name + " (" + p2Price + "원)", p2Icon, JLabel.CENTER);
        p2Label.setVerticalTextPosition(JLabel.BOTTOM);
        p2Label.setHorizontalTextPosition(JLabel.CENTER);

        JTextField p1Count = new JTextField("0");
        JTextField p2Count = new JTextField("0");
        p1Count.setVisible(false);
        p2Count.setVisible(false);

        centerPanel.add(p1Label);
        centerPanel.add(p1Count);
        centerPanel.add(p2Label);
        centerPanel.add(p2Count);
        menuPanel.add(centerPanel, BorderLayout.CENTER);

        // 하단 버튼 영역
        // 1. 버튼을 담을 전용 판(Panel)을 만듭니다. (기본이 FlowLayout이며 가운데 정렬입니다.)
        JPanel bottomButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); 
        JButton btnBasket = new JButton("바구니 담기");
        JButton btnOrder = new JButton("주문하기");
        btnOrder.setVisible(false);
        // 2. 판에 버튼들을 추가합니다.
        bottomButtonPanel.add(btnBasket);
        bottomButtonPanel.add(btnOrder);
        // 3. 이제 이 '판'을 메뉴 패널의 하단(SOUTH)에 딱 붙입니다.
        menuPanel.add(bottomButtonPanel, BorderLayout.SOUTH);

        // --- 3. 주소 입력 화면 --- (이전과 동일)
        JPanel addressPanel = new JPanel(new GridLayout(3, 1));
        addressPanel.add(new JLabel("배달 받을 주소를 입력해주세요", JLabel.CENTER));
        JTextField addrField = new JTextField();
        JButton btnFinish = new JButton("맛있는 피자 배달 받기");
        addressPanel.add(addrField);
        addressPanel.add(btnFinish);

        mainPanel.add(homePanel, "home");
        mainPanel.add(menuPanel, "menu");
        mainPanel.add(addressPanel, "address");

        // --- 이벤트 로직 ---

        btnGoMenu.addActionListener(e -> cardLayout.show(mainPanel, "menu"));

        // 바구니 담기 클릭 시
        btnBasket.addActionListener(e -> {
            menuTitle.setText("--- 주문서 작성 ---"); // 타이틀 변환!
            menuTitle.setForeground(Color.BLUE);
            p1Count.setVisible(true);
            p2Count.setVisible(true);
            btnOrder.setVisible(true);
            btnBasket.setVisible(false);
            revalidate();
        });

        btnOrder.addActionListener(e -> {
            try {
                int c1 = Integer.parseInt(p1Count.getText());
                int c2 = Integer.parseInt(p2Count.getText());
                int total = (c1 * p1Price) + (c2 * p2Price);
                
                if(c1 == 0 && c2 == 0) {
                    JOptionPane.showMessageDialog(null, "한 판 이상 선택해주세요!");
                    return;
                }

                int result = JOptionPane.showConfirmDialog(null, "총합 " + total + "원입니다. 주문할까요?", "확인", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) cardLayout.show(mainPanel, "address");
            } catch (Exception ex) { JOptionPane.showMessageDialog(null, "숫자만 입력하세요!"); }
        });

        btnFinish.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "곧 도착합니다!");
            // 초기화
            menuTitle.setText("--- 핏자핫 메뉴판 ---");
            menuTitle.setForeground(Color.BLACK);
            p1Count.setVisible(false); p2Count.setVisible(false);
            btnOrder.setVisible(false); btnBasket.setVisible(true);
            cardLayout.show(mainPanel, "home");
        });

        add(mainPanel);
        setVisible(true);
    }

    // 이미지 크기를 조절해서 가져오는 도우미 메소드
    private ImageIcon getResizedIcon(String urlStr) {
        try {
            // [수정된 부분] URI를 거쳐서 URL로 변환하는 최신 방식입니다.
            java.net.URL url = java.net.URI.create(urlStr).toURL();
            
            ImageIcon icon = new ImageIcon(url);
            // 이미지 크기 조절 (가로 100, 세로 100)
            Image img = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            return new ImageIcon(img);
        } catch (Exception e) {
            System.out.println("이미지 로드 실패: " + e.getMessage());
            return null;
        }
    }
}