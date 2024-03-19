package sleepjo.xmlmapper;

import org.apache.ibatis.session.SqlSession;
import sleepjo.common.ProductDTO;

import static sleepjo.common.Template.getSqlSession;

public class ProductService {

private ProductMapper mapper;
    public boolean insertProduct(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductMapper.class);

        int result = mapper.insertProduct(product);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true : false ;

    }

    public boolean deleteProduct(int code) {

        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductMapper.class);

        int result = mapper.deleteProduct(code);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true: false;

    }

    public boolean updateMenu(ProductDTO product) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(ProductMapper.class);

        int result = mapper.updateProduct(product);

        if(result > 0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();

        return result > 0 ? true: false;

    }
}
