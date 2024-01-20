package org.QuizApp.QuestionsService;

import java.util.Scanner;

public class quizService {

    questions[] question = new questions[5];
    String select[] = new String[5];
    public quizService() {
        question[0] = new questions(1,"Which language is created in 1990 ?", "java", "cpp", "python", "c", "Java");
        question[1] = new questions(2, "Size of Int ?", "1", "2", "3","4", "2");
        question[2] = new questions(3,"Number of primitive data types in Java are?", "6", "2","8","7", "8");
        question[3] = new questions(4,"What is the size of float and double in java?", "32 & 64","64 & 64","32 & 32", "64 & 32", "32 & 64");
        question[4] = new questions(5,"Automatic type conversion is possible in ?","byte to int", "int to long","long to int","short to int", "int to long");
    }
int i = 0;
    public void PlayQuiz(){
        for(questions qn: question){
            System.out.println("Question number: "+qn.getId());
            System.out.println(qn.getQuestions());
            System.out.println(qn.getOpt1());
            System.out.println(qn.getOpt2());
            System.out.println(qn.getOpt3());
            System.out.println(qn.getOpt4());
            //input from user
            Scanner sc = new Scanner(System.in);
            select[i] = sc.nextLine();
            System.out.println(select[i]);
            i++;
        }

        for(String s: select){
            System.out.println(s);
            System.out.println("========================");
        }
    }

    public void printScore(){
        int score = 0;
        for(int i=0; i<question.length; i++){
            questions Que = question[i];
            String answer = Que.getAnswer();

            String userAnswer = select[i];

            if(answer.equals(userAnswer)){
                score++;
//                System.out.println("user Input: "+ userAnswer);
//                System.out.println("Correct Anwer: "+ answer);
            }
        }
        System.out.println("Your score is: "+ score);
    }
}
