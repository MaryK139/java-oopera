public class Theatre {

    public static void main(String[] args) {
        // System.out.println("Поехали!");
        Actor actor1 = new Actor("Александр", "Петров", 174, Person.PersonGender.MALE);
        Actor actor2 = new Actor("Любовь", "Аксёнова", 175, Person.PersonGender.FEMALE);
        Actor actor3 = new Actor("Сергей", "Безруков", 172, Person.PersonGender.MALE);
        Director director1 = new Director("Глеб", "Панфилов",
                37, Person.PersonGender.MALE);
        Director director2 = new Director("Андрей", "Хржановский",
                41, Person.PersonGender.MALE);
        MusicAuthor musicAuthor = new MusicAuthor("Михаил", "Глинка", Person.PersonGender.MALE);
        Choreographer choreographer = new Choreographer("Юрий", "Григорович", Person.PersonGender.MALE);

        Show show = new Show("Пиковая Дама", 90, director1);
        Opera opera = new Opera("Борис Годунов", "Народ взывает к царю: «Хлеба, хлеба! " +
                "Дай голодным хлеба!» Мальчишки обижают юродивого.", 165, 100, director2, musicAuthor);
        Ballet ballet = new Ballet("Щелкунчик", "Щелкунчик, превратившись в прекрасного принца, " +
                "становится на колени перед Машей и просит ее следовать за ним.", 120,
                director2, musicAuthor, choreographer);

        show.addActor(actor1);
        show.addActor(actor2);
        show.addActor(actor3);
        opera.addActor(actor3);
        opera.addActor(actor2);
        ballet.addActor(actor1);

        show.printActorsList();
        System.out.println(" ");
        opera.printActorsList();
        System.out.println(" ");
        ballet.printActorsList();
        System.out.println(" ");
        // Замените актёра в одном из спектаклей на актёра из другого спектакля
        opera.replaceActor(actor1, actor3.getSurname());
        System.out.println(" ");
        opera.printActorsList();
        System.out.println(" ");
        //Попробуйте заменить в другом спектакле несуществующего актёра.
        ballet.replaceActor(actor2, actor3.getSurname());
        System.out.println(" ");
        opera.printLibrettoText();
        System.out.println(" ");
        ballet.printLibrettoText();
    }
}
