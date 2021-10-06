package kg.halyk.cardqueue.dto.card;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
public class CardCreateRequest {
    private String version;
    private String type;
    private String source;
}
