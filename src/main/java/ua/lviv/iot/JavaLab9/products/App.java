package ua.lviv.iot.JavaLab9.products;/*package ua.lviv.iot;

import ua.lviv.iot.enums.*;
import ua.lviv.iot.managers.CreativityManager;
import ua.lviv.iot.managers.SortOrder;
import ua.lviv.iot.products.Beadwork;
import ua.lviv.iot.products.DrawingBoard;
import ua.lviv.iot.products.ThreeDPen;
import ua.lviv.iot.products.ToyKnitting;

import java.util.Arrays;

public class App
{
    public static void main( String[] args )
    {
        ThreeDPen my3DPen = ThreeDPen.builder()
                .brand("n")
                .brandCountry(Country.CHINA)
                .price(1129)
                .originCountry(Country.EU)
                .recommendedAge(Arrays.asList(12, 13))
                .name("Pontius")
                .powerSupply("usb")
                .materials(Arrays.asList(Material.FIBEROPTICS, Material.METAL))
                .type(CreativityType.SEWING)
                .inkMaterial("blood")
                .color(Colour.VIOLET)
                .build();
        DrawingBoard myBoard = DrawingBoard.builder()
                .brand("n")
                .brandCountry(Country.CHINA)
                .price(134.23)
                .originCountry(Country.EU)
                .recommendedAge(Arrays.asList(12, 13))
                .name("Dayneris")
                .powerSupply("usb")
                .materials(Arrays.asList(Material.FIBEROPTICS, Material.METAL))
                .type(CreativityType.DRAWING)
                .backlightLight("neon")
                .build();
        ToyKnitting meinKampf = ToyKnitting.builder()
                .numberOfNeedles(12)
                .brandCountry(Country.EU)
                .originCountry(Country.UKRAINE)
                .brand("SS")
                .name("Adolf")
                .price(1488)
                .recommendedAge(Arrays.asList(18, 27))
                .type(CreativityType.DRAWING)
                .threadsColor(Colour.RED)
                .toyFiller(Filler.HOLOFIBER)
                .build();
        Beadwork beadwork  = Beadwork.builder()
                .numberOfNeedles(12)
                .brandCountry(Country.EU)
                .originCountry(Country.UKRAINE)
                .brand("SS")
                .name("Gadesen")
                .price(19.96)
                .recommendedAge(Arrays.asList(18, 27))
                .type(CreativityType.DRAWING)
                .threadsColor(Colour.RED)
                .beadsColor(Arrays.asList(Colour.ORANGE, Colour.BLUE))
                .build();

        CreativityManager manager = CreativityManager.builder()
                .goods(Arrays.asList(my3DPen, myBoard, meinKampf, beadwork))
                .build();
        String boarder = "----------------------------------------------------------------------------------------";

        System.out.println("All my items: \n");
        manager.getGoods().forEach(System.out::println);
        System.out.println(boarder);

        System.out.printf("\nThis items have %s CreativityType attribute: \n\n", CreativityType.DRAWING.toString());
        manager.searchBy(CreativityType.DRAWING).forEach(System.out::println);
        System.out.println(boarder);

        System.out.println("\nMy items sorted by name: \n");
        manager.sortByName(SortOrder.ASC).forEach(System.out::println);
        System.out.println(boarder);

        System.out.println("\nMy items sorted by price: \n");
        manager.sortByPrice(SortOrder.DESC).forEach(System.out::println);
        System.out.println(boarder);
    }
}
*/