package edu.cnm.deepdive.dicewareservice.service;

import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

@Service
public class ResourceBundleProvider implements WordListProvider {

    private final List<String> words;

    public ResourceBundleProvider(ResourceBundle bundle) {
        words = new LinkedList<>(bundle.keySet());
    } 


    @Override
    public List<String> getWords() {
        return words;
    }
}
