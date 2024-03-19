package sleepjo.xmlmapper;

import java.util.Map;

public interface MemberMapper {
    int signUp(Map<String, String> data);

    String logIn(Map<String, String> data);
}
