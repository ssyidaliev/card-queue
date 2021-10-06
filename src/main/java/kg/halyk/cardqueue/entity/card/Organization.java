package kg.halyk.cardqueue.entity.card;

import kg.halyk.cardqueue.entity.base.TimedEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "organization")
public class Organization extends TimedEntity {

    @NonNull
    @Column(name = "name")
    private String name;
}