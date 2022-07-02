import java.util.Arrays;

public class LimitingRectangle {
    /**
     * Напишите класс LimitingRectangle (ограничивающий точки прямоугольник), класс принимает точки на плоскости и строит прямоугольник. Если точка лежит на границе прямоугольника, то считаем, что она в него входит.
     *
     * В нем должны быть:
     *
     * поле points (двумерный массив целых чисел);
     * конструктор, принимающий двумерный массив целых чисел (массив точек на плоскости вида [[1, 0], [2, 3], ...], 0 элемент — координата по оси X, 1 элемент — по оси Y);
     * метод getWidth(), возвращающий целое число (ширину прямоугольника);
     * метод getHeight(), возвращает целое число (высоту прямоугольника);
     * метод getBorders, возвращает строку вида {нижняя точка по Y, верхняя точка по Y, левая точка по Х, правая точка по Х}.
     * Пример:
     *
     * LimitingRectangle r = new LimitingRectangle(new int[][] {{-1, -2}, {3, 4}});
     * System.out.println(r.getWidth() +   + r.getHeight());
     * System.out.println(r.getBorders());
     * Вывод:
     *
     * 4 6
     * -2, 4, -1, 3
     * @param args
     */
    int[][] points;

    LimitingRectangle(int[][] points){
        this.points = points;
    }

    int getMinX(){
        int min = points[0][0];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] < min) min = points[i][0];
        }
        return min;
    }

    int getMaxX(){
        int max = points[0][0];
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] > max) max = points[i][0];
        }
        return max;
    }

    int getMinY(){
        int min = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] < min) min = points[i][1];
        }
        return min;
    }

    int getMaxY(){
        int max = points[0][1];
        for (int i = 0; i < points.length; i++) {
            if (points[i][1] > max) max = points[i][1];
        }
        return max;
    }

    /**
     * возвращает целое число (ширину прямоугольника)
     * @return
     */
    int getWidth(){
        return Math.abs(getMinX()) + Math.abs(getMaxX());
    }

    /**
     * возвращает целое число (высоту прямоугольника)
     * @return
     */
    int getHeight(){
        return Math.abs(getMinY()) + Math.abs(getMaxY());
    }

    /**
     * метод getBorders, возвращает строку вида {нижняя точка по Y, верхняя точка по Y, левая точка по Х, правая точка по Х}.
     * @return String
     */
    String getBorders(){
        return getMinY() + ", " + getMaxY() + ", " + getMinX() + ", " + getMaxX();
    }

    public static void main(String[] args) {
        LimitingRectangle limitingRectangle = new LimitingRectangle(new int[][] {{0, 2}, {1, 1}, {2, -1}, {0, -2}, {-1, -1}, {-2, 1}});
        System.out.println(limitingRectangle.getMinX());
        System.out.println(limitingRectangle.getMaxX());
        System.out.println(limitingRectangle.getMinY());
        System.out.println(limitingRectangle.getMaxY());
        System.out.println("Width:");
        System.out.println(limitingRectangle.getWidth());
        System.out.println("Height:");
        System.out.println(limitingRectangle.getHeight());
        System.out.println("Borders:");
        System.out.println(limitingRectangle.getBorders());
    }
}
