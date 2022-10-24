package Class07.ThisKeyword1;
/*
* ****В классе объектов автомобиля:**

Создайте переменные экземпляра, как показано ниже.

- модель
- цена,
- количество

Создайте конструктор, который будет инициализировать переменные экземпляра.

Создайте метод с именем car Stock Value. Напишите логику для вычисления
общей стоимости автомобилей на складе и распечатайте результат.

запустите приложение в основном классе

**Ожидаемый результат:**

```
Стоимость акций Toyota 2019 года 2500000.0
Стоимость акций BMW 2019 года 652980,0
```

```
Цель задания. Чистый код, Это ключевое слово, Создание метода, Математические операции.
```
* */
public class CarObj {

    String model;
    double price;
    int quantity;

    CarObj(String model, double price, int quantity){
        this.model=model;
        this.price=price;
        this.quantity=quantity;
    }

    void Stock_Value(){
        double totalVal = price*quantity;
        System.out.println(model + " 2019 Stock Value " + totalVal);
    }
    }

