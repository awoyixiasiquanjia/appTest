package com.example.mydaggerapplication.dagger;

public enum seasons {
      SPRING("春天","春暖花开"),
      SUMMER("夏天","夏日炎炎"),
      AUTUMN("秋天","秋高气爽"),
      WINTER("冬天","白雪皑皑");

    private final   String seasonName;
    private final String seasonDesc;
    private seasons(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }


}
