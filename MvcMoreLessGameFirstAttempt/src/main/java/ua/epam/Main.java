package ua.epam;

public class Main {

    public static void main(String [] args) {
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        try{
             controller.start();
        }
        catch (Exception e){
            System.out.println("Smth went wrong "+ e.getMessage());
        }
        
    }
}
