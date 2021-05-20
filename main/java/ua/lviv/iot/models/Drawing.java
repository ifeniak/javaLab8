package ua.lviv.iot.models;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public abstract class Drawing extends Item {
    @NonNull
    private int numberOfBrushes;
}
