package sleepjo.xmlmapper;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    static Scanner sc;
    static MemberService memberSerivce;
    static PostService postService;
    static int input;
    static boolean logInStatus = false;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        memberSerivce = new MemberService();



        postService = new PostService();

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
        do {
            System.out.println("**********Post Submenu**********");
            System.out.println("1. view all posts");
            System.out.println("2. view posts by title");  //제목조회
            System.out.println("3. view posts by memberCode");
            System.out.println("9. back to main menu");
            input = sc.nextInt();
            switch (input) {
                case 1:

                    Post1Servise.viewAllPost();
                    break;

                case 2:
                    postService.viewPostByTitle(inputTitle());
                    break;
                case 3:
                    viewByMemberCode();
                    break;
                case 9:
                    return;
            }
        } while(input != 9); 
    }

    private static Map<String,String> inputTitle() {
        System.out.println("****************");
        System.out.print("input title: ");
        sc.nextLine(); // buffer 비우기
        String title = sc.nextLine();
        Map<String,String> data = new HashMap<>();
        data.put("title", title);

        return data;
    }

    private static void viewByMemberCode() {
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
        } while (input != 9);
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
            

            switch (input){
                case 1: memberSerivce.signUp(inputSignUp()); break;
                case 2:
                    if(logInStatus) {
                        System.out.println("You are already logged in");
                        continue;
                    }
                    logInStatus = memberSerivce.logIn(inputLogIn());
                    if(logInStatus){
                        System.out.println("You are logged in!!!");
                    }
                    else{
                        System.out.println("Failed to Logged in!!!");
                    }
                    break;
                case 3:
                    if(!logInStatus){
                        System.out.println("You are already logged out!!!");
                    } else {
                        logInStatus = false;
                        System.out.println("You are signed out!!!");
                    }
                    break;
                case 9: return;
            }

            
        } while(true);
    }

    private static Map<String,String> inputLogIn() {
        sc.nextLine();
        System.out.print("id: ");
        String id = sc.nextLine();
        System.out.print("password: ");
        String password = sc.nextLine();
        Map<String,String> data = new HashMap<>();
        data.put("id", id);
        data.put("password", password);
        return data;
    }

    private static Map<String,String> inputSignUp() {
        sc.nextLine(); // buffer 비우기
        System.out.print("id: ");
        String id = sc.nextLine();
        System.out.print("password: ");
        String password = sc.nextLine();
        System.out.print("name: ");
        String name = sc.nextLine();
        System.out.print("username: ");
        String username = sc.nextLine();
        System.out.print("email: ");
        String email = sc.nextLine();
        Map<String,String> data = new HashMap<>();
        data.put("id", id);
        data.put("password", password);
        data.put("name", name);
        data.put("username", username);
        data.put("email", email);

        return data;

    }
}

