import java.util.Objects;

// Создать класс Сотрудник (Employee).
// У класса должны быть следующие поля:
// 1. Возраст (int)
// 2. Имя (String)
// 3. Фамилия (String)
// 4. Зарплата (double)
// 5. ... можно придумать свои поля

// У класса должно быть 2 конструктора:
// 1. Конструктор, который принимает все аргументы
// 2. Констуктор, который принимает все аргументы КРОМЕ зарплаты; значение зарплаты должно быть задано значением по умолчанию (50.0)

// Переопределить:
// 1. Методы equals и hashCode (поля, которые должны там участвовать, нужно определить самостоятельно)
// 2. Метод toString (в любом формате)

// Реализовать методы:
// String getFullName() - возвращает полное имя сотрудника
// boolean olderThan(Employee e) - возвращает true, если текущий сотрудник старше чем тот, который передали в метод.
// void upgrade(double salary) - повышает зарплату сотрудника НА salary единиц. Пример: Было 50.0, upgrade(20.0) -> стало 70.0

public class Employee{
    int age;
    String firstName;
    String lastName;
    Double sallary;

    public Employee (int age, String firstName, String lastName, Double sallary) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sallary = sallary;

    }
    public Employee (int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sallary = 50.0;
        
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
    @Override
    public String toString(){
        return firstName + " " + lastName;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    // public boolean olderThan(Employee e){
    //     if (e > age){

    //     }
    public double upgrade(double salary){
        return sallary + 20.0;
    }
}
