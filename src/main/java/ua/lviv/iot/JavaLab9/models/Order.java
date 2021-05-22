package ua.lviv.iot.JavaLab9.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {

    private Integer id;

    private Integer totalPrice;

    @NonNull
    private String submitter;
}
