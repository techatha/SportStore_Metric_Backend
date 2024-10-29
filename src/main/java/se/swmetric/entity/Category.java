package se.swmetric.entity;

// Category.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "category")
public class Category {
    @Id
    private String categoryId;
    private String categoryName;
    private String kind;

    // Constructors, Getters, and Setters
    public Category() {}

    public Category(String categoryId, String categoryName, String kind) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.kind = kind;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
