package com.codegym.repository;

import com.codegym.model.Dictionary;

import java.util.List;

public interface DictionaryRepository {
    List<Dictionary> findAll();

}
