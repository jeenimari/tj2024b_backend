package day08;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Waiting[] waitingList = new Waiting[100]; //배열 객체 생성
        int waitingCount = 0;    // 카운트 초기화
        Scanner scan = new Scanner(System.in);  // 입력받기
        
        while(true) {
            System.out.println("\n=== 대기번호 발행 프로그램 ===");   
            System.out.println("1.대기등록 2.대기확인 3.종료");
            System.out.print("선택: ");
            
            int choose = scan.nextInt();  //선택입력
            
            if(choose == 1) {               //1번누르면~
                if(waitingCount >= 100) {  // 100이하면~
                    System.out.println("대기 명단이 가득 찼습니다.");
                    continue;      
                }
                
                System.out.print("전화번호: ");  
                String phone = scan.next();
                System.out.print("인원수: ");
                int headcount = scan.nextInt();
                
                Waiting waiting = new Waiting();  //객체생성
                waiting.phone = phone;             // 클래스의 폰에 폰을 대입
                waiting.headCount = headcount;      // 클래스의 헤드카운트에 헤드카운트대입
                waiting.waitingNumber = waitingCount + 1; // 클래스의 대기넘버에  웨이팅 카운터 +1 증가시키기
                
                waitingList[waitingCount] = waiting;    // 웨이팅 리스트[대기번호] 에 대기대입
                waitingCount++;                            // 대기번호 증감
                
                System.out.println("대기번호 " + waiting.waitingNumber + "번이 발급");
                
            } else if(choose == 2) {
                if(waitingCount == 0) {
                    System.out.println("대기중인 사람없음 .");
                    continue;
                }
                
                System.out.println("\n=== 대기 명단 ===");
                for(int i = 0; i < waitingCount; i++) {   // i가 대기번호보다 작으면 증감
                    System.out.println(waitingList[i].headCount);   //
                }
                
            } else if(choose == 3) {
                System.out.println("프로그램 끔 ㅅㄱ.");
                break;
            } else {
                System.out.println("다시선택ㄱㄱ");
            }
        }//while end
        
        scan.close();
    }//main end
}//class end