package com.tzb.springcloud.entities;

import java.io.Serializable;

/**
 * @author TZB
 */

public class Payment implements Serializable {
    private long id;
    private String serial;

    public Payment(long id, String serial) {
        this.id = id;
        this.serial = serial;
    }

    public Payment() {
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", serial='" + serial + '\'' +
                '}';
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public long getId() {
        return id;
    }

    public String getSerial() {
        return serial;
    }

}
