package org.example.backquiz.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@Entity
@Table(name="question" )
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id")
    private int id;

    private String statement;

    @ElementCollection
    private List<Integer> expectedAnswer;

    @ElementCollection
    private List<String> listAnswer;

    @ElementCollection
    private List<String> userAnswer;

    @ManyToMany
    @JoinTable(
            name = "question_party",
            joinColumns = @JoinColumn(name = "party_id"),
            inverseJoinColumns = @JoinColumn(name = "question_id")
    )
    Set<Party> parties;
}
