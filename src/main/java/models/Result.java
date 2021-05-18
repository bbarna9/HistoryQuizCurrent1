package models;

import javax.persistence.*;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

/**
 * In this class we are creating a {@code Result} entity, that declares the columns our Database model is
 * going to have. The ID is a Generated Value, which means we don't have to keep count of it, it will grow automatically.
 */
public class Result{

        @Id
        @GeneratedValue(strategy= GenerationType.AUTO)
        private int id;

        @Column(nullable=false)
        private String Player1;

        @Column(nullable=false)
        private String Player2;

        @Column(nullable=false)
        private int Score1;

        @Column(nullable=false)
        private int Score2;

        @Column(nullable=false)
        private String Winner;
}