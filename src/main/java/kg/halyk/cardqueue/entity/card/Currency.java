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
@Table(name = "currency")
public class Currency extends TimedEntity {

    @NonNull
    @Column(name = "name")
    private String name;
}
