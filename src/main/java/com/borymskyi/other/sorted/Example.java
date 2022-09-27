package com.borymskyi.other.sorted;

/**
 * Практикую код по книге Алгоритмы на Java, 4-е издание. Роберт Седжвик
 * <p>
 * @author Dmitrii Borymskyi
 * @version 1.0
 */
public class Example {

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {50, 70, 5, 10, 8};
        sort(arr);
        show(arr);
    }

    // алгоритм сортировки выбором
    public static void sort(Comparable[] a) {
        if (a == null && a.getClass() != Comparable[].class) {
            throw new IllegalArgumentException("(a == null && a.getClass() != Comparable[].class)");
        }
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i+1; j < N; j++) {
                if (less(a[j], a[min])) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    /**
     * Сравнивает два объекта.
     * Объекты должны реализовывать интерфейс {@link Comparable} и метод {@code compareTo()}.
     * <p>
     * @param v первый объект который реализует интерфейс Comparable.
     * @param w второй объект который реализует интерфейс Comparable.
     * @return false если параметры первого объекта больше чем у второго.
     * Возвращает true если параметры первого объекта меньше чем у второго.
     */
    private static boolean less(Comparable v, Comparable w) {
        return  v.compareTo(w) < 0;
    }

    // метод для обмена элементов
    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    // Вывод массива в одной строке.
    public static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Проверка упорядоченности элементов массива.
    public static boolean isSorted(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            if (less(a[i], a[i=1])) {
                return false;
            }
        }
        return true;
    }
}

class Date implements Comparable<Date> {
    private final int day;
    private final int month;
    private final int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int compareTo(Date that) {
        if (this.year > that.year) return +1;
        if (this.year < that.year) return -1;
        if (this.month > that.month) return +1;
        if (this.month < that.month) return -1;
        if (this.day > that.day) return +1;
        if (this.day < that.day) return -1;
        return 0;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Date date = (Date) o;

        if (day != date.day) return false;
        if (month != date.month) return false;
        return year == date.year;
    }

    @Override
    public int hashCode() {
        int result = day;
        result = 31 * result + month;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
