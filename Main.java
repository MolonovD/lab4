//главный класс, в нем история собрается и выводится
public class Main {

    //в методе создаются нужные объекты классов
    public static void main(String[] args) {
        Painter painter = new Painter();
        Poet poet = new Poet();

        Portrait portrait = new Portrait();
        Portrait.Pieces pieces = new Portrait(). new Pieces();
        Poems poems = new Poems();
        Street street = new Street();
        Names names = new Names();

        Gunka gunka = new Gunka(portrait, pieces);
        Neznaika neznaika = new Neznaika(painter, poet, poems, street);
        Pudik pudik = new Pudik(poet, poems, names);
        Tsvetik tsvetik = new Tsvetik(poet);
        All all = new All(poet);


        //лямбда-выражение которое возвращает союз "и"
        Word wordAnd;
        wordAnd = () -> "И ";


        System.out.println(gunka.tookPortrait());
        //блок кода в котором может произойти исключение
        try {
            portrait.amount(portrait,1);
        }
        //обработка исключения
        catch (Exception excp){
            System.out.println(excp.getMessage());
        }
        gunka.toreItToPiecesAndSaid(true);
        System.out.println(neznaika.didntBecomeAPainter());
        System.out.println(neznaika.decidedToBecomeAPoet());
        System.out.println(wordAnd.addWord());
        System.out.println(neznaika.composePoems());
        System.out.println(neznaika.heHadAFamiliarPoet());
        System.out.println(neznaika.whichLivedOnAOduvanchikovStreet());
        System.out.println(pudik.thisPoetNameIsPudikForReal());
        System.out.println(all.allPoetsReallyLikesBeautifulNames());
        System.out.println(pudik.thatsWhyWhenPudikStartedToWriteAPoems());
        System.out.println(pudik.heChoseAnotherName());
        System.out.println(tsvetik.andCallYourselfByTsvetik());
    }
}
