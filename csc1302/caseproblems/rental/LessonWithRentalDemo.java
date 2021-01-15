package chapter10_.caseproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class LessonWithRentalDemo {
    public static void lessonWithRentalDemo(){
        ArrayList<LessonWithRental> rentas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        rentas.add(new LessonWithRental("3245",120,1));
        rentas.add(new LessonWithRental("2214",100,0));
        rentas.add(new LessonWithRental("1241",60,7));
        rentas.add(new LessonWithRental("9254",200,5));
        Integer option;
        do{
            System.out.println("----------");
            System.out.println("1. No. de contacto");
            System.out.println("2. No. de horas.");
            System.out.println("3. No. de equipamiento");
            System.out.println("4. Quit");
            System.out.println("----------");
            System.out.print("Escoger: ");
            option = scanner.nextInt();
            switch(option){
                case 1: burbleContact(rentas);
                        break;
                case 2: burbleHours(rentas);
                        break;
                case 3: burbleType(rentas);
                        break;
                case 4:
                        break;
            }
        }while(option!=4);
    }
    
    private static void burbleHours(ArrayList<LessonWithRental> eventos){
        LessonWithRental aux = null;
        for(int i =0;i<eventos.size()-1;i++){
            for(int j =0 ;j<eventos.size()-1;j++){
                if(eventos.get(j).getHours_rental()>eventos.get(j+1).getHours_rental()){
                    aux = eventos.get(j);
                    eventos.set(j,eventos.get(j+1));
                    eventos.set(j+1, aux);
                }
            }
        }
    }
    
    private static void burbleContact(ArrayList<LessonWithRental> eventos){
        LessonWithRental aux = null;
        for(int i =0;i<eventos.size()-1;i++){
            for(int j =0 ;j<eventos.size()-1;j++){
                if(eventos.get(j).getContact_number().compareTo(eventos.get(j+1).getContact_number()) <0){
                    aux = eventos.get(j);
                    eventos.set(j,eventos.get(j+1));
                    eventos.set(j+1, aux);
                }
            }
        }
    }
    
    private static void burbleType(ArrayList<LessonWithRental> eventos){
        LessonWithRental aux = null;
        for(int i =0;i<eventos.size()-1;i++){
            for(int j =0 ;j<eventos.size()-1;j++){
                if(eventos.get(j).getType()>eventos.get(j+1).getType()){
                    aux = eventos.get(j);
                    eventos.set(j,eventos.get(j+1));
                    eventos.set(j+1, aux);
                }
            }
        }
    }
    
}
