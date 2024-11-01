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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshoes%2Fs1_bl.png?alt=media&token=3fb0a7e5-5faf-43fe-a401-aaa8329b4b96")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshoes%2Fs2_bl.png?alt=media&token=4c3e7111-c47a-4e3e-a3ab-2be64d97f66e")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshoes%2Fs3_r.png?alt=media&token=ffc70696-0d2a-4ca7-9313-7aef9ca4f7aa")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshoes%2Fs6.png?alt=media&token=d253aea9-cfcb-45d5-b514-bd5b0bed4146")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshoes%2Fs7.png?alt=media&token=3998810a-1832-4193-8a67-b732d4021836")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshorts%2Fsh1_bl.png?alt=media&token=bf7c2b54-0150-4960-a083-3299aa027b7a")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshorts%2Fsh2_bl.png?alt=media&token=b5a9b6f1-46c6-474b-92c9-4f755f7f642b")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshirts%2Fsh1_b.png?alt=media&token=cdd16e65-26e5-4bea-9253-d22be0052855")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshirts%2Fsh2_b.png?alt=media&token=d0dce6e0-06ca-46ef-8d1c-68d483869588")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshirts%2Fsh3_bl.png?alt=media&token=bb0b7099-729c-4a76-a319-c0f20f0c08c7")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshirts%2Fsh4_b.png?alt=media&token=752cc80b-8bd1-4ba2-a5ba-627436bf6813")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshirts%2Fsh5_bl.png?alt=media&token=c7e0b98c-a200-4015-a390-d7955b010f5b")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshorts%2Fsh3_r.png?alt=media&token=eda63e48-c126-4b53-995f-df7f549eb664")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshorts%2Fsh4_bl.png?alt=media&token=b14917d5-251b-402a-8dc2-72026ad42e24")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshorts%2Fsh5_b.png?alt=media&token=d02e4846-31d5-4c68-b0f9-015e78931c3b")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/women%2Fshorts%2Fsh6_b.png?alt=media&token=ef0c846f-2f82-42b8-badd-1aedb5500d54")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshirt%2Fshm1_bl.png?alt=media&token=21adc400-1cba-4b9a-8979-496c5e2d36c9")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshirt%2Fshm2_r.png?alt=media&token=73624fe7-9a4a-4fb0-bfc5-4b48453b6657")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshirt%2Fshm3_r.png?alt=media&token=46e6dd49-500a-49fc-8df5-e56c3e3aa784")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshirt%2Fshm4_b.png?alt=media&token=d60b67f2-86aa-40d7-99dd-288a1e3d2fbc")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshirt%2Fshm5_r.png?alt=media&token=93ae7e92-f131-4e7f-9ddf-66af3806d538")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshirt%2Fshm6_b.png?alt=media&token=dac10227-3aae-413f-bc9b-325072fd7e90")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshoes%2Fs1_bl.png?alt=media&token=cfa167c4-3a85-405b-9fd4-e468adf21fae")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshoes%2Fs2_r.png?alt=media&token=ece48b63-6dec-43cc-817c-18bb21cfa99d")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshoes%2Fs3_bl.png?alt=media&token=3200aa6c-3219-4d5b-9126-800e1a28ff6c")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshoes%2Fs4_bl.png?alt=media&token=f521d4bb-7986-4c2e-9339-2509ddc31287")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshorts%2Fsh1_bl.png?alt=media&token=6125e90e-4e3c-4573-bdb5-645f1b284b8a")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshorts%2Fsh2_b.png?alt=media&token=8f7a051e-6a55-423e-aba1-162d47b23d86")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/men%2Fshorts%2Fsh3_bl.png?alt=media&token=5ff2c6f7-96f9-4a17-a8b9-430f41825a9b")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fclothing%2Fs1_b.png?alt=media&token=ecaf1aec-78ee-44ee-850d-e8c84ec7a66a")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fclothing%2Fs2_bl.png?alt=media&token=3ef524ea-331b-4f75-b850-abf85fe200f7")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fclothing%2Fs3_r.png?alt=media&token=cd273997-af3f-4480-a395-facec676a188")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fclothing%2Fs4_b.png?alt=media&token=f9be2789-442a-43a0-9b9a-d60f3c0485b7")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fclothing%2Fs5_b.png?alt=media&token=37fbd339-de04-4d4a-800f-ad7217fc8370")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fclothing%2Fs6_r.png?alt=media&token=c0e34975-91d0-4d6d-88b3-dc4a7da39650")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fshoes%2Fks1_bl.png?alt=media&token=841ad146-60a4-4002-a59a-2ee040bd4427")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fshoes%2Fks2_bl.png?alt=media&token=ebc6715b-ffab-43c3-a170-f470fda731d3")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fshoes%2Fks3_r.png?alt=media&token=6f15d680-03bc-457c-ad9e-defd110f4687")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fshoes%2Fks4_r.png?alt=media&token=865b5e4a-e678-423a-a748-751620487da5")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fshoes%2Fks5_b.png?alt=media&token=e11d61e9-43a1-4e66-8832-7d67f6eb2718")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Fshoes%2Fks6_b.png?alt=media&token=598d6d3f-caf2-46f9-9fdc-4076302fadf1")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Faccessory%2Fb1_b.png?alt=media&token=a0ffcc30-0e10-4818-86bd-67b08f135a94")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Faccessory%2Fb2_bl.png?alt=media&token=7c4c8093-cb23-4fdf-a954-acf2956cdfc7")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Faccessory%2Fb3_bl.png?alt=media&token=b960dd5f-23f5-4761-a3ff-39ce8e5b8c14")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Faccessory%2Fh1_bl.png?alt=media&token=4657e827-5ca2-4026-811c-7a01e8c01096")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Faccessory%2Fh2_r.png?alt=media&token=dab9cc39-d013-4f35-a715-afb69a5f2404")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Faccessory%2Fs1_bl.png?alt=media&token=e614c364-21c5-46d7-9dab-a686ca3b2b73")
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
                .image("https://firebasestorage.googleapis.com/v0/b/sw-metric.appspot.com/o/kid%2Faccessory%2Fs2_r.png?alt=media&token=8e9b1e0a-a149-4f16-9e86-251884ba1fb0")
                .build();
        p.setCategory(kidAccess);
        p.getColors().add(red);
        p.getColors().add(blue);
        p.getColors().add(black);
        productRepository.save(p);

    }
}
