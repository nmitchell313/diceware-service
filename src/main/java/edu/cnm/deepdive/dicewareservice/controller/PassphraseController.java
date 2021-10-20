package edu.cnm.deepdive.dicewareservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import edu.cnm.deepdive.dicewareservice.service.PassphraseGenerator;


@Controller
@RequestMapping("/passphrases")
public class PassphraseController {

    private final PassphraseGenerator generator;

    @Autowired
    public PassphraseController(
            PassphraseGenerator generator) {
        this.generator = generator;
    }

    @ResponseBody
    @GetMapping(value = "/transient", produces = MediaType.APPLICATION_JSON_VALUE)
    public String[] generate(@RequestParam(defaultValue = "5") int length) {
        return generator.generate(length);
    }

    @GetMapping(value = "/transient", produces = MediaType.TEXT_HTML_VALUE)
    public String generate(@RequestParam(defaultValue = "5") int length, Model model) {
        model.addAttribute("words", generator.generate(length));
        return "passphrase";
    }

}
