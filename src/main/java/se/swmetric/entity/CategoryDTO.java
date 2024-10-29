package se.swmetric.entity;

public class CategoryDTO {
    private String categoryId;
    private String categoryName;
    private String kind;

    // Constructors, getters, and setters
    public CategoryDTO() {}

    public CategoryDTO(String categoryId, String categoryName, String kind) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.kind = kind;
    }

    public String getCategoryId() { return categoryId; }
    public void setCategoryId(String categoryId) { this.categoryId = categoryId; }

    public String getCategoryName() { return categoryName; }
    public void setCategoryName(String categoryName) { this.categoryName = categoryName; }

    public String getKind() { return kind; }
    public void setKind(String kind) { this.kind = kind; }
}

