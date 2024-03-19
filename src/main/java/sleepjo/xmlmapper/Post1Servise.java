package sleepjo.xmlmapper;

import org.apache.ibatis.session.SqlSession;
import sleepjo.common.PostDTO;

import java.util.List;
import java.util.Map;

import static sleepjo.common.Template.getSqlSession;

public class Post1Servise {
    private static Post1Mapper mapper;

    public static void viewAllPost() {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(Post1Mapper.class);

        List<PostDTO> PostList = mapper.viewAllPost();
        for(PostDTO post : PostList) {
            System.out.println(post);
        }
        sqlSession.close();
    }

}
