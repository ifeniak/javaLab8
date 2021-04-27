package ua.lviv.iot.managers;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.experimental.SuperBuilder;
import ua.lviv.iot.enums.CreativityType;
import ua.lviv.iot.models.Item;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@SuperBuilder
@NoArgsConstructor
public class CreativityManager {

    @NonNull
    private List<Item> goods;

    public List<Item> searchBy(CreativityType type) {
        return goods.stream()
                .filter(item -> item.getType().equals(type))
                .collect(Collectors.toList());
    }

    public List<Item> sortByName(SortOrder order) {
        if (order == SortOrder.ASC) { goods.sort(Comparator.comparing(Item::getName)); }

        else { goods.sort(Comparator.comparing(Item::getName).reversed()); }

        return goods;
    }

    public List<Item> sortByPrice(SortOrder order) {
        if (order == SortOrder.ASC) { goods.sort(Comparator.comparing(Item::getPrice)); }

        else { goods.sort(Comparator.comparing(Item::getPrice).reversed()); }

        return goods;

    }
}
