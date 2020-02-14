/**
 * <html>
 * <body>
 * <p> All rights reserved.</p>
 * <p> Created on 2020-02-11</p>
 * <p> Created by huangjy</p>
 * </body>
 * </html>
 */
package com.john.controlleradvice;

/**
 * @author huangjy
 * @since v1.0
 */
public class Book {
    private String name;
    private Double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
