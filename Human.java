import java.util.Objects;

//абстрактный класс людей
public abstract class Human {
    private String name = " ";

    //метод, возвращающий имя
    public String getName(){
        return this.name;
    }

    //метод, возвращающий имя человека
    public Human(String name) {
        this.name = name;
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name);
    }

    //переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    //переопределение метода toString
    @Override
    public String toString(){
        return name;
    }
}

//класс Гуньки, описывает все его действия
class Gunka extends Human {
    private Things portrait;
    private Things pieces;

    //инициализация
    public Gunka(Things portrait, Things pieces) {
        super("Гунька");
        this.portrait = portrait;
        this.pieces = pieces;
    }

    //метод, возвращающий, что Гунька взял портрет
    public String tookPortrait() {
        return this.getName() + " " + portrait.thing();
    }

    //метод, возвращающий, что Гунька порвал его на кусочки
    public void toreItToPiecesAndSaid(boolean flag) {
        try {
            if (flag) {
                System.out.println(this.getName() + " " + pieces.thing());
            } else {
                throw new StoryException("Гунька не порвал портерт. ");
            }
        } catch (StoryException e) {
            System.out.print(e.getMessage());
            System.exit(0);
        }
    }

    //статичный класс
    static class innerPortrait {
        private final String name;

        innerPortrait(String name) {
            this.name = name;
        }
        public String ThereIsOnlyOneGunkasPortraitLeftOnTheWall() {
            return "На стене остался " + name ;
        }
    }
}

//класс Незнайки, описывает все его действия
class Neznaika extends Human {
    private Professions painter;
    private Professions poet;
    private Things poems;
    private Things street;

    //инициализация
    public Neznaika(Professions painter, Professions poet, Things poems, Things street) {
        super ("Незнайка");
        this.painter = painter;
        this.poet = poet;
        this.poems = poems;
        this.street = street;
    }

    //метод, возвращающий что Незнайка не стал художником
    public String didntBecomeAPainter(){
        return "После того как из " + this.getName() + " " + painter.profession();
    }

    //метод, возвращающий что Незнайка решил стать поэтом
    public String decidedToBecomeAPoet(){
        return this.getName() + " решил сделаться " + poet.profession();
    }

    //метод, возвращающий что Незнайка сочинил стихи
    public String composePoems(){
        return  "сочинять " + poems.thing();
    }

    //метод, возвращающий что у Незнайки был знакомый поэт
    public String heHadAFamiliarPoet(){
        return "У " + this.getName() + " был знакомый " + poet.profession();
    }

    //метод, возвращающий что Незнайка живет на улице Одуванчиков
    public String whichLivedOnAOduvanchikovStreet(){
        return "Который " + street.thing() + " Одуванчиков";
    }



    //анонимный класс
    Portrait he = new Portrait(){
        @Override
        public String thing() { return " снял его";}
    };
}


//класс Пудика, описывает все его действия
class Pudik extends Human {
    private Professions poet;
    private Things poems;
    private Things names;
    private PudiksName pudiksName;

    //инициализация
    public Pudik(Professions poet, Things poems, Things names) {
        super ("Пудик");
        this.pudiksName = PudiksName.pudik;
        this.poet = poet;
        this.poems = poems;
        this.names = names;
    }

    //метод, возвращающий что Пудик это настоящее имя
    public String thisPoetNameIsPudikForReal(){
        return "Этого " + poet.profession() + "a по-настоящему звали " + pudiksName.getName();
    }

    //метод, возвращающий что когда Пудик начал писать стихи
    public String thatsWhyWhenPudikStartedToWriteAPoems(){
        return "Поэтому, когда " + pudiksName.getName() + " начал писать " + poems.thing();
    }

    //метод, возвращающий что Пудик выбрал себе другое имя
    public String heChoseAnotherName (){

        //локальный класс
        class anotherName {
            private final String name;

            anotherName(String name) {
                this.name = name;
            }
        }
        return pudiksName.getName() + " выбрал себе " + new anotherName("другое имя").name;

    }
}


//класс Цветика, описывает все действия
class Tsvetik extends Human {
    private Professions poet;
    private PudiksName pudiksName;

    //инициализация
    public Tsvetik(Professions poet) {
        super ("Цветик");
        this.pudiksName = PudiksName.tsvetik;
        this.poet = poet;
    }

    //метод, возвращающий что Цветик начал называть себя Цветиком
    public String andCallYourselfByTsvetik(){
        if (pudiksName.getName() == null) {
            throw new NullPointerException();
        }
        return "И стал называться " + pudiksName.getName();
    }
}


//класс Все, описывает действия
class All extends Human {
    Professions poet;

    //инициализация
    public All(Professions poet) {
        super ("Все");
        this.poet = poet;}

    //метод, возвращающий что Все поэты любят красивые имена
    public String allPoetsReallyLikesBeautifulNames(){
        return this.getName() + " " + poet.profession() + "ы очень любят красивые имена";
    }
}

//перечисление имен Пудика
enum PudiksName {
    pudik("Пудик"), tsvetik("Цветик");
    private String name;
    PudiksName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}