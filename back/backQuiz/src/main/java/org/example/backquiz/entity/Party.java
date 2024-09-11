package org.example.backquiz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity
@Table(name="party" )
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Party {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "party_id")
    private int id;

    @ManyToMany
    Set<Question> questions;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
