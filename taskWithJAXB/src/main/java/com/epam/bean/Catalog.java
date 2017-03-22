package com.epam.bean;

import com.epam.bean.NewsItem;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement (name = "catalog")
public class Catalog {
    private ArrayList<NewsItem> newsItem;

    public ArrayList<NewsItem> getNewsItem() {
        return newsItem;
    }

    @XmlElement
    public void setNewsItem(ArrayList<NewsItem> newsItem) {
        this.newsItem = newsItem;
    }



}
