package sleepjo.xmlmapper;

import org.apache.ibatis.session.SqlSession;

import java.util.Map;

import static sleepjo.common.Template.getSqlSession;

public class MemberService {
    private memberMapper mapper;

    public void signUp(Map<String, String> data) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(memberMapper.class);
        int result = mapper.signUp(data);
        if(result >0){
            System.out.println("sign up success...");
            sqlSession.commit();
        } else {
            System.out.println("sign up failed...");
            sqlSession.rollback();
        }
        sqlSession.close();
    }

    public void logIn(Object o) {
    }

    public void logOut() {
    }
}








