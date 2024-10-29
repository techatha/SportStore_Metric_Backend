package se.swmetric.config;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se.swmetric.Repository.CategoryRepository;
import se.swmetric.Repository.ColorRepository;
import se.swmetric.Repository.ProductRepository;
import se.swmetric.entity.Category;
import se.swmetric.entity.Color;
import se.swmetric.entity.Product;

@Component
@RequiredArgsConstructor
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    final ProductRepository productRepository;
    final CategoryRepository categoryRepository;
    final ColorRepository colorRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        productRepository.deleteAll();
        categoryRepository.deleteAll();
        colorRepository.deleteAll();

        // Colors
        Color red = colorRepository.save(Color.builder().name("Red").build());
        Color blue = colorRepository.save(Color.builder().name("Blue").build());
        Color black = colorRepository.save(Color.builder().name("Black").build());

        // Categories
        Category menShirt = categoryRepository.save(Category.builder().categoryName("Men").kind("Shirt").build());
        Category menShorts = categoryRepository.save(Category.builder().categoryName("Men").kind("Shorts").build());
        Category menShoes = categoryRepository.save(Category.builder().categoryName("Men").kind("Shoes").build());
        Category womenShirt = categoryRepository.save(Category.builder().categoryName("Women").kind("Shirt").build());
        Category womenShorts = categoryRepository.save(Category.builder().categoryName("Women").kind("Shorts").build());
        Category womenShoes = categoryRepository.save(Category.builder().categoryName("Women").kind("Shoes").build());
        Category kidClothing = categoryRepository.save(Category.builder().categoryName("Kids").kind("Clothing").build());
        Category kidShoes = categoryRepository.save(Category.builder().categoryName("Kids").kind("Shoes").build());
        Category kidAccess = categoryRepository.save(Category.builder().categoryName("Kids").kind("Accessory").build());

        // Products
        Product p;
        // Women
        p = Product.builder()
                .name("Women's Air Zoom Pegasus")
                .description("Women's Air Zoom Pegasus")
                .discount(0)
                .price(120)
                .quantity(20)
                .image("/img/women/shoes/s1_bl.png")
                .build();
        p.setCategory(womenShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Ultraboost")
                .description("Women's Ultraboost")
                .discount(0)
                .price(180)
                .quantity(30)
                .image("/img/women/shoes/s2_bl.png")
                .build();
        p.setCategory(womenShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's HOVR Sonic 4")
                .description("Women's HOVR Sonic 4")
                .discount(0)
                .price(100)
                .quantity(12)
                .image("/img/women/shoes/s3_r.png")
                .build();
        p.setCategory(womenShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Nano X")
                .description("Women's Nano X")
                .discount(12)
                .price(130)
                .quantity(34)
                .image("/img/women/shoes/s6.png")
                .build();
        p.setCategory(womenShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Ignite Dual")
                .description("Women's Ignite Dual")
                .discount(20)
                .price(90)
                .quantity(32)
                .image("/img/women/shoes/s7.png")
                .build();
        p.setCategory(womenShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Fresh Foam 1080v11")
                .description("Women's Fresh Foam 1080v11")
                .discount(0)
                .price(150)
                .quantity(54)
                .image("/img/women/shorts/sh1_bl.png")
                .build();
        p.setCategory(womenShorts);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Gel-Nimbus 23")
                .description("Women's Gel-Nimbus 23")
                .discount(0)
                .price(150)
                .quantity(24)
                .image("/img/women/shorts/sh2_bl.png")
                .build();
        p.setCategory(womenShorts);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Ghost 14")
                .description("Women's Ghost 14")
                .discount(0)
                .price(130)
                .quantity(34)
                .image("/img/women/shirts/sh1_b.png")
                .build();
        p.setCategory(womenShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Facet 45 OutDry")
                .description("Women's Facet 45 OutDry")
                .discount(0)
                .price(140)
                .quantity(75)
                .image("/img/women/shirts/sh2_b.png")
                .build();
        p.setCategory(womenShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Speedcross 5")
                .description("Women's Speedcross 5")
                .discount(10)
                .price(130)
                .quantity(45)
                .image("/img/women/shirts/sh3_bl.png")
                .build();
        p.setCategory(womenShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Ultra 111 Waterproof")
                .description("Women's Ultra 111 Waterproof")
                .discount(0)
                .price(120)
                .quantity(65)
                .image("/img/women/shirts/sh4_b.png")
                .build();
        p.setCategory(womenShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Tiger Women's Gel-Lyte III")
                .description("Tiger Women's Gel-Lyte III")
                .discount(0)
                .price(110)
                .quantity(45)
                .image("/img/women/shirts/sh5_bl.png")
                .build();
        p.setCategory(womenShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Ultra 2")
                .description("Women's Ultra 2")
                .discount(0)
                .price(120)
                .quantity(65)
                .image("/img/women/shorts/sh3_r.png")
                .build();
        p.setCategory(womenShorts);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Nano X")
                .description("Nano X")
                .discount(0)
                .price(110)
                .quantity(45)
                .image("/img/women/shorts/sh4_bl.png")
                .build();
        p.setCategory(womenShorts);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Zero No Show")
                .description("Women's Zero No Show")
                .discount(0)
                .price(120)
                .quantity(65)
                .image("/img/women/shorts/sh5_b.png")
                .build();
        p.setCategory(womenShorts);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Women's Facet 45 OutDry")
                .description("Women's Facet 45 OutDry")
                .discount(0)
                .price(110)
                .quantity(45)
                .image("/img/women/shorts/sh6_b.png")
                .build();
        p.setCategory(womenShorts);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        // Men
        p = Product.builder()
                .name("Men's Air Zoom Pegasus")
                .description("Men's Air Zoom Pegasus")
                .discount(0)
                .price(120)
                .quantity(25)
                .image("/img/men/shirt/shm1_bl.png")
                .build();
        p.setCategory(menShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's Ultraboost")
                .description("Men's Ultraboost")
                .discount(0)
                .price(180)
                .quantity(13)
                .image("/img/men/shirt/shm2_r.png")
                .build();
        p.setCategory(menShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's HOVR Sonic 4")
                .description("Men's HOVR Sonic 4")
                .discount(20)
                .price(120)
                .quantity(24)
                .image("/img/men/shirt/shm3_r.png")
                .build();
        p.setCategory(menShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's Nano X")
                .description("Men's Nano X")
                .discount(0)
                .price(130)
                .quantity(53)
                .image("/img/men/shirt/shm4_b.png")
                .build();
        p.setCategory(menShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's Ignite Dual")
                .description("Men's Ignite Dual")
                .discount(0)
                .price(90)
                .quantity(23)
                .image("/img/men/shirt/shm5_r.png")
                .build();
        p.setCategory(menShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's Fresh Foam 1080v11")
                .description("Men's Fresh Foam 1080v11")
                .discount(0)
                .price(80)
                .quantity(13)
                .image("/img/men/shirt/shm6_b.png")
                .build();
        p.setCategory(menShirt);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's Gel-Nimbus 23")
                .description("Men's Gel-Nimbus 23")
                .discount(0)
                .price(150)
                .quantity(35)
                .image("/img/men/shoes/s1_bl.png")
                .build();
        p.setCategory(menShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's Ghost 14")
                .description("Men's Ghost 14")
                .discount(0)
                .price(130)
                .quantity(35)
                .image("/img/men/shoes/s2_r.png")
                .build();
        p.setCategory(menShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's Facet 45 OutDry")
                .description("Men's Facet 45 OutDry")
                .discount(0)
                .price(140)
                .quantity(64)
                .image("/img/men/shoes/s3_bl.png")
                .build();
        p.setCategory(menShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's Speedcross 5")
                .description("Men's Speedcross 5")
                .discount(0)
                .price(130)
                .quantity(24)
                .image("/img/men/shoes/s4_bl.png")
                .build();
        p.setCategory(menShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Men's Ultra 111 Waterproof")
                .description("Men's Ultra 111 Waterproof")
                .discount(0)
                .price(120)
                .quantity(54)
                .image("/img/men/shorts/sh1_bl.png")
                .build();
        p.setCategory(menShorts);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Tiger Men's Gel-Lyte III")
                .description("Tiger Men's Gel-Lyte III")
                .discount(0)
                .price(110)
                .quantity(36)
                .image("/img/men/shorts/sh2_b.png")
                .build();
        p.setCategory(menShorts);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Elite Cushioned Crew")
                .description("Elite Cushioned Crew")
                .discount(0)
                .price(20)
                .quantity(86)
                .image("/img/men/shorts/sh3_bl.png")
                .build();
        p.setCategory(menShorts);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        // Kids
        p = Product.builder()
                .name("Performance Cushioned Crew (Unisex)")
                .description("Performance Cushioned Crew (Unisex)")
                .discount(0)
                .price(15)
                .quantity(36)
                .image("/img/kids/clothing/s1_b.png")
                .build();
        p.setCategory(kidClothing);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("HeatGear Tech Crew (Unisex)")
                .description("HeatGear Tech Crew (Unisex)")
                .discount(10)
                .price(12)
                .quantity(0)
                .image("/img/kids/clothing/s2_bl.png")
                .build();
        p.setCategory(kidClothing);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Hidden Comfort No-Show Running (Women's)")
                .description("Hidden Comfort No-Show Running (Women's)")
                .discount(0)
                .price(13)
                .quantity(13)
                .image("/img/kids/clothing/s3_r.png")
                .build();
        p.setCategory(kidClothing);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Run Light Elite Low Cut (Men's)")
                .description("Run Light Elite Low Cut (Men's)")
                .discount(0)
                .price(18)
                .quantity(43)
                .image("/img/kids/clothing/s4_b.png")
                .build();
        p.setCategory(kidClothing);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Max Cushion No Show Tab (Women's)")
                .description("Max Cushion No Show Tab (Women's)")
                .discount(0)
                .price(17)
                .quantity(63)
                .image("/img/kids/clothing/s5_b.png")
                .build();
        p.setCategory(kidClothing);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Experia Energy Ultra Light No Show (Men's)")
                .description("Experia Energy Ultra Light No Show (Men's)")
                .discount(0)
                .price(15)
                .quantity(73)
                .image("/img/kids/clothing/s6_r.png")
                .build();
        p.setCategory(kidClothing);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Tab (Women's)")
                .description("Tab (Women's)")
                .discount(0)
                .price(14)
                .quantity(47)
                .image("/img/kids/shoes/ks1_bl.png")
                .build();
        p.setCategory(kidClothing);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Zero No Show (Men's)")
                .description("Zero No Show (Men's)")
                .discount(0)
                .price(15)
                .quantity(67)
                .image("/img/kids/shoes/ks2_bl.png")
                .build();
        p.setCategory(kidShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("II Lo (Men's)")
                .description("II Lo (Men's)")
                .discount(0)
                .price(14)
                .quantity(96)
                .image("/img/kids/shoes/ks3_bl.png")
                .build();
        p.setCategory(kidShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Cushion No Show Tab")
                .description("Cushion No Show Tab")
                .discount(0)
                .price(15)
                .quantity(35)
                .image("/img/kids/shoes/ks4_r.png")
                .build();
        p.setCategory(kidShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Featherlight")
                .description("Featherlight")
                .discount(0)
                .price(25)
                .quantity(75)
                .image("/img/kids/shoes/ks5_b.png")
                .build();
        p.setCategory(kidShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Superlite")
                .description("Superlite")
                .discount(0)
                .price(24)
                .quantity(45)
                .image("/img/kids/shoes/ks6_b.png")
                .build();
        p.setCategory(kidShoes);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Launch ArmourVent")
                .description("Launch ArmourVent")
                .discount(0)
                .price(30)
                .quantity(86)
                .image("/img/kids/accessory/b1_b.png")
                .build();
        p.setCategory(kidAccess);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Horizon Breeze Brimmer")
                .description("Horizon Breeze Brimmer")
                .discount(0)
                .price(35)
                .quantity(35)
                .image("/img/kids/accessory/b2_bl.png")
                .build();
        p.setCategory(kidAccess);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Bank Cachalot III")
                .description("Bank Cachalot III")
                .discount(0)
                .price(30)
                .quantity(56)
                .image("/img/kids/accessory/b3_bl.png")
                .build();
        p.setCategory(kidAccess);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Trucker Hat")
                .description("Trucker Hat")
                .discount(0)
                .price(29)
                .quantity(75)
                .image("/img/kids/accessory/h1_bl.png")
                .build();
        p.setCategory(kidAccess);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Sinsolo Hat")
                .description("Sinsolo Hat")
                .discount(0)
                .price(39)
                .quantity(62)
                .image("/img/kids/accessory/h2_r.png")
                .build();
        p.setCategory(kidAccess);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Sun Runner")
                .description("Sun Runner")
                .discount(20)
                .price(36)
                .quantity(27)
                .image("/img/kids/accessory/s1_bl.png")
                .build();
        p.setCategory(kidAccess);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

        p = Product.builder()
                .name("Canyon Wide Brim Hat")
                .description("Canyon Wide Brim Hat")
                .discount(0)
                .price(35)
                .quantity(84)
                .image("/img/kids/accessory/s2_r.png")
                .build();
        p.setCategory(kidAccess);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

    }
}
