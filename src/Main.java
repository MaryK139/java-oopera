public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        
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
