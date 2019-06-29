package lesson19;

public class Person {
    private String name;
    private int age;


    public void setAge(int age) throws UncurrentAgeException {
        if(age < 0 || age > 150){
            throw new UncurrentAgeException("Возраст не может быть отрицательным или больше 150");
        }// можно указать Exception, чтобы красным не помечалось, выбрать Add...
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
// checked Exception проверяются Идеей, не даст запустить без обработчика правильного, try/catch блока.
// Unchecked программой не проверяются
// При написании кода избегать NullPointerException в результатах
// для этого там где непримитивные типы указываем например if (a != null){a.add(1;}
// Catch может быть прописано несколько, столько же сколько Exception, или прописать
// один универсальный Catch для всех Exception
// finally можно прописать, он работает независимо от того, сработал ли try или не сработал
// Exception дочерний должен быть в том catch который выше родительского
// Если указано finally срабатывает только один из catch (первый сработавший) когда catch несколько