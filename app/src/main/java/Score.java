public class Score {
    private int point;

    public Score(int point) {
        this.point = point;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    public int addToScore(int add){
        setPoint(getPoint()+add);
        return this.getPoint();
    }


    @Override
    public String toString() {
        return "Score{" +
                "point=" + point +
                '}';
    }
}
