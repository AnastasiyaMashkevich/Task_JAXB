package com.epam.runner;

import com.epam.dao.WorkWithXml;


public class Runner {
    public static void main (String [] args) {
        WorkWithXml workWithXml = new WorkWithXml();
        workWithXml.printCatalog();
    }
}
