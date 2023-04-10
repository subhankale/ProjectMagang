package com.testing.magang.utils;

public enum TestScenarios {
    T1("Admin valid login WJC"),
    T2("Admin logout WJC"),
    T3("Admin masuk dengan password tidak terdaftar"),
    T4("Admin masuk dengan username tidak terdaftar"),
    T5("Admin simpan username menggunakan nomor handphone"),
    T6("Admin masuk dengan password menggunakan huruf kapital"),
    T7("Admin masuk dengan password menggunakan angka"),
    T8("Admin tanpa input username dan password");

    private final String testCaseName;

    TestScenarios(String value){
        testCaseName = value;
    }

    public String getTestCaseName(){
        return testCaseName;
    }
}
