package crolling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrollingPractice1 {
    public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver", 
    		    System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        try {
            String baseUrl = "https://movie.daum.net/ranking/boxoffice/weekly";
            driver.get(baseUrl);
            
            ArrayList<Movie> movie_data = new ArrayList<>();
            
            WebElement movie_container = driver.findElement(By.cssSelector(".list_movieranking"));
            List<WebElement> movie_links = movie_container.findElements(By.cssSelector(".tit_item>a"));
            
            for(int i = 0; i < movie_links.size(); i++) {
                String link = movie_links.get(i).getAttribute("href");
                driver.get(link);
                
                driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
                
                String title = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div[2]/div[1]/h3/span[1]")).getText();
                String start = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div[2]/div[2]/div[1]/dl[1]/dd")).getText();
                String star = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div[2]/div[2]/div[2]/dl[1]/dd")).getText();
                String learning_time = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[1]/div[2]/div[2]/div[1]/dl[5]/dd")).getText();
                String content = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[2]/div[2]/div[1]/div/div/div")).getText();
                
                Movie movie = new Movie(title, start, star, learning_time, content);
                System.out.println((i+1) + ". " + title + " (" + star + ")");
                
                movie_data.add(movie);
                driver.navigate().back();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 모든 작업이 끝난 후에 브라우저 종료
            driver.quit();
        }
    }
}