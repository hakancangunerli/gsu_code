import java.util.*;
public class RecordingSort{
    public static void main(String[] args) {
       String title;
       String name;
       int time;
       Scanner sc=new Scanner(System.in);
        Recording[] recArr = new Recording[5];
        for(int i=0;i<5;i++)
        {
            recArr[i]=new Recording();
            System.out.print("Enter Song Name: ");
             // inputs 
            title=sc.nextLine();
            recArr[i].setSong(title);
            System.out.print("Enter Artist Name: ");
            name=sc.nextLine();
            recArr[i].setArtist(name);
            System.out.print("Enter the duration: ");
            time=sc.nextInt();
            recArr[i].setPlayTime(time);
            sc.nextLine();

            
            
        }
        sortByArtist(recArr);    // run these methods,
        sortBySong(recArr);      
        sortByTime(recArr);
    }
  
    public static void sortByArtist(Recording[] array) {
       Arrays.sort(array, new Comparator<Recording>() {
        
           public int compare(Recording first, Recording second) {
               return first.getArtist().compareTo(second.getArtist());
           }
       });
       System.out.println("sorted by artist,");
       for(int i=0;i<5;i++)
       {
             System.out.println("the title is: "+array[i].getSong()     );
               System.out.println(" the artist is: "+array[i].getArtist() );
               System.out.println(" the time is: "+array[i].getPlayTime() );
       }
    }
  
    public static void sortBySong(Recording[] array) {
           Arrays.sort(array, new Comparator<Recording>() {
               
               public int compare(Recording first, Recording second) {
                   return first.getSong().compareTo(second.getSong());
               }
           });
           System.out.println("sorted by song, ");
           for(int i=0;i<5;i++)
           {
                System.out.println("the title is: "+array[i].getSong()     );
               System.out.println(" the artist is: "+array[i].getArtist() );
               System.out.println(" the time is: "+array[i].getPlayTime() );
           }
    }
  
    public static void sortByTime(Recording[] array) {
           Arrays.sort(array, new Comparator<Recording>() {
            
               public int compare(Recording initial, Recording finale) {
                   return initial.getPlayTime()-finale.getPlayTime();
               }
           });
           System.out.println("sorted by time");
           for(int i=0;i<5;i++){
               System.out.println("the title is: "+array[i].getSong()     );
               System.out.println(" the artist is: "+array[i].getArtist() );
               System.out.println(" the time is: "+array[i].getPlayTime() );
           }
    }
}

// i am once again going to write this in vscode cause there is so much repetition, if you think I am cheating, please let me know so i can find a proper way to do this instead of doing this 


// my tasks attemps is 1 because i test them on my vscode at bashshell 
