package Test;

import Crawlers.JunitCralwer;
import Utils.Crawler;
import org.jsoup.nodes.Document;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import javax.swing.text.html.HTMLDocument;

public class CrawlerTest {
    public static Crawler crawler;
    @BeforeClass
    public static void makeInstance(){
        crawler = Crawler.getInstance();
    }

    @Test
    public void CGVtest(){
        String httpdocument = crawler.crawl(new JunitCralwer(),"http://www.cgv.co.kr/theaters/?areacode=206%2C04%2C06&theaterCode=0121","&date=20180108");
        Assert.assertTrue(httpdocument.contains("CGV"));
    }



}