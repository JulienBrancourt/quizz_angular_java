package org.example.backquiz.dao;

import org.example.backquiz.entity.Party;
import org.springframework.data.repository.CrudRepository;

public interface PartyRepository extends CrudRepository<Party, Integer> {
}
