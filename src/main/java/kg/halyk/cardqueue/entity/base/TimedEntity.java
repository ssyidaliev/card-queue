package kg.halyk.cardqueue.entity.base;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter

@MappedSuperclass
public abstract class TimedEntity extends BaseEntity {

    @Column(name = "date_time")
    private LocalDateTime dateTime;
}
