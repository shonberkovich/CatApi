package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Data {
     private int length;
    private String fact;


    public int getLenght() {
        return length;
    }

    public String getFact() {
        return fact;
    }

    public void setLenght(int lenght) {
        this.length = lenght;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }

    @Override
    public String toString() {
        return "Data{" +
                "length=" + length +
                ", fact='" + fact + '\'' +
                '}';
    }
//    public CatFact(int lenght, String fact) {
//        this.lenght = lenght;
//        this.fact = fact;
//    }
}
