public class DinnerAdvisor {
    public static void getAdvice(double moneyBeforeSalary, int daysBeforeSalary){
        if (moneyBeforeSalary < 3000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 10000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }
        } else if (moneyBeforeSalary < 30000) {
            if (daysBeforeSalary < 10) {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
            } else {
                System.out.println("Окей, пора в Макдак!");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Отлично! Заказывайте крабов!");
            } else {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
            }
        }
    }
}
        /*В отдельной вкладке создайте новый класс — DinnerAdvisor (англ. «советник по ужину»).
        У него не будет полей и будет только один метод getAdvice(double moneyBeforeSalary, int daysBeforeSalary) —
        перенесите в него код из соответствующего метода класса Praktikum.
        В классе Praktikum создайте объект класса DinnerAdvisor, воспользовавшись конструктором по умолчанию.
        Вызовите метод getAdvice класса DinnerAdvisor в блоке ветвления, который отвечает за реализацию пункта меню «Получить совет».
        Из класса Praktikum удалите метод getAdvice(double moneyBeforeSalary, int daysBeforeSalary).*/