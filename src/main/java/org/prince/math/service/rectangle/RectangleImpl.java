package org.prince.math.service.rectangle;

import org.prince.math.model.Rectangle;

public class RectangleImpl implements RectangleIntr {

    @Override
    public Double surface(Rectangle rectangle) {
        return rectangle.getLongueur() * rectangle.getLargeur();
    }

    @Override
    public Double perimetre(Rectangle rectangle) {
        return (rectangle.getLongueur() + rectangle.getLargeur()) * 2;
    }
}
