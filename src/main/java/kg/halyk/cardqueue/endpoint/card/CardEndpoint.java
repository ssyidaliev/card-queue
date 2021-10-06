package kg.halyk.cardqueue.endpoint.card;

import kg.halyk.cardqueue.dto.card.CardCreateRequest;
import kg.halyk.cardqueue.dto.card.CardResponse;

public interface CardEndpoint {
    CardResponse add(CardCreateRequest request);
}
