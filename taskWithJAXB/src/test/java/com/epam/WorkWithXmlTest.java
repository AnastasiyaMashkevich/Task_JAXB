package com.epam;

import com.epam.bean.Catalog;
import com.epam.bean.NewsItem;
import com.epam.dao.WorkWithXml;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by LENOVO on 21.03.2017.
 */
public class WorkWithXmlTest {

    @Test
    public void readFromXmlTest () {
        WorkWithXml workWithXml = new WorkWithXml();
        Catalog catalog = workWithXml.getCatalog();
        ArrayList<NewsItem> news = catalog.getNewsItem();
        Assert.assertEquals(news.get(0).getTitle(), "Meet_Joe_Black");
        Assert.assertEquals(news.get(0).getYear(), "1997");
        Assert.assertEquals(news.get(0).getAdditionalInfo(), "1 mln USD profit");
        Assert.assertEquals(news.get(0).getCategory(), "movie");
    }
}
