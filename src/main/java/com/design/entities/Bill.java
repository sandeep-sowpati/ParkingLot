package com.design.entities;

import java.time.LocalDateTime;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private int amount;
    private Ticket ticket;
    private Gate gate;
}
