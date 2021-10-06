package kg.halyk.cardqueue.endpoint.card.impl;

import kg.halyk.cardqueue.dto.card.CardCreateRequest;
import kg.halyk.cardqueue.dto.card.CardResponse;
import kg.halyk.cardqueue.endpoint.card.CardEndpoint;
import kg.halyk.cardqueue.mapper.CardMapper;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CardEndpointImpl implements CardEndpoint {

    private final CardMapper cardMapper;
//    private final CardService cardService;

    public CardEndpointImpl(CardMapper cardMapper) {
        this.cardMapper = cardMapper;
    }

    @Override
    @Transactional
    public CardResponse add(@NonNull CardCreateRequest request) {
        return cardMapper.toCardResponse(request);
    }
}
