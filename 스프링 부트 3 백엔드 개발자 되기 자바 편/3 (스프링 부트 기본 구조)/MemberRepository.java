package org.chunbae.springbootdeveloper;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// MemberRepository 인터페이스는 JpaRepository 인터페이스를 상속받는다.
@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {

}
햣