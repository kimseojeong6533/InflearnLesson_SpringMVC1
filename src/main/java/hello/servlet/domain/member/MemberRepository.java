package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Repository(DAO) - 실제 DB에 데이터를 저장하는 건 Repository 클래스의 Entity Manager를 통해 이루어짐
 * (??)동시성 문제가 고려되어 있지 않음, 실무에서는 ConcurrentHashMap, AtomicLong 사용 고려 필요
 */
public class MemberRepository {

    private Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;  // id값 - auto increment

    private static final MemberRepository instance = new MemberRepository();  // 싱글톤

    public static MemberRepository getInstance(){
        return instance;
    }

    private MemberRepository(){  // SingleTon 객체로 설정
    }

    public Member save(Member member){
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;

    }

    public Member findById(Long id){
        return store.get(id);
    }

    public List<Member> findAll(){
        return new ArrayList<>(store.values());
    }

    public void clearStore(){
        store.clear();
    }

}
