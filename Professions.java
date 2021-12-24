import java.util.Objects;
import java.util.stream.Stream;

//интерфейс определяет что у всех имплементирующих его классов будет вызов метода описания действия над объектом
public interface Professions {
    //метод действия над объектом
    String profession();
}

//описывает художника
class Painter implements Professions{
    private final String job = "художник";

    //конструктор, создает объект художника
    public String profession(){
        return "не получилось " + job;
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Painter painter = (Painter) o;
        return Objects.equals(job, painter.job);
    }

    //переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(job);
    }

    //переопределение метдоа toString
    @Override
    public String toString() {
        return "Painter{" +
                "job='" + job + '\'' +
                '}';
    }
}

//описывает поэта
class Poet implements Professions{
    private String job;

    //конструктор, создает объект поэта
    public String profession() {
        return this.job;
    }

    public Poet (){
        this.job = "Поэт";
    }

    //переопределение метода equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Poet poet = (Poet) o;
        return Objects.equals(job, poet.job);
    }

    //переопределение метода hashCode
    @Override
    public int hashCode() {
        return Objects.hash(job);
    }

    //переопределение метода toString
    @Override
    public String toString() {
        return "Poet{" +
                "job='" + job + '\'' +
                '}';
    }
}

