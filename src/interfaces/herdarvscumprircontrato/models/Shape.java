package interfaces.herdarvscumprircontrato.models;

import interfaces.herdarvscumprircontrato.enums.Color;

public abstract class Shape implements IShape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
