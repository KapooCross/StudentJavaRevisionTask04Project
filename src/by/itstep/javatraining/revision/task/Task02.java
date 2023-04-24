package by.itstep.javatraining.revision.task;

/*	Task 02. Digital Watch [электронные часы]
 *
 *	Электронные часы показывают время в формате h:mm:ss (от 0:00:00 до 23:59:59),
 *	т.е. сначала записывается количество часов, потом обязательно двузначное количество минут,
 *	затем обязательно двузначное количество секунд.
 *	Количество минут и секунд при необходимости дополняются до двузначного числа нулями.
 *	С начала суток прошло N секунд. Выведите, что покажут электронные часы.
 *
 *  Примечание
 *  1) Необходимо учесть, что с начало суток может пройти несколько дней.
 *  2) Не забудьте про "защиту от дурака": если данные некорректны, то нужно возвратить "error".
 *  3) Можно попробовать решить данную задачу без использования условных конструкций.
 *
 *	Формат входных данных [input]
 *	На вход даётся целочисленное число в диапазоне типа int.
 *
 *	Формат выходных данных
 *	Возвратите ответ на задачу в виде строки.
 *
 *	[ input 1]: 0
 *	[output 1]: 0:00:00
 *
 *	[ input 2]: 3602
 *	[output 2]: 1:00:02
 *
 *	[ input 3]: 86399
 *	[output 3]: 23:59:59
 *
 *	[ input 4]: 129700
 *	[output 4]: 12:01:40
 *
 *	[ input 5]: -1
 *	[output 5]: error
 */

public class Task02 {
    public static String task02(int number) {

        int hour = number / 3600;
        int minute = number / 60 % 60;
        int second = number % 60;

        String rez = (minute < 10 ? 0 + "" + minute : minute + "") + ":" +
                (second < 10 ? 0 + "" + second : second + "");

        return number < 0 ? "error" :
                hour > 23 ? (hour %= 24) + ":" + rez : hour + ":" + rez;
    }
}
