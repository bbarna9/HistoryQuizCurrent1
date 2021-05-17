package models;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

/**
 * In this class we are creating a {@code Result} entity, that declares the columns our {@link models.Database} is
 * going to have. The ID is a Generated Value, which means we don't have to keep count of it, it will grow automatically.
 */
public class Result{

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private int id;

        @Column(nullable=false)
        private String player1;

        @Column(nullable=false)
        private String player2;

        @Column(nullable=false)
        private int score1;

        @Column(nullable=false)
        private int score2;

        @Column(nullable=false)
        private String winner;
}