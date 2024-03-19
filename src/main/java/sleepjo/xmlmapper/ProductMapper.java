package sleepjo.xmlmapper;

import sleepjo.common.ProductDTO;

public interface ProductMapper {

    int insertProduct(ProductDTO product);

    int deleteProduct(int code);

    int updateProduct(ProductDTO product);
}
