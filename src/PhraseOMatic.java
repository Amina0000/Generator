public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный",
                "распределенный, ", "кластеризованный", "фирменный", "нестадартный ум",
                "позиционированный", "сетевой", "фирменный", "сфокусированный",
                "использованный с выгодой", "выровненный", "нацеленыный на", "общий",
                "совместный", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структур",
                "талант", "подход", "уровень завоеваннного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования"};
        String[] wordListOne = {"круглосуточный", "трех-звенный", "30000-футовый",
                "взаимный", "обоюдный выигрыш", "фронтэнд",
                "на основе веб-технологий", "проникающий", "умный", "шесть сигм",
                "метод критического пути", "динамичный"};

        int oneLenght = wordListOne.length;
        int twoLenght = wordListTwo.length;
        int threeLenght = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLenght);
        int rand2 = (int) (Math.random() * twoLenght);
        int rand3 = (int) (Math.random() * threeLenght);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("Все что нужно это, - " + phrase);
    }
}