package ua.lviv.iot.JavaLab9.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.JavaLab9.enums.Country;
import ua.lviv.iot.JavaLab9.enums.CreativityType;

import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class Item {

    @NonNull
    private String name;

    @NonNull
    private String brandCountry;

    @NonNull
    private String originCountry;

    @NonNull
    private String brand;

    @NonNull
    private Double price;

    @NonNull
    private Integer recommendedAge;

    @NonNull
    private String type;

}
