package kg.halyk.cardqueue.mapper;

import kg.halyk.cardqueue.dto.card.CardCreateRequest;
import kg.halyk.cardqueue.dto.card.CardResponse;
import org.springframework.stereotype.Component;

@Component
public class CardMapper {

    public CardResponse toCardResponse(CardCreateRequest request) {
        return CardResponse.builder()
                .version(request.getVersion())
                .type(request.getType())
                .source(request.getSource())
                .build();
    }
}
