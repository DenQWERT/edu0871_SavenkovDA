/*Вывести на экран все возможные комбинации слов "Мама", "Мыла", "Раму".
Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.
Пример:
МылаРамуМама
РамуМамаМыла
...
Требования:
•	Программа должна выводить текст.
•	Выведенный текст должен содержать 6 строк.
•	Текст в каждой строке должен быть уникален.
•	Должны быть выведены все возможные комбинации. */



//  Мама моет рамы циклами :

public class Main {
    public static void main(String[] args) {
        String[] wds = new String[]{"Мама", "Мыла", "Раму"};
        int len = wds.length;
        for (int i = 0; i < len; i++){
            for (int j = 0; j < len; j++){
                for (int k = 0; k < len; k++){
                    if ((i!=j)&&(j!=k)&&(i!=k)) System.out.println(wds[i] + wds[j] + wds[k]);
                }
            }
        }
    }
}
