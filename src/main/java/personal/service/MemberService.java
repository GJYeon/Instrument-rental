package personal.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import personal.dto.MemberDto;
import personal.entity.MemberEntity;
import personal.repository.MemberRepository;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public void save(MemberDto memberDto) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.toSaveEntity(memberDto);
        memberRepository.save(memberEntity);
    }
}
