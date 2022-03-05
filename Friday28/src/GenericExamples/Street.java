package GenericExamples;

import java.util.Objects;

public class Street {
    private String Boardwalk;
    private Integer num,color;

    @Override
    public String toString() {
        return "Street{" +
                "Boardwalk='" + Boardwalk + '\'' +
                ", num=" + num +
                ", color=" + color +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Street street = (Street) o;
        return Objects.equals(Boardwalk, street.Boardwalk) && Objects.equals(num, street.num) && Objects.equals(color, street.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Boardwalk, num, color);
    }

    public Street() {
    }

    public Street(String boardwalk, Integer num, Integer color) {
        Boardwalk = boardwalk;
        this.num = num;
        this.color = color;
    }

    public String getBoardwalk() {
        return Boardwalk;
    }

    public void setBoardwalk(String boardwalk) {
        Boardwalk = boardwalk;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }


}
