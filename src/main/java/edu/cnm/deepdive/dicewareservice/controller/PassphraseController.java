package edu.cnm.deepdive.dicewareservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.cnm.deepdive.dicewareservice.service.PassphraseGenerator;

@RestController
@RequestMapping("/passphrases")
public class PassphraseController {

    private final PassphraseGenerator generator;

    @Autowired
    public PassphraseController(
            PassphraseGenerator generator) {
        this.generator = generator;
    }

    @GetMapping("/transient")
    public String[] generate(int length) {
        return generator.generate(length);
    }
}
