package com.example.roomdatabaseproject;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import org.jetbrains.annotations.NotNull;

@Entity(tableName = "word_table")
public class Word {
    @PrimaryKey
    @NotNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NotNull String mWord) {
        this.mWord = mWord;
    }

    public String getWord() {
        return this.mWord;
    }
}
