package ua.lviv.iot.JavaLab9.products;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.JavaLab9.enums.Colour;
import ua.lviv.iot.JavaLab9.models.ThreeDCreativity;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class ThreeDPen extends ThreeDCreativity {

    @NonNull
    private Integer id;

    @NonNull
    private String inkMaterial;

    @NonNull
    private String color;
}
