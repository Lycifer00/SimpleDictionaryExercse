package com.codegym.repository;

import com.codegym.model.Dictionary;

import java.util.ArrayList;
import java.util.List;

public class DictionaryRepositoryImpl implements DictionaryRepository {
    @Override
    public List<Dictionary> findAll() {
        List<Dictionary> words = new ArrayList<>();

        Dictionary dictionary = new Dictionary("hello", "Xin chào");
        words.add(dictionary);
        Dictionary dictionary1 = new Dictionary("how", "Thế nào");
        words.add(dictionary1);
        Dictionary dictionary2 = new Dictionary("book", "Quyển sách");
        words.add(dictionary2);
        Dictionary dictionary3 = new Dictionary("computer", "Máy tính");
        words.add(dictionary3);

        return words;
    }

}
