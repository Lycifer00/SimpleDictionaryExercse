package com.codegym.service;

import com.codegym.model.Dictionary;
import com.codegym.repository.DictionaryRepository;

public class DictionaryServiceImpl implements DictionaryService {
    private DictionaryRepository dictionaryRepository;

    @Override
    public void setDictionaryRepository(DictionaryRepository dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }

    @Override
    public String findWord(String wordWhatNeedToFindViMeaning) {
        for (Dictionary d : dictionaryRepository.findAll()) {
            if (wordWhatNeedToFindViMeaning.equals(d.getEng())) return d.getVi();
        }
        return null;
    }
}
