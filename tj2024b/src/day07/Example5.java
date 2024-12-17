package day07;

public class Example5 {
    public static void main(String[] args) {
        // 5개의 점수를 배열에 저장
        int[] scores = {85, 92, 78, 90, 88};   // 인트 [] 점수들 = {점수 , 점수 ,ㅡ점수 , 점수}
        
        // 총점을 저장할 변수
        int total = 0;                 // 인트 총점  = 0;
        
        // 배열을 순회하며 총점 계산
        for(int i = 0; i < scores.length; i++) {     //for(int i =0; i< 점수들.length; i++){ 총점 += 점수[i]}
            total += scores[i];
        }
        
        // 평균 계산
        double average = (double)total / scores.length;  // 더블 평균  = 더블치환 총점 나누기 점수의 길이
        
        // 결과 출력
        System.out.println("점수 목록:");                               // 출력 화면
        for(int i = 0; i < scores.length; i++) {                     // 인트 i를 0d으로 i가 점수길이보다 작으면 i는 증감
            System.out.println("점수 " + (i+1) + ": " + scores[i]);   // i +1) 실제 화면에 출력되는 점수를 1부터 보여주기 위해서 하는 것 
        }
        System.out.println("총점: " + total);
        System.out.println("평균: " + average);
    }
    
    
 
}