package kg.halyk.cardqueue.controller.card;

import kg.halyk.cardqueue.dto.card.CardCreateRequest;
import kg.halyk.cardqueue.dto.card.CardResponse;
import kg.halyk.cardqueue.endpoint.card.CardEndpoint;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/card")
public class CardController {

    private final CardEndpoint cardEndpoint;

    public CardController(CardEndpoint cardEndpoint) {
        this.cardEndpoint = cardEndpoint;
    }

    @PostMapping
    public ResponseEntity<CardResponse> create(@RequestBody CardCreateRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(cardEndpoint.add(request));
    }
}
