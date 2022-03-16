package models;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data
public class Game implements Comparable<Game> {
    private String title;
    private String discount;
    private String price;

    public Game(String title, String discount, String price) {
        this.title = title;
        this.discount = discount;
        this.price = price;
    }

    @Override
    public int compareTo(@NotNull Game game) {
        return discount.compareTo(game.getDiscount());
    }
}