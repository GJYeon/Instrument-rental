package personal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import personal.entity.MemberEntity;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> {

}
