import java.util.Random;


public class randomname {
    public static void main(String[] args) {
        String[] Name = { "daisy", "simran","shifa","jishra","zeba","samiksha", "saniya", "sabiha"};
      
        Random random = new Random();
      
       int randomIndex = random.nextInt(Name.length);
       
        System.out.println(Name[randomIndex]);
    }
    }