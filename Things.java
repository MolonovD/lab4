import java.util.Objects;
import java.util.stream.Stream;

//интерфейс, определяет что у всех имплементирующих его классов будет вызов метода описания действия над объектом
public interface Things {
    String thing();
}

//описывает портрет...
class Portrait implements Things{
    private final String object = "портрет";

    //конструктор, создает объект портрета
    public String thing(){

        return "взял " + object;
    }

    //метод, который возвращает сообщение если нет ошибки в вводе количества портрета
    public void amount(Portrait portrait, int count) throws InvalidAmountOfPortraitException{
        if (count == 1){
            System.out.println( "На стене остался " + count + " портрет Гуньки." );
        }
        else throw new InvalidAmountOfPortraitException();
    }

    //static класс, описывает кусочки от портрета
    class Pieces implements Things {
        private final String object = "кусочки";

        //конструктор, создает объект кусочков
        public String thing(){

            return "порвал его на " + object + " и сказал";
        }

        //переопределение метода equals
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pieces pieces = (Pieces) o;
            return Objects.equals(object, pieces.object);
        }

        //переопределение метода hashCode
        @Override
        public int hashCode() {
            return Objects.hash(object);
        }

        //переопределение метода toString
        @Override
        public String toString() {
            return "Pieces{" +
                    "object='" + object + '\'' +
                    '}';
        }
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Portrait portrait = (Portrait) o;
        return Objects.equals(object, portrait.object);
    }

    //переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    //переопределение метода toString
    @Override
    public String toString() {
        return "Portrait{" +
                "object='" + object + '\'' +
                '}';
    }

}


//описывает стихотворения
class Poems implements Things{
    private final String object = "стихи";

    //конструктор, создает объект стиха
    public String thing(){
        return  object;
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poems poems = (Poems) o;
        return Objects.equals(object, poems.object);
    }

    //переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    //переопределение метода toString
    @Override
    public String toString() {
        return "Poems{" +
                "object='" + object + '\'' +
                '}';
    }
}

//описывает имена
class Names implements Things{
    private final String object = "имя";

    //конструктор, создает объект имён
    public String thing(){
        return  object;
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Names names = (Names) o;
        return Objects.equals(object, names.object);
    }

    //переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    //переопределение метода toString
    @Override
    public String toString() {
        return "Names{" +
                "object='" + object + '\'' +
                '}';
    }
}

//описывает улицу
class Street implements Things{
    private final String object = "улица";

    //конструктор, создает объект улицы
    public String thing(){
        return "жил на " + object;
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return Objects.equals(object, street.object);
    }

    //переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(object);
    }

    //переопределение метода toString
    @Override
    public String toString() {
        return "Street{" +
                "object='" + object + '\'' +
                '}';
    }
}
