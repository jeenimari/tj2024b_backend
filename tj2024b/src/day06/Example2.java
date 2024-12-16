package day06;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        
        int 콜라재고 = 10;
        int 사이다재고 = 10;
        int 환타재고 = 10;
        
        
        int 콜라 = 1000;
        int 사이다 = 1500;
        int 환타 = 2000;
        
       
        int 콜라구매개수 = 0;
        int 사이다구매개수 = 0;
        int 환타구매개수 = 0;

        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("1.콜라 || 2.사이다 || 3.환타 || 4.결제");
            int chose = scan.nextInt();
            
            switch (chose) {
                case 1: {
                    if (콜라재고 > 0) {
                        콜라구매개수++;  // Increment purchases
                        콜라재고--;     // Decrement inventory
                        System.out.println("콜라 한병추가했습니다.");
                    } else {
                        System.out.println("재고부족");
                    }
                    break;
                }
                
                case 2: {
                    if (사이다재고 > 0) {
                        사이다구매개수++;  
                        사이다재고--;     
                        System.out.println("사이다 한병추가했습니다.");
                    } else {
                        System.out.println("재고부족");
                    }
                    break;
                }
                
                case 3: {
                    if (환타재고 > 0) {
                        환타구매개수++;  
                        환타재고--;    
                        System.out.println("환타 한병추가했습니다.");
                    } else {
                        System.out.println("재고부족");
                    }
                    break;
                }
                
                case 4: {
                    int cokeSum = 콜라구매개수 * 콜라;
                    int stripeSum = 사이다구매개수 * 사이다;
                    int fantaSum = 환타구매개수 * 환타;
                    
                    System.out.println("장바구니 현황:");
                    System.out.println("콜라: " + 콜라구매개수 + "개");
                    System.out.println("사이다: " + 사이다구매개수 + "개");
                    System.out.println("환타: " + 환타구매개수 + "개");
                    System.out.println("결제금액은 " + (cokeSum + stripeSum + fantaSum) + "원 입니다");
                    return; 
                }
            }
        }
    }
}