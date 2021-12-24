// исключение количества портретов, которое выводит ошибку, если в main ввести число, отличное от 1
public class InvalidAmountOfPortraitException extends RuntimeException {
    //метод, в котором написано, что будет выведено при ошибке
    public InvalidAmountOfPortraitException(){
        super("ОШИБКА! АЛО!!! всего 1(!) потртет остался!");
    }
}
