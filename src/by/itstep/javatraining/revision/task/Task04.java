package by.itstep.javatraining.revision.task;

/*	Task 04. Ordering Numbers [упорядочивание чисел]
 *
 *	Даны три числа. Упорядочите их в порядке неубывания.
 *
 *	Формат входных данных [input]
 *	На вход даётся три числа в диапазоне целочисленного типа int.
 *
 *	Формат выходных данных
 *	Возвратите в виде строки три числа, которые упорядочены в порядке неубывания.
 *	Числа в строке должны быть разделены друг от друга одним пробелом.
 *
 *	[ input 1]: 7 6 1
 *	[output 1]: 1 6 7
 *
 *	[ input 2]: 6 7 2
 *	[output 2]: 2 6 7
 *
 *	[ input 3]: 7 4 7
 *	[output 3]: 4 7 7
 */

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task04 {
    public static String task04(int a, int b, int c) {
        List<Integer> list = Arrays.asList(a, b, c);
        Collections.sort(list);
        
        return list.get(0) + " " + list.get(1) + " " + list.get(2);
//        return a < b ? a + " " + (b < c ? b + " " + c : c + " " + b) :

    }
}
