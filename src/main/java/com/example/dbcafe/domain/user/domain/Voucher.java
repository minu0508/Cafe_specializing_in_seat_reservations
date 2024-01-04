package com.example.dbcafe.domain.user.domain;

import com.example.dbcafe.domain.order.domain.Menu;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class Voucher { // 교환권
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id")
    private Menu menu;

    private int price;

    @Column(nullable = false, name = "created_at")
    @CreatedDate
    private Date createdAt;

    private int period;

    private Date usedAt;

    @Enumerated(EnumType.STRING)
    private CouponStatus status;

    public Voucher(User user, Menu menu, int price, Date createdAt, int period, Date usedAt, CouponStatus status) {
        this.user = user;
        this.menu = menu;
        this.price = price;
        this.createdAt = createdAt;
        this.period = period;
        this.usedAt = usedAt;
        this.status = status;
    }
}
