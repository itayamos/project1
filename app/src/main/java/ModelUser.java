import java.util.ArrayList;

public class ModelUser extends Users{
    public ModelUser(String name, String password, ArrayList<Score> scores, int score, long id) {
        super(name,  password, scores, score,id);
    }


    public ModelUser(String name, int score, long id) {
        super(name,score,id);
    }
}
