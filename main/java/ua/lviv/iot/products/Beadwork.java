package ua.lviv.iot.products;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.enums.Colour;
import ua.lviv.iot.models.Sewing;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class Beadwork extends Sewing {

    @NonNull
    private List<Colour> beadsColor;
}
