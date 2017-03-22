package com.epam.dao;

;
import com.epam.bean.Catalog;
import com.epam.bean.NewsItem;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;


public class WorkWithXml {
    public Catalog getCatalog() {
        Catalog catalog;
        try {
            File file = new File("Catalog.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            catalog=(Catalog) jaxbUnmarshaller.unmarshal(file);
            return catalog;
        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void printCatalog (){
        Catalog catalog = getCatalog();
        ArrayList<NewsItem> news = catalog.getNewsItem();
        for (NewsItem newsItem : news) {
            System.out.println(newsItem.getTitle());

        }
    }
}
