package models;

public enum ProductCategory {
    // Definindo as constantes com seus "Friendly Names"
    ELECTRONICS("Electronics"),
    HOME_APPLIANCES("Home Appliances"),
    SMARTPHONES("Smartphones & Tablets"),
    CLOTHING("Clothing & Apparel"),
    SPORTS_EQUIPMENT("Sports & Outdoors");

    private final String displayName;

    // Construtor do Enum
    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    // Getter para recuperar o nome amigável
    public String getDisplayName() {
        return displayName;
    }
}


// Java Enums no Baeldung.
/*

public enum ProductCategory {
    // Tecnologia e Eletrônicos
    ELECTRONICS,
    COMPUTERS,
    SMARTPHONES,
    ACCESSORIES,
    
    // Moda
    CLOTHING,
    FOOTWEAR,
    JEWELRY,
    
    // Casa e Vida
    HOME_APPLIANCES,
    FURNITURE,
    GARDEN,
    
    // Saúde e Beleza
    BEAUTY_CARE,
    HEALTH_SUPPLEMENTS,
    
    // Lazer
    SPORTS_EQUIPMENT,
    TOYS_GAMES,
    BOOKS,
    
    // Outros
    AUTOMOTIVE,
    GROCERIES,
    PET_SUPPLIES
}
    */