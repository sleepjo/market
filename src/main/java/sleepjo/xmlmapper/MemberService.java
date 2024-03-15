package sleepjo.xmlmapper;

import org.apache.ibatis.session.SqlSession;
import sleepjo.common.MemberDTO;

import java.util.Map;

import static sleepjo.common.Template.getSqlSession;

public class MemberService {
    private MemberMapper mapper;

    public void signUp(Map<String, String> data) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MemberMapper.class);
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


    public boolean logIn(Map<String, String> data) {
        SqlSession sqlSession = getSqlSession();
        mapper = sqlSession.getMapper(MemberMapper.class);
        String password = mapper.logIn(data);
        if(password.equals(data.get("password")))
            return true;

        return false;
    }
}








