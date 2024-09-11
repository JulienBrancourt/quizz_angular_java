package org.example.backquiz.controller;


import org.example.backquiz.entity.Party;
import org.example.backquiz.entity.Question;
import org.example.backquiz.service.PartyService;
import org.example.backquiz.service.QuestionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/party")
public class PartyController {

    private final PartyService partyService;

    public PartyController(PartyService partyService) {
        this.partyService = partyService;
    }

    @PostMapping("/registerparty")
    public ResponseEntity<Party> registerParty(@RequestBody Party party) {
        System.out.println("registerParty");
        Party newParty = partyService.createParty(party);
        return ResponseEntity.ok(newParty);
    }
}
