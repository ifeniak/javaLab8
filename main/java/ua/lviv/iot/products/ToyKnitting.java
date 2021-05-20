package ua.lviv.iot.products;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.enums.Filler;
import ua.lviv.iot.models.Sewing;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ToyKnitting extends Sewing {

    @NonNull
    private Filler toyFiller;
}
