package day07;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Product p1 = new Product(); p1.name="콜라"; p1.price = 1000; p1.stock=10;
        Product p2 = new Product(); p2.name="사이다"; p2.price = 1500; p2.stock=10;
        Product p3 = new Product(); p3.name="환타"; p3.price = 2000; p3.stock=10;
        
        while(true) {
            System.out.println("1.콜라 2.사이다 3.환타 4.결제:");
            Scanner scan = new Scanner(System.in);
            int choose = scan.nextInt();
            
            if(choose == 1) {
                if(p1.stock>0) {
                    p1.stock--; p1.cart++;
                } else {
                    System.out.println("콜라 재고 부족");
                }
            } else if(choose == 2) {
                if(p2.stock>0) {
                    p2.stock--; p2.cart++;
                } else {
                    System.out.println("사이다재고 부족");
                }
            } else if(choose == 3) {
                if(p3.stock>0) {
                    p3.stock--; p3.cart++;
                } else {
                    System.out.println("환타재고부족 부족");
                }
            } else if(choose == 4) {
                int 총금액 = (p1.cart * p1.price)+(p2.cart * p2.price)+(p3.cart * p3.price);
                System.out.println("결제금액은 " + 총금액 + "원 입니다");
                System.out.printf("바구니 현황 : 콜라 %d개, 사이다 %d개, 환타 %d개\n총금액 : %d원\n",
                    p1.cart, p2.cart, p3.cart, 총금액);
                p1.cart=0; p2.cart = 0; p3.cart=0;
            }
        }
    }
} // class end