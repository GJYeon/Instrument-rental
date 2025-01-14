package personal.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import personal.dto.MemberDto;
import personal.service.MemberService;

@Controller
@RequiredArgsConstructor
public class LoginController {
    private final MemberService memberService;

    @PostMapping
    public String login(@ModelAttribute MemberDto memberDto){
        memberService.save(memberDto);
        return "redirect:/";
    }
}
