package ua.lviv.iot.JavaLab9.products;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.JavaLab9.enums.Filler;
import ua.lviv.iot.JavaLab9.models.Sewing;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ToyKnitting extends Sewing {

    @NonNull
    private Filler toyFiller;
}
