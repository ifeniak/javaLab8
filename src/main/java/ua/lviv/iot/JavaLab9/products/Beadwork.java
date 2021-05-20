package ua.lviv.iot.JavaLab9.products;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.JavaLab9.enums.Colour;
import ua.lviv.iot.JavaLab9.models.Sewing;

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
