package ua.lviv.iot.models;

import lombok.*;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.enums.Country;
import ua.lviv.iot.enums.CreativityType;

import java.util.ArrayList;
import java.util.List;

@Data
@SuperBuilder
@NoArgsConstructor
public abstract class Item {

    @NonNull
    private String name;

    @NonNull
    private Country brandCountry;

    @NonNull
    private Country originCountry;

    @NonNull
    private String brand;

    @NonNull
    private double price;

    @NonNull
    private List<Integer> recommendedAge;

    @NonNull
    private CreativityType type;

}
