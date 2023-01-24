public class ExpensesManager {
    double[] expenses;
    ExpensesManager(){
        expenses = new double[7]; // Должно стать полем нового класса
    }

     double saveExpense(double moneyBeforeSalary, double expense, int day) {
         moneyBeforeSalary = moneyBeforeSalary - expense;
         expenses[day - 1] = expenses[day - 1] + expense;
         System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
         if (moneyBeforeSalary < 1000) {
             System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
         }
         return moneyBeforeSalary;
    }

    void printAllExpenses() {
        for (int i = 0; i < expenses.length; i++) {
            System.out.println("День " + (i + 1) + ". Потрачено " + expenses[i] + " рублей");
        }
    }

    double findMaxExpense() {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (expenses[i] > maxExpense) {
                maxExpense = expenses[i];
            }
        }
        return maxExpense;
    }
}

        /*Объявите одно поле —  массив трат double[] expenses.
        Объявите конструктор без параметров, а внутри него инициализируйте массив так же, как это происходит сейчас в классе Praktikum, — в нём должно храниться семь значений.
        Перенесите в ExpensesManager  код методов saveExpense, findMaxExpense и printAllExpenses. Удалите перед названием методов слова public и static.
        В классе Praktikum должно остаться взаимодействие с пользователем — печать меню, вопросов пользователю, а также считывание его ответов: команд, значений зарплаты, дней и трат.
        Параметры метода saveExpenseвнутри класса ExpensesManager изменятся: теперь он должен принимать остаток на счёте moneyBeforeSalary, размер траты expense и номер дня недели day, за который нужно её учесть.
        Уберите из методов findMaxExpense и printAllExpenses параметр double[] expenses. Теперь он стал полем класса, и его не нужно передавать.
        Создайте объект класса ExpensesManager и вызовите его методы внутри класса Praktikum.*/