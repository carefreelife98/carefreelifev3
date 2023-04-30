package carefreelife.CarefreeLifeV3.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

@Slf4j
@Repository
public class userRepository {

    private static final Map<Long, User> users = new ConcurrentHashMap<>();

    public class AtomicIdCounter {
        private static AtomicLong counter = new AtomicLong(0);

        public static long nextId() {
            return counter.incrementAndGet();
        }
    }

    //save-user
    public User save(User user) {
        user.setUID(AtomicIdCounter.nextId());
        users.put(user.getUID(), user);
        return user;

    }

    // add-User

    // find-user-by-UID
    public User findUserByUID(Long UID) {
        return users.get(UID);
    }
    // find-user-by-userId
    // find-user-by-userName
    // find-all-user
    public List<User> findAllUser() {
        return new ArrayList<>(users.values());
    }

    public void updateUser(Long UID, UserDTO updateParam) {
        User findUser = findUserByUID(UID);
        findUser.setUserName(updateParam.getUserName());

    }
    // delete-user-by-userId
    // delete-user-by-userName
    // delete-user-all
    //


}
