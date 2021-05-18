package ua.lviv.iot.JavaLab9.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.JavaLab9.enums.Material;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
public abstract class ThreeDCreativity extends Item{

    @NonNull
    private String powerSupply;

    @NonNull
    private String materials;
}
