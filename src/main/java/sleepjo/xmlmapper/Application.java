package sleepjo.xmlmapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
//                    if(!logInStatus) {
//                        System.out.println("You should log in first!!!!");
//                        continue;
//                    }
                    
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
        ProductController productController = new ProductController();

        do{
            System.out.println("**********Product Submenu**********");
            System.out.println("1. insert product");
            System.out.println("2. delete product");
            System.out.println("3. update product");
            System.out.println("9. back to main menu");
            input = sc.nextInt();
            switch (input){
                case 1:
                    productController.insertProduct(inputProduct());
                    break;
                case 2:
                    productController.deleteProduct(inputProductCode());
                    break;
                case 3:
                    productController.updateProduct(inputModifyProduct());
                    break;
                case 9:
                    return;
            }
        } while(input != 9);
        
    }

    private static Map<String,String> inputModifyProduct() {

        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 상품 코드를 입력해주세요 : ");
        String code = sc.nextLine();
        System.out.print("상품 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("상품 가격을 입력해주세요 : ");
        String price = sc.nextLine();
        System.out.print("상품 설명을 입력해주세요 : ");
        String description = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("code", code);
        parameter.put("name",name);
        parameter.put("price",price);
        parameter.put("description",description);

        return parameter;

    }

    private static Map<String,String> inputProductCode() {

        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 상품 코드를 입력해주세요 : ");
        String code = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("code",code);

        return parameter;

    }

    private static Map<String, String> inputProduct() {

        Scanner sc = new Scanner(System.in);
        System.out.print("상품 이름을 입력해주세요 : ");
        String name = sc.nextLine();
        System.out.print("상품 가격을 입력해주세요 : ");
        String price = sc.nextLine();
        System.out.print("상품 설명을 입력해주세요 : ");
        String description = sc.nextLine();
        System.out.print("회원 코드를 입력해주세요 : ");
        String memberCode = sc.nextLine();

        Map<String,String> parameter = new HashMap<>();
        parameter.put("name",name);
        parameter.put("price",price);
        parameter.put("description",description);
        parameter.put("memberCode",memberCode);

        return parameter;

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
            
//            switch (input){
//                case 1: memberSerivce.signUp(); break;
//                case 2: memberSerivce.logIn(); break;
//                case 3: memberSerivce.logOut(); break;
//                case 9: return;
//            }
            
        } while(true);
    }
}
