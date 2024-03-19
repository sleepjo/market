package sleepjo.xmlmapper;

import org.apache.ibatis.session.SqlSession;
import sleepjo.common.ProductDTO;

import java.util.List;
import java.util.Map;

import static sleepjo.common.Template.getSqlSession;

public class PostService {
    private PostMapper mapper;


    public void viewPostByTitle(Map<String, String> stringStringMap) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(PostMapper.class);
        List<ProductDTO> list = mapper.viewPostByTitle();
        for(ProductDTO product : list){
            System.out.println(product);
        }
    }
}
