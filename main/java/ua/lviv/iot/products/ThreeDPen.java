package ua.lviv.iot.products;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.enums.Colour;
import ua.lviv.iot.models.ThreeDCreativity;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ThreeDPen extends ThreeDCreativity {

    @NonNull
    private String inkMaterial;

    @NonNull
    private Colour color;
}
