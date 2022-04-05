import java.util.ArrayList;

public class Users {
    private String UserName;
    private String password;
    private ArrayList<Score> scores;
    private int score;
    private int bestScore;
    private long id;

    public Users(String userName, String password, ArrayList<Score> scores, int score,long id) {
        this.UserName = userName;
        this.password = password;
        this.scores = scores;
        this.score=score;
        this.id=id;
    }

    public Users(String name, int score, long id) {
        this.UserName = name;
        this.score=score;
        this.id=id;
    }

    public static String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static byte[] getScore() {
        return scores;
    }

    public void setScores(ArrayList<Score> score) {
        this.scores = score;
    }

    public int getBestScore() {
        return bestScore;
    }

    public void setBestScore(int bestScore) {
        this.bestScore = bestScore;
    }
    public void newBestScore(){
        int max=0;
        int indexMax=-1;
        for (int i=0; i<getScore().size(); i++){
            if (max<getScore().indexOf(i)){
                max=getScore().indexOf(i);
                indexMax=i;
            }
        }
        setBestScore(getScore().indexOf(indexMax));
    }

    public void setScore(ArrayList<Score> score) {
        this.scores = score;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
