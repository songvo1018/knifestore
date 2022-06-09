package org.nosov;

import java.awt.*;
import java.util.Currency;

/**
У нас есть нож
 Что представляет собой нож?
 1. Материал Material.class
 2. Длина и ширина Dimension.class
 3. Толщина int
 4. Заточка Bevel.class

Нам нужно продать нож, для этого нам нужен Товар
 Что представляет собой товар?
 1. Название String
 2. Артикул long
 3. Цена BigDecimal
 4. Состояние (новый, б\у, утиль) Condition
 5. Предмет покупки Object?
 6. Производитель Producer
 7. Дата производства Timestamp
 **/
abstract public class Knife {
    private Material material;
    private Dimension dimension;
    private Thick thick;
    private Bevel bevel;
}
