package dto;

import models.ProductCategory;

public record CategoryCountInOrderDto (
    ProductCategory category,
    int count
) {
    
}
