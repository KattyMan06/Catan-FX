package com.example.catanfx.GamePieces.Structures;

import javafx.scene.image.ImageView;
import java.util.Objects;

public class Structure {
    public String type;
    public String color;
    public ImageView image;
    public boolean isVisible;

    public Structure(String type, String color,ImageView image) {
        this.type = type;
        this.color = color;
        this.image = image;
        this.isVisible = false;
    }

    public void setVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public ImageView getImage() { return image; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Structure structure = (Structure) o;
        return Objects.equals(type, structure.type) && Objects.equals(color, structure.color) && Objects.equals(image, structure.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, color, image);
    }

}
