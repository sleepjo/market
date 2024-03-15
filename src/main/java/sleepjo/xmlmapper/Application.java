package sleepjo.xmlmapper;

import java.util.Scanner;
import sleepjo.xmlmapper.MemberService;

public class Application {
    static Scanner sc;
    static MemberService memberSerivce;
    static int input;
    static boolean logInStatus = false;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        memberSerivce = new MemberService();
        
        do{
            System.out.println("********Menu*********");
            System.out.println("1. Member submenu");
            System.out.println("2. Product submenu");
            System.out.println("3. Post submenu");
            System.out.println("9. Quit");
            System.out.print("input: ");
            input = sc.nextInt();
            
            switch (input){
                case 1: 
                    memberSubmenu();
                    break;
                case 2: 
                    if(!logInStatus) {
                        System.out.println("You should log in first!!!!");
                        continue;
                    }
                    
                    productSubmenu();
                    break;
                case 3: 
                    postSubmenu();
                    break;
                case 9: return;
            }
            
        } while(input != 9);
        
        
    }

    private static void postSubmenu() {
        do{
            System.out.println("**********Post Submenu**********");
            System.out.println("1. view all posts");
            System.out.println("2. view posts by title");
            System.out.println("3. view posts by memberCode");
            System.out.println("9. back to main menu");
            input = sc.nextInt();
            switch (input){
                case 1:
                    viewAllPost();
                    break;
                case 2:
                    viewByTitle();
                    break;
                case 3:
                    viewByMemberCode();
                    break;
                case 9:
                    return;
            }
        } while(input != 9); 
    }

    private static void viewByMemberCode() {
    }

    private static void viewByTitle() {
    }

    private static void viewAllPost() {
        
    }

    private static void productSubmenu() {
        do{
            System.out.println("**********Product Submenu**********");
            System.out.println("1. insert product");
            System.out.println("2. delete product");
            System.out.println("3. update product");
            System.out.println("9. back to main menu");
            input = sc.nextInt();
            switch (input){
                case 1: 
                    insertProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    updateProduct();
                    break;
                case 9:
                    return;
            }
        } while(input != 9);
        
    }

    private static void memberSubmenu() {
        do{
            System.out.println("**********Member Submenu**********");
            System.out.println("1. Sign up");
            System.out.println("2. Log in");
            System.out.println("3. Log out");
            System.out.println("9. Back to Main Menu");
            System.out.print("input: ");
            input = sc.nextInt();
            
            switch (input){
                case 1: memberSerivce.signUp(); break;
                case 2: memberSerivce.logIn(); break;
                case 3: memberSerivce.logOut(); break;
                case 9: return;
            }
            
        } while(true);
    }
}
