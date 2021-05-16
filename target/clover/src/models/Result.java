/* $$ This file has been instrumented by Clover 4.4.1#2019101123313948 $$ */package models;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Result{

        /*public Result (int match, String player1, String player2, int score1, int score2, String winner, long version) {
                this.match = match;
                this.player1 = player1;
                this.player2 = player2;
                this.score1 = score1;
                this.score2 = score2;
                this.winner = winner;
                this.version = version;
        }*/

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