package dto;

import java.time.LocalDateTime;

public record CalculateOrdersTotalByDateRangeRequest(
    LocalDateTime startDate,
    LocalDateTime endDate
) {
}
