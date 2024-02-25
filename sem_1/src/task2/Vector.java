package task2;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector() {
    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }



    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    /**
     * @apiNote метод вычисляющий длину вектора
     * @return длину
     */
    public double length() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    /**
     * @apiNote метод, вычисляющий скалярное произведение
     * @param vectorTwo с которым происходит умножение
     * @return скаляр
     */
    public int scalar(Vector vectorTwo) {
        return x * vectorTwo.x + y * vectorTwo.y + z * vectorTwo.z;
    }

    /**
     * @apiNote метод, вычисляющий векторное произведение
     * @param vectorTwo с которым происходит векторное произведение
     * @return вектор
     */
    public Vector vectorMultiplication(Vector vectorTwo) {
        return new Vector(
                y*vectorTwo.z - z*vectorTwo.y,
                z*vectorTwo.x - x*vectorTwo.z,
                x*vectorTwo.y - y*vectorTwo.x
        );
    }

    /**
     * @apiNote метод, вычисляющий косинус угла между векторами
     * @param vectorTwo между которым вычисляется угол
     * @return косинус угла
     */
    public double cos(Vector vectorTwo) {
        return scalar(vectorTwo)/(Math.abs(length())*Math.abs(vectorTwo.length()));
    }
}
