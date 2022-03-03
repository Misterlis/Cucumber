package stepDefenition;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Тогда;

public class steps {
    int a;
    int b;
    int sum;
    int diff;
    int mult;
    int div;

    @Дано("^два числа (.*) and (.*)$*")
    public void given(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Тогда("^находим сумму чисел$")
    public void summa() {
        sum = a + b;
    }

    @И("^выводим сумму на экран$")
    public void printResult() {
        System.out.println("Сумма чисел" + a + " и " + b + " равняется " + sum);
    }

    @Тогда("^находим разность чисел$")
    public void difference() {
        diff = a - b;
    }

    @И("^выводим разность на экран$")
    public void printResult2() {
        System.out.println("Разность чисел" + a + " и " + b + " равняется " + diff);
    }

    @Тогда("^находим умножение чисел$")
    public void multiplication() {
        mult = a * b;
    }

    @И("^выводим умножение на экран$")
    public void printResult3() {
        System.out.println("Умножение чисел" + a + " и " + b + " равняется " + mult);
    }

    @Тогда("^находим деление чисел$")
    public void division() {
        div = a / b;
    }

    @И("^выводим деление на экран$")
    public void printResult4() {
        System.out.println("Деление чисел" + a + " и " + b + " равняется " + div);
    }
}

