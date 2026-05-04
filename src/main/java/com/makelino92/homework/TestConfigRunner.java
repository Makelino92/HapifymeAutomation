package com.makelino92.homework;

public class TestConfigRunner {
    public static void main(String[] args) {


        BrowserConfig defaultConfig = BrowserConfig.createDefaultChromeConfig();
        System.out.println("--- Configuratie Default ---");
        defaultConfig.afiseazaConfig();


        BrowserConfig firefoxConfig = new BrowserConfig(BrowserType.FIREFOX, "121.0");
        System.out.println("--- Configuratie Firefox ---");
        firefoxConfig.afiseazaConfig();


        BrowserConfig edgeConfig = new BrowserConfig(BrowserType.EDGE, "119.0", true);
        System.out.println("--- Configuratie Edge ---");
        edgeConfig.afiseazaConfig();
    }
}