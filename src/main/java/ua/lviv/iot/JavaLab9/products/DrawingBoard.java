package ua.lviv.iot.JavaLab9.products;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.JavaLab9.models.ThreeDCreativity;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public class DrawingBoard extends ThreeDCreativity {

    @NonNull
    private String backlightLight;
}
