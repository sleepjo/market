package sleepjo.xmlmapper;

import sleepjo.common.ProductDTO;

import java.util.Map;

public class ProductController {
    private final ProductService productService;

    public ProductController() {
        this.productService = new ProductService();
    }

    public void insertProduct(Map<String, String> parameter) {

        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        String description = parameter.get("description");
        int memberCode = Integer.parseInt(parameter.get("memberCode"));

        ProductDTO product = new ProductDTO();
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);
        product.setMemberCode(memberCode);

        if(productService.insertProduct(product)){
            System.out.println("상품 등록 성공");
        }else {
            System.out.println("상품 등록 실패");
        }



    }

    public void deleteProduct(Map<String, String> parameter) {

        int code = Integer.parseInt(parameter.get("code"));

        if(productService.deleteProduct(code)){
            System.out.println("상품 삭제 성공");
        }else {
            System.out.println("상품 삭제 실패");
        }

    }

    public void updateProduct(Map<String, String> parameter) {
        int code = Integer.parseInt(parameter.get("code"));
        String name = parameter.get("name");
        int price = Integer.parseInt(parameter.get("price"));
        String description = parameter.get("description");

        ProductDTO product = new ProductDTO();
        product.setCode(code);
        product.setName(name);
        product.setPrice(price);
        product.setDescription(description);

        if(productService.updateMenu(product)){
            System.out.println("메뉴 수정 성공");
        }else {
            System.out.println("메뉴 수정 실패");
        }
    }
}
