package kg.halyk.cardqueue.entity.user;

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
@Table(name = "customer")
public class Customer extends TimedEntity {

    @NonNull
    @Column(name = "first_name")
    private String latFirstName;

    @NonNull
    @Column(name = "name")
    private String latName;

    @NonNull
    @Column(name = "last_name")
    private String latLastName;
}
