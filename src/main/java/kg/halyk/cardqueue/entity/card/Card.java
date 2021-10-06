package kg.halyk.cardqueue.entity.card;

import kg.halyk.cardqueue.entity.base.TimedEntity;
import kg.halyk.cardqueue.entity.user.Customer;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "card")
public class Card extends TimedEntity {

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @NonNull
    @Column(name = "account_number")
    private String accountNumber;
}
