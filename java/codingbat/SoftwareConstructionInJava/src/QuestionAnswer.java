import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class QuestionAnswer {

    class BadInputException extends Exception{
        
    }
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        BufferedReader br = null;        
        try{
            br = new BufferedReader(new FileReader("input.txt"));
            QuestionAnswer qa = new QuestionAnswer(br);
            qa.doQuestionnaire();
        }catch(IOException ioe){
            System.err.println("That didn't work");
        }catch(BadInputException bie){
            System.err.println("Bad Input File");
        }
        
        
    }
    String line;
    BufferedReader fis;
    boolean genius=true;
    int badAnswers=0;
    void loadLine()throws IOException{ line = fis.readLine(); }
    QuestionAnswer(BufferedReader fis){ this.fis = fis; }
    /**
     *  Questionnaire = Entry* ##
     *  Entry = Question # Answer #
     *  Question = Text*
     *  Answer = Text*
     *
     */
    void doQuestionnaire() throws IOException, BadInputException{
        loadLine();
        while(!line.equals("##")){            
            doEntry();            
        }
        check("##");
        if(genius){
            System.out.println("Congratulations, you are a genius!");
        }else{
            System.out.println("Sorry, you are not genius :(");
        }
    }
    void doEntry()throws IOException, BadInputException{
        doQuestion();        
        check("#");
        doAnswer();
        check("#");
    }
    void check(String s)throws IOException, BadInputException{
        if(line.equals(s)){
            loadLine();
            return;
        }
        throw new BadInputException();
    }
    void doQuestion() throws IOException, BadInputException{
        String question = "";
        while(isText(line)){
            question += line + "\n"; loadLine();
        }        
        System.out.print(question);
    }
    void doAnswer() throws IOException, BadInputException{
        String answer = "";
        while(isText(line)){
            answer += line; loadLine();
        }
        askForAnswer(answer);
    }
    void askForAnswer(String goodAnswer)throws IOException{
        boolean answerOK;
        do{
            String answer = readFromConsole();
            answerOK = answer.equals(goodAnswer);            
            if(!answerOK){
                genius=false;
                badAnswerPrompt(answer);
            }
        }while(!answerOK);
    }
    void badAnswerPrompt(String answer){
        if(badAnswers%2==0){
            System.out.println(answer+ "? \nSeriously? \nDidn't you go to elementary school? \nTry again!!");
        }else{
            System.out.println("What do you mean " + answer+ "? \nAre you sure? \nTry again!!");
        }
        ++badAnswers;
    }
    static String readFromConsole() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();        
    }
    boolean isText(String s){
        return s.charAt(0) != '#';
    }
}