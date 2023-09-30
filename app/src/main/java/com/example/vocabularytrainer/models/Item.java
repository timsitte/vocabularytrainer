package com.example.vocabularytrainer.models;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "items")
public class Item {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "item_id")
    private long item_id;
    private String language_1;

    private String language_2;

    public Item(String language_1, String language_2){
        this.language_1 = language_1;
        this.language_2 = language_2;

    }

    public String getLanguage_1() {
        return language_1;
    }

    public void setLanguage_1(String language_1) {
        this.language_1 = language_1;
    }

    public String getLanguage_2() {
        return language_2;
    }

    public void setLanguage_2(String language_2) {
        this.language_2 = language_2;
    }
}
