package com.example.onlineShopApp;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orderTable")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int user_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }


}
