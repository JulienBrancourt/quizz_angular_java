package org.example.backquiz.service;

import org.example.backquiz.dao.PartyRepository;
import org.example.backquiz.entity.Party;
import org.springframework.stereotype.Service;

@Service
public class PartyService {
    private final PartyRepository partyRepository;

    public PartyService(PartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }

    public Party createParty(Party party) {
        return partyRepository.save(party);
    }

}
