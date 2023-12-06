package com.danko.entity.rooms;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "rooms")
public class Rooms {

    public Rooms() {}
    public Rooms(String amount, String price, String discription) {
        rooms_guest_amount = Integer.parseInt(amount);
        rooms_price = Float.parseFloat(price);
        rooms_discription = discription;
        rooms_deleted = false;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_rooms;
    private int rooms_guest_amount;
    private float rooms_price;
    private String rooms_discription;
    private Boolean rooms_deleted;
}
