package com.balita.webscrap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Document doc = null;
        try {
            doc = Jsoup.connect("https://www.google.com/search?client=firefox-b-d&q=mur+ariary").get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.printf("Title %s" , doc.title());


    }
}
