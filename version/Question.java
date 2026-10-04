package version;
public class Question{
    private int id;
    private String question;
    private String[] opts= new String[4];
    private String anwser;
    private int score;
    public Question(){

        score=0;
    }
    public Question(int id ,String question ,String[] opts,String anwser){
        this.id=id;
        this.question = question;
        this.opts =opts;
        this.anwser=anwser;

        
    }
    public int getId(){
        return id;
    }
    public String getQuestion(){
        return question;
    }
    public String[] getOpts(){
        return opts;
    }
    public String getAnwser(){
        return anwser;
    }
    public void setId(int id){
        this.id=id;
    }
    public void setQuestion(String question){
        this.question=question;
    }
    public void setOpts(String[] opts){
        this.opts=opts;
    }
    public void setAnwser(String anwser){
        this.anwser=anwser;
    }
    public int getScore(){
        return score;
    }
    public void getScore(int score){
        this.score= score;
    }

    public String toString(){
        return "the question is :"+ question + "and the opts are" +opts[0]+" " +opts[1]+" " +opts[2]+" " +opts[3] + " and the correct anwser is "+anwser;
    }
    
}