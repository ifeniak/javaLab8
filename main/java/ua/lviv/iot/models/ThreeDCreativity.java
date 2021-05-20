package ua.lviv.iot.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.enums.Material;

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
    private List<Material> materials;
}
