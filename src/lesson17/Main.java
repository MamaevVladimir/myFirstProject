package lesson17;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Tovar rukzak = new Tovar();
        rukzak.setMainName("Рюкзак Mark Ryden MR-9032");
        rukzak.setArtikul("MR-9032");
        rukzak.setOpisanie("Компактный городской рюкзак – отличный выбор для тех, кто привык идти вперед. Современные дизайн-решения и материалы премиум качества делают рюкзак отличным дополнением к любому стилю.\n" +
                "\n" +
                "Особенности:\n" +
                "\n" +
                "    Ортопедическая спинка – три слоя высокотехнологичных материалов – и удобные мягкие лямки, регулирующийся по высоте\n" +
                "    Внешний USB-порт.\n" +
                "    Лёгкий, компактный городской рюкзак для тех, кто живёт в ритме города.\n" +
                "    Рюкзак отлично держит форму и занимает минимум места – удобно в транспорте, на мероприятиях, на прогулках.\n" +
                "    Система крепления телефона на лямке рюкзака OCTOPUS, внешний USB-порт – звони, снимай фото и видео не снимая с рюкзака.\n" +
                "    Трёхслойная ортопедическая спинка с вентилируемой сеткой и мягкие лямки обеспечивают удобное использование. <br>        \n" +
                "        Подробнее: https://www.rukzakoff.ru/product/ryukzak-mark-ryden-mr-9032/");

        rukzak.setOstatokNaSklade(24);
        rukzak.setPriceFull(3990);
        rukzak.setPathToImage("https://www.rukzakoff.ru/wa-data/public/site/themes/profitbuy/img/sizes/1-1.png");

        Otziv otziv1 = new Otziv();
        otziv1.setNameAutor("Ирина");
        otziv1.setTema("Очень удобный рюкзак");
        otziv1.setTrueFoto(true);
        otziv1.setTrueOpisanie(true);
        otziv1.setReiting(5);
        otziv1.setOtziv("Мне всё понравилось");
        otziv1.setTrueRazmer(true);
        otziv1.setDatePublikasii(new Date());// в классе Tovar делаем метод "Добавить отзыв"

        Otziv otziv2 = new Otziv();
        otziv2.setNameAutor("Ирина");
        otziv2.setTema("Очень удобный рюкзак");
        otziv2.setTrueFoto(true);
        otziv2.setTrueOpisanie(true);
        otziv2.setReiting(4);
        otziv2.setOtziv("Мне всё понравилось");
        otziv2.setTrueRazmer(true);
        otziv2.setDatePublikasii(new Date());

        rukzak.addOtziv(otziv1);
        rukzak.addOtziv(otziv2);

        Harakteristika vmeschaetA4 = new Harakteristika();
        vmeschaetA4.setPodskazka("Вмещает или нет");
        vmeschaetA4.setKey("A4");
        vmeschaetA4.setValue("Вмещает");

        Harakteristika material = new Harakteristika();
        material.setPodskazka("Материал рюкзака");
        material.setValue("Полиэстер");
        material.setKey("Полиэстер");

        Harakteristika spinka = new Harakteristika();
        spinka.setKey("Ортоп");
        spinka.setValue("Ортоп");
        spinka.setPodskazka("Материал спинки");

        rukzak.addHarakteristika(vmeschaetA4);
        rukzak.addHarakteristika(material);
        rukzak.addHarakteristika(spinka);

        Foto foto = new Foto();
        foto.setPathToBigFoto("foto1.png");
        foto.setPathToSmallFoto("foto2.png");

        Foto foto1 = new Foto();
        foto1.setPathToSmallFoto("foto3.png");
        foto1.setPathToBigFoto("foto4.png");

        rukzak.addFoto(foto);
        rukzak.addFoto(foto1);

        rukzak.printMiddleRate();

        rukzak.printOtziviByRate();
    }
}
