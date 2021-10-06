package kg.halyk.cardqueue.repository.card;

import kg.halyk.cardqueue.entity.card.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Long> {
}
