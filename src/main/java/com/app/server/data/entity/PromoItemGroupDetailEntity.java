package com.app.server.data.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table(name = "promo_item_group_detail")
public class PromoItemGroupDetailEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Integer id;
    private int promo_item_group_id;
    private int item_id;
    private String note;
    private int status;
    private Date created_date = new Date();
    private Integer modifier_id;
    private Integer creator_id;
    private Date modify_date = new Date();
    private int promo_id;
    private int item_quantity;
    private long item_price;
    private long max_offer_per_promo;
    private long max_offer_per_agency;
    private String item_type;
    private int category_level;
}