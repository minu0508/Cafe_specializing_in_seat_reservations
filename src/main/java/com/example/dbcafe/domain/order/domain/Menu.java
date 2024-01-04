package com.example.dbcafe.domain.order.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private int price;

    @Enumerated(EnumType.STRING)
    private MenuCategory category;

    private String content;

    private boolean isSelling;

    private String img;

    public boolean getIsSelling() {
        return isSelling;
    }

    public Menu(String name, int price, MenuCategory category, String content, boolean isSelling, String img) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.content = content;
        this.isSelling = isSelling;
        this.img = img;
    }
}
