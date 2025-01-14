package personal.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import personal.dto.MemberDto;

@Entity
@Getter
@Setter
@Table(name = "Member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String password;


    public static MemberEntity toSaveEntity(MemberDto memberDto) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDto.getId());
        memberEntity.setName(memberDto.getName());
        memberEntity.setPassword(memberDto.getPassword());
        return memberEntity;
    }
}
