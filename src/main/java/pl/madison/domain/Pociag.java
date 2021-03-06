package pl.madison.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Pociag {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private int dlugosc;
    private boolean lokomotywa;
}
