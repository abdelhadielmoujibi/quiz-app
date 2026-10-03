public class Question{
    private int id;
    private String question;
    private String[] opts;
    private String anwser;
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
    
}