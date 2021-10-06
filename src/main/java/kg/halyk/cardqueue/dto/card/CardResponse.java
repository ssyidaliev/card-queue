package kg.halyk.cardqueue.dto.card;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Builder
public class CardResponse {
    private String version;
    private String type;
    private UUID guid;
    private LocalDateTime dateTime;
    private String source;
}