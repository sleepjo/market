package sleepjo.xmlmapper;

import sleepjo.common.ProductDTO;

import java.util.List;

public interface PostMapper {

    List<ProductDTO> viewPostByTitle();
}
