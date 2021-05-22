package ua.lviv.iot.JavaLab9.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.JavaLab9.enums.Colour;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public abstract class Sewing extends Item{

    @NonNull
    private int numberOfNeedles;

    @NonNull
    private Colour threadsColor;
}
