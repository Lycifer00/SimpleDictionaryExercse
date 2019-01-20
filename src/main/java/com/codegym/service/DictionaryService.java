package com.codegym.service;

import com.codegym.repository.DictionaryRepository;

public interface DictionaryService {
    void setDictionaryRepository(DictionaryRepository dictionaryRepository);

    String findWord(String wordWhatNeedToFindViMeaning);
}
